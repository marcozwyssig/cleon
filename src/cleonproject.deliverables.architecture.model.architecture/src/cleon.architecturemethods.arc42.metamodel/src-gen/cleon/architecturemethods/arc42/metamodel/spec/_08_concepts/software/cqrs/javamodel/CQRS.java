package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.cqrs.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CQRS extends DynamicResource implements ICQRS {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICQRS> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICQRS>() {
    
    @Override
    public ICQRS create() {
      return new CQRS();
    }
    
    @Override
    public ICQRS create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CQRS(resourceRepository, resource);
    }
  
  };

  public CQRS() {
    super(ICQRS.TYPE_ID);
  }
  
  public CQRS(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICQRS.TYPE_ID);
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

  public CQRS setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ebb6e640-11f5-11e5-848b-017a3a98ae34,AnCoMeaefFGyZKtynLqDW6w3CPA=] */
