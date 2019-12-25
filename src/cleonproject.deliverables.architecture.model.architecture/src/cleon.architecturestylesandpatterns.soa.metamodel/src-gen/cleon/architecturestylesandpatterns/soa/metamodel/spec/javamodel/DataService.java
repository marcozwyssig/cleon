package cleon.architecturestylesandpatterns.soa.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DataService extends DynamicResource implements IDataService {

  // abstract implementation, only used for static method calls
  private DataService() {
    super(IDataService.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturestylesandpatterns.soa.metamodel.spec.javamodel.IDataService selectToMeEvents(cleon.architecturestylesandpatterns.soa.metamodel.spec.javamodel.IEvent object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturestylesandpatterns.soa.metamodel.spec.javamodel.IDataService.class, cleon.architecturestylesandpatterns.soa.metamodel.spec.SpecPackage.DataService_events, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d93b7c9d-13cb-11e3-bec7-f1e135382475,7o2LH1lGbvDii/khnTWjfEvlqsY=] */
