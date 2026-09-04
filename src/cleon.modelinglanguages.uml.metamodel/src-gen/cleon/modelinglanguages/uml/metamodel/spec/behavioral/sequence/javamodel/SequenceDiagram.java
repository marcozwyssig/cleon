package cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SequenceDiagram extends DynamicResource implements ISequenceDiagram {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISequenceDiagram> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISequenceDiagram>() {
    
    @Override
    public ISequenceDiagram create() {
      return new SequenceDiagram();
    }
    
    @Override
    public ISequenceDiagram create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SequenceDiagram(resourceRepository, resource);
    }
  
  };

  public SequenceDiagram() {
    super(ISequenceDiagram.TYPE_ID);
  }
  
  public SequenceDiagram(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISequenceDiagram.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.Boolean selectLeftToRight() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_leftToRight);
  }
    
  public void setLeftToRight(java.lang.Boolean leftToRight) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_leftToRight, leftToRight);
  }

  @Override
  public java.lang.Boolean selectMonochrome() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_monochrome);
  }
    
  public void setMonochrome(java.lang.Boolean monochrome) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_monochrome, monochrome);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_path);
  }
    
  public void setPath(java.lang.String path) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_path, path);
  }

  @Override
  public java.lang.String selectScale() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_scale);
  }
    
  public void setScale(java.lang.String scale) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_scale, scale);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements);
  }

  public SequenceDiagram setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation> selectNameTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation);
  }

  public SequenceDiagram setNameTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation> nameTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation, nameTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SequenceDiagram setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant> selectParticipants() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.SequenceDiagram_participants);
  }

  public SequenceDiagram setParticipants(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant> participants) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.SequenceDiagram_participants, participants);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IAbstractSequence> selectSequences() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IAbstractSequence.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.SequenceDiagram_sequences);
  }

  public SequenceDiagram setSequences(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IAbstractSequence> sequences) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.SequenceDiagram_sequences, sequences);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SequenceDiagram setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_leftToRight, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_monochrome, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_path, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.metamodel.spec.SpecPackage.UmlDiagram_scale, visitor);
    // relations
    _acceptMap(cleon.common.language.metamodel.spec.translation.name.javamodel.ILanguageNameTranslation.class, cleon.common.language.metamodel.spec.translation.name.NamePackage.MultilingualName_nameTranslation, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.SequenceDiagram_participants, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IAbstractSequence.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.SequenceDiagram_sequences, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.ISequenceDiagram selectToMeParticipants(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IParticipant object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.ISequenceDiagram.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.SequenceDiagram_participants, object.getResource());
  }
  
  public static cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.ISequenceDiagram selectToMeSequences(cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.IAbstractSequence object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.javamodel.ISequenceDiagram.class, cleon.modelinglanguages.uml.metamodel.spec.behavioral.sequence.SequencePackage.SequenceDiagram_sequences, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,66daed74-de53-11ef-81c7-3391f050addb,TMMio5VqUYEAPRCIHXxYnzwWOuk=] */
