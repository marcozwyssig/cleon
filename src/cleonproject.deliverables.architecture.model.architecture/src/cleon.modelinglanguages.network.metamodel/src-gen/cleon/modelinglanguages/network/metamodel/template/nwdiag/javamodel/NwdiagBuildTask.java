package cleon.modelinglanguages.network.metamodel.template.nwdiag.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NwdiagBuildTask extends DynamicResource implements INwdiagBuildTask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INwdiagBuildTask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INwdiagBuildTask>() {
    
    @Override
    public INwdiagBuildTask create() {
      return new NwdiagBuildTask();
    }
    
    @Override
    public INwdiagBuildTask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NwdiagBuildTask(resourceRepository, resource);
    }
  
  };

  public NwdiagBuildTask() {
    super(INwdiagBuildTask.TYPE_ID);
  }
  
  public NwdiagBuildTask(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INwdiagBuildTask.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectBin() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_bin);
  }
    
  public void setBin(java.lang.String bin) {
     _setSingleAttribute(cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_bin, bin);
  }

  @Override
  public java.lang.String selectFont() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.network.metamodel.template.nwdiag.NwdiagPackage.NwdiagBuildTask_font);
  }
    
  public void setFont(java.lang.String font) {
     _setSingleAttribute(cleon.modelinglanguages.network.metamodel.template.nwdiag.NwdiagPackage.NwdiagBuildTask_font, font);
  }

  // relations
  
  @Override
  public cleon.common.resources.metamodel.spec.image.javamodel.IImageType selectImageType() {
    return _getSingle(cleon.common.resources.metamodel.spec.image.javamodel.IImageType.class, cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_imageType);
  }

  public NwdiagBuildTask setImageType(cleon.common.resources.metamodel.spec.image.javamodel.IImageType imageType) {
    _setSingle(cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_imageType, imageType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NwdiagBuildTask setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_bin, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.network.metamodel.template.nwdiag.NwdiagPackage.NwdiagBuildTask_font, visitor);
    // relations
    _acceptSingle(cleon.common.resources.metamodel.spec.image.javamodel.IImageType.class, cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_imageType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5754eef7-054f-11e9-b814-a133e521728c,a1Tg7ZJNqUrhpq5i5LlnvF0a4QQ=] */
