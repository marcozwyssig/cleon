package cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class WeightingCriteriaAggregateAware extends DynamicResource implements IWeightingCriteriaAggregateAware {

  // abstract implementation, only used for static method calls
  private WeightingCriteriaAggregateAware() {
    super(IWeightingCriteriaAggregateAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteriaAggregateAware selectToMeWeightingCriterias(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteriaAggregateAware.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.WeightingPackage.WeightingCriteriaAggregateAware_weightingCriterias, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5f32cd0c-a77f-11e8-8660-2f457072b676,E/XSrjAskcBLCzQiK1apP5CxOVw=] */
