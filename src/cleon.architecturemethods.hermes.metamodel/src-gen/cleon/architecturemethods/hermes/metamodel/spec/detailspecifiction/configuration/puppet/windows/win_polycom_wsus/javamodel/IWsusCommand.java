package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWsusCommand extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("65ed808f-8a6c-11f0-af5e-cd5d044ab02b");
  
  public static interface IValueVoidVisitor {
    
    public void visitUninstall();
    
    public void visitNotApproved();
    
    public void visitDenied();
    
    public void visitInstall();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitUninstall();
    
    public R visitNotApproved();
    
    public R visitDenied();
    
    public R visitInstall();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isUninstall();
  
  public boolean isNotApproved();
  
  public boolean isDenied();
  
  public boolean isInstall();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,65ed808f-8a6c-11f0-af5e-cd5d044ab02b,p+GzowwN+AfwGAGBDDCZNGZ/rUk=] */
