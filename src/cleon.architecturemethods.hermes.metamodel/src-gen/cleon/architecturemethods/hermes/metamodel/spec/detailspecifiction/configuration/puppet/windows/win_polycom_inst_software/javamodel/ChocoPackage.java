package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ChocoPackage extends DynamicResource implements IChocoPackage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChocoPackage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChocoPackage>() {
    
    @Override
    public IChocoPackage create() {
      return new ChocoPackage();
    }
    
    @Override
    public IChocoPackage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ChocoPackage(resourceRepository, resource);
    }
  
  };

  public ChocoPackage() {
    super(IChocoPackage.TYPE_ID);
  }
  
  public ChocoPackage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IChocoPackage.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant selectProductVariant() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.ChocoPackage_productVariant);
  }

  public ChocoPackage setProductVariant(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant productVariant) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.ChocoPackage_productVariant, productVariant);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ChocoPackage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ChocoPackage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.ChocoPackage_productVariant, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.javamodel.IChocoPackage> selectToMeProductVariant(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.javamodel.IChocoPackage.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.Win_polycom_inst_softwarePackage.ChocoPackage_productVariant, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1ce02c4f-13bf-11f0-b664-c7b92124985d,NF2lm1TvEt7tv3+jGk5KKjixzN8=] */
