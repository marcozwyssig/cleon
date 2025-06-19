package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedMember extends DynamicResource implements INamedMember {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedMember> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedMember>() {
    
    @Override
    public INamedMember create() {
      return new NamedMember();
    }
    
    @Override
    public INamedMember create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedMember(resourceRepository, resource);
    }
  
  };

  public NamedMember() {
    super(INamedMember.TYPE_ID);
  }
  
  public NamedMember(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedMember.TYPE_ID);
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

  public NamedMember setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e98fa26e-07fd-11f0-bc12-1bbda1d7028e,/fW/7clZasX4/PUbiU6gpDpAbQI=] */
