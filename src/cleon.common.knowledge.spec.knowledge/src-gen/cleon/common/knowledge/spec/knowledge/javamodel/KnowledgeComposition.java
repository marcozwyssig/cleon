package cleon.common.knowledge.spec.knowledge.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class KnowledgeComposition extends DynamicResource implements IKnowledgeComposition {

  // abstract implementation, only used for static method calls
  private KnowledgeComposition() {
    super(IKnowledgeComposition.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.knowledge.spec.knowledge.javamodel.IKnowledgeComposition selectToMeKnowledges(cleon.common.knowledge.spec.knowledge.javamodel.IKnowledge object) {
    return _getToMeSingle(object.getRepository(), cleon.common.knowledge.spec.knowledge.javamodel.IKnowledgeComposition.class, cleon.common.knowledge.spec.knowledge.KnowledgePackage.KnowledgeComposition_knowledges, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,012cc4cb-b7df-11e6-ab27-f74a954bc0f4,r+EjUrI+GmNgSY9USR7WhL/iFUI=] */
