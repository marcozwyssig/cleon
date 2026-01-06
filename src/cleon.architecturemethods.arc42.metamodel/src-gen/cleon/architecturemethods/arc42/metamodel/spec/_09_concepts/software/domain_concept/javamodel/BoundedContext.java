package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class BoundedContext extends DynamicResource implements IBoundedContext {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBoundedContext> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBoundedContext>() {
    
    @Override
    public IBoundedContext create() {
      return new BoundedContext();
    }
    
    @Override
    public IBoundedContext create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new BoundedContext(resourceRepository, resource);
    }
  
  };

  public BoundedContext() {
    super(IBoundedContext.TYPE_ID);
  }
  
  public BoundedContext(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBoundedContext.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IAggregate> selectAggregates() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.Domain_conceptPackage.BoundedContext_aggregates);
  }

  public BoundedContext setAggregates(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IAggregate> aggregates) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.Domain_conceptPackage.BoundedContext_aggregates, aggregates);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public BoundedContext setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IAggregate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.Domain_conceptPackage.BoundedContext_aggregates, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IBoundedContext selectToMeAggregates(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IAggregate object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.javamodel.IBoundedContext.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.domain_concept.Domain_conceptPackage.BoundedContext_aggregates, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c2f1fc72-e28d-11f0-a927-5b9cb523e701,zsxxSC3UiUGqarl+aqRFg+tjkSk=] */
