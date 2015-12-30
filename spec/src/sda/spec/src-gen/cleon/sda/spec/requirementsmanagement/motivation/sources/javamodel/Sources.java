package cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Sources extends DynamicResource implements ISources {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISources> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISources>() {
    
    @Override
    public ISources create() {
      return new Sources();
    }
    
    @Override
    public ISources create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Sources(resourceRepository, resource);
    }
  
  };

  public Sources() {
    super(ISources.TYPE_ID);
  }
  
  public Sources(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISources.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectSource() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.Sources_source);
  }

  public Sources setSource(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> source) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.Sources_source, source);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Sources setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.Sources_source, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISources selectToMeSource(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISources.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.Sources_source, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,efb0f224-a281-11e5-9332-1b5893de4362,naJ9JHe0erAUJc9pCrAdgUt26xM=] */
