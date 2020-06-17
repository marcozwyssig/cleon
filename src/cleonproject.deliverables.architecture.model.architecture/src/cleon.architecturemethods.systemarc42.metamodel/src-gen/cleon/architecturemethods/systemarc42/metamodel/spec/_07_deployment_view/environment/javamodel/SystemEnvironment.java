package cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemEnvironment extends DynamicResource implements ISystemEnvironment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemEnvironment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemEnvironment>() {
    
    @Override
    public ISystemEnvironment create() {
      return new SystemEnvironment();
    }
    
    @Override
    public ISystemEnvironment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemEnvironment(resourceRepository, resource);
    }
  
  };

  public SystemEnvironment() {
    super(ISystemEnvironment.TYPE_ID);
  }
  
  public SystemEnvironment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemEnvironment.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectHostGroupPrefix() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_hostGroupPrefix);
  }
    
  public void setHostGroupPrefix(java.lang.String hostGroupPrefix) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_hostGroupPrefix, hostGroupPrefix);
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
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.RootNode_buildNodes);
  }

  public SystemEnvironment setBuildNodes(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode> buildNodes) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.RootNode_buildNodes, buildNodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SystemEnvironment setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SystemEnvironment setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment> selectIncludeEnvironment() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_includeEnvironment);
  }

  public SystemEnvironment setIncludeEnvironment(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment> includeEnvironment) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_includeEnvironment, includeEnvironment);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_1() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_1);
  }

  public SystemEnvironment setLevel_1(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> level_1) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_1, level_1);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_2() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_2);
  }

  public SystemEnvironment setLevel_2(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> level_2) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_2, level_2);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_3() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_3);
  }

  public SystemEnvironment setLevel_3(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> level_3) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_3, level_3);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_4() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_4);
  }

  public SystemEnvironment setLevel_4(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> level_4) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_4, level_4);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_5() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_5);
  }

  public SystemEnvironment setLevel_5(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> level_5) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_5, level_5);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_6() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_6);
  }

  public SystemEnvironment setLevel_6(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> level_6) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_6, level_6);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_7() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_7);
  }

  public SystemEnvironment setLevel_7(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> level_7) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_7, level_7);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> selectLevel_8() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_8);
  }

  public SystemEnvironment setLevel_8(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel> level_8) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_8, level_8);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> selectNodes() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.Node_nodes);
  }

  public SystemEnvironment setNodes(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.javamodel.INode> nodes) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.Node_nodes, nodes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SystemEnvironment setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode> selectSuppliedNodes() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes);
  }

  public SystemEnvironment setSuppliedNodes(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode> suppliedNodes) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, suppliedNodes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemEnvironment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_hostGroupPrefix, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.buildnode.javamodel.IBuildNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.RootNode_buildNodes, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_includeEnvironment, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_1, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_2, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_3, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_4, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_5, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_6, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_7, visitor);
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_8, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectToMeLevel_1(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_1, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectToMeLevel_2(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_2, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectToMeLevel_3(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_3, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectToMeLevel_4(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_4, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectToMeLevel_5(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_5, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectToMeLevel_6(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_6, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectToMeLevel_7(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_7, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment selectToMeLevel_8(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.IDeploymentLevel object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_level_aE_8, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment> selectToMeIncludeEnvironment(cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.EnvironmentPackage.SystemEnvironment_includeEnvironment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7372f8ef-ef40-11e8-be8a-b748ff8f0a75,PwAUUOJuvn5QHHMRmiwi+ObkLw8=] */
