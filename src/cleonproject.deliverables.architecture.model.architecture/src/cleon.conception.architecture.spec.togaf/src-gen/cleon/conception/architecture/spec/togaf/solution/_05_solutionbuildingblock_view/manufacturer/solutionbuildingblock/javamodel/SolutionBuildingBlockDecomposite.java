package cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SolutionBuildingBlockDecomposite extends DynamicResource implements ISolutionBuildingBlockDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionBuildingBlockDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionBuildingBlockDecomposite>() {
    
    @Override
    public ISolutionBuildingBlockDecomposite create() {
      return new SolutionBuildingBlockDecomposite();
    }
    
    @Override
    public ISolutionBuildingBlockDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SolutionBuildingBlockDecomposite(resourceRepository, resource);
    }
  
  };

  public SolutionBuildingBlockDecomposite() {
    super(ISolutionBuildingBlockDecomposite.TYPE_ID);
  }
  
  public SolutionBuildingBlockDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutionBuildingBlockDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock selectInto() {
    return _getSingle(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock.class, cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlockDecomposite_into);
  }

  public SolutionBuildingBlockDecomposite setInto(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock into) {
    _setSingle(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlockDecomposite_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SolutionBuildingBlockDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock.class, cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlockDecomposite_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlockDecomposite selectToMeInto(cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlockDecomposite.class, cleon.conception.architecture.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.SolutionBuildingBlockDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b3803688-2d70-11e6-959f-d1cef44ff5fd,Ap6IlQtu8SS0FLlcW5reuNT5+aY=] */
