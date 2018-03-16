package cleon.conception.eamod.spec.nsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Function extends DynamicResource implements IFunction {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunction> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunction>() {
    
    @Override
    public IFunction create() {
      return new Function();
    }
    
    @Override
    public IFunction create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Function(resourceRepository, resource);
    }
  
  };

  public Function() {
    super(IFunction.TYPE_ID);
  }
  
  public Function(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFunction.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.nsv.javamodel.IFunction> selectFunctionFlow() {
    return _getList(cleon.conception.eamod.spec.nsv.javamodel.IFunction.class, cleon.conception.eamod.spec.nsv.NsvPackage.Function_functionFlow);
  }

  public Function setFunctionFlow(java.util.List<? extends cleon.conception.eamod.spec.nsv.javamodel.IFunction> functionFlow) {
    _setList(cleon.conception.eamod.spec.nsv.NsvPackage.Function_functionFlow, functionFlow);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Function setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.conception.eamod.spec.nsv.javamodel.IFunction.class, cleon.conception.eamod.spec.nsv.NsvPackage.Function_functionFlow, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.eamod.spec.nsv.javamodel.IFunction> selectToMeFunctionFlow(cleon.conception.eamod.spec.nsv.javamodel.IFunction object) {
    return _getToMeList(object.getRepository(), cleon.conception.eamod.spec.nsv.javamodel.IFunction.class, cleon.conception.eamod.spec.nsv.NsvPackage.Function_functionFlow, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,33f184bf-818c-11e7-9507-01b75489c44b,SQKWDyBU2ar5H9cRVIcV3qSaeBs=] */
