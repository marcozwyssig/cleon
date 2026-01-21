package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

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
    if (is__V___F___8___F_FALSE()) return visitor.visit__V___F___8___F_FALSE();
    if (is__W___F___8___F_TRUE()) return visitor.visit__W___F___8___F_TRUE();
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
    if (isMESH__F___8___F_full__F_mesh()) return visitor.visitMESH__F___8___F_full__F_mesh();
    if (isTREE__F___8___F___H_Root__S_and__S_Leaf__H___F_or__F___H_Hub__S_and__S_Spoke__H_()) return visitor.visitTREE__F___8___F___H_Root__S_and__S_Leaf__H___F_or__F___H_Hub__S_and__S_Spoke__H_();
    if (isSCALABLE__F___8___F_Map__F_to__F_underlay__F_multicast()) return visitor.visitSCALABLE__F___8___F_Map__F_to__F_underlay__F_multicast();
    if (isDISABLED__F___8___F_No__F_L3__F_multicast__F_support()) return visitor.visitDISABLED__F___8___F_No__F_L3__F_multicast__F_support();
    if (isA__F___8___F_IPv4__S_Address()) return visitor.visitA__F___8___F_IPv4__S_Address();
    if (isAAAA__F___8___F_IPv6__S_Address()) return visitor.visitAAAA__F___8___F_IPv6__S_Address();
    if (isMX__F___8___F_Mail__F_server__F___N_priority__F_and__F_DNS__F_name__O_()) return visitor.visitMX__F___8___F_Mail__F_server__F___N_priority__F_and__F_DNS__F_name__O_();
    if (isSRV__F___8___F_Service__F_record__F___N_priority__R___F_weight__R___F_port__R___F_and__F_DNS__F_name__O_()) return visitor.visitSRV__F___8___F_Service__F_record__F___N_priority__R___F_weight__R___F_port__R___F_and__F_DNS__F_name__O_();
    if (isCNAME__F___8___F_Canonical__F_name__F___N_DNS__F_alias__O_()) return visitor.visitCNAME__F___8___F_Canonical__F_name__F___N_DNS__F_alias__O_();
    if (isTXT__F___8___F_Arbitrary__F_text()) return visitor.visitTXT__F___8___F_Arbitrary__F_text();
    if (isMD5()) return visitor.visitMD5();
    if (isAES_aE_CMAC__F___N_128bit__O_()) return visitor.visitAES_aE_CMAC__F___N_128bit__O_();
    if (isROOT__5___F___H_Root__H___F_oder__F___H_Hub__H_()) return visitor.visitROOT__5___F___H_Root__H___F_oder__F___H_Hub__H_();
    if (isLEAF__5___F___H_Leaf__H___F_oder__F___H_Spoke__H_()) return visitor.visitLEAF__5___F___H_Leaf__H___F_oder__F___H_Spoke__H_();
    if (is_aA_STRING_aC_()) return visitor.visit_aA_STRING_aC_();
    if (isSTP()) return visitor.visitSTP();
    if (isRSTP()) return visitor.visitRSTP();
    if (isMSTP()) return visitor.visitMSTP();
    if (is__X___F___8___F_OspfVersion__F_v2()) return visitor.visit__X___F___8___F_OspfVersion__F_v2();
    if (is__Y___F___8___F_OspfVersion__F_v3()) return visitor.visit__Y___F___8___F_OspfVersion__F_v3();
    if (is__Z___F___8___F_IPv4()) return visitor.visit__Z___F___8___F_IPv4();
    if (is__1___F___8___F_IPv6()) return visitor.visit__1___F___8___F_IPv6();
    if (isMAC__S_Address__F___N_IEEE__F_802__F_MAC__S_Adresse__F___N_EUI__S_48__O___O_()) return visitor.visitMAC__S_Address__F___N_IEEE__F_802__F_MAC__S_Adresse__F___N_EUI__S_48__O___O_();
    if (is__X___T_4__F_GHz()) return visitor.visit__X___T_4__F_GHz();
    if (is__0___F_GHz()) return visitor.visit__0___F_GHz();
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
    if (is__V___F___8___F_FALSE()) {
      visitor.visit__V___F___8___F_FALSE();
      return;
    }
    if (is__W___F___8___F_TRUE()) {
      visitor.visit__W___F___8___F_TRUE();
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
    if (isMESH__F___8___F_full__F_mesh()) {
      visitor.visitMESH__F___8___F_full__F_mesh();
      return;
    }
    if (isTREE__F___8___F___H_Root__S_and__S_Leaf__H___F_or__F___H_Hub__S_and__S_Spoke__H_()) {
      visitor.visitTREE__F___8___F___H_Root__S_and__S_Leaf__H___F_or__F___H_Hub__S_and__S_Spoke__H_();
      return;
    }
    if (isSCALABLE__F___8___F_Map__F_to__F_underlay__F_multicast()) {
      visitor.visitSCALABLE__F___8___F_Map__F_to__F_underlay__F_multicast();
      return;
    }
    if (isDISABLED__F___8___F_No__F_L3__F_multicast__F_support()) {
      visitor.visitDISABLED__F___8___F_No__F_L3__F_multicast__F_support();
      return;
    }
    if (isA__F___8___F_IPv4__S_Address()) {
      visitor.visitA__F___8___F_IPv4__S_Address();
      return;
    }
    if (isAAAA__F___8___F_IPv6__S_Address()) {
      visitor.visitAAAA__F___8___F_IPv6__S_Address();
      return;
    }
    if (isMX__F___8___F_Mail__F_server__F___N_priority__F_and__F_DNS__F_name__O_()) {
      visitor.visitMX__F___8___F_Mail__F_server__F___N_priority__F_and__F_DNS__F_name__O_();
      return;
    }
    if (isSRV__F___8___F_Service__F_record__F___N_priority__R___F_weight__R___F_port__R___F_and__F_DNS__F_name__O_()) {
      visitor.visitSRV__F___8___F_Service__F_record__F___N_priority__R___F_weight__R___F_port__R___F_and__F_DNS__F_name__O_();
      return;
    }
    if (isCNAME__F___8___F_Canonical__F_name__F___N_DNS__F_alias__O_()) {
      visitor.visitCNAME__F___8___F_Canonical__F_name__F___N_DNS__F_alias__O_();
      return;
    }
    if (isTXT__F___8___F_Arbitrary__F_text()) {
      visitor.visitTXT__F___8___F_Arbitrary__F_text();
      return;
    }
    if (isMD5()) {
      visitor.visitMD5();
      return;
    }
    if (isAES_aE_CMAC__F___N_128bit__O_()) {
      visitor.visitAES_aE_CMAC__F___N_128bit__O_();
      return;
    }
    if (isROOT__5___F___H_Root__H___F_oder__F___H_Hub__H_()) {
      visitor.visitROOT__5___F___H_Root__H___F_oder__F___H_Hub__H_();
      return;
    }
    if (isLEAF__5___F___H_Leaf__H___F_oder__F___H_Spoke__H_()) {
      visitor.visitLEAF__5___F___H_Leaf__H___F_oder__F___H_Spoke__H_();
      return;
    }
    if (is_aA_STRING_aC_()) {
      visitor.visit_aA_STRING_aC_();
      return;
    }
    if (isSTP()) {
      visitor.visitSTP();
      return;
    }
    if (isRSTP()) {
      visitor.visitRSTP();
      return;
    }
    if (isMSTP()) {
      visitor.visitMSTP();
      return;
    }
    if (is__X___F___8___F_OspfVersion__F_v2()) {
      visitor.visit__X___F___8___F_OspfVersion__F_v2();
      return;
    }
    if (is__Y___F___8___F_OspfVersion__F_v3()) {
      visitor.visit__Y___F___8___F_OspfVersion__F_v3();
      return;
    }
    if (is__Z___F___8___F_IPv4()) {
      visitor.visit__Z___F___8___F_IPv4();
      return;
    }
    if (is__1___F___8___F_IPv6()) {
      visitor.visit__1___F___8___F_IPv6();
      return;
    }
    if (isMAC__S_Address__F___N_IEEE__F_802__F_MAC__S_Adresse__F___N_EUI__S_48__O___O_()) {
      visitor.visitMAC__S_Address__F___N_IEEE__F_802__F_MAC__S_Adresse__F___N_EUI__S_48__O___O_();
      return;
    }
    if (is__X___T_4__F_GHz()) {
      visitor.visit__X___T_4__F_GHz();
      return;
    }
    if (is__0___F_GHz()) {
      visitor.visit__0___F_GHz();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__S_90__F_to__F___Q_90() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___S_90__F_to__F___Q_90);
  }
  
  @Override
  public boolean is__S_180__F_to__F___Q_180() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___S_180__F_to__F___Q_180);
  }
  
  @Override
  public boolean is__S_360__F_to__F___Q_360() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___S_360__F_to__F___Q_360);
  }
  
  @Override
  public boolean is__V___F_b_s___F_15() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___V___F_b_s___F_15);
  }
  
  @Override
  public boolean is__V___F_b_s___F_1000__F_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___V___F_b_s___F_1000__F_);
  }
  
  @Override
  public boolean is__V___F_b_s___F_10000() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___V___F_b_s___F_10000);
  }
  
  @Override
  public boolean is__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___V___F___8___F_FALSE__6___F_1__F___8___F_TRUE);
  }
  
  @Override
  public boolean is__V___F___8___F_FALSE() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___V___F___8___F_FALSE);
  }
  
  @Override
  public boolean is__W___F___8___F_TRUE() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___W___F___8___F_TRUE);
  }
  
  @Override
  public boolean is__W___F_b_s___F_2_aD_12() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___W___F_b_s___F_2_aD_12);
  }
  
  @Override
  public boolean is__W___F_b_s___F_2_aD_32() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___W___F_b_s___F_2_aD_32);
  }
  
  @Override
  public boolean is__W___F_b_s___F_2_aD_64() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___W___F_b_s___F_2_aD_64);
  }
  
  @Override
  public boolean is__W___F_b_s___F_9() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___W___F_b_s___F_9);
  }
  
  @Override
  public boolean is__W___F_b_s___F_256() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___W___F_b_s___F_256);
  }
  
  @Override
  public boolean is__W___F_b_s___F_n() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___W___F_b_s___F_n);
  }
  
  @Override
  public boolean is__W_000__F_b_s___F_9999() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___W_000__F_b_s___F_9999);
  }
  
  @Override
  public boolean isGUID__F_1__F_b_s___F_2_aD_128() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_GUID__F_1__F_b_s___F_2_aD_128);
  }
  
  @Override
  public boolean isIP__F___N_CIDR__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_IP__F___N_CIDR__O_);
  }
  
  @Override
  public boolean isIPv4__F_Address() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_IPv4__F_Address);
  }
  
  @Override
  public boolean isIPv6__F_Address() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_IPv6__F_Address);
  }
  
  @Override
  public boolean isJSON() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_JSON);
  }
  
  @Override
  public boolean isMin__F___8___F_0__R___F_Max__F___8___F_8() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_Min__F___8___F_0__R___F_Max__F___8___F_8);
  }
  
  @Override
  public boolean isParts__F_per__F_million__F___N_ppm__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_Parts__F_per__F_million__F___N_ppm__O_);
  }
  
  @Override
  public boolean isSeconds() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_Seconds);
  }
  
  @Override
  public boolean isString() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_String);
  }
  
  @Override
  public boolean is__3___F_to__F_16__F_chars() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___3___F_to__F_16__F_chars);
  }
  
  @Override
  public boolean is__H___H___F_or__F_SID() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___H___H___F_or__F_SID);
  }
  
  @Override
  public boolean is__W___F_b_s___F_MAX__N_2_aD_32__S_1__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___W___F_b_s___F_MAX__N_2_aD_32__S_1__O_);
  }
  
  @Override
  public boolean isUTC__Q_0() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_UTC__Q_0);
  }
  
  @Override
  public boolean isTRUE__5___F_condition__F_is__F_active__6___F_FALSE__5___F_condition__F_is__F_inactive() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_TRUE__5___F_condition__F_is__F_active__6___F_FALSE__5___F_condition__F_is__F_inactive);
  }
  
  @Override
  public boolean isMESH__F___8___F_full__F_mesh() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_MESH__F___8___F_full__F_mesh);
  }
  
  @Override
  public boolean isTREE__F___8___F___H_Root__S_and__S_Leaf__H___F_or__F___H_Hub__S_and__S_Spoke__H_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_TREE__F___8___F___H_Root__S_and__S_Leaf__H___F_or__F___H_Hub__S_and__S_Spoke__H_);
  }
  
  @Override
  public boolean isSCALABLE__F___8___F_Map__F_to__F_underlay__F_multicast() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_SCALABLE__F___8___F_Map__F_to__F_underlay__F_multicast);
  }
  
  @Override
  public boolean isDISABLED__F___8___F_No__F_L3__F_multicast__F_support() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_DISABLED__F___8___F_No__F_L3__F_multicast__F_support);
  }
  
  @Override
  public boolean isA__F___8___F_IPv4__S_Address() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_A__F___8___F_IPv4__S_Address);
  }
  
  @Override
  public boolean isAAAA__F___8___F_IPv6__S_Address() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_AAAA__F___8___F_IPv6__S_Address);
  }
  
  @Override
  public boolean isMX__F___8___F_Mail__F_server__F___N_priority__F_and__F_DNS__F_name__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_MX__F___8___F_Mail__F_server__F___N_priority__F_and__F_DNS__F_name__O_);
  }
  
  @Override
  public boolean isSRV__F___8___F_Service__F_record__F___N_priority__R___F_weight__R___F_port__R___F_and__F_DNS__F_name__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_SRV__F___8___F_Service__F_record__F___N_priority__R___F_weight__R___F_port__R___F_and__F_DNS__F_name__O_);
  }
  
  @Override
  public boolean isCNAME__F___8___F_Canonical__F_name__F___N_DNS__F_alias__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_CNAME__F___8___F_Canonical__F_name__F___N_DNS__F_alias__O_);
  }
  
  @Override
  public boolean isTXT__F___8___F_Arbitrary__F_text() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_TXT__F___8___F_Arbitrary__F_text);
  }
  
  @Override
  public boolean isMD5() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_MD5);
  }
  
  @Override
  public boolean isAES_aE_CMAC__F___N_128bit__O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_AES_aE_CMAC__F___N_128bit__O_);
  }
  
  @Override
  public boolean isROOT__5___F___H_Root__H___F_oder__F___H_Hub__H_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_ROOT__5___F___H_Root__H___F_oder__F___H_Hub__H_);
  }
  
  @Override
  public boolean isLEAF__5___F___H_Leaf__H___F_oder__F___H_Spoke__H_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_LEAF__5___F___H_Leaf__H___F_oder__F___H_Spoke__H_);
  }
  
  @Override
  public boolean is_aA_STRING_aC_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue__aA_STRING_aC_);
  }
  
  @Override
  public boolean isSTP() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_STP);
  }
  
  @Override
  public boolean isRSTP() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_RSTP);
  }
  
  @Override
  public boolean isMSTP() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_MSTP);
  }
  
  @Override
  public boolean is__X___F___8___F_OspfVersion__F_v2() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___X___F___8___F_OspfVersion__F_v2);
  }
  
  @Override
  public boolean is__Y___F___8___F_OspfVersion__F_v3() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___Y___F___8___F_OspfVersion__F_v3);
  }
  
  @Override
  public boolean is__Z___F___8___F_IPv4() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___Z___F___8___F_IPv4);
  }
  
  @Override
  public boolean is__1___F___8___F_IPv6() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___1___F___8___F_IPv6);
  }
  
  @Override
  public boolean isMAC__S_Address__F___N_IEEE__F_802__F_MAC__S_Adresse__F___N_EUI__S_48__O___O_() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue_MAC__S_Address__F___N_IEEE__F_802__F_MAC__S_Adresse__F___N_EUI__S_48__O___O_);
  }
  
  @Override
  public boolean is__X___T_4__F_GHz() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___X___T_4__F_GHz);
  }
  
  @Override
  public boolean is__0___F_GHz() {
    return getResource().equals(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.TablePackage.ColumnValue___0___F_GHz);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f46c2d4f-ba0f-11ee-876d-0f01c87670c8,htqtxwYtr3aTeeT1gH6Rb0aM5XA=] */
