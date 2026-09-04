package cleon.architecturemethods.hermes.metamodel.spec.licensing.open_source.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILicenseTyp extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4d4ecf44-dfc0-11ef-b0be-9b4cac321140");
  
  public static interface IValueVoidVisitor {
    
    public void visitApache__F_License__R___F_Version__F_2__T_0();
    
    public void visitArtistic__F_License__F_2__T_0();
    
    public void visitBSD__S_Lizenz();
    
    public void visitGNU__F_General__F_Public__F_License__F___N_GPL__O___F_Version__F_2();
    
    public void visitGNU__F_Lesser__F_General__F_Public__F_License__F___N_LGPL__O_();
    
    public void visitMozilla__F_Public__F_License__F___N_MPL__O___F_2__T_0();
    
    public void visitMIT__S_License();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitApache__F_License__R___F_Version__F_2__T_0();
    
    public R visitArtistic__F_License__F_2__T_0();
    
    public R visitBSD__S_Lizenz();
    
    public R visitGNU__F_General__F_Public__F_License__F___N_GPL__O___F_Version__F_2();
    
    public R visitGNU__F_Lesser__F_General__F_Public__F_License__F___N_LGPL__O_();
    
    public R visitMozilla__F_Public__F_License__F___N_MPL__O___F_2__T_0();
    
    public R visitMIT__S_License();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isApache__F_License__R___F_Version__F_2__T_0();
  
  public boolean isArtistic__F_License__F_2__T_0();
  
  public boolean isBSD__S_Lizenz();
  
  public boolean isGNU__F_General__F_Public__F_License__F___N_GPL__O___F_Version__F_2();
  
  public boolean isGNU__F_Lesser__F_General__F_Public__F_License__F___N_LGPL__O_();
  
  public boolean isMozilla__F_Public__F_License__F___N_MPL__O___F_2__T_0();
  
  public boolean isMIT__S_License();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4d4ecf44-dfc0-11ef-b0be-9b4cac321140,ORfOuxe0W62PYmsOsZDtBbXYDxg=] */
