package cleon.common.analysis.spec.analysis.solution.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Drivers extends DynamicResource implements IDrivers {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDrivers> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDrivers>() {
    
    @Override
    public IDrivers create() {
      return new Drivers();
    }
    
    @Override
    public IDrivers create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Drivers(resourceRepository, resource);
    }
  
  };

  public Drivers() {
    super(IDrivers.TYPE_ID);
  }
  
  public Drivers(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDrivers.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IContext selectContext() {
    return _getSingle(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IContext.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_context);
  }

  public Drivers setContext(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IContext context) {
    _setSingle(cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_context, context);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public Drivers setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IGoals selectGoal() {
    return _getSingle(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IGoals.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_goal);
  }

  public Drivers setGoal(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IGoals goal) {
    _setSingle(cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_goal, goal);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ISource> selectSources() {
    return _getList(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ISource.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_sources);
  }

  public Drivers setSources(java.util.List<? extends cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ISource> sources) {
    _setList(cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_sources, sources);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Drivers setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IContext.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_context, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptSingle(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IGoals.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_goal, visitor);
    _acceptList(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ISource.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_sources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers selectToMeContext(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IContext object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_context, object.getResource());
  }
  
  public static cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers selectToMeGoal(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_goal, object.getResource());
  }
  
  public static cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers selectToMeSources(cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ISource object) {
    return _getToMeSingle(object.getRepository(), cleon.common.analysis.spec.analysis.solution.drivers.javamodel.IDrivers.class, cleon.common.analysis.spec.analysis.solution.drivers.DriversPackage.Drivers_sources, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,877f094b-3c14-11e5-9962-cf3035adb922,JXlK1sNuxqeWet9WrnKnPQQ/AKk=] */
