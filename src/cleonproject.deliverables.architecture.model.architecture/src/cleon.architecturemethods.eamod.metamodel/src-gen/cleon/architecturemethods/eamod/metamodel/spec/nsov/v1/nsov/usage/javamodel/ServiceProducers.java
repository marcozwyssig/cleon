package cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceProducers extends DynamicResource implements IServiceProducers {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceProducers> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceProducers>() {
    
    @Override
    public IServiceProducers create() {
      return new ServiceProducers();
    }
    
    @Override
    public IServiceProducers create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceProducers(resourceRepository, resource);
    }
  
  };

  public ServiceProducers() {
    super(IServiceProducers.TYPE_ID);
  }
  
  public ServiceProducers(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceProducers.TYPE_ID);
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

  public ServiceProducers setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable> selectDeliverables() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.Deliverables_deliverables);
  }

  public ServiceProducers setDeliverables(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable> deliverables) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.Deliverables_deliverables, deliverables);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ServiceProducers setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ServiceProducers setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.javamodel.IServiceUsage> selectServices() {
    return _getMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.javamodel.IServiceUsage.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.UsagePackage.ServiceProducers_services);
  }

  public ServiceProducers setServices(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.javamodel.IServiceUsage> services) {
    _setMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.UsagePackage.ServiceProducers_services, services);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceProducers setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.Deliverables_deliverables, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.javamodel.IServiceUsage.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.UsagePackage.ServiceProducers_services, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.javamodel.IServiceProducers selectToMeServices(cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.javamodel.IServiceUsage object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.javamodel.IServiceProducers.class, cleon.architecturemethods.eamod.metamodel.spec.nsov.v1.nsov.usage.UsagePackage.ServiceProducers_services, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e164d2a6-c690-11e6-8242-2f0ed6756d77,eoRwsrHQ+pEeIRvuYfNZ+fvyI3k=] */
