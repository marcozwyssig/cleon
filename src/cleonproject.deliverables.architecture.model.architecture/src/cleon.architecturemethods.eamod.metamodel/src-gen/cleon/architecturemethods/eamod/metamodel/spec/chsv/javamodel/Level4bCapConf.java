package cleon.architecturemethods.eamod.metamodel.spec.chsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Level4bCapConf extends DynamicResource implements ILevel4bCapConf {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILevel4bCapConf> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILevel4bCapConf>() {
    
    @Override
    public ILevel4bCapConf create() {
      return new Level4bCapConf();
    }
    
    @Override
    public ILevel4bCapConf create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Level4bCapConf(resourceRepository, resource);
    }
  
  };

  public Level4bCapConf() {
    super(ILevel4bCapConf.TYPE_ID);
  }
  
  public Level4bCapConf(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILevel4bCapConf.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectCheopsNr() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chsv.ChsvPackage.LevelCapConf_CheopsNr);
  }
    
  public void setCheopsNr(java.lang.String cheopsNr) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.chsv.ChsvPackage.LevelCapConf_CheopsNr, cheopsNr);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
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
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectDecommission() {
    return _getSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.architecturemethods.eamod.metamodel.spec.chsv.ChsvPackage.LevelCapConf_Decommission);
  }

  public Level4bCapConf setDecommission(cleon.common.calendar.metamodel.spec.javamodel.IDay decommission) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chsv.ChsvPackage.LevelCapConf_Decommission, decommission);
    return this;
  }
    
  @Override
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectEndOfLife() {
    return _getSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.architecturemethods.eamod.metamodel.spec.chsv.ChsvPackage.LevelCapConf_EndOfLife);
  }

  public Level4bCapConf setEndOfLife(cleon.common.calendar.metamodel.spec.javamodel.IDay endOfLife) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chsv.ChsvPackage.LevelCapConf_EndOfLife, endOfLife);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors);
  }

  public Level4bCapConf setAuthors(java.util.List<? extends cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Level4bCapConf setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chsv.ChsvPackage.LevelCapConf_CheopsNr, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.architecturemethods.eamod.metamodel.spec.chsv.ChsvPackage.LevelCapConf_Decommission, visitor);
    _acceptSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.architecturemethods.eamod.metamodel.spec.chsv.ChsvPackage.LevelCapConf_EndOfLife, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bcb2d08b-a7f9-11e7-9807-4f1f5d43f7c9,dtOuatXyMRYBRlxogt4945T2fDA=] */
