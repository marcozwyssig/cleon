package cleon.initialization.projectmanagement.spec.resource.teams.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Teams extends DynamicResource implements ITeams {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITeams> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITeams>() {
    
    @Override
    public ITeams create() {
      return new Teams();
    }
    
    @Override
    public ITeams create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Teams(resourceRepository, resource);
    }
  
  };

  public Teams() {
    super(ITeams.TYPE_ID);
  }
  
  public Teams(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITeams.TYPE_ID);
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

  public Teams setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.teams.javamodel.ITeam> selectTeams() {
    return _getList(cleon.initialization.projectmanagement.spec.resource.teams.javamodel.ITeam.class, cleon.initialization.projectmanagement.spec.resource.teams.TeamsPackage.Teams_teams);
  }

  public Teams setTeams(java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.teams.javamodel.ITeam> teams) {
    _setList(cleon.initialization.projectmanagement.spec.resource.teams.TeamsPackage.Teams_teams, teams);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Teams setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.initialization.projectmanagement.spec.resource.teams.javamodel.ITeam.class, cleon.initialization.projectmanagement.spec.resource.teams.TeamsPackage.Teams_teams, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.resource.teams.javamodel.ITeams selectToMeTeams(cleon.initialization.projectmanagement.spec.resource.teams.javamodel.ITeam object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.resource.teams.javamodel.ITeams.class, cleon.initialization.projectmanagement.spec.resource.teams.TeamsPackage.Teams_teams, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6744688b-2eea-11e6-8bd9-a77b8d2a3a0e,z90z/EKXLSqY5FfIr6OS7xk2yA4=] */
