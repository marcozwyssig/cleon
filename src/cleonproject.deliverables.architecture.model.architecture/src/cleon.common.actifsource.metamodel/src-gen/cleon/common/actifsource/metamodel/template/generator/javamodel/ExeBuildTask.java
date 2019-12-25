package cleon.common.actifsource.metamodel.template.generator.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ExeBuildTask extends DynamicResource implements IExeBuildTask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExeBuildTask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExeBuildTask>() {
    
    @Override
    public IExeBuildTask create() {
      return new ExeBuildTask();
    }
    
    @Override
    public IExeBuildTask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ExeBuildTask(resourceRepository, resource);
    }
  
  };

  public ExeBuildTask() {
    super(IExeBuildTask.TYPE_ID);
  }
  
  public ExeBuildTask(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IExeBuildTask.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectBin() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_bin);
  }
    
  public void setBin(java.lang.String bin) {
     _setSingleAttribute(cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_bin, bin);
  }

  // relations
  
  @Override
  public cleon.common.resources.metamodel.spec.image.javamodel.IImageType selectImageType() {
    return _getSingle(cleon.common.resources.metamodel.spec.image.javamodel.IImageType.class, cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_imageType);
  }

  public ExeBuildTask setImageType(cleon.common.resources.metamodel.spec.image.javamodel.IImageType imageType) {
    _setSingle(cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_imageType, imageType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ExeBuildTask setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_bin, visitor);
    // relations
    _acceptSingle(cleon.common.resources.metamodel.spec.image.javamodel.IImageType.class, cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_imageType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.common.actifsource.metamodel.template.generator.javamodel.IExeBuildTask> selectToMeImageType(cleon.common.resources.metamodel.spec.image.javamodel.IImageType object) {
    return _getToMeList(object.getRepository(), cleon.common.actifsource.metamodel.template.generator.javamodel.IExeBuildTask.class, cleon.common.actifsource.metamodel.template.generator.GeneratorPackage.ExeBuildTask_imageType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,476ffade-0c87-11e9-8d44-37d40bf2d9d4,3eCLp09cItjzmhyfgTwkgfZdOzo=] */
