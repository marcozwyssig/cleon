package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDocumentStage extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("784a1bc2-bff7-11e8-a3d0-5394fd9291a1");
  
  public static interface IValueVoidVisitor {
    
    public void visitDraft();
    
    public void visitReview();
    
    public void visitFinal();
    
    public void visitApproved();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitDraft();
    
    public R visitReview();
    
    public R visitFinal();
    
    public R visitApproved();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isDraft();
  
  public boolean isReview();
  
  public boolean isFinal();
  
  public boolean isApproved();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,784a1bc2-bff7-11e8-a3d0-5394fd9291a1,0YJCnEoweHTde4cbSYSBFFbnsUQ=] */
