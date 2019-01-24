package cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class CriteriaAggregateAware extends DynamicResource implements ICriteriaAggregateAware {

  // abstract implementation, only used for static method calls
  private CriteriaAggregateAware() {
    super(ICriteriaAggregateAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.ICriteriaAggregateAware selectToMeCriterias(cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.IAbstractCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.ICriteriaAggregateAware.class, cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.CriteriasPackage.CriteriaAggregateAware_criterias, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5f32cd0c-a77f-11e8-8660-2f457072b676,IlZRPfpRx2KWOoPLLZN2ve5jml8=] */
