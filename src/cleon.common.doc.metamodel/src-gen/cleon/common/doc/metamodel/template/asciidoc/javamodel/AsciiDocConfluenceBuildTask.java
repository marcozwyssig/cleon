package cleon.common.doc.metamodel.template.asciidoc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AsciiDocConfluenceBuildTask extends DynamicResource implements IAsciiDocConfluenceBuildTask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAsciiDocConfluenceBuildTask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAsciiDocConfluenceBuildTask>() {
    
    @Override
    public IAsciiDocConfluenceBuildTask create() {
      return new AsciiDocConfluenceBuildTask();
    }
    
    @Override
    public IAsciiDocConfluenceBuildTask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AsciiDocConfluenceBuildTask(resourceRepository, resource);
    }
  
  };

  public AsciiDocConfluenceBuildTask() {
    super(IAsciiDocConfluenceBuildTask.TYPE_ID);
  }
  
  public AsciiDocConfluenceBuildTask(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAsciiDocConfluenceBuildTask.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectHost() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.template.asciidoc.AsciidocPackage.AsciiDocConfluenceBuildTask_host);
  }
    
  public void setHost(java.lang.String host) {
     _setSingleAttribute(cleon.common.doc.metamodel.template.asciidoc.AsciidocPackage.AsciiDocConfluenceBuildTask_host, host);
  }

  @Override
  public java.lang.String selectSpaceKey() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.template.asciidoc.AsciidocPackage.AsciiDocConfluenceBuildTask_spaceKey);
  }
    
  public void setSpaceKey(java.lang.String spaceKey) {
     _setSingleAttribute(cleon.common.doc.metamodel.template.asciidoc.AsciidocPackage.AsciiDocConfluenceBuildTask_spaceKey, spaceKey);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AsciiDocConfluenceBuildTask setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.template.asciidoc.AsciidocPackage.AsciiDocConfluenceBuildTask_host, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.template.asciidoc.AsciidocPackage.AsciiDocConfluenceBuildTask_spaceKey, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,de19b8fe-65f5-11e7-a25d-b350312fe5de,W/ivOTA8x5jAg8G5Ra9xtwD3C14=] */
