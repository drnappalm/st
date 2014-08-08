package at.bachmann.gef.sample.action

import org.eclipse.draw2d.ConnectionRouter
import org.eclipse.draw2d.ConnectionRouter.NullConnectionRouter
import org.eclipse.draw2d.IFigure
import org.eclipse.draw2d.FanRouter
import org.eclipse.draw2d.ManhattanConnectionRouter
import org.eclipse.draw2d.ShortestPathConnectionRouter
import org.eclipse.draw2d.BendpointConnectionRouter

class RouterFactory {
	def static createRouter(IFigure container, String routerType) {
		switch routerType {
			case typeof(NullConnectionRouter).name:
				ConnectionRouter.NULL
			case typeof(FanRouter).name:
				new FanRouter
			case typeof(ManhattanConnectionRouter).name:
				new ManhattanConnectionRouter
			case typeof(ShortestPathConnectionRouter).name:
				new ShortestPathConnectionRouter(container)
			case typeof(BendpointConnectionRouter).name:
				new BendpointConnectionRouter
		}
	}
}