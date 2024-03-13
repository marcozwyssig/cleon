package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Where extends DynamicResource implements IWhere {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWhere> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWhere>() {
    
    @Override
    public IWhere create() {
      return new Where();
    }
    
    @Override
    public IWhere create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Where(resourceRepository, resource);
    }
  
  };

  public Where() {
    super(IWhere.TYPE_ID);
  }
  
  public Where(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWhere.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICondition> selectOperand() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICondition.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Conditional_operand);
  }

  public Where setOperand(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICondition> operand) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Conditional_operand, operand);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Where setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICondition.class, cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.Conditional_operand, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,42d94ad2-e11a-11ee-995f-5faf5f77d478,nUXPUtUO5M2LnExR56I7lcFTG+g=] */
