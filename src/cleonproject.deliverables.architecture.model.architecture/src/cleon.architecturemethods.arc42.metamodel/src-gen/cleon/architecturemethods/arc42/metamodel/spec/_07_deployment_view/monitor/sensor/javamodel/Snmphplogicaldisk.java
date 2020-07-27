package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Snmphplogicaldisk extends DynamicResource implements ISnmphplogicaldisk {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmphplogicaldisk> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmphplogicaldisk>() {
    
    @Override
    public ISnmphplogicaldisk create() {
      return new Snmphplogicaldisk();
    }
    
    @Override
    public ISnmphplogicaldisk create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Snmphplogicaldisk(resourceRepository, resource);
    }
  
  };

  public Snmphplogicaldisk() {
    super(ISnmphplogicaldisk.TYPE_ID);
  }
  
  public Snmphplogicaldisk(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmphplogicaldisk.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Snmphplogicaldisk setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4b94ce-c1eb-11ea-820f-9931558a898c,pAzYQhp4Ln3/ge0HkP7HKB5A60A=] */
