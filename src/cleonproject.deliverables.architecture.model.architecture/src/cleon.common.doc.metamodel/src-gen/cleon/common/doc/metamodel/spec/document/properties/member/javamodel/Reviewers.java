package cleon.common.doc.metamodel.spec.document.properties.member.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Reviewers extends DynamicResource implements IReviewers {

  // abstract implementation, only used for static method calls
  private Reviewers() {
    super(IReviewers.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IReviewers> selectToMeReviewers(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember object) {
    return _getToMeList(object.getRepository(), cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IReviewers.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Reviewers_reviewers, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7073ba65-47f9-11e6-b388-8539f6ff7310,Dkzt5Pt/J24+cO2rhBOLqF1+dBw=] */
