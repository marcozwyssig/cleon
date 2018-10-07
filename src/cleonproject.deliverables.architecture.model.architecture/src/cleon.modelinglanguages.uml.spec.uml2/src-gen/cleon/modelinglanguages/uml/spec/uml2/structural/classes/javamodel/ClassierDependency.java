package cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ClassierDependency extends DynamicResource implements IClassierDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IClassierDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IClassierDependency>() {
    
    @Override
    public IClassierDependency create() {
      return new ClassierDependency();
    }
    
    @Override
    public IClassierDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ClassierDependency(resourceRepository, resource);
    }
  
  };

  public ClassierDependency() {
    super(IClassierDependency.TYPE_ID);
  }
  
  public ClassierDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IClassierDependency.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier selectTo() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.ClassierDependency_to);
  }

  public ClassierDependency setTo(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier to) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.ClassierDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ClassierDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.ClassierDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassierDependency> selectToMeTo(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassierDependency.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.ClassierDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,17f56ccf-3b5f-11e5-86bc-73aedc28563d,d9wiCeZW68enU2es0jUHYDoCnDw=] */
