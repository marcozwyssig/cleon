package cleon.architecturemethods.itarc42.spec.itarc42.concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceClass extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.spec.resources.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("af43badb-1d88-11e9-b601-db75aa6f89a4");
  
  public static interface IValueVoidVisitor {
    
    public void visitAF11__F___S___F_High__F_Throughput__F_Data();
    
    public void visitAF21__F___S___F_Low__F_Latency__F_Data();
    
    public void visitAF31__F___S___F_Multimedia__F_Streaming();
    
    public void visitAF41__F___S___F_Multimedia__F_Conferencing();
    
    public void visitCS1__F___S___F_Low__S_Priority__F_Data();
    
    public void visitCS2__F___S___F_OAM__F___N_Operation__R___F_Administration__R___F_Maintenance__O_();
    
    public void visitCS3__F___S___F_Broadcast__F_Video();
    
    public void visitCS4__F___S___F_Real__F_time__F_Interactive();
    
    public void visitCS5__F___S___F_Signalling();
    
    public void visitCS6__F___S___F_Network__F_Control__F___N_Access__O_();
    
    public void visitCS7__F___S___F_Network__F_Control__F___N_Backbone__O___F_();
    
    public void visitDF__F___S___F_Standard();
    
    public void visitEF__F___S___F_Telephony();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitAF11__F___S___F_High__F_Throughput__F_Data();
    
    public R visitAF21__F___S___F_Low__F_Latency__F_Data();
    
    public R visitAF31__F___S___F_Multimedia__F_Streaming();
    
    public R visitAF41__F___S___F_Multimedia__F_Conferencing();
    
    public R visitCS1__F___S___F_Low__S_Priority__F_Data();
    
    public R visitCS2__F___S___F_OAM__F___N_Operation__R___F_Administration__R___F_Maintenance__O_();
    
    public R visitCS3__F___S___F_Broadcast__F_Video();
    
    public R visitCS4__F___S___F_Real__F_time__F_Interactive();
    
    public R visitCS5__F___S___F_Signalling();
    
    public R visitCS6__F___S___F_Network__F_Control__F___N_Access__O_();
    
    public R visitCS7__F___S___F_Network__F_Control__F___N_Backbone__O___F_();
    
    public R visitDF__F___S___F_Standard();
    
    public R visitEF__F___S___F_Telephony();
    
  }
  
  // attributes
  
  public java.lang.Integer selectDSCP();
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isAF11__F___S___F_High__F_Throughput__F_Data();
  
  public boolean isAF21__F___S___F_Low__F_Latency__F_Data();
  
  public boolean isAF31__F___S___F_Multimedia__F_Streaming();
  
  public boolean isAF41__F___S___F_Multimedia__F_Conferencing();
  
  public boolean isCS1__F___S___F_Low__S_Priority__F_Data();
  
  public boolean isCS2__F___S___F_OAM__F___N_Operation__R___F_Administration__R___F_Maintenance__O_();
  
  public boolean isCS3__F___S___F_Broadcast__F_Video();
  
  public boolean isCS4__F___S___F_Real__F_time__F_Interactive();
  
  public boolean isCS5__F___S___F_Signalling();
  
  public boolean isCS6__F___S___F_Network__F_Control__F___N_Access__O_();
  
  public boolean isCS7__F___S___F_Network__F_Control__F___N_Backbone__O___F_();
  
  public boolean isDF__F___S___F_Standard();
  
  public boolean isEF__F___S___F_Telephony();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,af43badb-1d88-11e9-b601-db75aa6f89a4,/kvoUr9i1vo1sYBD+jRIX70h0mc=] */
