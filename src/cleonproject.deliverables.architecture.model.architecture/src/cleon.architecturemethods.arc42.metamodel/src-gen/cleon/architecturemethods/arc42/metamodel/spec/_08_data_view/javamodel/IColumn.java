package cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IColumn extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.ICommentAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a757c855-b934-11ee-a0d0-e953bcbfaeef");
  
  public java.lang.Boolean selectNullable();
  
  // relations
  
  public ch.actifsource.solution.datatype.generic.datatype.javamodel.IType selectType();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IColumnValue selectValueRange();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a757c855-b934-11ee-a0d0-e953bcbfaeef,P0Q43BUzIW2Cxk1YRC4toEAYvFA=] */
