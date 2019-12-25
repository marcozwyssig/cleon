package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FactoryMethod extends DynamicResource implements IFactoryMethod {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFactoryMethod> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFactoryMethod>() {
    
    @Override
    public IFactoryMethod create() {
      return new FactoryMethod();
    }
    
    @Override
    public IFactoryMethod create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FactoryMethod(resourceRepository, resource);
    }
  
  };

  public FactoryMethod() {
    super(IFactoryMethod.TYPE_ID);
  }
  
  public FactoryMethod(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFactoryMethod.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier selectClassifier() {
    return _getSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.FactorymethodPackage.FactoryMethod_classifier);
  }

  public FactoryMethod setClassifier(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier classifier) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.FactorymethodPackage.FactoryMethod_classifier, classifier);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.javamodel.IParameter> selectCtorArgs() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.javamodel.IParameter.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.FactorymethodPackage.FactoryMethod_ctorArgs);
  }

  public FactoryMethod setCtorArgs(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.javamodel.IParameter> ctorArgs) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.FactorymethodPackage.FactoryMethod_ctorArgs, ctorArgs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public FactoryMethod setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FactoryMethod setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.FactorymethodPackage.FactoryMethod_classifier, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.javamodel.IParameter.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.FactorymethodPackage.FactoryMethod_ctorArgs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.javamodel.IFactoryMethod> selectToMeClassifier(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.javamodel.IFactoryMethod.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.FactorymethodPackage.FactoryMethod_classifier, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.javamodel.IFactoryMethod selectToMeCtorArgs(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.parameter.javamodel.IParameter object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.javamodel.IFactoryMethod.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.gof.creational.factorymethod.FactorymethodPackage.FactoryMethod_ctorArgs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8838d098-ddd3-11e4-b0b5-6911fa4e24e5,huRjYDENkuRlX7jDLz6VNq5vLHg=] */
