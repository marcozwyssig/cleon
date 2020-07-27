package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Snmphpphysicaldisk extends DynamicResource implements ISnmphpphysicaldisk {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmphpphysicaldisk> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmphpphysicaldisk>() {
    
    @Override
    public ISnmphpphysicaldisk create() {
      return new Snmphpphysicaldisk();
    }
    
    @Override
    public ISnmphpphysicaldisk create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Snmphpphysicaldisk(resourceRepository, resource);
    }
  
  };

  public Snmphpphysicaldisk() {
    super(ISnmphpphysicaldisk.TYPE_ID);
  }
  
  public Snmphpphysicaldisk(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmphpphysicaldisk.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Snmphpphysicaldisk setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4b94e0-c1eb-11ea-820f-9931558a898c,AxIGguTIsuADIrvmKXN9IUi97U4=] */
