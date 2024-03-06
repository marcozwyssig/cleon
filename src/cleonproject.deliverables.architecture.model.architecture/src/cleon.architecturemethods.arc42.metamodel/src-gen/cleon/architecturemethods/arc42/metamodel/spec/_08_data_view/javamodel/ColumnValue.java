package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

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
    if (is__V___F_b_s___F_15()) return visitor.visit__V___F_b_s___F_15();
    if (is__V___F_b_s___F_1000__F_()) return visitor.visit__V___F_b_s___F_1000__F_();
    if (is__V___F_b_s___F_10000()) return visitor.visit__V___F_b_s___F_10000();
    if (is__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE()) return visitor.visit__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE();
    if (is__W___F_b_s___F_2_aD_12()) return visitor.visit__W___F_b_s___F_2_aD_12();
    if (is__W___F_b_s___F_2_aD_32()) return visitor.visit__W___F_b_s___F_2_aD_32();
    if (is__W___F_b_s___F_2_aD_64()) return visitor.visit__W___F_b_s___F_2_aD_64();
    if (is__W___F_b_s___F_9()) return visitor.visit__W___F_b_s___F_9();
    if (is__W___F_b_s___F_256()) return visitor.visit__W___F_b_s___F_256();
    if (is__W___F_b_s___F_n()) return visitor.visit__W___F_b_s___F_n();
    if (is__W_000__F_b_s___F_9999()) return visitor.visit__W_000__F_b_s___F_9999();
    if (isGUID__F_1__F_b_s___F_2_aD_128()) return visitor.visitGUID__F_1__F_b_s___F_2_aD_128();
    if (isIP__F___N_CIDR__O_()) return visitor.visitIP__F___N_CIDR__O_();
    if (isIPv4__F_Address()) return visitor.visitIPv4__F_Address();
    if (isIPv6__F_Address()) return visitor.visitIPv6__F_Address();
    if (isJSON()) return visitor.visitJSON();
    if (isMin__F___8___F_0__R___F_Max__F___8___F_8()) return visitor.visitMin__F___8___F_0__R___F_Max__F___8___F_8();
    if (isParts__F_per__F_million__F___N_ppm__O_()) return visitor.visitParts__F_per__F_million__F___N_ppm__O_();
    if (isSeconds()) return visitor.visitSeconds();
    if (isString()) return visitor.visitString();
    if (is__3___F_to__F_16__F_chars()) return visitor.visit__3___F_to__F_16__F_chars();
    if (is__H___H___F_or__F_SID()) return visitor.visit__H___H___F_or__F_SID();
    if (is__W___F_b_s___F_MAX__N_2_aD_32__S_1__O_()) return visitor.visit__W___F_b_s___F_MAX__N_2_aD_32__S_1__O_();
    if (isUTC__Q_0()) return visitor.visitUTC__Q_0();
    if (isTRUE__5___F_condition__F_is__F_active__6___F_FALSE__5___F_condition__F_is__F_inactive()) return visitor.visitTRUE__5___F_condition__F_is__F_active__6___F_FALSE__5___F_condition__F_is__F_inactive();
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
    if (is__V___F_b_s___F_15()) {
      visitor.visit__V___F_b_s___F_15();
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
    if (is__W___F_b_s___F_2_aD_12()) {
      visitor.visit__W___F_b_s___F_2_aD_12();
      return;
    }
    if (is__W___F_b_s___F_2_aD_32()) {
      visitor.visit__W___F_b_s___F_2_aD_32();
      return;
    }
    if (is__W___F_b_s___F_2_aD_64()) {
      visitor.visit__W___F_b_s___F_2_aD_64();
      return;
    }
    if (is__W___F_b_s___F_9()) {
      visitor.visit__W___F_b_s___F_9();
      return;
    }
    if (is__W___F_b_s___F_256()) {
      visitor.visit__W___F_b_s___F_256();
      return;
    }
    if (is__W___F_b_s___F_n()) {
      visitor.visit__W___F_b_s___F_n();
      return;
    }
    if (is__W_000__F_b_s___F_9999()) {
      visitor.visit__W_000__F_b_s___F_9999();
      return;
    }
    if (isGUID__F_1__F_b_s___F_2_aD_128()) {
      visitor.visitGUID__F_1__F_b_s___F_2_aD_128();
      return;
    }
    if (isIP__F___N_CIDR__O_()) {
      visitor.visitIP__F___N_CIDR__O_();
      return;
    }
    if (isIPv4__F_Address()) {
      visitor.visitIPv4__F_Address();
      return;
    }
    if (isIPv6__F_Address()) {
      visitor.visitIPv6__F_Address();
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
    if (is__3___F_to__F_16__F_chars()) {
      visitor.visit__3___F_to__F_16__F_chars();
      return;
    }
    if (is__H___H___F_or__F_SID()) {
      visitor.visit__H___H___F_or__F_SID();
      return;
    }
    if (is__W___F_b_s___F_MAX__N_2_aD_32__S_1__O_()) {
      visitor.visit__W___F_b_s___F_MAX__N_2_aD_32__S_1__O_();
      return;
    }
    if (isUTC__Q_0()) {
      visitor.visitUTC__Q_0();
      return;
    }
    if (isTRUE__5___F_condition__F_is__F_active__6___F_FALSE__5___F_condition__F_is__F_inactive()) {
      visitor.visitTRUE__5___F_condition__F_is__F_active__6___F_FALSE__5___F_condition__F_is__F_inactive();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__S_90__F_to__F___Q_90() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___S_90__F_to__F___Q_90);
  }
  
  @Override
  public boolean is__S_180__F_to__F___Q_180() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___S_180__F_to__F___Q_180);
  }
  
  @Override
  public boolean is__S_360__F_to__F___Q_360() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___S_360__F_to__F___Q_360);
  }
  
  @Override
  public boolean is__V___F_b_s___F_15() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___V___F_b_s___F_15);
  }
  
  @Override
  public boolean is__V___F_b_s___F_1000__F_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___V___F_b_s___F_1000__F_);
  }
  
  @Override
  public boolean is__V___F_b_s___F_10000() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___V___F_b_s___F_10000);
  }
  
  @Override
  public boolean is__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___V___F___8___F_FALSE__6___F_1__F___8___F_TRUE);
  }
  
  @Override
  public boolean is__W___F_b_s___F_2_aD_12() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___W___F_b_s___F_2_aD_12);
  }
  
  @Override
  public boolean is__W___F_b_s___F_2_aD_32() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___W___F_b_s___F_2_aD_32);
  }
  
  @Override
  public boolean is__W___F_b_s___F_2_aD_64() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___W___F_b_s___F_2_aD_64);
  }
  
  @Override
  public boolean is__W___F_b_s___F_9() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___W___F_b_s___F_9);
  }
  
  @Override
  public boolean is__W___F_b_s___F_256() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___W___F_b_s___F_256);
  }
  
  @Override
  public boolean is__W___F_b_s___F_n() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___W___F_b_s___F_n);
  }
  
  @Override
  public boolean is__W_000__F_b_s___F_9999() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___W_000__F_b_s___F_9999);
  }
  
  @Override
  public boolean isGUID__F_1__F_b_s___F_2_aD_128() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue_GUID__F_1__F_b_s___F_2_aD_128);
  }
  
  @Override
  public boolean isIP__F___N_CIDR__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue_IP__F___N_CIDR__O_);
  }
  
  @Override
  public boolean isIPv4__F_Address() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue_IPv4__F_Address);
  }
  
  @Override
  public boolean isIPv6__F_Address() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue_IPv6__F_Address);
  }
  
  @Override
  public boolean isJSON() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue_JSON);
  }
  
  @Override
  public boolean isMin__F___8___F_0__R___F_Max__F___8___F_8() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue_Min__F___8___F_0__R___F_Max__F___8___F_8);
  }
  
  @Override
  public boolean isParts__F_per__F_million__F___N_ppm__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue_Parts__F_per__F_million__F___N_ppm__O_);
  }
  
  @Override
  public boolean isSeconds() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue_Seconds);
  }
  
  @Override
  public boolean isString() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue_String);
  }
  
  @Override
  public boolean is__3___F_to__F_16__F_chars() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___3___F_to__F_16__F_chars);
  }
  
  @Override
  public boolean is__H___H___F_or__F_SID() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___H___H___F_or__F_SID);
  }
  
  @Override
  public boolean is__W___F_b_s___F_MAX__N_2_aD_32__S_1__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue___W___F_b_s___F_MAX__N_2_aD_32__S_1__O_);
  }
  
  @Override
  public boolean isUTC__Q_0() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue_UTC__Q_0);
  }
  
  @Override
  public boolean isTRUE__5___F_condition__F_is__F_active__6___F_FALSE__5___F_condition__F_is__F_inactive() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view._08_data_viewPackage.ColumnValue_TRUE__5___F_condition__F_is__F_active__6___F_FALSE__5___F_condition__F_is__F_inactive);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f46c2d4f-ba0f-11ee-876d-0f01c87670c8,+KO0X1+t9SDzPH8bO6t/XMNLmfE=] */
