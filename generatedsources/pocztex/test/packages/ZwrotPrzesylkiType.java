
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for zwrotPrzesylkiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zwrotPrzesylkiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="przyczyna" type="{http://e-nadawca.poczta-polska.pl}przyczynaZwrotuEnum" />
 *       &lt;attribute name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zwrotPrzesylkiType")
public class ZwrotPrzesylkiType {

    @XmlAttribute(name = "przyczyna")
    protected PrzyczynaZwrotuEnum przyczyna;
    @XmlAttribute(name = "data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;

    /**
     * Gets the value of the przyczyna property.
     * 
     * @return
     *     possible object is
     *     {@link PrzyczynaZwrotuEnum }
     *     
     */
    public PrzyczynaZwrotuEnum getPrzyczyna() {
        return przyczyna;
    }

    /**
     * Sets the value of the przyczyna property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrzyczynaZwrotuEnum }
     *     
     */
    public void setPrzyczyna(PrzyczynaZwrotuEnum value) {
        this.przyczyna = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

}
