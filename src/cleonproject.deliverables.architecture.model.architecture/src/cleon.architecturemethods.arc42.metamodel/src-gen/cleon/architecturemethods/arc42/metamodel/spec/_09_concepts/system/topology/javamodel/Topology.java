package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Topology extends DynamicResource implements ITopology {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITopology> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITopology>() {
    
    @Override
    public ITopology create() {
      return new Topology();
    }
    
    @Override
    public ITopology create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Topology(resourceRepository, resource);
    }
  
  };

  public Topology() {
    super(ITopology.TYPE_ID);
  }
  
  public Topology(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITopology.TYPE_ID);
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
  public java.lang.String selectDomainPrefix() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Topology_domainPrefix);
  }
    
  public void setDomainPrefix(java.lang.String domainPrefix) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Topology_domainPrefix, domainPrefix);
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

  public Topology setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Topology setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IDeployView selectEnvironments() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IDeployView.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Topology_environments);
  }

  public Topology setEnvironments(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IDeployView environments) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Topology_environments, environments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Topology setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment> selectTopologyEnvironment() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Topology_topologyEnvironment);
  }

  public Topology setTopologyEnvironment(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment> topologyEnvironment) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Topology_topologyEnvironment, topologyEnvironment);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Topology setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Topology_domainPrefix, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IDeployView.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Topology_environments, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Topology_topologyEnvironment, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopology selectToMeTopologyEnvironment(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopology.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Topology_topologyEnvironment, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopology selectToMeEnvironments(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IDeployView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopology.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.Topology_environments, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fca3a39b-878a-11e9-a61b-279ebde48b48,Y2r5W0pkdy49cM5tR+TTAH0p85I=] */
