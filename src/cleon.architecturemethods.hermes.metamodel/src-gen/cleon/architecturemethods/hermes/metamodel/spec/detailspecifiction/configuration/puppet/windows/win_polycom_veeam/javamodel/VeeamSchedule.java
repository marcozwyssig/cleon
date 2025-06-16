package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VeeamSchedule extends DynamicResource implements IVeeamSchedule {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVeeamSchedule> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVeeamSchedule>() {
    
    @Override
    public IVeeamSchedule create() {
      return new VeeamSchedule();
    }
    
    @Override
    public IVeeamSchedule create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VeeamSchedule(resourceRepository, resource);
    }
  
  };

  public VeeamSchedule() {
    super(IVeeamSchedule.TYPE_ID);
  }
  
  public VeeamSchedule(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVeeamSchedule.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectTime() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamSchedule_time);
  }
    
  public void setTime(java.lang.String time) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamSchedule_time, time);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.calendar.metamodel.spec.javamodel.IWeekday> selectDays() {
    return _getList(cleon.common.calendar.metamodel.spec.javamodel.IWeekday.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamSchedule_days);
  }

  public VeeamSchedule setDays(java.util.List<? extends cleon.common.calendar.metamodel.spec.javamodel.IWeekday> days) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamSchedule_days, days);
    return this;
  }
    
  @Override
  public cleon.common.calendar.metamodel.spec.javamodel.IWeekday selectTransformToSyntethicDays() {
    return _getSingle(cleon.common.calendar.metamodel.spec.javamodel.IWeekday.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamSchedule_transformToSyntethicDays);
  }

  public VeeamSchedule setTransformToSyntethicDays(cleon.common.calendar.metamodel.spec.javamodel.IWeekday transformToSyntethicDays) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamSchedule_transformToSyntethicDays, transformToSyntethicDays);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VeeamSchedule setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamSchedule_time, visitor);
    // relations
    _acceptList(cleon.common.calendar.metamodel.spec.javamodel.IWeekday.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamSchedule_days, visitor);
    _acceptSingle(cleon.common.calendar.metamodel.spec.javamodel.IWeekday.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamSchedule_transformToSyntethicDays, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamSchedule> selectToMeDays(cleon.common.calendar.metamodel.spec.javamodel.IWeekday object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamSchedule.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamSchedule_days, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamSchedule> selectToMeTransformToSyntethicDays(cleon.common.calendar.metamodel.spec.javamodel.IWeekday object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.javamodel.IVeeamSchedule.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_veeam.Win_polycom_veeamPackage.VeeamSchedule_transformToSyntethicDays, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d9f61a02-4860-11f0-ab73-2116b4504ace,/OzfSatKe1OdDVw5aK8UyQaSGEU=] */
