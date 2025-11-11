package cleon.architecturemethods.hermes.metamodel.importer.solution_concept.xml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;

import ch.actifsource.core.INode;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.patch.IStatementPosition;
import ch.actifsource.ui.wizard.importer.IImportContext;
import cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.RequirementsPackage;

/**
 * Root element representing all requirements - Pure Java, no dependencies
 * Can load itself from XML using built-in factory methods
 */
public class Requirements {

    private String project;
    private int count;
    private List<RequirementsList> requirementsLists;

    public Requirements() {
        this.requirementsLists = new ArrayList<>();
    }

    public Requirements(String project, int count) {
        this.project = project;
        this.count = count;
        this.requirementsLists = new ArrayList<>();
    }

    /**
     * Factory method: Load Requirements from InputStream
     */
    public static Requirements fromInputStream(InputStream inputStream) throws Exception {
        var factory = DocumentBuilderFactory.newInstance();
        var builder = factory.newDocumentBuilder();
        var doc = builder.parse(inputStream);
        doc.getDocumentElement().normalize();

        return fromXmlElement(doc.getDocumentElement());
    }

    /**
     * Factory method: Load Requirements from XML Element
     */
    public static Requirements fromXmlElement(Element root) {
        var requirements = new Requirements();

        // Parse root element attributes
        requirements.setProject(root.getAttribute("project"));
        requirements.setCount(parseInt(root.getAttribute("count")));

        // Parse all requirementslists
        var requirementsLists = root.getElementsByTagName("requirementslist");

        for (var i = 0; i < requirementsLists.getLength(); i++) {
            var listElement = (Element) requirementsLists.item(i);
            var reqList = RequirementsList.fromXmlElement(listElement);
            requirements.addRequirementsList(reqList);
        }

        return requirements;
    }

    /**
     * Helper: Parse integer safely
     */
    private static int parseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // Getters and Setters
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<RequirementsList> getRequirementsLists() {
        return requirementsLists;
    }

    public void setRequirementsLists(List<RequirementsList> requirementsLists) {
        this.requirementsLists = requirementsLists;
    }

    public void addRequirementsList(RequirementsList list) {
        this.requirementsLists.add(list);
    }

    /**
     * Persist this Requirements object to proprietary storage system
     * @param context2
     */
    public void persist(INode iNode, IImportContext context) {

        // Persist all RequirementsLists
        for (final var list : this.requirementsLists) {

    		final var requirementListObject =
    				Update.createAndInitializeResource
    					(context.getWriteJobExecutor(),
    					 context.getPackage(),
    					 RequirementsPackage.RequirementList,
    					 iNode,
    					 RequirementsPackage.Requirements_requirements,
    					 IStatementPosition.AT_END);

        	list.persist(requirementListObject, context);
        }
    }


    @Override
    public String toString() {
        return String.format("Requirements [project=%s, count=%d, lists=%d]",
            project, count, requirementsLists.size());
    }
}