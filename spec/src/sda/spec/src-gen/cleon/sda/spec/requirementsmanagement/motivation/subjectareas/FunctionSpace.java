package cleon.sda.spec.requirementsmanagement.motivation.subjectareas;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4c9ff48f-c58d-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[4c9ff48f-c58d-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[4c9ff48f-c58d-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[4c9ff48f-c58d-11e5-aeea-1db9268c0ee9]] */


  public static interface ISubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4c9ff491-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

  }
  
  public static interface ISubjectAreaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4c9ff491-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea subjectArea);

  }
  
  public static class SubjectAreaFunctionsImpl implements ISubjectAreaFunctionsImpl {

    public static final ISubjectAreaFunctionsImpl INSTANCE = new SubjectAreaFunctionsImpl();

    private SubjectAreaFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea subjectArea) {
      /* Begin Protected Region [[4c9ff491-c58d-11e5-aeea-1db9268c0ee9]] */
    	return String.format("SU-%03d", subjectArea.selectIdentifier());     
      /* End Protected Region   [[4c9ff491-c58d-11e5-aeea-1db9268c0ee9]] */
    }

  }
  
  public static class SubjectAreaFunctions {

    private SubjectAreaFunctions() {}

    public static java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea subjectArea) {
      return DynamicResourceUtil.invoke(ISubjectAreaFunctionsImpl.class, SubjectAreaFunctionsImpl.INSTANCE, subjectArea).GetId(subjectArea);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4c9ff48f-c58d-11e5-aeea-1db9268c0ee9,3kwlE7VnVs3FBdkhRCgoeJ/09S0=] */
