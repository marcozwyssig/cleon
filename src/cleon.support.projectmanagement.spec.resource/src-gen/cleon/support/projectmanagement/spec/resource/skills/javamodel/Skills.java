package cleon.support.projectmanagement.spec.resource.skills.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Skills extends DynamicResource implements ISkills {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISkills> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISkills>() {
    
    @Override
    public ISkills create() {
      return new Skills();
    }
    
    @Override
    public ISkills create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Skills(resourceRepository, resource);
    }
  
  };

  public Skills() {
    super(ISkills.TYPE_ID);
  }
  
  public Skills(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISkills.TYPE_ID);
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

  public Skills setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.resource.skills.javamodel.ISkill> selectSkills() {
    return _getList(cleon.support.projectmanagement.spec.resource.skills.javamodel.ISkill.class, cleon.support.projectmanagement.spec.resource.skills.SkillsPackage.Skills_skills);
  }

  public Skills setSkills(java.util.List<? extends cleon.support.projectmanagement.spec.resource.skills.javamodel.ISkill> skills) {
    _setList(cleon.support.projectmanagement.spec.resource.skills.SkillsPackage.Skills_skills, skills);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Skills setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.support.projectmanagement.spec.resource.skills.javamodel.ISkill.class, cleon.support.projectmanagement.spec.resource.skills.SkillsPackage.Skills_skills, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.resource.skills.javamodel.ISkills selectToMeSkills(cleon.support.projectmanagement.spec.resource.skills.javamodel.ISkill object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.resource.skills.javamodel.ISkills.class, cleon.support.projectmanagement.spec.resource.skills.SkillsPackage.Skills_skills, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,301e91fc-a7e4-11e5-82dd-3b995d9c840c,clYzO0eIMLBCvCUc4fWq3dB050s=] */
