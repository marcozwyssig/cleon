package cleon.support.projectmanagement.spec.planning.organisation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Organisation extends DynamicResource implements IOrganisation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisation>() {
    
    @Override
    public IOrganisation create() {
      return new Organisation();
    }
    
    @Override
    public IOrganisation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Organisation(resourceRepository, resource);
    }
  
  };

  public Organisation() {
    super(IOrganisation.TYPE_ID);
  }
  
  public Organisation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrganisation.TYPE_ID);
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

  public Organisation setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.IRoles selectRoles() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.IRoles.class, cleon.support.projectmanagement.spec.planning.organisation.OrganisationPackage.Organisation_roles);
  }

  public Organisation setRoles(cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.IRoles roles) {
    _setSingle(cleon.support.projectmanagement.spec.planning.organisation.OrganisationPackage.Organisation_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Organisation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.IRoles.class, cleon.support.projectmanagement.spec.planning.organisation.OrganisationPackage.Organisation_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.planning.organisation.javamodel.IOrganisation selectToMeRoles(cleon.support.projectmanagement.spec.planning.organisation.roles.javamodel.IRoles object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.organisation.javamodel.IOrganisation.class, cleon.support.projectmanagement.spec.planning.organisation.OrganisationPackage.Organisation_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7d0996e3-210a-11e8-9bf6-d910b575bad9,V4/f6IAvEjILlQi6cw9gIbmBvPk=] */
