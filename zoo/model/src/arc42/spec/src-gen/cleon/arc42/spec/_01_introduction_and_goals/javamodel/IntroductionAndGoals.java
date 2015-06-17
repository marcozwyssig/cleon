package cleon.arc42.spec._01_introduction_and_goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IntroductionAndGoals extends DynamicResource implements IIntroductionAndGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIntroductionAndGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIntroductionAndGoals>() {
    
    @Override
    public IIntroductionAndGoals create() {
      return new IntroductionAndGoals();
    }
    
    @Override
    public IIntroductionAndGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IntroductionAndGoals(resourceRepository, resource);
    }
  
  };

  public IntroductionAndGoals() {
    super(IIntroductionAndGoals.TYPE_ID);
  }
  
  public IntroductionAndGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIntroductionAndGoals.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters);
  }

  public IntroductionAndGoals setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public IntroductionAndGoals setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._01_introduction_and_goals.javamodel.IQualityGoals> selectQualityGoals() {
    return _getList(cleon.arc42.spec._01_introduction_and_goals.javamodel.IQualityGoals.class, cleon.arc42.spec._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_qualityGoals);
  }

  public IntroductionAndGoals setQualityGoals(java.util.List<? extends cleon.arc42.spec._01_introduction_and_goals.javamodel.IQualityGoals> qualityGoals) {
    _setList(cleon.arc42.spec._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_qualityGoals, qualityGoals);
    return this;
  }
    
  @Override
  public cleon.arc42.spec._01_introduction_and_goals.javamodel.IRequirements selectRequirements() {
    return _getSingle(cleon.arc42.spec._01_introduction_and_goals.javamodel.IRequirements.class, cleon.arc42.spec._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_requirements);
  }

  public IntroductionAndGoals setRequirements(cleon.arc42.spec._01_introduction_and_goals.javamodel.IRequirements requirements) {
    _setSingle(cleon.arc42.spec._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_requirements, requirements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IntroductionAndGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.arc42.spec._01_introduction_and_goals.javamodel.IQualityGoals.class, cleon.arc42.spec._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_qualityGoals, visitor);
    _acceptSingle(cleon.arc42.spec._01_introduction_and_goals.javamodel.IRequirements.class, cleon.arc42.spec._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_requirements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.arc42.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals selectToMeRequirements(cleon.arc42.spec._01_introduction_and_goals.javamodel.IRequirements object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.arc42.spec._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_requirements, object.getResource());
  }
  
  public static java.util.List<cleon.arc42.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals> selectToMeQualityGoals(cleon.arc42.spec._01_introduction_and_goals.javamodel.IQualityGoals object) {
    return _getToMeList(object.getRepository(), cleon.arc42.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.arc42.spec._01_introduction_and_goals._01_introduction_and_goalsPackage.IntroductionAndGoals_qualityGoals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b1708484-11fc-11e5-848b-017a3a98ae34,8Y4HhfTpjVFpccMrdF4zK5yZeqY=] */
