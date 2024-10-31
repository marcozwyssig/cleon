package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.defect.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IObservation extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a6933d32-3765-11e5-95d9-2b04d7ab02d9");
  
  public static interface IValueVoidVisitor {
    
    public void visitA__F___N_reproduzierbar__O_();
    
    public void visitB__F___N_wiederholtes__F_Auftreten__O_();
    
    public void visitC__F___N_seltenes__F_Auftreten__O_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitA__F___N_reproduzierbar__O_();
    
    public R visitB__F___N_wiederholtes__F_Auftreten__O_();
    
    public R visitC__F___N_seltenes__F_Auftreten__O_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isA__F___N_reproduzierbar__O_();
  
  public boolean isB__F___N_wiederholtes__F_Auftreten__O_();
  
  public boolean isC__F___N_seltenes__F_Auftreten__O_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a6933d32-3765-11e5-95d9-2b04d7ab02d9,XhzFzD5NmsqdBxSdUix85BdBKhg=] */
