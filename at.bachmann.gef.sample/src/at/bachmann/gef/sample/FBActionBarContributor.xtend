package at.bachmann.gef.sample

import at.bachmann.gef.sample.action.FBDiagramChangeRoutingAction
import java.util.Set
import org.eclipse.draw2d.BendpointConnectionRouter
import org.eclipse.draw2d.ConnectionRouter.NullConnectionRouter
import org.eclipse.draw2d.FanRouter
import org.eclipse.draw2d.ManhattanConnectionRouter
import org.eclipse.draw2d.ShortestPathConnectionRouter
import org.eclipse.gef.ui.actions.ActionBarContributor
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.ui.actions.RetargetAction

class FBActionBarContributor extends ActionBarContributor {

	val static CHANGEROUTER_NULL = 'Null'
	val static CHANGEROUTER_BENDPOINT = 'Bendpoint'
	val static CHANGEROUTER_FAN = 'Fan'
	val static CHANGEROUTER_MANHATTAN = 'Manhattan'
	val static CHANGEROUTER_SHORTPATH = 'Shortpath'

	public var Set<Pair<String, RetargetAction>> actions
	
	override protected buildActions() {
		actions = #{CHANGEROUTER_NULL -> new FBDiagramChangeRoutingAction(CHANGEROUTER_NULL, NullConnectionRouter), 
			CHANGEROUTER_BENDPOINT -> new FBDiagramChangeRoutingAction(CHANGEROUTER_BENDPOINT, BendpointConnectionRouter), 
			CHANGEROUTER_FAN -> new FBDiagramChangeRoutingAction(CHANGEROUTER_FAN, FanRouter), 
			CHANGEROUTER_MANHATTAN -> new FBDiagramChangeRoutingAction(CHANGEROUTER_MANHATTAN, ManhattanConnectionRouter),
			CHANGEROUTER_SHORTPATH -> new FBDiagramChangeRoutingAction(CHANGEROUTER_SHORTPATH, ShortestPathConnectionRouter)}
		
		actions.forEach[
			addRetargetAction(it.value)	
		]	
	}
	
	override protected declareGlobalActionKeys() {
	}
	
	override contributeToToolBar(IToolBarManager toolBarManager) {
		actions.forEach[
			toolBarManager.add(it.value)
		]
	}
	
}
