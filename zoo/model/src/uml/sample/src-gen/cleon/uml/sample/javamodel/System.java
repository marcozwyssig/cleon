package cleon.uml.sample.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class System extends DynamicResource implements ISystem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem>() {
    
    @Override
    public ISystem create() {
      return new System();
    }
    
    @Override
    public ISystem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new System(resourceRepository, resource);
    }
  
  };

  public System() {
    super(ISystem.TYPE_ID);
  }
  
  public System(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystem.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.arc42.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals select__V_1_aE_introduction_aE_and_aE_goals() {
    return _getSingle(cleon.arc42.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.arc42.spec.SpecPackage.arc42___V_1_aE_introduction_aE_and_aE_goals);
  }

  public System set__V_1_aE_introduction_aE_and_aE_goals(cleon.arc42.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals __V_1_aE_introduction_aE_and_aE_goals) {
    _setSingle(cleon.arc42.spec.SpecPackage.arc42___V_1_aE_introduction_aE_and_aE_goals, __V_1_aE_introduction_aE_and_aE_goals);
    return this;
  }
    
  @Override
  public cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlockView select__V_5_aE_buildingBlockView() {
    return _getSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlockView.class, cleon.arc42.spec.SpecPackage.arc42___V_5_aE_buildingBlockView);
  }

  public System set__V_5_aE_buildingBlockView(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlockView __V_5_aE_buildingBlockView) {
    _setSingle(cleon.arc42.spec.SpecPackage.arc42___V_5_aE_buildingBlockView, __V_5_aE_buildingBlockView);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Document_chapters);
  }

  public System setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Document_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public System setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public System setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.arc42.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.arc42.spec.SpecPackage.arc42___V_1_aE_introduction_aE_and_aE_goals, visitor);
    _acceptSingle(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlockView.class, cleon.arc42.spec.SpecPackage.arc42___V_5_aE_buildingBlockView, visitor);
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Document_chapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,03828ae9-ffce-11e4-ac0a-959b440f987f,gNNBnbpJyR8tEHmabcIk5DEHQfk=] */
