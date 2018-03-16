package cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourceUtilization extends DynamicResource implements IResourceUtilization {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceUtilization> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceUtilization>() {
    
    @Override
    public IResourceUtilization create() {
      return new ResourceUtilization();
    }
    
    @Override
    public IResourceUtilization create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourceUtilization(resourceRepository, resource);
    }
  
  };

  public ResourceUtilization() {
    super(IResourceUtilization.TYPE_ID);
  }
  
  public ResourceUtilization(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourceUtilization.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ResourceUtilization setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourceUtilization setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization> selectUtilizateRoles() {
    return _getMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_utilizateRoles);
  }

  public ResourceUtilization setUtilizateRoles(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization> utilizateRoles) {
    _setMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_utilizateRoles, utilizateRoles);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_utilizateRoles, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IResourceUtilization selectToMeUtilizateRoles(cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IResourceUtilization.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.UtilizationPackage.ResourceUtilization_utilizateRoles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8db4bffd-bbd5-11e6-997f-d73ea5a3671c,tJBPM6aKuDhFj28B0FU0MSMTUMc=] */
