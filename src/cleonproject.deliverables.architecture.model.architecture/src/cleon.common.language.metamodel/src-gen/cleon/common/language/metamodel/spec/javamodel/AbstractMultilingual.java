package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractMultilingual extends DynamicResource implements IAbstractMultilingual {

  // abstract implementation, only used for static method calls
  private AbstractMultilingual() {
    super(IAbstractMultilingual.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.language.metamodel.spec.javamodel.IAbstractMultilingual> selectToMeLanguageSettings(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings object) {
    return _getToMeList(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.IAbstractMultilingual.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractMultilingual_languageSettings, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a302d9a3-3360-11e8-a9fe-87ba35d8f5c4,CnW0ZNq5YBewfcDv1f6V+vEFgjY=] */
