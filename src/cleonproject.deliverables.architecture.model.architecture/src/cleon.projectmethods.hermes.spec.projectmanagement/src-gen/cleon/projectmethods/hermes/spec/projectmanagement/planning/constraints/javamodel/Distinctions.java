package cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Distinctions extends DynamicResource implements IDistinctions {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistinctions> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDistinctions>() {
    
    @Override
    public IDistinctions create() {
      return new Distinctions();
    }
    
    @Override
    public IDistinctions create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Distinctions(resourceRepository, resource);
    }
  
  };

  public Distinctions() {
    super(IDistinctions.TYPE_ID);
  }
  
  public Distinctions(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDistinctions.TYPE_ID);
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

  public Distinctions setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IProjectDistinction> selectProjectDistinctions() {
    return _getMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IProjectDistinction.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Distinctions_projectDistinctions);
  }

  public Distinctions setProjectDistinctions(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IProjectDistinction> projectDistinctions) {
    _setMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Distinctions_projectDistinctions, projectDistinctions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Distinctions setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IProjectDistinction.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Distinctions_projectDistinctions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDistinctions selectToMeProjectDistinctions(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IProjectDistinction object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IDistinctions.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.ConstraintsPackage.Distinctions_projectDistinctions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,613dabdb-d437-11e6-8a1d-7fdd5d29730e,1I5VPDUM4MZe6Qs2CmBeRXZfYiw=] */
