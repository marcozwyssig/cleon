package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractCriteriaAggregateAware extends DynamicResource implements IAbstractCriteriaAggregateAware {

  // abstract implementation, only used for static method calls
  private AbstractCriteriaAggregateAware() {
    super(IAbstractCriteriaAggregateAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteriaAggregateAware selectToMeCriterias(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.javamodel.IAbstractCriteriaAggregateAware.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.CriteriasPackage.AbstractCriteriaAggregateAware_criterias, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c5e185e1-2029-11e9-83b3-a16e26b4cc59,bcDCw/kKxcrV9Ynvbeth2kiT+8g=] */
