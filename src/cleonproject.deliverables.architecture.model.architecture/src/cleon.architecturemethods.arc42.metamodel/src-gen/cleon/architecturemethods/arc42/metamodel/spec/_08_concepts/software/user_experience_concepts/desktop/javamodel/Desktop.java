package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.user_experience_concepts.desktop.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Desktop extends DynamicResource implements IDesktop {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDesktop> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDesktop>() {
    
    @Override
    public IDesktop create() {
      return new Desktop();
    }
    
    @Override
    public IDesktop create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Desktop(resourceRepository, resource);
    }
  
  };

  public Desktop() {
    super(IDesktop.TYPE_ID);
  }
  
  public Desktop(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDesktop.TYPE_ID);
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

  public Desktop setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,05bff060-11f6-11e5-848b-017a3a98ae34,225J89R1LlQM5uV9mq5Rrm28yEo=] */
