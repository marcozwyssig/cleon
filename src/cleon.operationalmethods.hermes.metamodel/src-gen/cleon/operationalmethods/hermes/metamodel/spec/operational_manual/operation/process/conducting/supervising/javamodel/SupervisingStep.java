package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.conducting.supervising.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SupervisingStep extends DynamicResource implements ISupervisingStep {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupervisingStep> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISupervisingStep>() {
    
    @Override
    public ISupervisingStep create() {
      return new SupervisingStep();
    }
    
    @Override
    public ISupervisingStep create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SupervisingStep(resourceRepository, resource);
    }
  
  };

  public SupervisingStep() {
    super(ISupervisingStep.TYPE_ID);
  }
  
  public SupervisingStep(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISupervisingStep.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectCmdImg() {
    return _getSingleAttribute(java.lang.String.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.ProcessPackage.Step_cmdImg);
  }
    
  public void setCmdImg(java.lang.String cmdImg) {
     _setSingleAttribute(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.ProcessPackage.Step_cmdImg, cmdImg);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectImg() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.image.ImagePackage.ImgAware_img);
  }
    
  public void setImg(java.lang.String img) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.paragraph.image.ImagePackage.ImgAware_img, img);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SupervisingStep setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.ProcessPackage.Step_cmdImg, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,48357801-95c9-11ea-9744-7dd962dc1878,zVkeaH7cJQnbd4MtS4PCFsTBFyQ=] */
