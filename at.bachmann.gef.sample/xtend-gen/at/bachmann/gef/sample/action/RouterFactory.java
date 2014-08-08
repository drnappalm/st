package at.bachmann.gef.sample.action;

import com.google.common.base.Objects;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.draw2d.FanRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ManhattanConnectionRouter;
import org.eclipse.draw2d.ShortestPathConnectionRouter;

@SuppressWarnings("all")
public class RouterFactory {
  public static ConnectionRouter createRouter(final IFigure container, final String routerType) {
    ConnectionRouter _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      String _name = ConnectionRouter.NullConnectionRouter.class.getName();
      if (Objects.equal(routerType,_name)) {
        _matched=true;
        _switchResult = ConnectionRouter.NULL;
      }
    }
    if (!_matched) {
      String _name_1 = FanRouter.class.getName();
      if (Objects.equal(routerType,_name_1)) {
        _matched=true;
        _switchResult = new FanRouter();
      }
    }
    if (!_matched) {
      String _name_2 = ManhattanConnectionRouter.class.getName();
      if (Objects.equal(routerType,_name_2)) {
        _matched=true;
        _switchResult = new ManhattanConnectionRouter();
      }
    }
    if (!_matched) {
      String _name_3 = ShortestPathConnectionRouter.class.getName();
      if (Objects.equal(routerType,_name_3)) {
        _matched=true;
        _switchResult = new ShortestPathConnectionRouter(container);
      }
    }
    if (!_matched) {
      String _name_4 = BendpointConnectionRouter.class.getName();
      if (Objects.equal(routerType,_name_4)) {
        _matched=true;
        _switchResult = new BendpointConnectionRouter();
      }
    }
    return _switchResult;
  }
}
