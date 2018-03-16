package cleon.common.doc.spec.doc.document.properties.member.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Distributers extends DynamicResource implements IDistributers {

  // abstract implementation, only used for static method calls
  private Distributers() {
    super(IDistributers.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.doc.spec.doc.document.properties.member.javamodel.IDistributers> selectToMeDistributers(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember object) {
    return _getToMeList(object.getRepository(), cleon.common.doc.spec.doc.document.properties.member.javamodel.IDistributers.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Distributers_distributers, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f6f49c2-47fa-11e6-b388-8539f6ff7310,BCjClCiNJuHDDRYOUatN/kb65dI=] */
