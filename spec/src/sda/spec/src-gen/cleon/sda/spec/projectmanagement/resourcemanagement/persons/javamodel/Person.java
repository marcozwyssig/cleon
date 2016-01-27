package cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel;

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
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectFirstname() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_firstname);
  }
    
  public void setFirstname(java.lang.String firstname) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_firstname, firstname);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectShortname() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_shortname);
  }
    
  public void setShortname(java.lang.String shortname) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_shortname, shortname);
  }

  @Override
  public java.lang.String selectSurname() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_surname);
  }
    
  public void setSurname(java.lang.String surname) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_surname, surname);
  }

  // relations
  
  @Override
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsences selectAbsences() {
    return _getSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsences.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_absences);
  }

  public Person setAbsences(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsences absences) {
    _setSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_absences, absences);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Person setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IExperience> selectExperience() {
    return _getMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IExperience.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_experience);
  }

  public Person setExperience(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IExperience> experience) {
    _setMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_experience, experience);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Person setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Person setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Person setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_firstname, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_shortname, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_surname, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsences.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_absences, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IExperience.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_experience, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson selectToMeExperience(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IExperience object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_experience, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson selectToMeAbsences(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsences object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.PersonsPackage.Person_absences, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9bfc0d2c-ff9e-11e4-ac0a-959b440f987f,aUPxFEw8rjMHbz/3tCErjTKAJL0=] */
