package cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CpuArchitecture extends DynamicResource implements ICpuArchitecture {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICpuArchitecture> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICpuArchitecture>() {
    
    @Override
    public ICpuArchitecture create() {
      return new CpuArchitecture();
    }
    
    @Override
    public ICpuArchitecture create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CpuArchitecture(resourceRepository, resource);
    }
  
  };

  public CpuArchitecture() {
    super(ICpuArchitecture.TYPE_ID);
  }
  
  public CpuArchitecture(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICpuArchitecture.TYPE_ID);
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

  public CpuArchitecture setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isX86_32bit()) return visitor.visitX86_32bit();
    if (isX86_64bit()) return visitor.visitX86_64bit();
    if (isX86_32_64_bit()) return visitor.visitX86_32_64_bit();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isX86_32bit()) {
      visitor.visitX86_32bit();
      return;
    }
    if (isX86_64bit()) {
      visitor.visitX86_64bit();
      return;
    }
    if (isX86_32_64_bit()) {
      visitor.visitX86_32_64_bit();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isX86_32bit() {
    return getResource().equals(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.CpuArchitecture_x86_aE_32bit);
  }
  
  @Override
  public boolean isX86_64bit() {
    return getResource().equals(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.CpuArchitecture_x86_aE_64bit);
  }
  
  @Override
  public boolean isX86_32_64_bit() {
    return getResource().equals(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.CpuArchitecture_x86_aE_32_aE_64_aE_bit);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0bba3407-2d73-11e6-959f-d1cef44ff5fd,Q+OhWK7Fx5YWe3wfD3HLQl846WA=] */
