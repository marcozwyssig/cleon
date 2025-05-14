package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IScheduleType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5699e5ea-2ce3-11f0-851f-3f768d79c0eb");
  
  public static interface IValueVoidVisitor {
    
    public void visitWeekly();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitWeekly();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isWeekly();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5699e5ea-2ce3-11f0-851f-3f768d79c0eb,5uM7ch1OoAIEWbbyZShRhcpoffs=] */
