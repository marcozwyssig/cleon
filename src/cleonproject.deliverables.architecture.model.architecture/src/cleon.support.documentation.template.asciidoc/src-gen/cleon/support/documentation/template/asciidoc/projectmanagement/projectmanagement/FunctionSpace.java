package cleon.support.documentation.template.asciidoc.projectmanagement.projectmanagement;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2143ad53-b468-11e5-a3f4-497fd75158dc,imports]] */
import java.util.*;
import cleon.common.resources.spec.calendar.FunctionSpace.DayFunctions;
/* End Protected Region   [[2143ad53-b468-11e5-a3f4-497fd75158dc,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[2143ad53-b468-11e5-a3f4-497fd75158dc]] */
  
  /* End Protected Region   [[2143ad53-b468-11e5-a3f4-497fd75158dc]] */


  public static interface IProtocolFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("942a546a-c6aa-11e5-a68d-835c1648a4d8")
    public java.lang.String GetDocumentPath();

    @IDynamicResourceExtension.MethodId("4f02765e-c75f-11e5-b3f9-43c5a0896ea1")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("1481e209-4e5d-11e6-a89e-4beefb17234f")
    public java.lang.String RenderEnd();

  }
  
  public static interface IProtocolFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolFunctionsImpl implements IProtocolFunctionsImpl {

    public static final IProtocolFunctionsImpl INSTANCE = new ProtocolFunctionsImpl();

    private ProtocolFunctionsImpl() {}

  }
  
  public static class ProtocolFunctions {

    private ProtocolFunctions() {}

  }

  public static interface IAgendaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9c31d862-c763-11e5-b3f9-43c5a0896ea1")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IAgendaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AgendaFunctionsImpl implements IAgendaFunctionsImpl {

    public static final IAgendaFunctionsImpl INSTANCE = new AgendaFunctionsImpl();

    private AgendaFunctionsImpl() {}

  }
  
  public static class AgendaFunctions {

    private AgendaFunctions() {}

  }

  public static interface IProtocolItemsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fdfcac8b-c764-11e5-b3f9-43c5a0896ea1")
    public java.lang.String RenderContentElement();

  }
  
  public static interface IProtocolItemsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolItemsFunctionsImpl implements IProtocolItemsFunctionsImpl {

    public static final IProtocolItemsFunctionsImpl INSTANCE = new ProtocolItemsFunctionsImpl();

    private ProtocolItemsFunctionsImpl() {}

  }
  
  public static class ProtocolItemsFunctions {

    private ProtocolItemsFunctions() {}

  }

  public static interface IProtocolItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f4a5dbbd-c766-11e5-b3f9-43c5a0896ea1")
    public java.lang.String GetType();

  }
  
  public static interface IProtocolItemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolItemFunctionsImpl implements IProtocolItemFunctionsImpl {

    public static final IProtocolItemFunctionsImpl INSTANCE = new ProtocolItemFunctionsImpl();

    private ProtocolItemFunctionsImpl() {}

  }
  
  public static class ProtocolItemFunctions {

    private ProtocolItemFunctions() {}

  }

  public static interface IDecisionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ff2bf34c-c766-11e5-b3f9-43c5a0896ea1")
    public java.lang.String GetType();

  }
  
  public static interface IDecisionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DecisionFunctionsImpl implements IDecisionFunctionsImpl {

    public static final IDecisionFunctionsImpl INSTANCE = new DecisionFunctionsImpl();

    private DecisionFunctionsImpl() {}

  }
  
  public static class DecisionFunctions {

    private DecisionFunctions() {}

  }

  public static interface ITaskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0d7a3677-c767-11e5-b3f9-43c5a0896ea1")
    public java.lang.String GetType();

    @IDynamicResourceExtension.MethodId("343f5f25-20d5-11e6-9368-9172b77c2cff")
    public <T extends cleon.initialization.projectmanagement.spec.projectmanagement.protocols.protocolsitems.javamodel.ITask> List<T> SortByDate();

  }
  
  public static interface ITaskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("343f5f25-20d5-11e6-9368-9172b77c2cff")
    public <T extends cleon.initialization.projectmanagement.spec.projectmanagement.protocols.protocolsitems.javamodel.ITask> List<T> SortByDate(final List<T> taskList);

  }
  
  public static class TaskFunctionsImpl implements ITaskFunctionsImpl {

    public static final ITaskFunctionsImpl INSTANCE = new TaskFunctionsImpl();

    private TaskFunctionsImpl() {}

    @Override
    public <T extends cleon.initialization.projectmanagement.spec.projectmanagement.protocols.protocolsitems.javamodel.ITask> List<T> SortByDate(final List<T> taskList) {
      /* Begin Protected Region [[343f5f25-20d5-11e6-9368-9172b77c2cff]] */
		ArrayList<T> taskSortedList = new ArrayList<>(taskList);
		Collections.sort(taskSortedList, new java.util.Comparator<T>() {
			public int compare(T o1, T o2)
			{
				Date deadline1 = DayFunctions.GetDate(o1.selectDeadline());
				Date deadline2 = DayFunctions.GetDate(o2.selectDeadline());
				return deadline1.compareTo(deadline2);
			}
		});
		
		return taskSortedList;
      /* End Protected Region   [[343f5f25-20d5-11e6-9368-9172b77c2cff]] */
    }

  }
  
  public static class TaskFunctions {

    private TaskFunctions() {}

    public static <T extends cleon.initialization.projectmanagement.spec.projectmanagement.protocols.protocolsitems.javamodel.ITask> List<T> SortByDate(final List<T> taskList) {
      return DynamicResourceUtil.invoke(ITaskFunctionsImpl.class, TaskFunctionsImpl.INSTANCE, taskList).SortByDate(taskList);
    }

  }

  public static interface IInformationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("133642d7-c767-11e5-b3f9-43c5a0896ea1")
    public java.lang.String GetType();

  }
  
  public static interface IInformationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InformationFunctionsImpl implements IInformationFunctionsImpl {

    public static final IInformationFunctionsImpl INSTANCE = new InformationFunctionsImpl();

    private InformationFunctionsImpl() {}

  }
  
  public static class InformationFunctions {

    private InformationFunctions() {}

  }

  public static interface IProtocolsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("500cc697-20b6-11e6-9bb5-2b7a5dccc043")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("bfa889d8-5e35-11e6-a777-551543f10110")
    public java.lang.String GetDocumentName();

  }
  
  public static interface IProtocolsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolsFunctionsImpl implements IProtocolsFunctionsImpl {

    public static final IProtocolsFunctionsImpl INSTANCE = new ProtocolsFunctionsImpl();

    private ProtocolsFunctionsImpl() {}

  }
  
  public static class ProtocolsFunctions {

    private ProtocolsFunctions() {}

  }

  public static interface IScheduleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("34e42d9d-5e37-11e6-a777-551543f10110")
    public java.lang.String GetDocumentName();

  }
  
  public static interface IScheduleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ScheduleFunctionsImpl implements IScheduleFunctionsImpl {

    public static final IScheduleFunctionsImpl INSTANCE = new ScheduleFunctionsImpl();

    private ScheduleFunctionsImpl() {}

  }
  
  public static class ScheduleFunctions {

    private ScheduleFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2143ad53-b468-11e5-a3f4-497fd75158dc,0R7SZtzix2qeU3pnnRjKlGsyehY=] */
