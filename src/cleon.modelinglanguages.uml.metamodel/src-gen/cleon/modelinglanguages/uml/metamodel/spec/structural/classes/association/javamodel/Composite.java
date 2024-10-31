package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Composite extends DynamicResource implements IComposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComposite>() {
    
    @Override
    public IComposite create() {
      return new Composite();
    }
    
    @Override
    public IComposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Composite(resourceRepository, resource);
    }
  
  };

  public Composite() {
    super(IComposite.TYPE_ID);
  }
  
  public Composite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComposite.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Composite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,40b847ce-13d4-11e3-9736-a3484832b481,Uul7CDnoJrfTC2OFOQ0fjHg5ANs=] */
