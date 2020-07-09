package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Script extends DynamicResource implements IScript {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScript> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IScript>() {
    
    @Override
    public IScript create() {
      return new Script();
    }
    
    @Override
    public IScript create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Script(resourceRepository, resource);
    }
  
  };

  public Script() {
    super(IScript.TYPE_ID);
  }
  
  public Script(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IScript.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIntervalIncidentMinutes() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_intervalIncidentMinutes);
  }
    
  public void setIntervalIncidentMinutes(java.lang.Integer intervalIncidentMinutes) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_intervalIncidentMinutes, intervalIncidentMinutes);
  }

  @Override
  public java.lang.Integer selectIntervalNormalMinutes() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_intervalNormalMinutes);
  }
    
  public void setIntervalNormalMinutes(java.lang.Integer intervalNormalMinutes) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_intervalNormalMinutes, intervalNormalMinutes);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour select__W_stErrorBehaviour() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___W_stErrorBehaviour);
  }

  public Script set__W_stErrorBehaviour(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour __W_stErrorBehaviour) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___W_stErrorBehaviour, __W_stErrorBehaviour);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour select__X_ndErrorBehaviour() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___X_ndErrorBehaviour);
  }

  public Script set__X_ndErrorBehaviour(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour __X_ndErrorBehaviour) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___X_ndErrorBehaviour, __X_ndErrorBehaviour);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour select__Y_rdErrorBehaviour() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___Y_rdErrorBehaviour);
  }

  public Script set__Y_rdErrorBehaviour(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour __Y_rdErrorBehaviour) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___Y_rdErrorBehaviour, __Y_rdErrorBehaviour);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Script setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Script setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Script setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IParameter> selectParameters() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IParameter.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_parameters);
  }

  public Script setParameters(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IParameter> parameters) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_parameters, parameters);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Script setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour selectWarningBehaviour() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_warningBehaviour);
  }

  public Script setWarningBehaviour(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour warningBehaviour) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_warningBehaviour, warningBehaviour);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_intervalIncidentMinutes, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_intervalNormalMinutes, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___W_stErrorBehaviour, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___X_ndErrorBehaviour, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___Y_rdErrorBehaviour, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IParameter.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_parameters, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_warningBehaviour, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript selectToMeParameters(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IParameter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_parameters, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript selectToMe__W_stErrorBehaviour(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___W_stErrorBehaviour, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript selectToMe__X_ndErrorBehaviour(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___X_ndErrorBehaviour, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript selectToMe__Y_rdErrorBehaviour(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script___Y_rdErrorBehaviour, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript selectToMeWarningBehaviour(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IAlarmBehaviour object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.javamodel.IScript.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.scripts.ScriptsPackage.Script_warningBehaviour, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4ab16a4b-8fdf-11e8-85d9-314ddfdf57eb,ERNkvQNWhfOxVFJIe+Zh/f7jAUY=] */
