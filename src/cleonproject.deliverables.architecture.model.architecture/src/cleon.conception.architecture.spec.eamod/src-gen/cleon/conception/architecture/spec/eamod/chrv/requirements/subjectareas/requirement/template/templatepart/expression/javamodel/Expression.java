package cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.expression.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Expression extends DynamicResource implements IExpression {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExpression> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExpression>() {
    
    @Override
    public IExpression create() {
      return new Expression();
    }
    
    @Override
    public IExpression create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Expression(resourceRepository, resource);
    }
  
  };

  public Expression() {
    super(IExpression.TYPE_ID);
  }
  
  public Expression(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IExpression.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Expression setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7f0c4021-d574-11e5-89ea-2d8d86e9ef89,f3OEEnyHMWDgIbfa5qVyVDKqwJo=] */
