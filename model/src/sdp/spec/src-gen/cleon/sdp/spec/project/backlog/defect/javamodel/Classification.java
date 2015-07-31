package cleon.sdp.spec.project.backlog.defect.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Classification extends DynamicResource implements IClassification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IClassification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IClassification>() {
    
    @Override
    public IClassification create() {
      return new Classification();
    }
    
    @Override
    public IClassification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Classification(resourceRepository, resource);
    }
  
  };

  public Classification() {
    super(IClassification.TYPE_ID);
  }
  
  public Classification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IClassification.TYPE_ID);
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

  public Classification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    if (is__W___F___N_leichter__F_Fehler__O_()) return visitor.visit__W___F___N_leichter__F_Fehler__O_();
    if (is__X___F___N_wesentlicher__F_Fehler__O_()) return visitor.visit__X___F___N_wesentlicher__F_Fehler__O_();
    if (is__Y___F___N_kritischer__F_Fehler__O_()) return visitor.visit__Y___F___N_kritischer__F_Fehler__O_();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (is__W___F___N_leichter__F_Fehler__O_()) {
      visitor.visit__W___F___N_leichter__F_Fehler__O_();
      return;
    }
    if (is__X___F___N_wesentlicher__F_Fehler__O_()) {
      visitor.visit__X___F___N_wesentlicher__F_Fehler__O_();
      return;
    }
    if (is__Y___F___N_kritischer__F_Fehler__O_()) {
      visitor.visit__Y___F___N_kritischer__F_Fehler__O_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean is__W___F___N_leichter__F_Fehler__O_() {
    return getResource().equals(cleon.sdp.spec.project.backlog.defect.DefectPackage.Classification___W___F___N_leichter__F_Fehler__O_);
  }
  
  @Override
  public boolean is__X___F___N_wesentlicher__F_Fehler__O_() {
    return getResource().equals(cleon.sdp.spec.project.backlog.defect.DefectPackage.Classification___X___F___N_wesentlicher__F_Fehler__O_);
  }
  
  @Override
  public boolean is__Y___F___N_kritischer__F_Fehler__O_() {
    return getResource().equals(cleon.sdp.spec.project.backlog.defect.DefectPackage.Classification___Y___F___N_kritischer__F_Fehler__O_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9a8462a1-3765-11e5-95d9-2b04d7ab02d9,tf9RIa230Bv0QCaN3DYaiqEIVFI=] */
