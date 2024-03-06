package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractRealmHandlers extends DynamicResource implements IAbstractRealmHandlers {

  // abstract implementation, only used for static method calls
  private AbstractRealmHandlers() {
    super(IAbstractRealmHandlers.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel.IAbstractRealmHandlers> selectToMeRealmForComponent(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel.IAbstractRealmHandlers.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.AuthnPackage.AbstractRealmHandlers_realmForComponent, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,55667c1c-fd8c-11ea-8a95-19b98046e6db,8+9PEkfWsYBXZlfPDtc9FjZpmN4=] */