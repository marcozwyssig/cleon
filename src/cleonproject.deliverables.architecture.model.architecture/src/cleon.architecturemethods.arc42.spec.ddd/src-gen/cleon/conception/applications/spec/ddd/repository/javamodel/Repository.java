package cleon.conception.applications.spec.ddd.repository.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Repository extends DynamicResource implements IRepository {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepository> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepository>() {
    
    @Override
    public IRepository create() {
      return new Repository();
    }
    
    @Override
    public IRepository create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Repository(resourceRepository, resource);
    }
  
  };

  public Repository() {
    super(IRepository.TYPE_ID);
  }
  
  public Repository(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRepository.TYPE_ID);
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
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IInterfaceData> selectData() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IInterfaceData.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.InterfacesPackage.InterfaceService_data);
  }

  public Repository setData(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IInterfaceData> data) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.InterfacesPackage.InterfaceService_data, data);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> selectGetBy() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_getBy);
  }

  public Repository setGetBy(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> getBy) {
    _setList(cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_getBy, getBy);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public Repository setMethods(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public cleon.conception.applications.spec.ddd.entities.javamodel.IEntity selectSearch() {
    return _getSingle(cleon.conception.applications.spec.ddd.entities.javamodel.IEntity.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_search);
  }

  public Repository setSearch(cleon.conception.applications.spec.ddd.entities.javamodel.IEntity search) {
    _setSingle(cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_search, search);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> selectSearchBy() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_searchBy);
  }

  public Repository setSearchBy(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> searchBy) {
    _setList(cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_searchBy, searchBy);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Repository setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.javamodel.IInterfaceData.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.interfaces.InterfacesPackage.InterfaceService_data, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_getBy, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptSingle(cleon.conception.applications.spec.ddd.entities.javamodel.IEntity.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_search, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_searchBy, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.applications.spec.ddd.repository.javamodel.IRepository> selectToMeSearch(cleon.conception.applications.spec.ddd.entities.javamodel.IEntity object) {
    return _getToMeList(object.getRepository(), cleon.conception.applications.spec.ddd.repository.javamodel.IRepository.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_search, object.getResource());
  }
  
  public static cleon.conception.applications.spec.ddd.repository.javamodel.IRepository selectToMeSearchBy(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.applications.spec.ddd.repository.javamodel.IRepository.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_searchBy, object.getResource());
  }
  
  public static cleon.conception.applications.spec.ddd.repository.javamodel.IRepository selectToMeGetBy(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.applications.spec.ddd.repository.javamodel.IRepository.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.Repository_getBy, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5e627f84-10c2-11e3-b60e-ab478a3e1eca,WsQBsFy1hF8ncRSVSMcpx/oji8o=] */
