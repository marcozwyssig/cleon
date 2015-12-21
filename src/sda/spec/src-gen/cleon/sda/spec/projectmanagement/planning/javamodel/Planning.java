package cleon.sda.spec.projectmanagement.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Planning extends DynamicResource implements IPlanning {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlanning> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlanning>() {
    
    @Override
    public IPlanning create() {
      return new Planning();
    }
    
    @Override
    public IPlanning create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Planning(resourceRepository, resource);
    }
  
  };

  public Planning() {
    super(IPlanning.TYPE_ID);
  }
  
  public Planning(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPlanning.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.planning.release.javamodel.IRelease> selectReleasePlanning() {
    return _getList(cleon.sda.spec.projectmanagement.planning.release.javamodel.IRelease.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_releasePlanning);
  }

  public Planning setReleasePlanning(java.util.List<? extends cleon.sda.spec.projectmanagement.planning.release.javamodel.IRelease> releasePlanning) {
    _setList(cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_releasePlanning, releasePlanning);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Planning setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.sda.spec.projectmanagement.planning.release.javamodel.IRelease.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_releasePlanning, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning> selectToMeReleasePlanning(cleon.sda.spec.projectmanagement.planning.release.javamodel.IRelease object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_releasePlanning, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5f541a84-a7d8-11e5-82dd-3b995d9c840c,Va0Z5TsRZe9O07Ob91PuB/nCs00=] */
