package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DataCenterSpecifications extends DynamicResource implements IDataCenterSpecifications {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDataCenterSpecifications> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDataCenterSpecifications>() {
    
    @Override
    public IDataCenterSpecifications create() {
      return new DataCenterSpecifications();
    }
    
    @Override
    public IDataCenterSpecifications create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DataCenterSpecifications(resourceRepository, resource);
    }
  
  };

  public DataCenterSpecifications() {
    super(IDataCenterSpecifications.TYPE_ID);
  }
  
  public DataCenterSpecifications(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDataCenterSpecifications.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
  }

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

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath, noChapterPath);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public DataCenterSpecifications setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplyDataCenter selectDatacenter() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplyDataCenter.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_datacenter);
  }

  public DataCenterSpecifications setDatacenter(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplyDataCenter datacenter) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_datacenter, datacenter);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public DataCenterSpecifications setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public DataCenterSpecifications setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode selectEnvironment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_environment);
  }

  public DataCenterSpecifications setEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode environment) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_environment, environment);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IHostSpecification> selectHostSpecification() {
    return _getMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IHostSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_hostSpecification);
  }

  public DataCenterSpecifications setHostSpecification(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IHostSpecification> hostSpecification) {
    _setMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_hostSpecification, hostSpecification);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DataCenterSpecifications setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplySiteNode selectSite() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplySiteNode.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_site);
  }

  public DataCenterSpecifications setSite(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplySiteNode site) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_site, site);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.ISysCfgSpecification> selectSystemConfigurationSpecifications() {
    return _getMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.ISysCfgSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.SyscmpPackage.AbstractListOfSysCfgSpecifications_systemConfigurationSpecifications);
  }

  public DataCenterSpecifications setSystemConfigurationSpecifications(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.ISysCfgSpecification> systemConfigurationSpecifications) {
    _setMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.SyscmpPackage.AbstractListOfSysCfgSpecifications_systemConfigurationSpecifications, systemConfigurationSpecifications);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DataCenterSpecifications setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DataCenterSpecifications setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplyDataCenter.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_datacenter, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_environment, visitor);
    _acceptMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IHostSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_hostSpecification, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplySiteNode.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_site, visitor);
    _acceptMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.ISysCfgSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.SyscmpPackage.AbstractListOfSysCfgSpecifications_systemConfigurationSpecifications, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IDataCenterSpecifications selectToMeHostSpecification(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IHostSpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IDataCenterSpecifications.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_hostSpecification, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IDataCenterSpecifications> selectToMeDatacenter(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplyDataCenter object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IDataCenterSpecifications.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_datacenter, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IDataCenterSpecifications> selectToMeSite(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.supplynode.javamodel.ISupplySiteNode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IDataCenterSpecifications.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_site, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IDataCenterSpecifications> selectToMeEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IDataCenterSpecifications.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.EnvPackage.DataCenterSpecifications_environment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,214db42e-001c-11f0-945c-87b19aec41f4,Bdmi8BbFJHHY0JT70GNqsEfFfHU=] */
