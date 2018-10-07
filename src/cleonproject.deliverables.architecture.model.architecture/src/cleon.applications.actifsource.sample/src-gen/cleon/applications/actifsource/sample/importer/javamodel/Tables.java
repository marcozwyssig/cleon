package cleon.applications.actifsource.sample.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Tables extends DynamicResource implements ITables {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITables> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITables>() {
    
    @Override
    public ITables create() {
      return new Tables();
    }
    
    @Override
    public ITables create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Tables(resourceRepository, resource);
    }
  
  };

  public Tables() {
    super(ITables.TYPE_ID);
  }
  
  public Tables(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITables.TYPE_ID);
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
  public java.util.List<? extends cleon.applications.actifsource.sample.importer.javamodel.ITable> selectTables() {
    return _getList(cleon.applications.actifsource.sample.importer.javamodel.ITable.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Tables_tables);
  }

  public Tables setTables(java.util.List<? extends cleon.applications.actifsource.sample.importer.javamodel.ITable> tables) {
    _setList(cleon.applications.actifsource.sample.importer.ImporterPackage.Tables_tables, tables);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Tables setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.applications.actifsource.sample.importer.javamodel.ITable.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Tables_tables, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.sample.importer.javamodel.ITables selectToMeTables(cleon.applications.actifsource.sample.importer.javamodel.ITable object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.sample.importer.javamodel.ITables.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Tables_tables, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d96c7dda-23a2-11e8-9237-83e9a2871328,aK0f/1anzqBhPARSmgZ2wgzTaw8=] */
