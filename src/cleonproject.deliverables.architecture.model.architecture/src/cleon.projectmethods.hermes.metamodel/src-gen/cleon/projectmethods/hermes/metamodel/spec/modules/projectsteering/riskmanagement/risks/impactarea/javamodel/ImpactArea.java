package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImpactArea extends DynamicResource implements IImpactArea {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImpactArea> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImpactArea>() {
    
    @Override
    public IImpactArea create() {
      return new ImpactArea();
    }
    
    @Override
    public IImpactArea create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImpactArea(resourceRepository, resource);
    }
  
  };

  public ImpactArea() {
    super(IImpactArea.TYPE_ID);
  }
  
  public ImpactArea(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImpactArea.TYPE_ID);
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
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactType> selectImpactTypes() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactType.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.ImpactareaPackage.ImpactArea_impactTypes);
  }

  public ImpactArea setImpactTypes(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactType> impactTypes) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.ImpactareaPackage.ImpactArea_impactTypes, impactTypes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ImpactArea setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactType.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.ImpactareaPackage.ImpactArea_impactTypes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactArea selectToMeImpactTypes(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactType object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactArea.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.ImpactareaPackage.ImpactArea_impactTypes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e1c17e6-2f07-11e6-8bd9-a77b8d2a3a0e,5AX3qgZ5y/MvglotykFyotTNZLY=] */
