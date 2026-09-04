package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWindowsCISEnforcementLevel extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6e548dad-5e43-11f0-a5db-972145eef50c");
  
  public static interface IValueVoidVisitor {
    
    public void visit__W_();
    
    public void visit__X_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visit__W_();
    
    public R visit__X_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean is__W_();
  
  public boolean is__X_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6e548dad-5e43-11f0-a5db-972145eef50c,g+hOWtXPrYUrZCupgNhehjMVVnQ=] */
