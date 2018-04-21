
package pocztex.test.packages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checklistTemplate" type="{http://e-nadawca.poczta-polska.pl}checklistTemplateType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checklistTemplate"
})
@XmlRootElement(name = "deleteChecklistTemplate")
public class DeleteChecklistTemplate {

    @XmlElement(required = true)
    protected List<ChecklistTemplateType> checklistTemplate;

    /**
     * Gets the value of the checklistTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checklistTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChecklistTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChecklistTemplateType }
     * 
     * 
     */
    public List<ChecklistTemplateType> getChecklistTemplate() {
        if (checklistTemplate == null) {
            checklistTemplate = new ArrayList<ChecklistTemplateType>();
        }
        return this.checklistTemplate;
    }

}
