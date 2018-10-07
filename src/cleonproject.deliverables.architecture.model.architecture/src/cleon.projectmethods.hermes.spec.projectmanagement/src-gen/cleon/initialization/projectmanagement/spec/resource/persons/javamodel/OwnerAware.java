package cleon.initialization.projectmanagement.spec.resource.persons.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class OwnerAware extends DynamicResource implements IOwnerAware {

  // abstract implementation, only used for static method calls
  private OwnerAware() {
    super(IOwnerAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IOwnerAware> selectToMeOwner(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IOwnerAware.class, cleon.initialization.projectmanagement.spec.resource.persons.PersonsPackage.OwnerAware_owner, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dd829c7f-3385-11e6-b251-57783f5929b3,ZvwW24VwxGGU8FCIM654yZ6m+MQ=] */
