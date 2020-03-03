package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBackupConfiguration extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0713be48-1e42-11e9-865e-41ef48a95f70");
  
  public static interface IValueVoidVisitor {
    
    public void visitNone();
    
    public void visitVM();
    
    public void visitWindows();
    
    public void visitSQL__F_Server();
    
    public void visitActive__F_Directory();
    
    public void visitExchange();
    
    public void visitDatenablage();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitNone();
    
    public R visitVM();
    
    public R visitWindows();
    
    public R visitSQL__F_Server();
    
    public R visitActive__F_Directory();
    
    public R visitExchange();
    
    public R visitDatenablage();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isNone();
  
  public boolean isVM();
  
  public boolean isWindows();
  
  public boolean isSQL__F_Server();
  
  public boolean isActive__F_Directory();
  
  public boolean isExchange();
  
  public boolean isDatenablage();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0713be48-1e42-11e9-865e-41ef48a95f70,+3szvJJQMraqVtHUkg4gMH4+RVo=] */
