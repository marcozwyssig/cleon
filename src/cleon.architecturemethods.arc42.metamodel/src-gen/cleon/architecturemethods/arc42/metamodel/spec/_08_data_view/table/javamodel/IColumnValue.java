package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IColumnValue extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f46c2d4f-ba0f-11ee-876d-0f01c87670c8");
  
  public static interface IValueVoidVisitor {
    
    public void visit__S_90__F_to__F___Q_90();
    
    public void visit__S_180__F_to__F___Q_180();
    
    public void visit__S_360__F_to__F___Q_360();
    
    public void visit__V___F_b_s___F_15();
    
    public void visit__V___F_b_s___F_1000__F_();
    
    public void visit__V___F_b_s___F_10000();
    
    public void visit__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE();
    
    public void visit__V___F___8___F_FALSE();
    
    public void visit__W___F___8___F_TRUE();
    
    public void visit__W___F_b_s___F_2_aD_12();
    
    public void visit__W___F_b_s___F_2_aD_32();
    
    public void visit__W___F_b_s___F_2_aD_64();
    
    public void visit__W___F_b_s___F_9();
    
    public void visit__W___F_b_s___F_256();
    
    public void visit__W___F_b_s___F_n();
    
    public void visit__W_000__F_b_s___F_9999();
    
    public void visitGUID__F_1__F_b_s___F_2_aD_128();
    
    public void visitIP__F___N_CIDR__O_();
    
    public void visitIPv4__F_Address();
    
    public void visitIPv6__F_Address();
    
    public void visitJSON();
    
    public void visitMin__F___8___F_0__R___F_Max__F___8___F_8();
    
    public void visitParts__F_per__F_million__F___N_ppm__O_();
    
    public void visitSeconds();
    
    public void visitString();
    
    public void visit__3___F_to__F_16__F_chars();
    
    public void visit__H___H___F_or__F_SID();
    
    public void visit__W___F_b_s___F_MAX__N_2_aD_32__S_1__O_();
    
    public void visitUTC__Q_0();
    
    public void visitTRUE__5___F_condition__F_is__F_active__6___F_FALSE__5___F_condition__F_is__F_inactive();
    
    public void visitMESH__F___8___F_full__F_mesh();
    
    public void visitTREE__F___8___F___H_Root__S_and__S_Leaf__H___F_or__F___H_Hub__S_and__S_Spoke__H_();
    
    public void visitSCALABLE__F___8___F_Map__F_to__F_underlay__F_multicast();
    
    public void visitDISABLED__F___8___F_No__F_L3__F_multicast__F_support();
    
    public void visitA__F___8___F_IPv4__S_Address();
    
    public void visitAAAA__F___8___F_IPv6__S_Address();
    
    public void visitMX__F___8___F_Mail__F_server__F___N_priority__F_and__F_DNS__F_name__O_();
    
    public void visitSRV__F___8___F_Service__F_record__F___N_priority__R___F_weight__R___F_port__R___F_and__F_DNS__F_name__O_();
    
    public void visitCNAME__F___8___F_Canonical__F_name__F___N_DNS__F_alias__O_();
    
    public void visitTXT__F___8___F_Arbitrary__F_text();
    
    public void visitMD5();
    
    public void visitAES_aE_CMAC__F___N_128bit__O_();
    
    public void visitROOT__5___F___H_Root__H___F_oder__F___H_Hub__H_();
    
    public void visitLEAF__5___F___H_Leaf__H___F_oder__F___H_Spoke__H_();
    
    public void visit_aA_STRING_aC_();
    
    public void visitSTP();
    
    public void visitRSTP();
    
    public void visitMSTP();
    
    public void visit__X___F___8___F_OspfVersion__F_v2();
    
    public void visit__Y___F___8___F_OspfVersion__F_v3();
    
    public void visit__Z___F___8___F_IPv4();
    
    public void visit__1___F___8___F_IPv6();
    
    public void visitMAC__S_Address__F___N_IEEE__F_802__F_MAC__S_Adresse__F___N_EUI__S_48__O___O_();
    
    public void visit__X___T_4__F_GHz();
    
    public void visit__0___F_GHz();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visit__S_90__F_to__F___Q_90();
    
    public R visit__S_180__F_to__F___Q_180();
    
    public R visit__S_360__F_to__F___Q_360();
    
    public R visit__V___F_b_s___F_15();
    
    public R visit__V___F_b_s___F_1000__F_();
    
    public R visit__V___F_b_s___F_10000();
    
    public R visit__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE();
    
    public R visit__V___F___8___F_FALSE();
    
    public R visit__W___F___8___F_TRUE();
    
    public R visit__W___F_b_s___F_2_aD_12();
    
    public R visit__W___F_b_s___F_2_aD_32();
    
    public R visit__W___F_b_s___F_2_aD_64();
    
    public R visit__W___F_b_s___F_9();
    
    public R visit__W___F_b_s___F_256();
    
    public R visit__W___F_b_s___F_n();
    
    public R visit__W_000__F_b_s___F_9999();
    
    public R visitGUID__F_1__F_b_s___F_2_aD_128();
    
    public R visitIP__F___N_CIDR__O_();
    
    public R visitIPv4__F_Address();
    
    public R visitIPv6__F_Address();
    
    public R visitJSON();
    
    public R visitMin__F___8___F_0__R___F_Max__F___8___F_8();
    
    public R visitParts__F_per__F_million__F___N_ppm__O_();
    
    public R visitSeconds();
    
    public R visitString();
    
    public R visit__3___F_to__F_16__F_chars();
    
    public R visit__H___H___F_or__F_SID();
    
    public R visit__W___F_b_s___F_MAX__N_2_aD_32__S_1__O_();
    
    public R visitUTC__Q_0();
    
    public R visitTRUE__5___F_condition__F_is__F_active__6___F_FALSE__5___F_condition__F_is__F_inactive();
    
    public R visitMESH__F___8___F_full__F_mesh();
    
    public R visitTREE__F___8___F___H_Root__S_and__S_Leaf__H___F_or__F___H_Hub__S_and__S_Spoke__H_();
    
    public R visitSCALABLE__F___8___F_Map__F_to__F_underlay__F_multicast();
    
    public R visitDISABLED__F___8___F_No__F_L3__F_multicast__F_support();
    
    public R visitA__F___8___F_IPv4__S_Address();
    
    public R visitAAAA__F___8___F_IPv6__S_Address();
    
    public R visitMX__F___8___F_Mail__F_server__F___N_priority__F_and__F_DNS__F_name__O_();
    
    public R visitSRV__F___8___F_Service__F_record__F___N_priority__R___F_weight__R___F_port__R___F_and__F_DNS__F_name__O_();
    
    public R visitCNAME__F___8___F_Canonical__F_name__F___N_DNS__F_alias__O_();
    
    public R visitTXT__F___8___F_Arbitrary__F_text();
    
    public R visitMD5();
    
    public R visitAES_aE_CMAC__F___N_128bit__O_();
    
    public R visitROOT__5___F___H_Root__H___F_oder__F___H_Hub__H_();
    
    public R visitLEAF__5___F___H_Leaf__H___F_oder__F___H_Spoke__H_();
    
    public R visit_aA_STRING_aC_();
    
    public R visitSTP();
    
    public R visitRSTP();
    
    public R visitMSTP();
    
    public R visit__X___F___8___F_OspfVersion__F_v2();
    
    public R visit__Y___F___8___F_OspfVersion__F_v3();
    
    public R visit__Z___F___8___F_IPv4();
    
    public R visit__1___F___8___F_IPv6();
    
    public R visitMAC__S_Address__F___N_IEEE__F_802__F_MAC__S_Adresse__F___N_EUI__S_48__O___O_();
    
    public R visit__X___T_4__F_GHz();
    
    public R visit__0___F_GHz();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean is__S_90__F_to__F___Q_90();
  
  public boolean is__S_180__F_to__F___Q_180();
  
  public boolean is__S_360__F_to__F___Q_360();
  
  public boolean is__V___F_b_s___F_15();
  
  public boolean is__V___F_b_s___F_1000__F_();
  
  public boolean is__V___F_b_s___F_10000();
  
  public boolean is__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE();
  
  public boolean is__V___F___8___F_FALSE();
  
  public boolean is__W___F___8___F_TRUE();
  
  public boolean is__W___F_b_s___F_2_aD_12();
  
  public boolean is__W___F_b_s___F_2_aD_32();
  
  public boolean is__W___F_b_s___F_2_aD_64();
  
  public boolean is__W___F_b_s___F_9();
  
  public boolean is__W___F_b_s___F_256();
  
  public boolean is__W___F_b_s___F_n();
  
  public boolean is__W_000__F_b_s___F_9999();
  
  public boolean isGUID__F_1__F_b_s___F_2_aD_128();
  
  public boolean isIP__F___N_CIDR__O_();
  
  public boolean isIPv4__F_Address();
  
  public boolean isIPv6__F_Address();
  
  public boolean isJSON();
  
  public boolean isMin__F___8___F_0__R___F_Max__F___8___F_8();
  
  public boolean isParts__F_per__F_million__F___N_ppm__O_();
  
  public boolean isSeconds();
  
  public boolean isString();
  
  public boolean is__3___F_to__F_16__F_chars();
  
  public boolean is__H___H___F_or__F_SID();
  
  public boolean is__W___F_b_s___F_MAX__N_2_aD_32__S_1__O_();
  
  public boolean isUTC__Q_0();
  
  public boolean isTRUE__5___F_condition__F_is__F_active__6___F_FALSE__5___F_condition__F_is__F_inactive();
  
  public boolean isMESH__F___8___F_full__F_mesh();
  
  public boolean isTREE__F___8___F___H_Root__S_and__S_Leaf__H___F_or__F___H_Hub__S_and__S_Spoke__H_();
  
  public boolean isSCALABLE__F___8___F_Map__F_to__F_underlay__F_multicast();
  
  public boolean isDISABLED__F___8___F_No__F_L3__F_multicast__F_support();
  
  public boolean isA__F___8___F_IPv4__S_Address();
  
  public boolean isAAAA__F___8___F_IPv6__S_Address();
  
  public boolean isMX__F___8___F_Mail__F_server__F___N_priority__F_and__F_DNS__F_name__O_();
  
  public boolean isSRV__F___8___F_Service__F_record__F___N_priority__R___F_weight__R___F_port__R___F_and__F_DNS__F_name__O_();
  
  public boolean isCNAME__F___8___F_Canonical__F_name__F___N_DNS__F_alias__O_();
  
  public boolean isTXT__F___8___F_Arbitrary__F_text();
  
  public boolean isMD5();
  
  public boolean isAES_aE_CMAC__F___N_128bit__O_();
  
  public boolean isROOT__5___F___H_Root__H___F_oder__F___H_Hub__H_();
  
  public boolean isLEAF__5___F___H_Leaf__H___F_oder__F___H_Spoke__H_();
  
  public boolean is_aA_STRING_aC_();
  
  public boolean isSTP();
  
  public boolean isRSTP();
  
  public boolean isMSTP();
  
  public boolean is__X___F___8___F_OspfVersion__F_v2();
  
  public boolean is__Y___F___8___F_OspfVersion__F_v3();
  
  public boolean is__Z___F___8___F_IPv4();
  
  public boolean is__1___F___8___F_IPv6();
  
  public boolean isMAC__S_Address__F___N_IEEE__F_802__F_MAC__S_Adresse__F___N_EUI__S_48__O___O_();
  
  public boolean is__X___T_4__F_GHz();
  
  public boolean is__0___F_GHz();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f46c2d4f-ba0f-11ee-876d-0f01c87670c8,K+gLoYPNI/pdi5UPeqHfwiIjvas=] */
