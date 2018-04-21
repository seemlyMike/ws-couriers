
package pocztex.test.packages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for godzinyPracyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="godzinyPracyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poniedzialek" type="{http://e-nadawca.poczta-polska.pl}godzinyPracyOdDoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="wtorek" type="{http://e-nadawca.poczta-polska.pl}godzinyPracyOdDoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sroda" type="{http://e-nadawca.poczta-polska.pl}godzinyPracyOdDoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="czwartek" type="{http://e-nadawca.poczta-polska.pl}godzinyPracyOdDoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="piatek" type="{http://e-nadawca.poczta-polska.pl}godzinyPracyOdDoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sobota" type="{http://e-nadawca.poczta-polska.pl}godzinyPracyOdDoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="niedziela" type="{http://e-nadawca.poczta-polska.pl}godzinyPracyOdDoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="robocze" type="{http://e-nadawca.poczta-polska.pl}godzinyPracyOdDoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="swieta" type="{http://e-nadawca.poczta-polska.pl}godzinyPracyOdDoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "godzinyPracyType", propOrder = {
    "poniedzialek",
    "wtorek",
    "sroda",
    "czwartek",
    "piatek",
    "sobota",
    "niedziela",
    "robocze",
    "swieta"
})
public class GodzinyPracyType {

    protected List<GodzinyPracyOdDoType> poniedzialek;
    protected List<GodzinyPracyOdDoType> wtorek;
    protected List<GodzinyPracyOdDoType> sroda;
    protected List<GodzinyPracyOdDoType> czwartek;
    protected List<GodzinyPracyOdDoType> piatek;
    protected List<GodzinyPracyOdDoType> sobota;
    protected List<GodzinyPracyOdDoType> niedziela;
    protected List<GodzinyPracyOdDoType> robocze;
    protected List<GodzinyPracyOdDoType> swieta;

    /**
     * Gets the value of the poniedzialek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poniedzialek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoniedzialek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GodzinyPracyOdDoType }
     * 
     * 
     */
    public List<GodzinyPracyOdDoType> getPoniedzialek() {
        if (poniedzialek == null) {
            poniedzialek = new ArrayList<GodzinyPracyOdDoType>();
        }
        return this.poniedzialek;
    }

    /**
     * Gets the value of the wtorek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wtorek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWtorek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GodzinyPracyOdDoType }
     * 
     * 
     */
    public List<GodzinyPracyOdDoType> getWtorek() {
        if (wtorek == null) {
            wtorek = new ArrayList<GodzinyPracyOdDoType>();
        }
        return this.wtorek;
    }

    /**
     * Gets the value of the sroda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sroda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSroda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GodzinyPracyOdDoType }
     * 
     * 
     */
    public List<GodzinyPracyOdDoType> getSroda() {
        if (sroda == null) {
            sroda = new ArrayList<GodzinyPracyOdDoType>();
        }
        return this.sroda;
    }

    /**
     * Gets the value of the czwartek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the czwartek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCzwartek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GodzinyPracyOdDoType }
     * 
     * 
     */
    public List<GodzinyPracyOdDoType> getCzwartek() {
        if (czwartek == null) {
            czwartek = new ArrayList<GodzinyPracyOdDoType>();
        }
        return this.czwartek;
    }

    /**
     * Gets the value of the piatek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the piatek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPiatek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GodzinyPracyOdDoType }
     * 
     * 
     */
    public List<GodzinyPracyOdDoType> getPiatek() {
        if (piatek == null) {
            piatek = new ArrayList<GodzinyPracyOdDoType>();
        }
        return this.piatek;
    }

    /**
     * Gets the value of the sobota property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sobota property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSobota().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GodzinyPracyOdDoType }
     * 
     * 
     */
    public List<GodzinyPracyOdDoType> getSobota() {
        if (sobota == null) {
            sobota = new ArrayList<GodzinyPracyOdDoType>();
        }
        return this.sobota;
    }

    /**
     * Gets the value of the niedziela property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the niedziela property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNiedziela().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GodzinyPracyOdDoType }
     * 
     * 
     */
    public List<GodzinyPracyOdDoType> getNiedziela() {
        if (niedziela == null) {
            niedziela = new ArrayList<GodzinyPracyOdDoType>();
        }
        return this.niedziela;
    }

    /**
     * Gets the value of the robocze property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the robocze property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRobocze().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GodzinyPracyOdDoType }
     * 
     * 
     */
    public List<GodzinyPracyOdDoType> getRobocze() {
        if (robocze == null) {
            robocze = new ArrayList<GodzinyPracyOdDoType>();
        }
        return this.robocze;
    }

    /**
     * Gets the value of the swieta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swieta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwieta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GodzinyPracyOdDoType }
     * 
     * 
     */
    public List<GodzinyPracyOdDoType> getSwieta() {
        if (swieta == null) {
            swieta = new ArrayList<GodzinyPracyOdDoType>();
        }
        return this.swieta;
    }

}
