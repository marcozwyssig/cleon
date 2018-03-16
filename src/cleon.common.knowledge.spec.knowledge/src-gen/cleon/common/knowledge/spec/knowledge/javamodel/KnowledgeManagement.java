package cleon.common.knowledge.spec.knowledge.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class KnowledgeManagement extends DynamicResource implements IKnowledgeManagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKnowledgeManagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKnowledgeManagement>() {
    
    @Override
    public IKnowledgeManagement create() {
      return new KnowledgeManagement();
    }
    
    @Override
    public IKnowledgeManagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new KnowledgeManagement(resourceRepository, resource);
    }
  
  };

  public KnowledgeManagement() {
    super(IKnowledgeManagement.TYPE_ID);
  }
  
  public KnowledgeManagement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IKnowledgeManagement.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.knowledge.spec.knowledge.javamodel.IKnowledge> selectKnowledges() {
    return _getList(cleon.common.knowledge.spec.knowledge.javamodel.IKnowledge.class, cleon.common.knowledge.spec.knowledge.KnowledgePackage.KnowledgeComposition_knowledges);
  }

  public KnowledgeManagement setKnowledges(java.util.List<? extends cleon.common.knowledge.spec.knowledge.javamodel.IKnowledge> knowledges) {
    _setList(cleon.common.knowledge.spec.knowledge.KnowledgePackage.KnowledgeComposition_knowledges, knowledges);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public KnowledgeManagement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.knowledge.spec.knowledge.javamodel.IKnowledge.class, cleon.common.knowledge.spec.knowledge.KnowledgePackage.KnowledgeComposition_knowledges, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1a32826a-b7da-11e6-8118-d1ad45921478,s/ZMaEVbc+6Nk6rJFrmy8vl2/9M=] */
