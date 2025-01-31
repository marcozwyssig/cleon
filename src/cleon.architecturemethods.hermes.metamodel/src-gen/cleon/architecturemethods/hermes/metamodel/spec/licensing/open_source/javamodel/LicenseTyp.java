package cleon.architecturemethods.hermes.metamodel.spec.licensing.open_source.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class LicenseTyp extends DynamicResource implements ILicenseTyp {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILicenseTyp> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILicenseTyp>() {
    
    @Override
    public ILicenseTyp create() {
      return new LicenseTyp();
    }
    
    @Override
    public ILicenseTyp create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new LicenseTyp(resourceRepository, resource);
    }
  
  };

  public LicenseTyp() {
    super(ILicenseTyp.TYPE_ID);
  }
  
  public LicenseTyp(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILicenseTyp.TYPE_ID);
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

  public LicenseTyp setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (isArtistic__F_License__F_2__T_0()) return visitor.visitArtistic__F_License__F_2__T_0();
    if (isGNU__F_General__F_Public__F_License__F___N_GPL__O___F_Version__F_2()) return visitor.visitGNU__F_General__F_Public__F_License__F___N_GPL__O___F_Version__F_2();
    if (isGNU__F_Lesser__F_General__F_Public__F_License__F___N_LGPL__O_()) return visitor.visitGNU__F_Lesser__F_General__F_Public__F_License__F___N_LGPL__O_();
    if (isMozilla__F_Public__F_License__F___N_MPL__O___F_2__T_0()) return visitor.visitMozilla__F_Public__F_License__F___N_MPL__O___F_2__T_0();
    if (isMIT__S_License()) return visitor.visitMIT__S_License();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isArtistic__F_License__F_2__T_0()) {
      visitor.visitArtistic__F_License__F_2__T_0();
      return;
    }
    if (isGNU__F_General__F_Public__F_License__F___N_GPL__O___F_Version__F_2()) {
      visitor.visitGNU__F_General__F_Public__F_License__F___N_GPL__O___F_Version__F_2();
      return;
    }
    if (isGNU__F_Lesser__F_General__F_Public__F_License__F___N_LGPL__O_()) {
      visitor.visitGNU__F_Lesser__F_General__F_Public__F_License__F___N_LGPL__O_();
      return;
    }
    if (isMozilla__F_Public__F_License__F___N_MPL__O___F_2__T_0()) {
      visitor.visitMozilla__F_Public__F_License__F___N_MPL__O___F_2__T_0();
      return;
    }
    if (isMIT__S_License()) {
      visitor.visitMIT__S_License();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isArtistic__F_License__F_2__T_0() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.open_source.Open_sourcePackage.LicenseTyp_Artistic__F_License__F_2__T_0);
  }
  
  @Override
  public boolean isGNU__F_General__F_Public__F_License__F___N_GPL__O___F_Version__F_2() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.open_source.Open_sourcePackage.LicenseTyp_GNU__F_General__F_Public__F_License__F___N_GPL__O___F_Version__F_2);
  }
  
  @Override
  public boolean isGNU__F_Lesser__F_General__F_Public__F_License__F___N_LGPL__O_() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.open_source.Open_sourcePackage.LicenseTyp_GNU__F_Lesser__F_General__F_Public__F_License__F___N_LGPL__O_);
  }
  
  @Override
  public boolean isMozilla__F_Public__F_License__F___N_MPL__O___F_2__T_0() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.open_source.Open_sourcePackage.LicenseTyp_Mozilla__F_Public__F_License__F___N_MPL__O___F_2__T_0);
  }
  
  @Override
  public boolean isMIT__S_License() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.licensing.open_source.Open_sourcePackage.LicenseTyp_MIT__S_License);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4d4ecf44-dfc0-11ef-b0be-9b4cac321140,ccCALUCnPXq6QPyppipW98jShPc=] */
