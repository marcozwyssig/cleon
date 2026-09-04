package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVeeamSchedule extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d9f61a02-4860-11f0-ab73-2116b4504ace");
  
  // attributes
  
  public java.lang.String selectTime();
  
  public java.util.List<? extends cleon.common.calendar.metamodel.spec.javamodel.IWeekday> selectDays();
  
  public cleon.common.calendar.metamodel.spec.javamodel.IWeekday selectTransformToSyntethicDays();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d9f61a02-4860-11f0-ab73-2116b4504ace,LrhgPEaRoDnK3k9UHmHKekSa8Rg=] */
