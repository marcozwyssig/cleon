package cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.property.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class PropertyAware extends DynamicResource implements IPropertyAware {

  // abstract implementation, only used for static method calls
  private PropertyAware() {
    super(IPropertyAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.property.javamodel.IPropertyAware> selectToMeProperty(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.property.javamodel.IProperty object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.property.javamodel.IPropertyAware.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.templatepart.property.PropertyPackage.PropertyAware_property, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,09db64ff-d657-11e5-beff-c5494779b7d9,8pWwPAlbpzfk3OzMG8O9prpUJUU=] */
