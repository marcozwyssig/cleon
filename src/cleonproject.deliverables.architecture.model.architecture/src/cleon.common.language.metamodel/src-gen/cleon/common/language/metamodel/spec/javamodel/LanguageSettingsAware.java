package cleon.common.language.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class LanguageSettingsAware extends DynamicResource implements ILanguageSettingsAware {

  // abstract implementation, only used for static method calls
  private LanguageSettingsAware() {
    super(ILanguageSettingsAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.language.metamodel.spec.javamodel.ILanguageSettingsAware> selectToMeLanguageSettings(cleon.common.language.metamodel.spec.javamodel.ILanguageSettings object) {
    return _getToMeList(object.getRepository(), cleon.common.language.metamodel.spec.javamodel.ILanguageSettingsAware.class, cleon.common.language.metamodel.spec.SpecPackage.LanguageSettingsAware_languageSettings, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ffbf6300-cd3b-11ec-85c9-011c467ea292,HZoTACH6FZAwujTOEHAutJcvgaI=] */
