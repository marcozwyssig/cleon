package cleon.sda.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ProtocolItem extends DynamicResource implements IProtocolItem {

  // abstract implementation, only used for static method calls
  private ProtocolItem() {
    super(IProtocolItem.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItem> selectToMeResponsibles(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItem.class, cleon.sda.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,71fe646f-b462-11e5-a3f4-497fd75158dc,Ix50kD5uwc/5VnvP4NQrCvrVvHw=] */
