package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAggregate extends cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.INamedPackage, cleon.modelinglanguages.uml.metamodel.spec.structural.packages.javamodel.INoSubPackages {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("83c13817-10c0-11e3-b60e-ab478a3e1eca");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.entities.javamodel.IEntity> selectEntities();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.exceptions.javamodel.IDomainException> selectExceptions();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.valueobjects.javamodel.IValueObject> selectValueObjects();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.repository.javamodel.IRepository> selectRepository();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.services.javamodel.IDomainService> selectDomainServices();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.enums.javamodel.IEnum> selectEnums();
  
  public java.util.List<? extends cleon.architecturestylesandpatterns.eda.metamodel.spec.eventaggregator.javamodel.IEventAggregator> selectEventAggregator();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,83c13817-10c0-11e3-b60e-ab478a3e1eca,T1PGarj8A3gJDQeehu63zahP+Ik=] */
