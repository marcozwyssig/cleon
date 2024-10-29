package cleon.common.resources.metamodel.spec.confidentiality.javamodel;

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
    if (isUNKLASSIFIZIERT()) return visitor.visitUNKLASSIFIZIERT();
    if (isINTERN()) return visitor.visitINTERN();
    if (isVERTRAULICH()) return visitor.visitVERTRAULICH();
    if (isGEHEIM()) return visitor.visitGEHEIM();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isUNKLASSIFIZIERT()) {
      visitor.visitUNKLASSIFIZIERT();
      return;
    }
    if (isINTERN()) {
      visitor.visitINTERN();
      return;
    }
    if (isVERTRAULICH()) {
      visitor.visitVERTRAULICH();
      return;
    }
    if (isGEHEIM()) {
      visitor.visitGEHEIM();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isUNKLASSIFIZIERT() {
    return getResource().equals(cleon.common.resources.metamodel.spec.confidentiality.ConfidentialityPackage.Classification_UNKLASSIFIZIERT);
  }
  
  @Override
  public boolean isINTERN() {
    return getResource().equals(cleon.common.resources.metamodel.spec.confidentiality.ConfidentialityPackage.Classification_INTERN);
  }
  
  @Override
  public boolean isVERTRAULICH() {
    return getResource().equals(cleon.common.resources.metamodel.spec.confidentiality.ConfidentialityPackage.Classification_VERTRAULICH);
  }
  
  @Override
  public boolean isGEHEIM() {
    return getResource().equals(cleon.common.resources.metamodel.spec.confidentiality.ConfidentialityPackage.Classification_GEHEIM);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d92db665-47f5-11e6-b388-8539f6ff7310,/qBpj+BLJ4vRAwA6whTtouc2zB4=] */
