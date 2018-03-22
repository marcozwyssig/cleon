package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Capable extends DynamicResource implements ICapable {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapable> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapable>() {
    
    @Override
    public ICapable create() {
      return new Capable();
    }
    
    @Override
    public ICapable create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Capable(resourceRepository, resource);
    }
  
  };

  public Capable() {
    super(ICapable.TYPE_ID);
  }
  
  public Capable(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICapable.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Capable setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3a346f9c-d56b-11e5-89ea-2d8d86e9ef89,I30mGqLiemBsK+UDrJDXO1hNOUg=] */
