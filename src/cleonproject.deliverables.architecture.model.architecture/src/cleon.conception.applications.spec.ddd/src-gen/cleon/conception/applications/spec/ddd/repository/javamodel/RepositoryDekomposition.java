package cleon.conception.applications.spec.ddd.repository.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RepositoryDekomposition extends DynamicResource implements IRepositoryDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepositoryDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepositoryDekomposition>() {
    
    @Override
    public IRepositoryDekomposition create() {
      return new RepositoryDekomposition();
    }
    
    @Override
    public IRepositoryDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RepositoryDekomposition(resourceRepository, resource);
    }
  
  };

  public RepositoryDekomposition() {
    super(IRepositoryDekomposition.TYPE_ID);
  }
  
  public RepositoryDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRepositoryDekomposition.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.applications.spec.ddd.repository.javamodel.IRepository selectInto() {
    return _getSingle(cleon.conception.applications.spec.ddd.repository.javamodel.IRepository.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.RepositoryDekomposition_into);
  }

  public RepositoryDekomposition setInto(cleon.conception.applications.spec.ddd.repository.javamodel.IRepository into) {
    _setSingle(cleon.conception.applications.spec.ddd.repository.RepositoryPackage.RepositoryDekomposition_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RepositoryDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.applications.spec.ddd.repository.javamodel.IRepository.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.RepositoryDekomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.applications.spec.ddd.repository.javamodel.IRepositoryDekomposition selectToMeInto(cleon.conception.applications.spec.ddd.repository.javamodel.IRepository object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.applications.spec.ddd.repository.javamodel.IRepositoryDekomposition.class, cleon.conception.applications.spec.ddd.repository.RepositoryPackage.RepositoryDekomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,43b7a073-28b4-11e5-8b63-33a353e42346,Yk+h3NUSmuQXBUCjgRZsuJYTbDk=] */
