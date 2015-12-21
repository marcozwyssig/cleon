package cleon.sda.spec.requirementmanagement.driver.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Source extends DynamicResource implements ISource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISource>() {
    
    @Override
    public ISource create() {
      return new Source();
    }
    
    @Override
    public ISource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Source(resourceRepository, resource);
    }
  
  };

  public Source() {
    super(ISource.TYPE_ID);
  }
  
  public Source(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISource.TYPE_ID);
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

  public Source setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,efb0f224-a281-11e5-9332-1b5893de4362,/TbBm26otOtLTdiUnR1tJhdbJCM=] */
