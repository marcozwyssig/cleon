package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Validator extends DynamicResource implements IValidator {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValidator> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValidator>() {
    
    @Override
    public IValidator create() {
      return new Validator();
    }
    
    @Override
    public IValidator create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Validator(resourceRepository, resource);
    }
  
  };

  public Validator() {
    super(IValidator.TYPE_ID);
  }
  
  public Validator(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IValidator.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectCommand() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_command);
  }
    
  public void setCommand(java.lang.String command) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_command, command);
  }

  @Override
  public java.lang.String selectMax() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_max);
  }
    
  public void setMax(java.lang.String max) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_max, max);
  }

  @Override
  public java.lang.Integer selectMin() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_min);
  }
    
  public void setMin(java.lang.Integer min) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_min, min);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.solution.datatype.generic.datatype.javamodel.IType selectType() {
    return _getSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_type);
  }

  public Validator setType(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType type) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Validator setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_command, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_max, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_min, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel.IValidator> selectToMeType(ch.actifsource.solution.datatype.generic.datatype.javamodel.IType object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel.IValidator.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.MonolithPackage.Validator_type, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a60f06b0-fb85-11f0-919e-07363e802872,Q7tEhLbpso6X/8j8lFoi52rGddg=] */
