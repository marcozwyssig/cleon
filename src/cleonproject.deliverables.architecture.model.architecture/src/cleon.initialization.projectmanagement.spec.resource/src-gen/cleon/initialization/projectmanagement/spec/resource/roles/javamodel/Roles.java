package cleon.initialization.projectmanagement.spec.resource.roles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Roles extends DynamicResource implements IRoles {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoles> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoles>() {
    
    @Override
    public IRoles create() {
      return new Roles();
    }
    
    @Override
    public IRoles create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Roles(resourceRepository, resource);
    }
  
  };

  public Roles() {
    super(IRoles.TYPE_ID);
  }
  
  public Roles(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoles.TYPE_ID);
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

  public Roles setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRole> selectRoles() {
    return _getList(cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRole.class, cleon.initialization.projectmanagement.spec.resource.roles.RolesPackage.Roles_roles);
  }

  public Roles setRoles(java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRole> roles) {
    _setList(cleon.initialization.projectmanagement.spec.resource.roles.RolesPackage.Roles_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Roles setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
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
    _acceptList(cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRole.class, cleon.initialization.projectmanagement.spec.resource.roles.RolesPackage.Roles_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRoles selectToMeRoles(cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRole object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.resource.roles.javamodel.IRoles.class, cleon.initialization.projectmanagement.spec.resource.roles.RolesPackage.Roles_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ed388f5b-bc93-11e6-904c-8bf6f8927ff0,/xFqNvHXZHea4+Qs0e1ZyrUcx1w=] */