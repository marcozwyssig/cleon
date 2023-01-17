package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AbstractionLevel extends DynamicResource implements IAbstractionLevel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbstractionLevel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbstractionLevel>() {
    
    @Override
    public IAbstractionLevel create() {
      return new AbstractionLevel();
    }
    
    @Override
    public IAbstractionLevel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AbstractionLevel(resourceRepository, resource);
    }
  
  };

  public AbstractionLevel() {
    super(IAbstractionLevel.TYPE_ID);
  }
  
  public AbstractionLevel(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAbstractionLevel.TYPE_ID);
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

  public AbstractionLevel setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isCAP()) return visitor.visitCAP();
    if (isCMP()) return visitor.visitCMP();
    if (isFEA()) return visitor.visitFEA();
    if (isFUN()) return visitor.visitFUN();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isCAP()) {
      visitor.visitCAP();
      return;
    }
    if (isCMP()) {
      visitor.visitCMP();
      return;
    }
    if (isFEA()) {
      visitor.visitFEA();
      return;
    }
    if (isFUN()) {
      visitor.visitFUN();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isCAP() {
    return getResource().equals(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.Abstraction_levelPackage.AbstractionLevel_CAP);
  }
  
  @Override
  public boolean isCMP() {
    return getResource().equals(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.Abstraction_levelPackage.AbstractionLevel_CMP);
  }
  
  @Override
  public boolean isFEA() {
    return getResource().equals(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.Abstraction_levelPackage.AbstractionLevel_FEA);
  }
  
  @Override
  public boolean isFUN() {
    return getResource().equals(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.Abstraction_levelPackage.AbstractionLevel_FUN);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3da3b4e2-ff9b-11e4-ac0a-959b440f987f,nqPlj3dEIN89Xov7fSSE+kecc9o=] */
