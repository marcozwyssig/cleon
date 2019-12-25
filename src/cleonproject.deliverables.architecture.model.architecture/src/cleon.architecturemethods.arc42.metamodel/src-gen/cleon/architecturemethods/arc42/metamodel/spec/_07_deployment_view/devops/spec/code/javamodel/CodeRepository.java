package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.javamodel;

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
  public java.lang.String selectPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.CodePackage.CodeRepository_path);
  }
    
  public void setPath(java.lang.String path) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.CodePackage.CodeRepository_path, path);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.javamodel.IClassification selectClassification() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.javamodel.IClassification.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.CodePackage.CodeRepository_classification);
  }

  public CodeRepository setClassification(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.javamodel.IClassification classification) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.CodePackage.CodeRepository_classification, classification);
    return this;
  }
    
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
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.CodePackage.CodeRepository_path, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.javamodel.IClassification.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.CodePackage.CodeRepository_classification, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.javamodel.ICodeRepository> selectToMeClassification(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.javamodel.IClassification object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.javamodel.ICodeRepository.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.code.CodePackage.CodeRepository_classification, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2f377098-4072-11e5-b5f0-5b1ce9c3de3e,tvjKcuY3398Xzk9iWDCH7J8vOK4=] */
