package cleon.ddd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAggregate extends cleon.uml.spec.structural.packages.javamodel.INamedPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("83c13817-10c0-11e3-b60e-ab478a3e1eca");
  
  // relations
  
  public java.util.List<? extends cleon.ddd.spec.entities.javamodel.IEntityDekomposition> selectDecomposeEntities();
  
  public java.util.List<? extends cleon.ddd.spec.exceptions.javamodel.IExceptionDekomposition> selectDecomposeExceptions();
  
  public java.util.List<? extends cleon.ddd.spec.valueobjects.javamodel.IValueObjectDekomposition> selectDecomposeValueObjects();
  
  public java.util.List<? extends cleon.ddd.spec.repository.javamodel.IRepositoryDekomposition> selectDecomposeRepository();
  
  public cleon.ddd.spec.services.javamodel.IServiceDekomposition selectDecomposeDomainServices();
  
  public java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnumDekomposition> selectDecomposeEnums();
  
  public java.util.List<? extends cleon.eda.spec.eventaggregator.javamodel.IEventAggregator> selectDecomposeEventAggregator();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,k6NThwQ5fB7w044TQFUDV42f/bQ=] */
