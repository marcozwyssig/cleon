package cleon.conception.uml.spec.uml.structural.packages.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PackageDecomposition extends DynamicResource implements IPackageDecomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageDecomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPackageDecomposition>() {
    
    @Override
    public IPackageDecomposition create() {
      return new PackageDecomposition();
    }
    
    @Override
    public IPackageDecomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PackageDecomposition(resourceRepository, resource);
    }
  
  };

  public PackageDecomposition() {
    super(IPackageDecomposition.TYPE_ID);
  }
  
  public PackageDecomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPackageDecomposition.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public PackageDecomposition setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage selectInto() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage.class, cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.PackageDecomposition_into);
  }

  public PackageDecomposition setInto(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage into) {
    _setSingle(cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.PackageDecomposition_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PackageDecomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage.class, cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.PackageDecomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition selectToMeInto(cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackage object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.uml.spec.uml.structural.packages.javamodel.IPackageDecomposition.class, cleon.conception.uml.spec.uml.structural.packages.PackagesPackage.PackageDecomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,392c77b6-1756-11e5-9ca7-d1bb57b73459,EU8/A9WVdNyInhID26eRAUp2nBE=] */
