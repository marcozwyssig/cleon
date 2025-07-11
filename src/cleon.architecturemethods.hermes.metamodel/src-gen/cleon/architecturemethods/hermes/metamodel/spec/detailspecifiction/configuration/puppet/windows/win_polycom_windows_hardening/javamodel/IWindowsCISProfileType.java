package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_windows_hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWindowsCISProfileType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("49daa1b0-5e43-11f0-a5db-972145eef50c");
  
  public static interface IValueVoidVisitor {
    
    public void visitDomain();
    
    public void visitStandalone();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitDomain();
    
    public R visitStandalone();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isDomain();
  
  public boolean isStandalone();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,49daa1b0-5e43-11f0-a5db-972145eef50c,HMRQRcNOGhhtBaZdPnXtLT3Smzg=] */
