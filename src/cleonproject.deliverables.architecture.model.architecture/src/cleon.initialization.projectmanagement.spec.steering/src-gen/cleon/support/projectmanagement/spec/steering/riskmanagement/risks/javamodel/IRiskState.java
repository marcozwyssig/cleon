package cleon.support.projectmanagement.spec.steering.riskmanagement.risks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRiskState extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f854e5b5-324e-11e6-ab4d-73a9260c8088");
  
  public static interface IValueVoidVisitor {
    
    public void visitIn__F_Plan();
    
    public void visitIn__F_Watchlist();
    
    public void visitIn__F_Steering();
    
    public void visitMaterialised();
    
    public void visitClosed();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitIn__F_Plan();
    
    public R visitIn__F_Watchlist();
    
    public R visitIn__F_Steering();
    
    public R visitMaterialised();
    
    public R visitClosed();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isIn__F_Plan();
  
  public boolean isIn__F_Watchlist();
  
  public boolean isIn__F_Steering();
  
  public boolean isMaterialised();
  
  public boolean isClosed();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f854e5b5-324e-11e6-ab4d-73a9260c8088,uBnPNjbHe/JOzZHLCLAb7QZKEYE=] */
