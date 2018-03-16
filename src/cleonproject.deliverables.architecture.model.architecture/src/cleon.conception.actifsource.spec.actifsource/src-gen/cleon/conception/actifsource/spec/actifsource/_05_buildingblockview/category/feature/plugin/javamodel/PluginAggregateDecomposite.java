package cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PluginAggregateDecomposite extends DynamicResource implements IPluginAggregateDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPluginAggregateDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPluginAggregateDecomposite>() {
    
    @Override
    public IPluginAggregateDecomposite create() {
      return new PluginAggregateDecomposite();
    }
    
    @Override
    public IPluginAggregateDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PluginAggregateDecomposite(resourceRepository, resource);
    }
  
  };

  public PluginAggregateDecomposite() {
    super(IPluginAggregateDecomposite.TYPE_ID);
  }
  
  public PluginAggregateDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPluginAggregateDecomposite.TYPE_ID);
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

  public PluginAggregateDecomposite setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin selectInto() {
    return _getSingle(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.PluginAggregateDecomposite_into);
  }

  public PluginAggregateDecomposite setInto(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin into) {
    _setSingle(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.PluginAggregateDecomposite_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PluginAggregateDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.PluginAggregateDecomposite_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginAggregateDecomposite selectToMeInto(cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPluginAggregateDecomposite.class, cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.PluginPackage.PluginAggregateDecomposite_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,17a9b7ab-a7d1-11e5-82dd-3b995d9c840c,Tw44ycPQJzA8CGXbUfQsXOCGWyU=] */
