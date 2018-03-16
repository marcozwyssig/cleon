package cleon.conception.eamod.spec.chrv.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SourceAware extends DynamicResource implements ISourceAware {

  // abstract implementation, only used for static method calls
  private SourceAware() {
    super(ISourceAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceAware> selectToMeOriginatesFromSource(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource object) {
    return _getToMeList(object.getRepository(), cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceAware.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9f082e63-06cb-11e6-a881-5729d6667c93,xLCkvzJsmiUjpEsCFxnHEY0Vfis=] */
