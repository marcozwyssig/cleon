package cleon.support.projectmanagement.template.versionone;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d17ca089-375d-11e5-95d9-2b04d7ab02d9,imports]] */

/* End Protected Region   [[d17ca089-375d-11e5-95d9-2b04d7ab02d9,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[d17ca089-375d-11e5-95d9-2b04d7ab02d9]] */
  
  /* End Protected Region   [[d17ca089-375d-11e5-95d9-2b04d7ab02d9]] */


  public static interface ITextFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d9dd677f-375d-11e5-95d9-2b04d7ab02d9")
    public java.lang.String RenderContent();

  }
  
  public static interface ITextFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TextFunctionsImpl implements ITextFunctionsImpl {

    public static final ITextFunctionsImpl INSTANCE = new TextFunctionsImpl();

    private TextFunctionsImpl() {}

  }
  
  public static class TextFunctions {

    private TextFunctions() {}

  }

  public static interface IReproducibilityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2077d5cf-376f-11e5-95d9-2b04d7ab02d9")
    public List<java.lang.String> RenderContent();

  }
  
  public static interface IReproducibilityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2077d5cf-376f-11e5-95d9-2b04d7ab02d9")
    public List<java.lang.String> RenderContent(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IReproducibility reproducibility);

  }
  
  public static class ReproducibilityFunctionsImpl implements IReproducibilityFunctionsImpl {

    public static final IReproducibilityFunctionsImpl INSTANCE = new ReproducibilityFunctionsImpl();

    private ReproducibilityFunctionsImpl() {}

    @Override
    public List<java.lang.String> RenderContent(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IReproducibility reproducibility) {
      /* Begin Protected Region [[2077d5cf-376f-11e5-95d9-2b04d7ab02d9]] */
        List<java.lang.String> result = new java.util.ArrayList<String>();
        List<java.lang.String> input = reproducibility.selectReproduce();
        for(int i=0; i <input.size(); ++i)
        {
      	  result.add(i + 1 + ". " + input.get(i));
        }
        return result; 
      /* End Protected Region   [[2077d5cf-376f-11e5-95d9-2b04d7ab02d9]] */
    }

  }
  
  public static class ReproducibilityFunctions {

    private ReproducibilityFunctions() {}

    public static List<java.lang.String> RenderContent(final cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IReproducibility reproducibility) {
      return DynamicResourceUtil.invoke(IReproducibilityFunctionsImpl.class, ReproducibilityFunctionsImpl.INSTANCE, reproducibility).RenderContent(reproducibility);
    }

  }

  public static interface IWorkItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d9f1817a-f2ba-11e5-8010-7b34e2b59618")
    public java.lang.String GetXmlContent();

  }
  
  public static interface IWorkItemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WorkItemFunctionsImpl implements IWorkItemFunctionsImpl {

    public static final IWorkItemFunctionsImpl INSTANCE = new WorkItemFunctionsImpl();

    private WorkItemFunctionsImpl() {}

  }
  
  public static class WorkItemFunctions {

    private WorkItemFunctions() {}

  }

  public static interface IDefectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("33f728a2-f2bb-11e5-8010-7b34e2b59618")
    public java.lang.String GetXmlContent();

  }
  
  public static interface IDefectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DefectFunctionsImpl implements IDefectFunctionsImpl {

    public static final IDefectFunctionsImpl INSTANCE = new DefectFunctionsImpl();

    private DefectFunctionsImpl() {}

  }
  
  public static class DefectFunctions {

    private DefectFunctions() {}

  }

  public static interface IConstraintFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("39d95a55-f2bb-11e5-8010-7b34e2b59618")
    public java.lang.String GetXmlContent();

  }
  
  public static interface IConstraintFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConstraintFunctionsImpl implements IConstraintFunctionsImpl {

    public static final IConstraintFunctionsImpl INSTANCE = new ConstraintFunctionsImpl();

    private ConstraintFunctionsImpl() {}

  }
  
  public static class ConstraintFunctions {

    private ConstraintFunctions() {}

  }

  public static interface IActivityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("73ad2042-f2bb-11e5-8010-7b34e2b59618")
    public java.lang.String GetXmlContent();

  }
  
  public static interface IActivityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityFunctionsImpl implements IActivityFunctionsImpl {

    public static final IActivityFunctionsImpl INSTANCE = new ActivityFunctionsImpl();

    private ActivityFunctionsImpl() {}

  }
  
  public static class ActivityFunctions {

    private ActivityFunctions() {}

  }

  public static interface IWorkItemGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d695c370-23f8-11e7-bec1-4d34b1aea387")
    public java.lang.String GetXmlContent();

  }
  
  public static interface IWorkItemGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WorkItemGroupFunctionsImpl implements IWorkItemGroupFunctionsImpl {

    public static final IWorkItemGroupFunctionsImpl INSTANCE = new WorkItemGroupFunctionsImpl();

    private WorkItemGroupFunctionsImpl() {}

  }
  
  public static class WorkItemGroupFunctions {

    private WorkItemGroupFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d17ca089-375d-11e5-95d9-2b04d7ab02d9,nzI5YdC7Un9Fa4WDgC4HQXISUwA=] */
