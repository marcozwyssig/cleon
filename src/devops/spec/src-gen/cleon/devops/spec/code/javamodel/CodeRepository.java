package cleon.devops.spec.code.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CodeRepository extends DynamicResource implements ICodeRepository {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICodeRepository> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICodeRepository>() {
    
    @Override
    public ICodeRepository create() {
      return new CodeRepository();
    }
    
    @Override
    public ICodeRepository create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CodeRepository(resourceRepository, resource);
    }
  
  };

  public CodeRepository() {
    super(ICodeRepository.TYPE_ID);
  }
  
  public CodeRepository(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICodeRepository.TYPE_ID);
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

  public CodeRepository setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2f377098-4072-11e5-b5f0-5b1ce9c3de3e,E81tlOzjLtpc9is8EhAf6MEGo0Q=] */
