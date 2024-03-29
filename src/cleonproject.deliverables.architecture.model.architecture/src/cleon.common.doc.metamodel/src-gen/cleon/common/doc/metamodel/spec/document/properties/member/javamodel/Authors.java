package cleon.common.doc.metamodel.spec.document.properties.member.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Authors extends DynamicResource implements IAuthors {

  // abstract implementation, only used for static method calls
  private Authors() {
    super(IAuthors.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IAuthors> selectToMeAuthors(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember object) {
    return _getToMeList(object.getRepository(), cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IAuthors.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a59c8d77-c589-11e5-aeea-1db9268c0ee9,TCn5OIKztb92r+Pjn0bIce3h+HE=] */
