package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ExpressionAware extends DynamicResource implements IExpressionAware {

  // abstract implementation, only used for static method calls
  private ExpressionAware() {
    super(IExpressionAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.javamodel.IExpressionAware> selectToMeExpression(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.javamodel.IExpression object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.javamodel.IExpressionAware.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.expression.ExpressionPackage.ExpressionAware_expression, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2fb52edc-d657-11e5-beff-c5494779b7d9,ZW2Fs5o/YgiLZIhH+oTJs6h6fKI=] */
