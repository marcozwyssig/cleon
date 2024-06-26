package cleon.common.doc.metamodel.spec.paragraph.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Column extends DynamicResource implements IColumn {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumn> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumn>() {
    
    @Override
    public IColumn create() {
      return new Column();
    }
    
    @Override
    public IColumn create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Column(resourceRepository, resource);
    }
  
  };

  public Column() {
    super(IColumn.TYPE_ID);
  }
  
  public Column(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IColumn.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Double selectWidth() {
    return _getSingleAttribute(java.lang.Double.class, cleon.common.doc.metamodel.spec.paragraph.table.TablePackage.Column_width);
  }
    
  public void setWidth(java.lang.Double width) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.paragraph.table.TablePackage.Column_width, width);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Column setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Double.class, cleon.common.doc.metamodel.spec.paragraph.table.TablePackage.Column_width, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,06fe17d8-3c4a-11e5-871f-6beac6a7c24b,kDEzkHb3uXBmtI+yHXp2uRDdsj4=] */
