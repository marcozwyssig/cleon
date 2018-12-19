package cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ResourceManagement extends DynamicResource implements IResourceManagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceManagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResourceManagement>() {
    
    @Override
    public IResourceManagement create() {
      return new ResourceManagement();
    }
    
    @Override
    public IResourceManagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ResourceManagement(resourceRepository, resource);
    }
  
  };

  public ResourceManagement() {
    super(IResourceManagement.TYPE_ID);
  }
  
  public ResourceManagement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResourceManagement.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters);
  }

  public ResourceManagement setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ResourceManagement setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.javamodel.IInfrastructure selectInfrastructure() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.javamodel.IInfrastructure.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_infrastructure);
  }

  public ResourceManagement setInfrastructure(cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.javamodel.IInfrastructure infrastructure) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_infrastructure, infrastructure);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.locations.javamodel.ILocations selectLocations() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.locations.javamodel.ILocations.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_locations);
  }

  public ResourceManagement setLocations(cleon.projectmethods.hermes.spec.projectmanagement.resource.locations.javamodel.ILocations locations) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_locations, locations);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisations selectOrganisations() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisations.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_organisations);
  }

  public ResourceManagement setOrganisations(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisations organisations) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_organisations, organisations);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ResourceManagement setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPersons selectPersons() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPersons.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_persons);
  }

  public ResourceManagement setPersons(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPersons persons) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_persons, persons);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public ResourceManagement setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.roles.javamodel.IRoles selectRoles() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.roles.javamodel.IRoles.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_roles);
  }

  public ResourceManagement setRoles(cleon.projectmethods.hermes.spec.projectmanagement.resource.roles.javamodel.IRoles roles) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_roles, roles);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.skills.javamodel.ISkills selectSkills() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.skills.javamodel.ISkills.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_skills);
  }

  public ResourceManagement setSkills(cleon.projectmethods.hermes.spec.projectmanagement.resource.skills.javamodel.ISkills skills) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_skills, skills);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public ResourceManagement setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel.ITeams selectTeams() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel.ITeams.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_teams);
  }

  public ResourceManagement setTeams(cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel.ITeams teams) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_teams, teams);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ResourceManagement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.javamodel.IInfrastructure.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_infrastructure, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.locations.javamodel.ILocations.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_locations, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisations.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_organisations, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPersons.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_persons, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.roles.javamodel.IRoles.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_roles, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.skills.javamodel.ISkills.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_skills, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel.ITeams.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_teams, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement selectToMeOrganisations(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisations object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_organisations, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement selectToMePersons(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPersons object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_persons, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement selectToMeSkills(cleon.projectmethods.hermes.spec.projectmanagement.resource.skills.javamodel.ISkills object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_skills, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement selectToMeRoles(cleon.projectmethods.hermes.spec.projectmanagement.resource.roles.javamodel.IRoles object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_roles, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement selectToMeInfrastructure(cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.javamodel.IInfrastructure object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_infrastructure, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement selectToMeLocations(cleon.projectmethods.hermes.spec.projectmanagement.resource.locations.javamodel.ILocations object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_locations, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement selectToMeTeams(cleon.projectmethods.hermes.spec.projectmanagement.resource.teams.javamodel.ITeams object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.javamodel.IResourceManagement.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.ResourcePackage.ResourceManagement_teams, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a143e996-a7e5-11e5-82dd-3b995d9c840c,E/Q9xwqoI7WWER8X5CflGe+xsbY=] */
