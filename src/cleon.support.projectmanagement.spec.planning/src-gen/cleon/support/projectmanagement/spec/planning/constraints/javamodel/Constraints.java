package cleon.support.projectmanagement.spec.planning.constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Constraints extends DynamicResource implements IConstraints {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConstraints> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IConstraints>() {
    
    @Override
    public IConstraints create() {
      return new Constraints();
    }
    
    @Override
    public IConstraints create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Constraints(resourceRepository, resource);
    }
  
  };

  public Constraints() {
    super(IConstraints.TYPE_ID);
  }
  
  public Constraints(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IConstraints.TYPE_ID);
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
  public cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDependencies selectDependencies() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDependencies.class, cleon.support.projectmanagement.spec.planning.constraints.ConstraintsPackage.Constraints_dependencies);
  }

  public Constraints setDependencies(cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDependencies dependencies) {
    _setSingle(cleon.support.projectmanagement.spec.planning.constraints.ConstraintsPackage.Constraints_dependencies, dependencies);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDistinctions selectDistinctions() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDistinctions.class, cleon.support.projectmanagement.spec.planning.constraints.ConstraintsPackage.Constraints_distinctions);
  }

  public Constraints setDistinctions(cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDistinctions distinctions) {
    _setSingle(cleon.support.projectmanagement.spec.planning.constraints.ConstraintsPackage.Constraints_distinctions, distinctions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Constraints setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Constraints setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDependencies.class, cleon.support.projectmanagement.spec.planning.constraints.ConstraintsPackage.Constraints_dependencies, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDistinctions.class, cleon.support.projectmanagement.spec.planning.constraints.ConstraintsPackage.Constraints_distinctions, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.planning.constraints.javamodel.IConstraints selectToMeDependencies(cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDependencies object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.constraints.javamodel.IConstraints.class, cleon.support.projectmanagement.spec.planning.constraints.ConstraintsPackage.Constraints_dependencies, object.getResource());
  }
  
  public static cleon.support.projectmanagement.spec.planning.constraints.javamodel.IConstraints selectToMeDistinctions(cleon.support.projectmanagement.spec.planning.constraints.javamodel.IDistinctions object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.constraints.javamodel.IConstraints.class, cleon.support.projectmanagement.spec.planning.constraints.ConstraintsPackage.Constraints_distinctions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f8f6cf2c-d42d-11e6-8a1d-7fdd5d29730e,x0ooTpU1E76e16BxcuaOFDtW96U=] */
