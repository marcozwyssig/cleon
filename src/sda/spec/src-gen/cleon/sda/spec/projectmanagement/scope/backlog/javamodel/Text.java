package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Text extends DynamicResource implements IText {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IText> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IText>() {
    
    @Override
    public IText create() {
      return new Text();
    }
    
    @Override
    public IText create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Text(resourceRepository, resource);
    }
  
  };

  public Text() {
    super(IText.TYPE_ID);
  }
  
  public Text(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IText.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDate() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Text_date);
  }
    
  public void setDate(java.lang.String date) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Text_date, date);
  }

  @Override
  public java.lang.String selectText() {
    return _getSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Text_text);
  }
    
  public void setText(java.lang.String text) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Text_text, text);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Text setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson selectWriter() {
    return _getSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Text_writer);
  }

  public Text setWriter(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson writer) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Text_writer, writer);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Text_date, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Text_text, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Text_writer, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText> selectToMeWriter(cleon.sda.spec.projectmanagement.ressources.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Text_writer, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d6f6f942-36ad-11e5-95d9-2b04d7ab02d9,21WFQSeYuajNuxgUSZfOMB4y4gg=] */
