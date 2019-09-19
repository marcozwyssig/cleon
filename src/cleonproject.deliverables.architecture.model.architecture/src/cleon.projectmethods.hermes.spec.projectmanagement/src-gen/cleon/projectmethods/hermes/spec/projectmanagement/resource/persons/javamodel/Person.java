package cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Person extends DynamicResource implements IPerson {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPerson> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPerson>() {
    
    @Override
    public IPerson create() {
      return new Person();
    }
    
    @Override
    public IPerson create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Person(resourceRepository, resource);
    }
  
  };

  public Person() {
    super(IPerson.TYPE_ID);
  }
  
  public Person(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPerson.TYPE_ID);
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
  public java.lang.String selectFirstname() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_firstname);
  }
    
  public void setFirstname(java.lang.String firstname) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_firstname, firstname);
  }

  @Override
  public java.lang.String selectShortname() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_shortname);
  }
    
  public void setShortname(java.lang.String shortname) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_shortname, shortname);
  }

  @Override
  public java.lang.String selectSurname() {
    return _getSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_surname);
  }
    
  public void setSurname(java.lang.String surname) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_surname, surname);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsences selectAbsences() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsences.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_absences);
  }

  public Person setAbsences(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsences absences) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_absences, absences);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public Person setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Person setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.experience.javamodel.IExperiences selectExperiences() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.experience.javamodel.IExperiences.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_experiences);
  }

  public Person setExperiences(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.experience.javamodel.IExperiences experiences) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_experiences, experiences);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation selectOrganisation() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_organisation);
  }

  public Person setOrganisation(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation organisation) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_organisation, organisation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Person setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.roles.javamodel.IRoles selectRoles() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.roles.javamodel.IRoles.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_roles);
  }

  public Person setRoles(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.roles.javamodel.IRoles roles) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Person setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_firstname, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_shortname, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_surname, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsences.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_absences, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.experience.javamodel.IExperiences.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_experiences, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_organisation, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.roles.javamodel.IRoles.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson selectToMeAbsences(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.absence.javamodel.IAbsences object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_absences, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson> selectToMeOrganisation(cleon.projectmethods.hermes.spec.projectmanagement.resource.organisations.javamodel.IOrganisation object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_organisation, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson selectToMeExperiences(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.experience.javamodel.IExperiences object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_experiences, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson selectToMeRoles(cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.roles.javamodel.IRoles object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.persons.PersonsPackage.Person_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9bfc0d2c-ff9e-11e4-ac0a-959b440f987f,RH1rxC1vWjOpN7ARBCT+j5X3XQs=] */
