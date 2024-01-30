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
    if (is__S_90__F_to__F___Q_90()) return visitor.visit__S_90__F_to__F___Q_90();
    if (is__S_180__F_to__F___Q_180()) return visitor.visit__S_180__F_to__F___Q_180();
    if (is__S_360__F_to__F___Q_360()) return visitor.visit__S_360__F_to__F___Q_360();
    if (is__V___F_b_s___F_1000__F_()) return visitor.visit__V___F_b_s___F_1000__F_();
    if (is__V___F_b_s___F_10000()) return visitor.visit__V___F_b_s___F_10000();
    if (is__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE()) return visitor.visit__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE();
    if (is__V___S_15()) return visitor.visit__V___S_15();
    if (is__W___F___S___F_2_aD_12()) return visitor.visit__W___F___S___F_2_aD_12();
    if (is__W___F___S___F_2_aD_32()) return visitor.visit__W___F___S___F_2_aD_32();
    if (is__W___F___S___F_2_aD_64()) return visitor.visit__W___F___S___F_2_aD_64();
    if (is__W___F___S___F_256()) return visitor.visit__W___F___S___F_256();
    if (is__W___S_9()) return visitor.visit__W___S_9();
    if (isGUID__F_1__F___S___F_2_aD_128()) return visitor.visitGUID__F_1__F___S___F_2_aD_128();
    if (isJSON()) return visitor.visitJSON();
    if (isMin__F___8___F_0__R___F_Max__F___8___F_8()) return visitor.visitMin__F___8___F_0__R___F_Max__F___8___F_8();
    if (isParts__F_per__F_million__F___N_ppm__O_()) return visitor.visitParts__F_per__F_million__F___N_ppm__O_();
    if (isSeconds()) return visitor.visitSeconds();
    if (isString()) return visitor.visitString();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (is__S_90__F_to__F___Q_90()) {
      visitor.visit__S_90__F_to__F___Q_90();
      return;
    }
    if (is__S_180__F_to__F___Q_180()) {
      visitor.visit__S_180__F_to__F___Q_180();
      return;
    }
    if (is__S_360__F_to__F___Q_360()) {
      visitor.visit__S_360__F_to__F___Q_360();
      return;
    }
    if (is__V___F_b_s___F_1000__F_()) {
      visitor.visit__V___F_b_s___F_1000__F_();
      return;
    }
    if (is__V___F_b_s___F_10000()) {
      visitor.visit__V___F_b_s___F_10000();
      return;
    }
    if (is__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE()) {
      visitor.visit__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE();
      return;
    }
    if (is__V___S_15()) {
      visitor.visit__V___S_15();
      return;
    }
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
    if (is__W___F___S___F_256()) {
      visitor.visit__W___F___S___F_256();
      return;
    }
    if (is__W___S_9()) {
      visitor.visit__W___S_9();
      return;
    }
    if (isGUID__F_1__F___S___F_2_aD_128()) {
      visitor.visitGUID__F_1__F___S___F_2_aD_128();
      return;
    }
    if (isJSON()) {
      visitor.visitJSON();
      return;
    }
    if (isMin__F___8___F_0__R___F_Max__F___8___F_8()) {
      visitor.visitMin__F___8___F_0__R___F_Max__F___8___F_8();
      return;
    }
    if (isParts__F_per__F_million__F___N_ppm__O_()) {
      visitor.visitParts__F_per__F_million__F___N_ppm__O_();
      return;
    }
    if (isSeconds()) {
      visitor.visitSeconds();
      return;
    }
    if (isString()) {
      visitor.visitString();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__S_90__F_to__F___Q_90() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___S_90__F_to__F___Q_90);
  }
  
  @Override
  public boolean is__S_180__F_to__F___Q_180() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___S_180__F_to__F___Q_180);
  }
  
  @Override
  public boolean is__S_360__F_to__F___Q_360() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___S_360__F_to__F___Q_360);
  }
  
  @Override
  public boolean is__V___F_b_s___F_1000__F_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___V___F_b_s___F_1000__F_);
  }
  
  @Override
  public boolean is__V___F_b_s___F_10000() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___V___F_b_s___F_10000);
  }
  
  @Override
  public boolean is__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___V___F___8___F_FALSE__6___F_1__F___8___F_TRUE);
  }
  
  @Override
  public boolean is__V___S_15() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___V___S_15);
  }
  
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
  public boolean is__W___F___S___F_256() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___W___F___S___F_256);
  }
  
  @Override
  public boolean is__W___S_9() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue___W___S_9);
  }
  
  @Override
  public boolean isGUID__F_1__F___S___F_2_aD_128() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue_GUID__F_1__F___S___F_2_aD_128);
  }
  
  @Override
  public boolean isJSON() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue_JSON);
  }
  
  @Override
  public boolean isMin__F___8___F_0__R___F_Max__F___8___F_8() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue_Min__F___8___F_0__R___F_Max__F___8___F_8);
  }
  
  @Override
  public boolean isParts__F_per__F_million__F___N_ppm__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue_Parts__F_per__F_million__F___N_ppm__O_);
  }
  
  @Override
  public boolean isSeconds() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue_Seconds);
  }
  
  @Override
  public boolean isString() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.ColumnValue_String);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f46c2d4f-ba0f-11ee-876d-0f01c87670c8,kEkDu/97MNrnbQJwAhuFlqYhXUk=] */
