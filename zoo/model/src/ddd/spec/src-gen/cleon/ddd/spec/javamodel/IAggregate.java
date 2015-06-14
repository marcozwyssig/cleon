package cleon.ddd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAggregate extends cleon.uml.spec.structural.packages.javamodel.INamedPackage {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("83c13817-10c0-11e3-b60e-ab478a3e1eca");
  
  // relations
  
  public java.util.List<? extends cleon.ddd.spec.javamodel.IEntity> selectEntities();
  
  public java.util.List<? extends cleon.ddd.spec.javamodel.IDomainException> selectExceptions();
  
  public java.util.List<? extends cleon.ddd.spec.javamodel.IValueObject> selectValueObjects();
  
  public java.util.List<? extends cleon.uml.spec.structural.classes.javamodel.IClassWithInterface> selectClasses();
  
  public java.util.List<? extends cleon.ddd.spec.javamodel.IRepositoryPackage> selectRepository();
  
  public cleon.ddd.spec.services.javamodel.IMainServicePackage selectServicePackage();
  
  public java.util.List<? extends cleon.uml.spec.structural.classes.enums.javamodel.IEnum> selectEnums();
  
  public java.util.List<? extends cleon.ddd.spec.javamodel.IEventAggregator> selectEventAggregator();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,mGuSd6C/9L6ku/slZFzJ9TVyTAM=] */
