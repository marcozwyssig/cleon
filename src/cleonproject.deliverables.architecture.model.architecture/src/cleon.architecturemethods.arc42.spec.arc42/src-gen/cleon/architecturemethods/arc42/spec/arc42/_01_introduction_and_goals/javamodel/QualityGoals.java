package cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QualityGoals extends DynamicResource implements IQualityGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityGoals>() {
    
    @Override
    public IQualityGoals create() {
      return new QualityGoals();
    }
    
    @Override
    public IQualityGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QualityGoals(resourceRepository, resource);
    }
  
  };

  public QualityGoals() {
    super(IQualityGoals.TYPE_ID);
  }
  
  public QualityGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQualityGoals.TYPE_ID);
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

  public QualityGoals setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoal> selectQualityGoals() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoal.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.QualityGoals_qualityGoals);
  }

  public QualityGoals setQualityGoals(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoal> qualityGoals) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.QualityGoals_qualityGoals, qualityGoals);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QualityGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoal.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.QualityGoals_qualityGoals, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals selectToMeQualityGoals(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoal object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IQualityGoals.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.QualityGoals_qualityGoals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f73da048-11fc-11e5-848b-017a3a98ae34,pLxEMTJ77tivB4jGMTAZXPabA74=] */
