package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class KnockoutCriteriaAggregateAware extends DynamicResource implements IKnockoutCriteriaAggregateAware {

  // abstract implementation, only used for static method calls
  private KnockoutCriteriaAggregateAware() {
    super(IKnockoutCriteriaAggregateAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteriaAggregateAware selectToMeKnockoutCriterias(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteriaAggregateAware.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.knockout.KnockoutPackage.KnockoutCriteriaAggregateAware_knockoutCriterias, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b9554f68-2027-11e9-83b3-a16e26b4cc59,u0W15GJUPw2340VCSBS8p+MZypI=] */
