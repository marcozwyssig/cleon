package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ColumnValue extends DynamicResource implements IColumnValue {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnValue> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnValue>() {
    
    @Override
    public IColumnValue create() {
      return new ColumnValue();
    }
    
    @Override
    public IColumnValue create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ColumnValue(resourceRepository, resource);
    }
  
  };

  public ColumnValue() {
    super(IColumnValue.TYPE_ID);
  }
  
  public ColumnValue(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IColumnValue.TYPE_ID);
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

  public ColumnValue setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (is__W___F___S___F_2_aD_12()) return visitor.visit__W___F___S___F_2_aD_12();
    if (is__W___F___S___F_2_aD_32()) return visitor.visit__W___F___S___F_2_aD_32();
    if (is__W___F___S___F_2_aD_64()) return visitor.visit__W___F___S___F_2_aD_64();
    if (is__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE()) return visitor.visit__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE();
    if (isJSON()) return visitor.visitJSON();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (is__W___F___S___F_2_aD_12()) {
      visitor.visit__W___F___S___F_2_aD_12();
      return;
    }
    if (is__W___F___S___F_2_aD_32()) {
      visitor.visit__W___F___S___F_2_aD_32();
      return;
    }
    if (is__W___F___S___F_2_aD_64()) {
      visitor.visit__W___F___S___F_2_aD_64();
      return;
    }
    if (is__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE()) {
      visitor.visit__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE();
      return;
    }
    if (isJSON()) {
      visitor.visitJSON();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__W___F___S___F_2_aD_12() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___W___F___S___F_2_aD_12);
  }
  
  @Override
  public boolean is__W___F___S___F_2_aD_32() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___W___F___S___F_2_aD_32);
  }
  
  @Override
  public boolean is__W___F___S___F_2_aD_64() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___W___F___S___F_2_aD_64);
  }
  
  @Override
  public boolean is__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___V___F___8___F_FALSE__6___F_1__F___8___F_TRUE);
  }
  
  @Override
  public boolean isJSON() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue_JSON);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f46c2d4f-ba0f-11ee-876d-0f01c87670c8,+ewF6mEdZng6TrGCP2L7RQa67yo=] */
