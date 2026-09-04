package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILocalWinFw extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel.IAbstractLocalFw {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0a34f096-0bd0-11f0-95b9-95d0cc9a328a");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel.ILocalFwRule> selectRules();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_operations.javamodel.IProgramLocalFirewallRule> selectProgramLocalFirewallRules();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0a34f096-0bd0-11f0-95b9-95d0cc9a328a,hzh4li1ghReWilde5jRzPpPGvgs=] */
