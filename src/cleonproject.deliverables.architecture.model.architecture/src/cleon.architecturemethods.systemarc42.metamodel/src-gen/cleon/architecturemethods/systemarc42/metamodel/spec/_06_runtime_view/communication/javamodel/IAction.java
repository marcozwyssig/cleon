package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAction extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e7b78922-dfaa-11e9-9827-a1514ee8d06a");
  
  public static interface IValueVoidVisitor {
    
    public void visitAccept();
    
    public void visitDrop();
    
    public void visitReject();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitAccept();
    
    public R visitDrop();
    
    public R visitReject();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isAccept();
  
  public boolean isDrop();
  
  public boolean isReject();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e7b78922-dfaa-11e9-9827-a1514ee8d06a,zih3KEuTucw0IKU2Plaxmm+xCOI=] */
