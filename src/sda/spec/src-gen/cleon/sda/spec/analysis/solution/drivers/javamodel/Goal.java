package cleon.sda.spec.analysis.solution.drivers.javamodel;

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

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectColumnOwns() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns);
  }

  public Goal setColumnOwns(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> columnOwns) {
    _setList(cleon.doc.spec.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns, columnOwns);
    return this;
  }
    
  @Override
  public cleon.doc.spec.paragraph.javamodel.ITextParagraph selectGoaldescription() {
    return _getSingle(cleon.doc.spec.paragraph.javamodel.ITextParagraph.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goaldescription);
  }

  public Goal setGoaldescription(cleon.doc.spec.paragraph.javamodel.ITextParagraph goaldescription) {
    _setSingle(cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goaldescription, goaldescription);
    return this;
  }
    
  @Override
  public cleon.doc.spec.paragraph.javamodel.ITextParagraph selectGoalname() {
    return _getSingle(cleon.doc.spec.paragraph.javamodel.ITextParagraph.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goalname);
  }

  public Goal setGoalname(cleon.doc.spec.paragraph.javamodel.ITextParagraph goalname) {
    _setSingle(cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goalname, goalname);
    return this;
  }
    
  @Override
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance selectImportance() {
    return _getSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_importance);
  }

  public Goal setImportance(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance importance) {
    _setSingle(cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_importance, importance);
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
    // relations
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.typedtable.TypedtablePackage.TypedTable_columnOwns, visitor);
    _acceptSingle(cleon.doc.spec.paragraph.javamodel.ITextParagraph.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goaldescription, visitor);
    _acceptSingle(cleon.doc.spec.paragraph.javamodel.ITextParagraph.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goalname, visitor);
    _acceptSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_importance, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal selectToMeGoalname(cleon.doc.spec.paragraph.javamodel.ITextParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goalname, object.getResource());
  }
  
  public static cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal selectToMeGoaldescription(cleon.doc.spec.paragraph.javamodel.ITextParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_goaldescription, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal> selectToMeImportance(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.analysis.solution.drivers.javamodel.IGoal.class, cleon.sda.spec.analysis.solution.drivers.DriversPackage.Goal_importance, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0797167b-3c15-11e5-9962-cf3035adb922,0O70cHr7mv7eW9by+AqWHjMa1zQ=] */
