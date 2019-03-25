package cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PlanningDocument extends DynamicResource implements IPlanningDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlanningDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlanningDocument>() {
    
    @Override
    public IPlanningDocument create() {
      return new PlanningDocument();
    }
    
    @Override
    public IPlanningDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PlanningDocument(resourceRepository, resource);
    }
  
  };

  public PlanningDocument() {
    super(IPlanningDocument.TYPE_ID);
  }
  
  public PlanningDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPlanningDocument.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public PlanningDocument setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IConstraints selectConstraints() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IConstraints.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_constraints);
  }

  public PlanningDocument setConstraints(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IConstraints constraints) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_constraints, constraints);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public PlanningDocument setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage);
  }

  public PlanningDocument setDocumentLanguage(java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoals selectGoals() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoals.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_goals);
  }

  public PlanningDocument setGoals(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoals goals) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_goals, goals);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.initialposition.javamodel.IInitialposition selectInitialposition() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.initialposition.javamodel.IInitialposition.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_initialposition);
  }

  public PlanningDocument setInitialposition(cleon.projectmethods.hermes.spec.projectmanagement.planning.initialposition.javamodel.IInitialposition initialposition) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_initialposition, initialposition);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public PlanningDocument setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement selectResourceManagement() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_resourceManagement);
  }

  public PlanningDocument setResourceManagement(cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement resourceManagement) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_resourceManagement, resourceManagement);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.javamodel.ISchedule selectSchedule() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.javamodel.ISchedule.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_schedule);
  }

  public PlanningDocument setSchedule(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.javamodel.ISchedule schedule) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_schedule, schedule);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IScope selectScope() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IScope.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_scope);
  }

  public PlanningDocument setScope(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IScope scope) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_scope, scope);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public PlanningDocument setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PlanningDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IConstraints.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_constraints, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoals.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_goals, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.initialposition.javamodel.IInitialposition.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_initialposition, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_resourceManagement, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.javamodel.ISchedule.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_schedule, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IScope.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_scope, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectToMeInitialposition(cleon.projectmethods.hermes.spec.projectmanagement.planning.initialposition.javamodel.IInitialposition object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_initialposition, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectToMeGoals(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_goals, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectToMeConstraints(cleon.projectmethods.hermes.spec.projectmanagement.planning.constraints.javamodel.IConstraints object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_constraints, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectToMeScope(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IScope object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_scope, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectToMeSchedule(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.javamodel.ISchedule object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_schedule, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument> selectToMeResourceManagement(cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.PlanningPackage.PlanningDocument_resourceManagement, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c6b25ecc-bd15-11e6-ba29-0d3a53b7fc17,B0YvfcwVd0Z8PyhRo2iijMHv6GU=] */
