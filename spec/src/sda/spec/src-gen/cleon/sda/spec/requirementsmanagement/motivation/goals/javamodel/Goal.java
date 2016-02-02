package cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Goal extends DynamicResource implements IGoal {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoal> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoal>() {
    
    @Override
    public IGoal create() {
      return new Goal();
    }
    
    @Override
    public IGoal create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Goal(resourceRepository, resource);
    }
  
  };

  public Goal() {
    super(IGoal.TYPE_ID);
  }
  
  public Goal(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGoal.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, identifier);
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
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver> selectAddresses() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_addresses);
  }

  public Goal setAddresses(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver> addresses) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_addresses, addresses);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> selectAutors() {
    return _getList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors);
  }

  public Goal setAutors(java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> autors) {
    _setList(cleon.doc.spec.autor.AutorPackage.Autors_autors, autors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> selectGoalAggregation() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_goalAggregation);
  }

  public Goal setGoalAggregation(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> goalAggregation) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_goalAggregation, goalAggregation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple> selectOriginatesFromPrinciple() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_originatesFromPrinciple);
  }

  public Goal setOriginatesFromPrinciple(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple> originatesFromPrinciple) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_originatesFromPrinciple, originatesFromPrinciple);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectOriginatesFromSource() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_originatesFromSource);
  }

  public Goal setOriginatesFromSource(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> originatesFromSource) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_originatesFromSource, originatesFromSource);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Goal setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes, visitor);
    // relations
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_addresses, visitor);
    _acceptList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_goalAggregation, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_originatesFromPrinciple, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_originatesFromSource, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal selectToMeGoalAggregation(cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_goalAggregation, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> selectToMeAddresses(cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_addresses, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> selectToMeOriginatesFromPrinciple(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_originatesFromPrinciple, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> selectToMeOriginatesFromSource(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal.class, cleon.sda.spec.requirementsmanagement.motivation.goals.GoalsPackage.Goal_originatesFromSource, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,31468bb8-a951-11e5-bda2-a7fc3bd7c783,9dTBSZHUR6Fc3KlLIgL96A8m3gQ=] */
