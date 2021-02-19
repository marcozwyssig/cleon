package cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CollectionType extends DynamicResource implements ICollectionType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICollectionType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICollectionType>() {
    
    @Override
    public ICollectionType create() {
      return new CollectionType();
    }
    
    @Override
    public ICollectionType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CollectionType(resourceRepository, resource);
    }
  
  };

  public CollectionType() {
    super(ICollectionType.TYPE_ID);
  }
  
  public CollectionType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICollectionType.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CollectionType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isEnumerable()) return visitor.visitEnumerable();
    if (isObservableCollection()) return visitor.visitObservableCollection();
    if (isObservableCollectionWithView()) return visitor.visitObservableCollectionWithView();
    if (isList()) return visitor.visitList();
    if (isReadOnlyList()) return visitor.visitReadOnlyList();
    if (isCollection()) return visitor.visitCollection();
    if (isReadOnlyObservableCollection()) return visitor.visitReadOnlyObservableCollection();
    if (isReadOnlyCollection()) return visitor.visitReadOnlyCollection();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isEnumerable()) {
      visitor.visitEnumerable();
      return;
    }
    if (isObservableCollection()) {
      visitor.visitObservableCollection();
      return;
    }
    if (isObservableCollectionWithView()) {
      visitor.visitObservableCollectionWithView();
      return;
    }
    if (isList()) {
      visitor.visitList();
      return;
    }
    if (isReadOnlyList()) {
      visitor.visitReadOnlyList();
      return;
    }
    if (isCollection()) {
      visitor.visitCollection();
      return;
    }
    if (isReadOnlyObservableCollection()) {
      visitor.visitReadOnlyObservableCollection();
      return;
    }
    if (isReadOnlyCollection()) {
      visitor.visitReadOnlyCollection();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isEnumerable() {
    return getResource().equals(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionType_Enumerable);
  }
  
  @Override
  public boolean isObservableCollection() {
    return getResource().equals(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionType_ObservableCollection);
  }
  
  @Override
  public boolean isObservableCollectionWithView() {
    return getResource().equals(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionType_ObservableCollectionWithView);
  }
  
  @Override
  public boolean isList() {
    return getResource().equals(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionType_List);
  }
  
  @Override
  public boolean isReadOnlyList() {
    return getResource().equals(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionType_ReadOnlyList);
  }
  
  @Override
  public boolean isCollection() {
    return getResource().equals(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionType_Collection);
  }
  
  @Override
  public boolean isReadOnlyObservableCollection() {
    return getResource().equals(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionType_ReadOnlyObservableCollection);
  }
  
  @Override
  public boolean isReadOnlyCollection() {
    return getResource().equals(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.AssociationPackage.CollectionType_ReadOnlyCollection);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,261182b1-13ca-11e3-bec7-f1e135382475,EHEArdAOAY0ENCSFWvHpNcUsfNk=] */
