package cleon.common.doc.metamodel.template.asciidoc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AsciiDocBuildTask extends DynamicResource implements IAsciiDocBuildTask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAsciiDocBuildTask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAsciiDocBuildTask>() {
    
    @Override
    public IAsciiDocBuildTask create() {
      return new AsciiDocBuildTask();
    }
    
    @Override
    public IAsciiDocBuildTask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AsciiDocBuildTask(resourceRepository, resource);
    }
  
  };

  public AsciiDocBuildTask() {
    super(IAsciiDocBuildTask.TYPE_ID);
  }
  
  public AsciiDocBuildTask(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAsciiDocBuildTask.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AsciiDocBuildTask setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5101c25b-5d86-11e7-b3de-5dfb634b4d92,f3wueTiMBAxBtBxIzJJrfZK4Lho=] */
