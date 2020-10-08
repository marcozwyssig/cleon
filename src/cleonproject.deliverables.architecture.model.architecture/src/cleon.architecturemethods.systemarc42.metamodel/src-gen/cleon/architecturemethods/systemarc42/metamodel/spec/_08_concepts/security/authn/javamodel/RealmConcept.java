package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RealmConcept extends DynamicResource implements IRealmConcept {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmConcept> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRealmConcept>() {
    
    @Override
    public IRealmConcept create() {
      return new RealmConcept();
    }
    
    @Override
    public IRealmConcept create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RealmConcept(resourceRepository, resource);
    }
  
  };

  public RealmConcept() {
    super(IRealmConcept.TYPE_ID);
  }
  
  public RealmConcept(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRealmConcept.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public RealmConcept setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public RealmConcept setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RealmConcept setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmConfiguration> selectRealmConfigurations() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.AuthnPackage.RealmConcept_realmConfigurations);
  }

  public RealmConcept setRealmConfigurations(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmConfiguration> realmConfigurations) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.AuthnPackage.RealmConcept_realmConfigurations, realmConfigurations);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmForSystem> selectRealmForSystems() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmForSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.AuthnPackage.RealmConcept_realmForSystems);
  }

  public RealmConcept setRealmForSystems(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmForSystem> realmForSystems) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.AuthnPackage.RealmConcept_realmForSystems, realmForSystems);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RealmConcept setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.AuthnPackage.RealmConcept_realmConfigurations, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmForSystem.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.AuthnPackage.RealmConcept_realmForSystems, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmConcept selectToMeRealmConfigurations(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.AuthnPackage.RealmConcept_realmConfigurations, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmConcept selectToMeRealmForSystems(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmForSystem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.javamodel.IRealmConcept.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authn.AuthnPackage.RealmConcept_realmForSystems, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ebac8bd2-0eaf-11e9-9f19-6d15636f4ecc,kGvr8Ci2zWQOifPntel7iK8a8i0=] */
