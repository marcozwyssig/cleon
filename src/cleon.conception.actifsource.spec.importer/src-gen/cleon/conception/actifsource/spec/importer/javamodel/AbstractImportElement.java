package cleon.conception.actifsource.spec.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractImportElement extends DynamicResource implements IAbstractImportElement {

  // abstract implementation, only used for static method calls
  private AbstractImportElement() {
    super(IAbstractImportElement.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3a665ba8-221e-11e8-8749-cb7f4d6924d3,vIY0iUIK8QvCzg/BlWKavV02gk4=] */
