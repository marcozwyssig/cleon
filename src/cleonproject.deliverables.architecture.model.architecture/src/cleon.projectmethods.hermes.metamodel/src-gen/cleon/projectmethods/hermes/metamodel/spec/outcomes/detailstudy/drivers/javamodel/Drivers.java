package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Drivers extends DynamicResource implements IDrivers {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDrivers> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDrivers>() {
    
    @Override
    public IDrivers create() {
      return new Drivers();
    }
    
    @Override
    public IDrivers create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Drivers(resourceRepository, resource);
    }
  
  };

  public Drivers() {
    super(IDrivers.TYPE_ID);
  }
  
  public Drivers(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDrivers.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Drivers setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IContext selectContext() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IContext.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_context);
  }

  public Drivers setContext(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IContext context) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_context, context);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Drivers setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriterias selectKnockoutCriterias() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriterias.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_knockoutCriterias);
  }

  public Drivers setKnockoutCriterias(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriterias knockoutCriterias) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_knockoutCriterias, knockoutCriterias);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Drivers setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.ISource> selectSources() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.ISource.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_sources);
  }

  public Drivers setSources(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.ISource> sources) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_sources, sources);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Drivers setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriterias selectWeightingCriterias() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriterias.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_weightingCriterias);
  }

  public Drivers setWeightingCriterias(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriterias weightingCriterias) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_weightingCriterias, weightingCriterias);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IContext.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_context, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriterias.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_knockoutCriterias, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.ISource.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_sources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriterias.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_weightingCriterias, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers selectToMeContext(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IContext object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_context, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers selectToMeKnockoutCriterias(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriterias object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_knockoutCriterias, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers selectToMeWeightingCriterias(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriterias object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_weightingCriterias, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers selectToMeSources(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.ISource object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.javamodel.IDrivers.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.DriversPackage.Drivers_sources, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,877f094b-3c14-11e5-9962-cf3035adb922,3OdEriIK8lOcLG4LUMo4VmFajKU=] */
