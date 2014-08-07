package at.bachmann.gef.sample

import org.eclipse.gef.ui.actions.ActionBarContributor
import org.eclipse.jface.action.IToolBarManager
import org.eclipse.jface.action.Separator
import org.eclipse.gef.ui.actions.ZoomComboContributionItem
import at.bachmann.gef.sample.action.FBDiagramChangeRoutingAction
import org.eclipse.draw2d.BendpointConnectionRouter
import org.eclipse.draw2d.ConnectionRouter.NullConnectionRouter
import org.eclipse.draw2d.FanRouter
import org.eclipse.draw2d.ManhattanConnectionRouter
import org.eclipse.draw2d.ShortestPathConnectionRouter
import java.util.Set
import org.eclipse.jface.action.IAction

class FBActionBarContributor extends ActionBarContributor {

	val static CHANGEROUTER_NULL = 'Null'
	val static CHANGEROUTER_BENDPOINT = 'Bendpoint'
	val static CHANGEROUTER_FAN = 'Fan'
	val static CHANGEROUTER_MANHATTAN = 'Manhattan'
	val static CHANGEROUTER_SHORTPATH = 'Shortpath'

	public var Set<Pair<String, IAction>> actions

	override protected buildActions() {
		actions = #{CHANGEROUTER_NULL -> new FBDiagramChangeRoutingAction(page.activeEditor, CHANGEROUTER_NULL, NullConnectionRouter), 
			CHANGEROUTER_BENDPOINT -> new FBDiagramChangeRoutingAction(page.activeEditor, CHANGEROUTER_BENDPOINT, BendpointConnectionRouter), 
			CHANGEROUTER_FAN -> new FBDiagramChangeRoutingAction(page.activeEditor, CHANGEROUTER_FAN, FanRouter), 
			CHANGEROUTER_MANHATTAN -> new FBDiagramChangeRoutingAction(page.activeEditor, CHANGEROUTER_MANHATTAN, ManhattanConnectionRouter),
			CHANGEROUTER_SHORTPATH -> new FBDiagramChangeRoutingAction(page.activeEditor, CHANGEROUTER_SHORTPATH, ShortestPathConnectionRouter)}
	}

	override protected declareGlobalActionKeys() {
		actions.forEach[
			addGlobalActionKey(it.key)	
		]
	}

	override contributeToToolBar(IToolBarManager toolBarManager) {
		super.contributeToToolBar(toolBarManager)

		toolBarManager.add(new Separator());
		actions.forEach[
			toolBarManager.add(it.value)
		]
	}
}
