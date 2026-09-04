package cleon.architecturemethods.hermes.metamodel.template.asciidoc.solution_concept;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[011d55a8-d33d-11ef-802e-175af1a41dfa,imports]] */

/* End Protected Region   [[011d55a8-d33d-11ef-802e-175af1a41dfa,imports]] */

public class FunctionSpace_Asciidoc {

  /* Begin Protected Region [[011d55a8-d33d-11ef-802e-175af1a41dfa]] */
  
  /* End Protected Region   [[011d55a8-d33d-11ef-802e-175af1a41dfa]] */


  public static interface IRequirementListFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a8f58eb3-d33f-11ef-802e-175af1a41dfa")
    public java.lang.String _RenderParagraph(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("095cb369-d8a8-11ef-a46f-a1c9ec5f966b")
    public java.lang.String ShortName();

  }
  
  public static interface IRequirementListFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementListFunctionsImpl implements IRequirementListFunctionsImpl {

    public static final IRequirementListFunctionsImpl INSTANCE = new RequirementListFunctionsImpl();

    private RequirementListFunctionsImpl() {}

  }
  
  public static class RequirementListFunctions {

    private RequirementListFunctions() {}

  }

  public static interface ISolutionConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c0949bd8-d8a6-11ef-a46f-a1c9ec5f966b")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

  }
  
  public static interface ISolutionConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SolutionConceptFunctionsImpl implements ISolutionConceptFunctionsImpl {

    public static final ISolutionConceptFunctionsImpl INSTANCE = new SolutionConceptFunctionsImpl();

    private SolutionConceptFunctionsImpl() {}

  }
  
  public static class SolutionConceptFunctions {

    private SolutionConceptFunctions() {}

  }

  public static interface IBackgroundFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1bb10a25-d8a7-11ef-a46f-a1c9ec5f966b")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IBackgroundFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BackgroundFunctionsImpl implements IBackgroundFunctionsImpl {

    public static final IBackgroundFunctionsImpl INSTANCE = new BackgroundFunctionsImpl();

    private BackgroundFunctionsImpl() {}

  }
  
  public static class BackgroundFunctions {

    private BackgroundFunctions() {}

  }

  public static interface IRequirementShortNameAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0036c7df-d8a8-11ef-a46f-a1c9ec5f966b")
    public java.lang.String ShortName();

  }
  
  public static interface IRequirementShortNameAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementShortNameAwareFunctionsImpl implements IRequirementShortNameAwareFunctionsImpl {

    public static final IRequirementShortNameAwareFunctionsImpl INSTANCE = new RequirementShortNameAwareFunctionsImpl();

    private RequirementShortNameAwareFunctionsImpl() {}

  }
  
  public static class RequirementShortNameAwareFunctions {

    private RequirementShortNameAwareFunctions() {}

  }

  public static interface IRequirementsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2c0c8cc2-d8a8-11ef-a46f-a1c9ec5f966b")
    public java.lang.String ShortName();

  }
  
  public static interface IRequirementsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RequirementsFunctionsImpl implements IRequirementsFunctionsImpl {

    public static final IRequirementsFunctionsImpl INSTANCE = new RequirementsFunctionsImpl();

    private RequirementsFunctionsImpl() {}

  }
  
  public static class RequirementsFunctions {

    private RequirementsFunctions() {}

  }

  public static interface IEvaluationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1336fa64-d8cd-11ef-8dec-7d07d45d9f8c")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("20ce71a7-51bb-11f0-a768-21f9f0df3439")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IEvaluationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EvaluationFunctionsImpl implements IEvaluationFunctionsImpl {

    public static final IEvaluationFunctionsImpl INSTANCE = new EvaluationFunctionsImpl();

    private EvaluationFunctionsImpl() {}

  }
  
  public static class EvaluationFunctions {

    private EvaluationFunctions() {}

  }

  public static interface IConclusionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("19d8abbc-d8cd-11ef-8dec-7d07d45d9f8c")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IConclusionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConclusionFunctionsImpl implements IConclusionFunctionsImpl {

    public static final IConclusionFunctionsImpl INSTANCE = new ConclusionFunctionsImpl();

    private ConclusionFunctionsImpl() {}

  }
  
  public static class ConclusionFunctions {

    private ConclusionFunctions() {}

  }

  public static interface IRequirementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("84d341a7-0efc-11f0-b76f-5998f6696fc7")
    public java.lang.String RenderChapter(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

    @IDynamicResourceExtension.MethodId("42a6c92e-3cc0-11f1-929c-672b94f43512")
    public java.lang.Boolean HasContent();

  }
  
  public static interface IRequirementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("42a6c92e-3cc0-11f1-929c-672b94f43512")
    public java.lang.Boolean HasContent(final cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirement requirement);

  }
  
  public static class RequirementFunctionsImpl implements IRequirementFunctionsImpl {

    public static final IRequirementFunctionsImpl INSTANCE = new RequirementFunctionsImpl();

    private RequirementFunctionsImpl() {}

    @Override
    public java.lang.Boolean HasContent(final cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirement requirement) {
      /* Begin Protected Region [[42a6c92e-3cc0-11f1-929c-672b94f43512]] */
    	return !requirement.selectParagraphs().isEmpty() || !requirement.selectDescriptions().isEmpty();      
      /* End Protected Region   [[42a6c92e-3cc0-11f1-929c-672b94f43512]] */
    }

  }
  
  public static class RequirementFunctions {

    private RequirementFunctions() {}

    public static java.lang.Boolean HasContent(final cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirement requirement) {
      return DynamicResourceUtil.invoke(IRequirementFunctionsImpl.class, RequirementFunctionsImpl.INSTANCE, requirement).HasContent(requirement);
    }

  }

  public static interface IEvaluationRequirementsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("81114ee9-51b9-11f0-a768-21f9f0df3439")
    public java.lang.String RenderContentElement(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IEvaluationRequirementsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EvaluationRequirementsFunctionsImpl implements IEvaluationRequirementsFunctionsImpl {

    public static final IEvaluationRequirementsFunctionsImpl INSTANCE = new EvaluationRequirementsFunctionsImpl();

    private EvaluationRequirementsFunctionsImpl() {}

  }
  
  public static class EvaluationRequirementsFunctions {

    private EvaluationRequirementsFunctions() {}

  }

  public static interface IAppendixFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1319fe83-51bb-11f0-a768-21f9f0df3439")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface IAppendixFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AppendixFunctionsImpl implements IAppendixFunctionsImpl {

    public static final IAppendixFunctionsImpl INSTANCE = new AppendixFunctionsImpl();

    private AppendixFunctionsImpl() {}

  }
  
  public static class AppendixFunctions {

    private AppendixFunctions() {}

  }

  public static interface ISolutionLevelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("aa1cfbad-17c8-11f1-8320-993712c2541b")
    public List<cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> ChapterOrder();

    @IDynamicResourceExtension.MethodId("fd2dae99-17cd-11f1-8320-993712c2541b")
    public java.lang.String ChapterPath(final cleon.common.language.metamodel.spec.languages.javamodel.ILanguage language);

  }
  
  public static interface ISolutionLevelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SolutionLevelFunctionsImpl implements ISolutionLevelFunctionsImpl {

    public static final ISolutionLevelFunctionsImpl INSTANCE = new SolutionLevelFunctionsImpl();

    private SolutionLevelFunctionsImpl() {}

  }
  
  public static class SolutionLevelFunctions {

    private SolutionLevelFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,011d55a8-d33d-11ef-802e-175af1a41dfa,hA/fHuk8TN6fXy+UfrsbqiYBSFI=] */
