package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractTranslation extends DynamicResource implements IAbstractTranslation {

  // abstract implementation, only used for static method calls
  private AbstractTranslation() {
    super(IAbstractTranslation.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.language.metamodel.spec.javamodel.IAbstractTranslation> selectToMeLanguage(cleon.common.language.metamodel.spec.language.javamodel.ILanguage object) {
    return _getToMeList(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.IAbstractTranslation.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractTranslation_language, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dc37c0c0-9794-11ef-a385-611913ad635b,U+tJWuIFE710BnBC2/VBFwF0ocE=] */
