package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AcceptanceCriteria extends DynamicResource implements IAcceptanceCriteria {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAcceptanceCriteria> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAcceptanceCriteria>() {
    
    @Override
    public IAcceptanceCriteria create() {
      return new AcceptanceCriteria();
    }
    
    @Override
    public IAcceptanceCriteria create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AcceptanceCriteria(resourceRepository, resource);
    }
  
  };

  public AcceptanceCriteria() {
    super(IAcceptanceCriteria.TYPE_ID);
  }
  
  public AcceptanceCriteria(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAcceptanceCriteria.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AcceptanceCriteria setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e1b6a50c-3cb0-11f1-9432-65d6b2716831,A1QcJbA+6cvD7EbHKXhfBRoP++Q=] */
