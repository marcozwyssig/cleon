package cleon.architecturemethods.arc42.spec.ddd.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAggregate extends cleon.modelinglanguages.uml.spec.uml2.structural.packages.javamodel.INamedPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("83c13817-10c0-11e3-b60e-ab478a3e1eca");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.entities.javamodel.IEntityDekomposition> selectEntities();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel.IExceptionDekomposition> selectExceptions();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.valueobjects.javamodel.IValueObjectDekomposition> selectValueObjects();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.ddd.repository.javamodel.IRepositoryDekomposition> selectRepository();
  
  public cleon.architecturemethods.arc42.spec.ddd.services.javamodel.IServiceDekomposition selectDomainServices();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.enums.javamodel.IEnumDekomposition> selectEnums();
  
  public java.util.List<? extends cleon.conception.architecture.spec.eda.eventaggregator.javamodel.IEventAggregator> selectEventAggregator();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,WOWHYA59eO5EjEEDnR1n5TZ2kEY=] */
