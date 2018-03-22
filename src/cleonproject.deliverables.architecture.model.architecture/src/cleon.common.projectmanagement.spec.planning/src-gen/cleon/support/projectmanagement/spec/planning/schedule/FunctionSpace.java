package cleon.support.projectmanagement.spec.planning.schedule;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[acb90998-20c6-11e6-9bb5-2b7a5dccc043,imports]] */
import java.time.LocalDate;
import cleon.common.resources.spec.calendar.FunctionSpace.DayFunctions;
/* End Protected Region   [[acb90998-20c6-11e6-9bb5-2b7a5dccc043,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[acb90998-20c6-11e6-9bb5-2b7a5dccc043]] */
  
  /* End Protected Region   [[acb90998-20c6-11e6-9bb5-2b7a5dccc043]] */


  public static interface ITargetDateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b5d11302-20c6-11e6-9bb5-2b7a5dccc043")
    public java.lang.Boolean IsLate();

  }
  
  public static interface ITargetDateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b5d11302-20c6-11e6-9bb5-2b7a5dccc043")
    public java.lang.Boolean IsLate(final cleon.support.projectmanagement.spec.resource.javamodel.ITargetDate targetDate);

  }
  
  public static class TargetDateFunctionsImpl implements ITargetDateFunctionsImpl {

    public static final ITargetDateFunctionsImpl INSTANCE = new TargetDateFunctionsImpl();

    private TargetDateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsLate(final cleon.support.projectmanagement.spec.resource.javamodel.ITargetDate targetDate) {
      /* Begin Protected Region [[b5d11302-20c6-11e6-9bb5-2b7a5dccc043]] */
      if( targetDate.selectState().isDone())
      {
    	  return false;
      }
      java.util.Date day = DayFunctions.GetDate(targetDate.selectDeadline());
      LocalDate today = java.time.LocalDateTime.now().toLocalDate();
      LocalDate targetDateDate = day.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
      return today.isAfter(targetDateDate);
      
      /* End Protected Region   [[b5d11302-20c6-11e6-9bb5-2b7a5dccc043]] */
    }

  }
  
  public static class TargetDateFunctions {

    private TargetDateFunctions() {}

    public static java.lang.Boolean IsLate(final cleon.support.projectmanagement.spec.resource.javamodel.ITargetDate targetDate) {
      return DynamicResourceUtil.invoke(ITargetDateFunctionsImpl.class, TargetDateFunctionsImpl.INSTANCE, targetDate).IsLate(targetDate);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,acb90998-20c6-11e6-9bb5-2b7a5dccc043,/XtZB0BYFKM2l+C346OAnIGFkSk=] */
