package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Snmpcustomstring extends DynamicResource implements ISnmpcustomstring {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpcustomstring> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISnmpcustomstring>() {
    
    @Override
    public ISnmpcustomstring create() {
      return new Snmpcustomstring();
    }
    
    @Override
    public ISnmpcustomstring create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Snmpcustomstring(resourceRepository, resource);
    }
  
  };

  public Snmpcustomstring() {
    super(ISnmpcustomstring.TYPE_ID);
  }
  
  public Snmpcustomstring(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISnmpcustomstring.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Snmpcustomstring setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,db4b9474-c1eb-11ea-820f-9931558a898c,QIrWQoqMVaoLL0bRvAUWjJGwewo=] */
