package cleon.architecturemethods.hermes.metamodel.importer.solution_concept.xml;

import org.w3c.dom.Element;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.Resource;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.ui.wizard.importer.IImportContext;

/**
 * Represents a single requirement - Pure Java, no dependencies
 * Can load itself from XML Element
 */
public class Requirement {

    private int id;
    private String status;
    private String name;
    private String type;
    private String description;
    private String chapter;

    public Requirement() {
    }

    public Requirement(int id, String status, String name, String type, String description, String chapter) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.type = type;
        this.description = description;
        this.chapter = chapter;
    }

    /**
     * Factory method: Load Requirement from XML Element
     */
    public static Requirement fromXmlElement(Element reqElement) {
        var req = new Requirement();

        // Parse attributes
        req.setId(parseInt(reqElement.getAttribute("id")));
        req.setStatus(reqElement.getAttribute("status"));
        req.setName(reqElement.getAttribute("name"));

        // Parse child elements
        req.setType(getElementText(reqElement, "type"));
        req.setDescription(getElementText(reqElement, "description"));
        req.setChapter(getElementText(reqElement, "chapter"));

        return req;
    }

    /**
     * Helper: Get text content of a child element
     */
    private static String getElementText(Element parent, String tagName) {
        var nodeList = parent.getElementsByTagName(tagName);
        if (nodeList.getLength() > 0) {
            return nodeList.item(0).getTextContent();
        }
        return "";
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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    /**
     * Persist this Requirement to proprietary storage system
     * @param context
     */
    public void persist(Resource resource, IImportContext context) {
		Update.createOrModifyStatement(context.getWriteJobExecutor(), context.getPackage(), resource,
				cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, LiteralUtil.create(getId()));

		Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), resource,
				CorePackage.NamedResource_name, LiteralUtil.create(getName()));

		Update.createStatement(context.getWriteJobExecutor(), context.getPackage(), resource,
				cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, LiteralUtil.create(getDescription()));

    }


    @Override
    public String toString() {
        return String.format("[%d] %s (Status: %s, Type: %s, Chapter: %s)%n  %s",
            id, name, status, type, chapter, description);
    }
}