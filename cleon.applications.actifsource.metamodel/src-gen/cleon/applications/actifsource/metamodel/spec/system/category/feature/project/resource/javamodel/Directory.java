package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Directory extends DynamicResource implements IDirectory {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDirectory> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDirectory>() {
    
    @Override
    public IDirectory create() {
      return new Directory();
    }
    
    @Override
    public IDirectory create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Directory(resourceRepository, resource);
    }
  
  };

  public Directory() {
    super(IDirectory.TYPE_ID);
  }
  
  public Directory(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDirectory.TYPE_ID);
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

  public Directory setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c8b68e26-5201-11e5-89ac-35d4069568da,h0fSKndoFlDoUsBOqRe4yWOuiX0=] */
