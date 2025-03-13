package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class MachineResource extends DynamicResource implements IMachineResource {

  // abstract implementation, only used for static method calls
  private MachineResource() {
    super(IMachineResource.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel.IMachineResource selectToMeCpu(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel.ICPU object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel.IMachineResource.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.MachinePackage.MachineResource_cpu, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c66f0428-f172-11e8-b3e7-15e2dd8d9b05,Vs3JjuEKev/SjuO0pEXLdsEa+eA=] */
