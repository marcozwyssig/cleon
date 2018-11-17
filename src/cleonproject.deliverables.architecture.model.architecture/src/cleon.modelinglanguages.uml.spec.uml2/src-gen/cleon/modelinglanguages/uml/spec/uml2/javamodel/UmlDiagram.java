package cleon.modelinglanguages.uml.spec.uml2.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class UmlDiagram extends DynamicResource implements IUmlDiagram {

  // abstract implementation, only used for static method calls
  private UmlDiagram() {
    super(IUmlDiagram.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2a6fe24f-eaac-11e8-88d3-bfc6b992bdec,+ihl475fvwtfg6vDJFkuojzVX1w=] */
