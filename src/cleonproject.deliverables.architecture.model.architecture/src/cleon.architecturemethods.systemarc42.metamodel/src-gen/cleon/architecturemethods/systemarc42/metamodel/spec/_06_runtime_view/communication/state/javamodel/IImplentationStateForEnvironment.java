package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImplentationStateForEnvironment extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b0ba7e8d-1770-11eb-aff5-dd5c3dd3a631");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment selectEnvironment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b0ba7e8d-1770-11eb-aff5-dd5c3dd3a631,HXUg7uvDDpOiGC2qLLU1iLlFd3k=] */