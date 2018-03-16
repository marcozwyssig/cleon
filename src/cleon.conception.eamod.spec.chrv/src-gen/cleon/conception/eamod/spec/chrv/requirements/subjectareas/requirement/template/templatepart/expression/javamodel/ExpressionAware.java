package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.expression.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ExpressionAware extends DynamicResource implements IExpressionAware {

  // abstract implementation, only used for static method calls
  private ExpressionAware() {
    super(IExpressionAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.expression.javamodel.IExpressionAware> selectToMeExpression(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.expression.javamodel.IExpression object) {
    return _getToMeList(object.getRepository(), cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.expression.javamodel.IExpressionAware.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.expression.ExpressionPackage.ExpressionAware_expression, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2fb52edc-d657-11e5-beff-c5494779b7d9,FweFHsuenzdc4v09UeyZX47lodE=] */
