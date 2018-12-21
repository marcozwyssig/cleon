package cleon.modelinglanguages.rack.template.rackdiag.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RackdiagBuildTask extends DynamicResource implements IRackdiagBuildTask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRackdiagBuildTask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRackdiagBuildTask>() {
    
    @Override
    public IRackdiagBuildTask create() {
      return new RackdiagBuildTask();
    }
    
    @Override
    public IRackdiagBuildTask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RackdiagBuildTask(resourceRepository, resource);
    }
  
  };

  public RackdiagBuildTask() {
    super(IRackdiagBuildTask.TYPE_ID);
  }
  
  public RackdiagBuildTask(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRackdiagBuildTask.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RackdiagBuildTask setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,497c82f6-0550-11e9-b814-a133e521728c,/MEga0P1Opz0s0b4fZAAe29s2mg=] */
