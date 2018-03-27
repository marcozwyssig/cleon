package cleon.conception.applications.spec.ddd.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAggregate extends cleon.conception.uml.spec.uml.structural.packages.javamodel.INamedPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("83c13817-10c0-11e3-b60e-ab478a3e1eca");
  
  // relations
  
  public java.util.List<? extends cleon.conception.applications.spec.ddd.entities.javamodel.IEntityDekomposition> selectEntities();
  
  public java.util.List<? extends cleon.conception.applications.spec.ddd.exceptions.javamodel.IExceptionDekomposition> selectExceptions();
  
  public java.util.List<? extends cleon.conception.applications.spec.ddd.valueobjects.javamodel.IValueObjectDekomposition> selectValueObjects();
  
  public java.util.List<? extends cleon.conception.applications.spec.ddd.repository.javamodel.IRepositoryDekomposition> selectRepository();
  
  public cleon.conception.applications.spec.ddd.services.javamodel.IServiceDekomposition selectDomainServices();
  
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.enums.javamodel.IEnumDekomposition> selectEnums();
  
  public java.util.List<? extends cleon.conception.architecture.spec.eda.eventaggregator.javamodel.IEventAggregator> selectEventAggregator();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,bbkArl8IjKRmd565n70m1reHIAQ=] */
