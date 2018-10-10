package cleon.architecturemethods.arc42.spec.devops.spec.code.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Secret extends DynamicResource implements ISecret {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecret> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecret>() {
    
    @Override
    public ISecret create() {
      return new Secret();
    }
    
    @Override
    public ISecret create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Secret(resourceRepository, resource);
    }
  
  };

  public Secret() {
    super(ISecret.TYPE_ID);
  }
  
  public Secret(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISecret.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Secret setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,56035e7d-41b7-11e5-a2b3-edc7f3343844,mQdm8kguTLy3DAeClCvYeIPW1jY=] */
