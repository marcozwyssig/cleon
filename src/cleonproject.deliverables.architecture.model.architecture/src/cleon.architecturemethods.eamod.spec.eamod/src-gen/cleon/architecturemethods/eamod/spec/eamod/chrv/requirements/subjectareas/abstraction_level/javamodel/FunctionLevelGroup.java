package cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.abstraction_level.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FunctionLevelGroup extends DynamicResource implements IFunctionLevelGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionLevelGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionLevelGroup>() {
    
    @Override
    public IFunctionLevelGroup create() {
      return new FunctionLevelGroup();
    }
    
    @Override
    public IFunctionLevelGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FunctionLevelGroup(resourceRepository, resource);
    }
  
  };

  public FunctionLevelGroup() {
    super(IFunctionLevelGroup.TYPE_ID);
  }
  
  public FunctionLevelGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFunctionLevelGroup.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FunctionLevelGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,147ed604-a95c-11e5-bda2-a7fc3bd7c783,x/nr/2jVvrKUGN89DkRwUw2tssw=] */
