package cleon.modelinglanguages.uml.template.plantuml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PlantUmlBuildTask extends DynamicResource implements IPlantUmlBuildTask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlantUmlBuildTask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlantUmlBuildTask>() {
    
    @Override
    public IPlantUmlBuildTask create() {
      return new PlantUmlBuildTask();
    }
    
    @Override
    public IPlantUmlBuildTask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PlantUmlBuildTask(resourceRepository, resource);
    }
  
  };

  public PlantUmlBuildTask() {
    super(IPlantUmlBuildTask.TYPE_ID);
  }
  
  public PlantUmlBuildTask(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPlantUmlBuildTask.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectBin() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.util.spec.actifsource.generator.GeneratorPackage.ExeBuildTask_bin);
  }
    
  public void setBin(java.lang.String bin) {
     _setSingleAttribute(cleon.common.util.spec.actifsource.generator.GeneratorPackage.ExeBuildTask_bin, bin);
  }

  // relations
  
  @Override
  public cleon.common.resources.spec.resources.image.javamodel.IImageType selectImageType() {
    return _getSingle(cleon.common.resources.spec.resources.image.javamodel.IImageType.class, cleon.common.util.spec.actifsource.generator.GeneratorPackage.ExeBuildTask_imageType);
  }

  public PlantUmlBuildTask setImageType(cleon.common.resources.spec.resources.image.javamodel.IImageType imageType) {
    _setSingle(cleon.common.util.spec.actifsource.generator.GeneratorPackage.ExeBuildTask_imageType, imageType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PlantUmlBuildTask setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.util.spec.actifsource.generator.GeneratorPackage.ExeBuildTask_bin, visitor);
    // relations
    _acceptSingle(cleon.common.resources.spec.resources.image.javamodel.IImageType.class, cleon.common.util.spec.actifsource.generator.GeneratorPackage.ExeBuildTask_imageType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,54616975-8e4f-11e7-859f-5dd1441850fb,h1/t/AJh1JZvG1RorE0TcAHPcIs=] */
