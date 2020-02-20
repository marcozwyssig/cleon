package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4c9ff48f-c58d-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[4c9ff48f-c58d-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace_SubjectArea {

  /* Begin Protected Region [[4c9ff48f-c58d-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[4c9ff48f-c58d-11e5-aeea-1db9268c0ee9]] */


  public static interface ISubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4c9ff491-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("fac13edd-a779-11e8-8660-2f457072b676")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> GetAllRequirements();

    @IDynamicResourceExtension.MethodId("edbc6484-a77c-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface ISubjectAreaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4c9ff491-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubjectArea subjectArea);

  }
  
  public static class SubjectAreaFunctionsImpl implements ISubjectAreaFunctionsImpl {

    public static final ISubjectAreaFunctionsImpl INSTANCE = new SubjectAreaFunctionsImpl();

    private SubjectAreaFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubjectArea subjectArea) {
      return String.format("SU-%02d", subjectArea.selectIdentifier());
    }

  }
  
  public static class SubjectAreaFunctions {

    private SubjectAreaFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubjectArea subjectArea) {
      return DynamicResourceUtil.invoke(ISubjectAreaFunctionsImpl.class, SubjectAreaFunctionsImpl.INSTANCE, subjectArea).GetId(subjectArea);
    }

  }

  public static interface IProjectSubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("775831cb-c90b-11e5-a64e-a5d84d8f1b45")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> GetAllRequirements();

    @IDynamicResourceExtension.MethodId("f3a266bb-a77c-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IProjectSubjectAreaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProjectSubjectAreaFunctionsImpl implements IProjectSubjectAreaFunctionsImpl {

    public static final IProjectSubjectAreaFunctionsImpl INSTANCE = new ProjectSubjectAreaFunctionsImpl();

    private ProjectSubjectAreaFunctionsImpl() {}

  }
  
  public static class ProjectSubjectAreaFunctions {

    private ProjectSubjectAreaFunctions() {}

  }

  public static interface ISubSubjectAreaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0b0de9e3-a77a-11e8-8660-2f457072b676")
    public List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> GetAllRequirements();

  }
  
  public static interface ISubSubjectAreaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SubSubjectAreaFunctionsImpl implements ISubSubjectAreaFunctionsImpl {

    public static final ISubSubjectAreaFunctionsImpl INSTANCE = new SubSubjectAreaFunctionsImpl();

    private SubSubjectAreaFunctionsImpl() {}

  }
  
  public static class SubSubjectAreaFunctions {

    private SubSubjectAreaFunctions() {}

  }

  public static interface IFunctionalityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("05fbf952-a77d-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IFunctionalityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FunctionalityFunctionsImpl implements IFunctionalityFunctionsImpl {

    public static final IFunctionalityFunctionsImpl INSTANCE = new FunctionalityFunctionsImpl();

    private FunctionalityFunctionsImpl() {}

  }
  
  public static class FunctionalityFunctions {

    private FunctionalityFunctions() {}

  }

  public static interface IUserInterfaceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("666f494b-a77d-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IUserInterfaceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UserInterfaceFunctionsImpl implements IUserInterfaceFunctionsImpl {

    public static final IUserInterfaceFunctionsImpl INSTANCE = new UserInterfaceFunctionsImpl();

    private UserInterfaceFunctionsImpl() {}

  }
  
  public static class UserInterfaceFunctions {

    private UserInterfaceFunctions() {}

  }

  public static interface IConstructionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6cd6d89f-a77d-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IConstructionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConstructionFunctionsImpl implements IConstructionFunctionsImpl {

    public static final IConstructionFunctionsImpl INSTANCE = new ConstructionFunctionsImpl();

    private ConstructionFunctionsImpl() {}

  }
  
  public static class ConstructionFunctions {

    private ConstructionFunctions() {}

  }

  public static interface IOperationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("77ae1d70-a77d-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IOperationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OperationFunctionsImpl implements IOperationFunctionsImpl {

    public static final IOperationFunctionsImpl INSTANCE = new OperationFunctionsImpl();

    private OperationFunctionsImpl() {}

  }
  
  public static class OperationFunctions {

    private OperationFunctions() {}

  }

  public static interface IInformationExchangeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7b0c3ca1-a77d-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IInformationExchangeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InformationExchangeFunctionsImpl implements IInformationExchangeFunctionsImpl {

    public static final IInformationExchangeFunctionsImpl INSTANCE = new InformationExchangeFunctionsImpl();

    private InformationExchangeFunctionsImpl() {}

  }
  
  public static class InformationExchangeFunctions {

    private InformationExchangeFunctions() {}

  }

  public static interface IComplianceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8e1743d3-a77d-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IComplianceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ComplianceFunctionsImpl implements IComplianceFunctionsImpl {

    public static final IComplianceFunctionsImpl INSTANCE = new ComplianceFunctionsImpl();

    private ComplianceFunctionsImpl() {}

  }
  
  public static class ComplianceFunctions {

    private ComplianceFunctions() {}

  }

  public static interface IOrganisationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("90c6ac45-a77d-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IOrganisationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OrganisationFunctionsImpl implements IOrganisationFunctionsImpl {

    public static final IOrganisationFunctionsImpl INSTANCE = new OrganisationFunctionsImpl();

    private OrganisationFunctionsImpl() {}

  }
  
  public static class OrganisationFunctions {

    private OrganisationFunctions() {}

  }

  public static interface ISurroundingsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a135856d-a77d-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface ISurroundingsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SurroundingsFunctionsImpl implements ISurroundingsFunctionsImpl {

    public static final ISurroundingsFunctionsImpl INSTANCE = new SurroundingsFunctionsImpl();

    private SurroundingsFunctionsImpl() {}

  }
  
  public static class SurroundingsFunctions {

    private SurroundingsFunctions() {}

  }

  public static interface ILogisticsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a5a22e6e-a77d-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface ILogisticsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LogisticsFunctionsImpl implements ILogisticsFunctionsImpl {

    public static final ILogisticsFunctionsImpl INSTANCE = new LogisticsFunctionsImpl();

    private LogisticsFunctionsImpl() {}

  }
  
  public static class LogisticsFunctions {

    private LogisticsFunctions() {}

  }

  public static interface IInfrastructureFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("74582cb6-a783-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IInfrastructureFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InfrastructureFunctionsImpl implements IInfrastructureFunctionsImpl {

    public static final IInfrastructureFunctionsImpl INSTANCE = new InfrastructureFunctionsImpl();

    private InfrastructureFunctionsImpl() {}

  }
  
  public static class InfrastructureFunctions {

    private InfrastructureFunctions() {}

  }

  public static interface ISystemEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("75273c92-a783-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface ISystemEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemEnvironmentFunctionsImpl implements ISystemEnvironmentFunctionsImpl {

    public static final ISystemEnvironmentFunctionsImpl INSTANCE = new SystemEnvironmentFunctionsImpl();

    private SystemEnvironmentFunctionsImpl() {}

  }
  
  public static class SystemEnvironmentFunctions {

    private SystemEnvironmentFunctions() {}

  }

  public static interface IInformationSecurityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7c111a93-a783-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IInformationSecurityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InformationSecurityFunctionsImpl implements IInformationSecurityFunctionsImpl {

    public static final IInformationSecurityFunctionsImpl INSTANCE = new InformationSecurityFunctionsImpl();

    private InformationSecurityFunctionsImpl() {}

  }
  
  public static class InformationSecurityFunctions {

    private InformationSecurityFunctions() {}

  }

  public static interface IEducationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("80e3d864-a783-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IEducationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EducationFunctionsImpl implements IEducationFunctionsImpl {

    public static final IEducationFunctionsImpl INSTANCE = new EducationFunctionsImpl();

    private EducationFunctionsImpl() {}

  }
  
  public static class EducationFunctions {

    private EducationFunctions() {}

  }

  public static interface IMissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8709f135-a783-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IMissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MissionFunctionsImpl implements IMissionFunctionsImpl {

    public static final IMissionFunctionsImpl INSTANCE = new MissionFunctionsImpl();

    private MissionFunctionsImpl() {}

  }
  
  public static class MissionFunctions {

    private MissionFunctions() {}

  }

  public static interface IStandardFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8b7a912e-a783-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IStandardFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StandardFunctionsImpl implements IStandardFunctionsImpl {

    public static final IStandardFunctionsImpl INSTANCE = new StandardFunctionsImpl();

    private StandardFunctionsImpl() {}

  }
  
  public static class StandardFunctions {

    private StandardFunctions() {}

  }

  public static interface IPackagingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("90210f39-a783-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IPackagingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PackagingFunctionsImpl implements IPackagingFunctionsImpl {

    public static final IPackagingFunctionsImpl INSTANCE = new PackagingFunctionsImpl();

    private PackagingFunctionsImpl() {}

  }
  
  public static class PackagingFunctions {

    private PackagingFunctions() {}

  }

  public static interface ISecurityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("95b9dbe3-a783-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface ISecurityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecurityFunctionsImpl implements ISecurityFunctionsImpl {

    public static final ISecurityFunctionsImpl INSTANCE = new SecurityFunctionsImpl();

    private SecurityFunctionsImpl() {}

  }
  
  public static class SecurityFunctions {

    private SecurityFunctions() {}

  }

  public static interface IPersonalFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9cfc8850-a783-11e8-8660-2f457072b676")
    public java.lang.String GetName();

  }
  
  public static interface IPersonalFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PersonalFunctionsImpl implements IPersonalFunctionsImpl {

    public static final IPersonalFunctionsImpl INSTANCE = new PersonalFunctionsImpl();

    private PersonalFunctionsImpl() {}

  }
  
  public static class PersonalFunctions {

    private PersonalFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4c9ff48f-c58d-11e5-aeea-1db9268c0ee9,QZbH/sbanDSD45BdBYG/ysS6u68=] */
