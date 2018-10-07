package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Story extends DynamicResource implements IStory {

  // abstract implementation, only used for static method calls
  private Story() {
    super(IStory.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel.IStory> selectToMeRequestedBy(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.story.javamodel.IStory.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.story.StoryPackage.Story_requestedBy, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,461882c1-ff9c-11e4-ac0a-959b440f987f,oGobODtAejk1S/NHeoNJ1Nw0AZo=] */
