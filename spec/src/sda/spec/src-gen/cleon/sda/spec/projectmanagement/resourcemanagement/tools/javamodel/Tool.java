package cleon.sda.spec.projectmanagement.resourcemanagement.tools.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Tool extends DynamicResource implements ITool {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITool> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITool>() {
    
    @Override
    public ITool create() {
      return new Tool();
    }
    
    @Override
    public ITool create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Tool(resourceRepository, resource);
    }
  
  };

  public Tool() {
    super(ITool.TYPE_ID);
  }
  
  public Tool(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITool.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Tool setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,052b13bf-a7e0-11e5-82dd-3b995d9c840c,M2PFNSgiLLlDbw/iDWa2iS5n4sE=] */
