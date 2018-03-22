package cleon.conception.eamod.spec.chrv.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SourceWorkshop extends DynamicResource implements ISourceWorkshop {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceWorkshop> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceWorkshop>() {
    
    @Override
    public ISourceWorkshop create() {
      return new SourceWorkshop();
    }
    
    @Override
    public ISourceWorkshop create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SourceWorkshop(resourceRepository, resource);
    }
  
  };

  public SourceWorkshop() {
    super(ISourceWorkshop.TYPE_ID);
  }
  
  public SourceWorkshop(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISourceWorkshop.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors);
  }

  public SourceWorkshop setAuthors(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> selectComposites() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceWorkshop_composites);
  }

  public SourceWorkshop setComposites(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> composites) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceWorkshop_composites, composites);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SourceWorkshop setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceWorkshop_composites, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceWorkshop selectToMeComposites(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISourceWorkshop.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceWorkshop_composites, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2054bb55-bb80-11e5-b2f7-f515c847fa35,TB6EYrX0QxmCNgyBeXIdqH4G6uI=] */
