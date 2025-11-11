package cleon.architecturemethods.hermes.metamodel.importer.solution_concept.xml;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.Resource;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.patch.IStatementPosition;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.ui.wizard.importer.IImportContext;
import cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.RequirementsPackage;

/**
 * Represents a list of requirements grouped by prefix - Pure Java, no dependencies
 * Can load itself from XML Element
 */
public class RequirementsList {

    private String prefix;
    private String name;
    private List<Requirement> requirements;

    public RequirementsList() {
        this.requirements = new ArrayList<>();
    }

    public RequirementsList(String prefix, String name) {
        this.prefix = prefix;
        this.name = name;
        this.requirements = new ArrayList<>();
    }

    /**
     * Factory method: Load RequirementsList from XML Element
     */
    public static RequirementsList fromXmlElement(Element listElement) {
        var reqList = new RequirementsList();
        reqList.setPrefix(listElement.getAttribute("prefix"));
        reqList.setName(listElement.getAttribute("name"));

        // Parse all requirements in this list
        var requirementNodes = listElement.getElementsByTagName("requirement");

        for (var j = 0; j < requirementNodes.getLength(); j++) {
            var reqElement = (Element) requirementNodes.item(j);
            var req = Requirement.fromXmlElement(reqElement);
            reqList.addRequirement(req);
        }

        return reqList;
    }

    // Getters and Setters
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }

    public void addRequirement(Requirement requirement) {
        this.requirements.add(requirement);
    }

    /**
     * Persist this RequirementsList to proprietary storage system
     */
    public void persist(Resource resource, IImportContext context) {

		Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), resource,
				RequirementsPackage.RequirementShortNameAware_reqShortName, LiteralUtil.create(getPrefix()));

		Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), resource,
				CorePackage.NamedResource_name, LiteralUtil.create(getName()));

        // Persist all Requirements in this list
        for (final var req : this.requirements) {
    		final var requirement =
    				Update.createAndInitializeResource
    					(context.getWriteJobExecutor(),
    					 context.getPackage(),
    					 RequirementsPackage.Requirement,
    					 resource,
    					 RequirementsPackage.RequirementList_requirements,
    					 IStatementPosition.AT_END);
        	req.persist(requirement, context);
        }
    }


    @Override
    public String toString() {
        return String.format("RequirementsList [prefix=%s, name=%s, count=%d]",
            prefix, name, requirements.size());
    }
}