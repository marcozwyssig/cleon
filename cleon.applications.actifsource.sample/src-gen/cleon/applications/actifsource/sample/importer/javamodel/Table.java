package cleon.applications.actifsource.sample.importer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Table extends DynamicResource implements ITable {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITable> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITable>() {
    
    @Override
    public ITable create() {
      return new Table();
    }
    
    @Override
    public ITable create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Table(resourceRepository, resource);
    }
  
  };

  public Table() {
    super(ITable.TYPE_ID);
  }
  
  public Table(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITable.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDescription() {
    return _getSingleAttribute(java.lang.String.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Table_description);
  }
    
  public void setDescription(java.lang.String description) {
     _setSingleAttribute(cleon.applications.actifsource.sample.importer.ImporterPackage.Table_description, description);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectSize() {
    return _getSingleAttribute(java.lang.String.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Table_size);
  }
    
  public void setSize(java.lang.String size) {
     _setSingleAttribute(cleon.applications.actifsource.sample.importer.ImporterPackage.Table_size, size);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.applications.actifsource.sample.importer.javamodel.IChair> selectChairs() {
    return _getList(cleon.applications.actifsource.sample.importer.javamodel.IChair.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Table_chairs);
  }

  public Table setChairs(java.util.List<? extends cleon.applications.actifsource.sample.importer.javamodel.IChair> chairs) {
    _setList(cleon.applications.actifsource.sample.importer.ImporterPackage.Table_chairs, chairs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.sample.importer.javamodel.IPerson> selectPersons() {
    return _getList(cleon.applications.actifsource.sample.importer.javamodel.IPerson.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Table_persons);
  }

  public Table setPersons(java.util.List<? extends cleon.applications.actifsource.sample.importer.javamodel.IPerson> persons) {
    _setList(cleon.applications.actifsource.sample.importer.ImporterPackage.Table_persons, persons);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Table setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Table_description, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Table_size, visitor);
    // relations
    _acceptList(cleon.applications.actifsource.sample.importer.javamodel.IChair.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Table_chairs, visitor);
    _acceptList(cleon.applications.actifsource.sample.importer.javamodel.IPerson.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Table_persons, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.applications.actifsource.sample.importer.javamodel.ITable selectToMePersons(cleon.applications.actifsource.sample.importer.javamodel.IPerson object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.sample.importer.javamodel.ITable.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Table_persons, object.getResource());
  }
  
  public static cleon.applications.actifsource.sample.importer.javamodel.ITable selectToMeChairs(cleon.applications.actifsource.sample.importer.javamodel.IChair object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.sample.importer.javamodel.ITable.class, cleon.applications.actifsource.sample.importer.ImporterPackage.Table_chairs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f51318cc-221f-11e8-8749-cb7f4d6924d3,EXqJpZqre4TZvULLZxfgEHoxoso=] */
