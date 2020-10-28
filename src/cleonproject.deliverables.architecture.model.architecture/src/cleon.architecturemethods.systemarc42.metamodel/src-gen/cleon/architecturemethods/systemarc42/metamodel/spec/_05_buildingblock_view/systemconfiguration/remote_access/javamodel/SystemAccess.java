package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.remote_access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemAccess extends DynamicResource implements ISystemAccess {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemAccess> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemAccess>() {
    
    @Override
    public ISystemAccess create() {
      return new SystemAccess();
    }
    
    @Override
    public ISystemAccess create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemAccess(resourceRepository, resource);
    }
  
  };

  public SystemAccess() {
    super(ISystemAccess.TYPE_ID);
  }
  
  public SystemAccess(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemAccess.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemAccess setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4c110ca7-193c-11eb-8585-65084a06c07f,6mG1bHIA5nBHWXGbag53DxxRmf4=] */
