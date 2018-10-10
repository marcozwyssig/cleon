package cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Code extends DynamicResource implements ICode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICode>() {
    
    @Override
    public ICode create() {
      return new Code();
    }
    
    @Override
    public ICode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Code(resourceRepository, resource);
    }
  
  };

  public Code() {
    super(ICode.TYPE_ID);
  }
  
  public Code(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICode.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICodeRepository> selectStore() {
    return _getList(cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICodeRepository.class, cleon.architecturemethods.arc42.spec.devops.spec.code.CodePackage.Code_store);
  }

  public Code setStore(java.util.List<? extends cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICodeRepository> store) {
    _setList(cleon.architecturemethods.arc42.spec.devops.spec.code.CodePackage.Code_store, store);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Code setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICodeRepository.class, cleon.architecturemethods.arc42.spec.devops.spec.code.CodePackage.Code_store, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICode selectToMeStore(cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICodeRepository object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel.ICode.class, cleon.architecturemethods.arc42.spec.devops.spec.code.CodePackage.Code_store, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c9bd141d-406e-11e5-b5f0-5b1ce9c3de3e,2XuodUKEk2NqkcDeWLiu8rtd1rM=] */
