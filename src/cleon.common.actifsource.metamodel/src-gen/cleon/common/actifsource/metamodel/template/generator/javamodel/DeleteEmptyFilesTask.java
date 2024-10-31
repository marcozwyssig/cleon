package cleon.common.actifsource.metamodel.template.generator.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeleteEmptyFilesTask extends DynamicResource implements IDeleteEmptyFilesTask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeleteEmptyFilesTask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeleteEmptyFilesTask>() {
    
    @Override
    public IDeleteEmptyFilesTask create() {
      return new DeleteEmptyFilesTask();
    }
    
    @Override
    public IDeleteEmptyFilesTask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeleteEmptyFilesTask(resourceRepository, resource);
    }
  
  };

  public DeleteEmptyFilesTask() {
    super(IDeleteEmptyFilesTask.TYPE_ID);
  }
  
  public DeleteEmptyFilesTask(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeleteEmptyFilesTask.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeleteEmptyFilesTask setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0032b965-f41b-11ea-ade2-eb32c9704a85,DVzrjA/POmWGfFbeq4AsAoRRf5E=] */
