
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for doreczeniePrzesylkiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doreczeniePrzesylkiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="osobaOdbierajaca" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="podmiotDoreczenia" type="{http://e-nadawca.poczta-polska.pl}podmiotDoreczeniaEnum" />
 *       &lt;attribute name="dataPelnomocnictwa" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="numerPelnomocnictwa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pieczecFirmowa" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="miejscePozostawieniaZawiadomieniaODoreczeniu" type="{http://e-nadawca.poczta-polska.pl}miejscePozostawieniaZawiadomieniaODoreczeniuEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doreczeniePrzesylkiType")
public class DoreczeniePrzesylkiType {

    @XmlAttribute(name = "data")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlAttribute(name = "osobaOdbierajaca")
    protected String osobaOdbierajaca;
    @XmlAttribute(name = "podmiotDoreczenia")
    protected PodmiotDoreczeniaEnum podmiotDoreczenia;
    @XmlAttribute(name = "dataPelnomocnictwa")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPelnomocnictwa;
    @XmlAttribute(name = "numerPelnomocnictwa")
    protected String numerPelnomocnictwa;
    @XmlAttribute(name = "pieczecFirmowa")
    protected Boolean pieczecFirmowa;
    @XmlAttribute(name = "miejscePozostawieniaZawiadomieniaODoreczeniu")
    protected MiejscePozostawieniaZawiadomieniaODoreczeniuEnum miejscePozostawieniaZawiadomieniaODoreczeniu;

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

    /**
     * Gets the value of the osobaOdbierajaca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsobaOdbierajaca() {
        return osobaOdbierajaca;
    }

    /**
     * Sets the value of the osobaOdbierajaca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsobaOdbierajaca(String value) {
        this.osobaOdbierajaca = value;
    }

    /**
     * Gets the value of the podmiotDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link PodmiotDoreczeniaEnum }
     *     
     */
    public PodmiotDoreczeniaEnum getPodmiotDoreczenia() {
        return podmiotDoreczenia;
    }

    /**
     * Sets the value of the podmiotDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodmiotDoreczeniaEnum }
     *     
     */
    public void setPodmiotDoreczenia(PodmiotDoreczeniaEnum value) {
        this.podmiotDoreczenia = value;
    }

    /**
     * Gets the value of the dataPelnomocnictwa property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPelnomocnictwa() {
        return dataPelnomocnictwa;
    }

    /**
     * Sets the value of the dataPelnomocnictwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPelnomocnictwa(XMLGregorianCalendar value) {
        this.dataPelnomocnictwa = value;
    }

    /**
     * Gets the value of the numerPelnomocnictwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerPelnomocnictwa() {
        return numerPelnomocnictwa;
    }

    /**
     * Sets the value of the numerPelnomocnictwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerPelnomocnictwa(String value) {
        this.numerPelnomocnictwa = value;
    }

    /**
     * Gets the value of the pieczecFirmowa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPieczecFirmowa() {
        return pieczecFirmowa;
    }

    /**
     * Sets the value of the pieczecFirmowa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPieczecFirmowa(Boolean value) {
        this.pieczecFirmowa = value;
    }

    /**
     * Gets the value of the miejscePozostawieniaZawiadomieniaODoreczeniu property.
     * 
     * @return
     *     possible object is
     *     {@link MiejscePozostawieniaZawiadomieniaODoreczeniuEnum }
     *     
     */
    public MiejscePozostawieniaZawiadomieniaODoreczeniuEnum getMiejscePozostawieniaZawiadomieniaODoreczeniu() {
        return miejscePozostawieniaZawiadomieniaODoreczeniu;
    }

    /**
     * Sets the value of the miejscePozostawieniaZawiadomieniaODoreczeniu property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiejscePozostawieniaZawiadomieniaODoreczeniuEnum }
     *     
     */
    public void setMiejscePozostawieniaZawiadomieniaODoreczeniu(MiejscePozostawieniaZawiadomieniaODoreczeniuEnum value) {
        this.miejscePozostawieniaZawiadomieniaODoreczeniu = value;
    }

}
