package cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SubjectArea extends DynamicResource implements ISubjectArea {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubjectArea> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubjectArea>() {
    
    @Override
    public ISubjectArea create() {
      return new SubjectArea();
    }
    
    @Override
    public ISubjectArea create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SubjectArea(resourceRepository, resource);
    }
  
  };

  public SubjectArea() {
    super(ISubjectArea.TYPE_ID);
  }
  
  public SubjectArea(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISubjectArea.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.List<java.lang.String> selectNotes() {
    return _getListAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes, notes);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver> selectAdresses() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectArea_adresses);
  }

  public SubjectArea setAdresses(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver> adresses) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectArea_adresses, adresses);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> selectAppliesTo() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectArea_appliesTo);
  }

  public SubjectArea setAppliesTo(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> appliesTo) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectArea_appliesTo, appliesTo);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SubjectArea setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes, visitor);
    // relations
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectArea_adresses, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectArea_appliesTo, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea> selectToMeAppliesTo(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectArea_appliesTo, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea> selectToMeAdresses(cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel.ISubjectArea.class, cleon.sda.spec.requirementsmanagement.motivation.subjectareas.SubjectareasPackage.SubjectArea_adresses, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,010e5bac-bf5d-11e5-a56a-35b34376b412,6aFKlOEjdr2b2tGG7V1SGvyJ2S8=] */
