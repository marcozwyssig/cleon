package cleon.analysis.spec.drivers.javamodel;

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
  public java.util.List<java.lang.Void> selectColumns() {
    return _getListAttribute(java.lang.Void.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columns);
  }
    
  public void setColumns(java.util.List<java.lang.Void> columns) {
     _setListAttribute(cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columns, columns);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescription() {
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.chapter.ChapterPackage.Description_description);
  }
    
  public void setDescription(java.util.List<java.lang.String> description) {
     _setListAttribute(cleon.doc.spec.chapter.ChapterPackage.Description_description, description);
  }

  @Override
  public java.lang.String selectGoaldescription() {
    return _getSingleAttribute(java.lang.String.class, cleon.analysis.spec.drivers.DriversPackage.Goal_goaldescription);
  }
    
  public void setGoaldescription(java.lang.String goaldescription) {
     _setSingleAttribute(cleon.analysis.spec.drivers.DriversPackage.Goal_goaldescription, goaldescription);
  }

  @Override
  public java.lang.String selectGoalname() {
    return _getSingleAttribute(java.lang.String.class, cleon.analysis.spec.drivers.DriversPackage.Goal_goalname);
  }
    
  public void setGoalname(java.lang.String goalname) {
     _setSingleAttribute(cleon.analysis.spec.drivers.DriversPackage.Goal_goalname, goalname);
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
  public cleon.analysis.spec.drivers.javamodel.IGoalImportance selectImportance() {
    return _getSingle(cleon.analysis.spec.drivers.javamodel.IGoalImportance.class, cleon.analysis.spec.drivers.DriversPackage.Goal_importance);
  }

  public Goal setImportance(cleon.analysis.spec.drivers.javamodel.IGoalImportance importance) {
    _setSingle(cleon.analysis.spec.drivers.DriversPackage.Goal_importance, importance);
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
    _acceptListAttribute(java.lang.Void.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.TypedTable_columns, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.chapter.ChapterPackage.Description_description, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.analysis.spec.drivers.DriversPackage.Goal_goaldescription, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.analysis.spec.drivers.DriversPackage.Goal_goalname, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.analysis.spec.drivers.javamodel.IGoalImportance.class, cleon.analysis.spec.drivers.DriversPackage.Goal_importance, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.analysis.spec.drivers.javamodel.IGoal> selectToMeImportance(cleon.analysis.spec.drivers.javamodel.IGoalImportance object) {
    return _getToMeList(object.getRepository(), cleon.analysis.spec.drivers.javamodel.IGoal.class, cleon.analysis.spec.drivers.DriversPackage.Goal_importance, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0797167b-3c15-11e5-9962-cf3035adb922,rUk7+SlMle2y7mk11pD+gMnyYPs=] */
