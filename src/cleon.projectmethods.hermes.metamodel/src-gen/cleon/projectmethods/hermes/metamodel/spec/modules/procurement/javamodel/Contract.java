package cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Contract extends DynamicResource implements IContract {

  // abstract implementation, only used for static method calls
  private Contract() {
    super(IContract.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,78a4d49e-4058-11eb-aaa9-61838d129c8c,WYipKd+7lj2utzZqgeIbtyc12aw=] */
