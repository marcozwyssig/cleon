package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.defect;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b425093b-c58b-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[b425093b-c58b-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[b425093b-c58b-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[b425093b-c58b-11e5-aeea-1db9268c0ee9]] */


  public static interface IDefectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b9550168-c58b-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

  }
  
  public static interface IDefectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b9550168-c58b-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.defect.javamodel.IDefect defect);

  }
  
  public static class DefectFunctionsImpl implements IDefectFunctionsImpl {

    public static final IDefectFunctionsImpl INSTANCE = new DefectFunctionsImpl();

    private DefectFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.defect.javamodel.IDefect defect) {
      /* Begin Protected Region [[b9550168-c58b-11e5-aeea-1db9268c0ee9]] */
    	return String.format("DF-%03d", defect.selectIdentifier());    
      /* End Protected Region   [[b9550168-c58b-11e5-aeea-1db9268c0ee9]] */
    }

  }
  
  public static class DefectFunctions {

    private DefectFunctions() {}

    public static java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.defect.javamodel.IDefect defect) {
      return DynamicResourceUtil.invoke(IDefectFunctionsImpl.class, DefectFunctionsImpl.INSTANCE, defect).GetId(defect);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b425093b-c58b-11e5-aeea-1db9268c0ee9,LjcF5B9yk4WyUWyQ9694VZoKJtY=] */
