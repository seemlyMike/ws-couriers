
package pocztex.test.packages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shopEZwrotyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shopEZwrotyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eZwrotPrzesylki" type="{http://e-nadawca.poczta-polska.pl}eZwrotPrzesylkiType" maxOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="idShop" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="nazwa" use="required" type="{http://e-nadawca.poczta-polska.pl}nazwaEZwrotyType" />
 *       &lt;attribute name="nazwa2" type="{http://e-nadawca.poczta-polska.pl}nazwaEZwrotyType" />
 *       &lt;attribute name="przyjaznaNazwa" use="required" type="{http://e-nadawca.poczta-polska.pl}nazwaEZwrotyType" />
 *       &lt;attribute name="ulica" use="required" type="{http://e-nadawca.poczta-polska.pl}ulicaType" />
 *       &lt;attribute name="numerDomu" use="required" type="{http://e-nadawca.poczta-polska.pl}numerDomuType" />
 *       &lt;attribute name="numerLokalu" type="{http://e-nadawca.poczta-polska.pl}numerLokaluType" />
 *       &lt;attribute name="miejscowosc" use="required" type="{http://e-nadawca.poczta-polska.pl}miejscowoscType" />
 *       &lt;attribute name="kodPocztowy" use="required" type="{http://e-nadawca.poczta-polska.pl}kodPocztowyType" />
 *       &lt;attribute name="mobile" use="required" type="{http://e-nadawca.poczta-polska.pl}mobileType" />
 *       &lt;attribute name="email" use="required" type="{http://e-nadawca.poczta-polska.pl}emailType" />
 *       &lt;attribute name="nip" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="regon" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="krs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eZwrotTyp" type="{http://e-nadawca.poczta-polska.pl}eZwrotTypZgodyType" />
 *       &lt;attribute name="wymagalnoscNumeruIdentyfikujacegoPrzesylke" type="{http://e-nadawca.poczta-polska.pl}wymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shopEZwrotyType", propOrder = {
    "eZwrotPrzesylki"
})
public class ShopEZwrotyType {

    @XmlElement(required = true)
    protected List<EZwrotPrzesylkiType> eZwrotPrzesylki;
    @XmlAttribute(name = "idShop")
    protected Integer idShop;
    @XmlAttribute(name = "nazwa", required = true)
    protected String nazwa;
    @XmlAttribute(name = "nazwa2")
    protected String nazwa2;
    @XmlAttribute(name = "przyjaznaNazwa", required = true)
    protected String przyjaznaNazwa;
    @XmlAttribute(name = "ulica", required = true)
    protected String ulica;
    @XmlAttribute(name = "numerDomu", required = true)
    protected String numerDomu;
    @XmlAttribute(name = "numerLokalu")
    protected String numerLokalu;
    @XmlAttribute(name = "miejscowosc", required = true)
    protected String miejscowosc;
    @XmlAttribute(name = "kodPocztowy", required = true)
    protected String kodPocztowy;
    @XmlAttribute(name = "mobile", required = true)
    protected String mobile;
    @XmlAttribute(name = "email", required = true)
    protected String email;
    @XmlAttribute(name = "nip")
    protected String nip;
    @XmlAttribute(name = "regon")
    protected String regon;
    @XmlAttribute(name = "krs")
    protected String krs;
    @XmlAttribute(name = "eZwrotTyp")
    protected EZwrotTypZgodyType eZwrotTyp;
    @XmlAttribute(name = "wymagalnoscNumeruIdentyfikujacegoPrzesylke")
    protected WymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum wymagalnoscNumeruIdentyfikujacegoPrzesylke;

    /**
     * Gets the value of the eZwrotPrzesylki property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eZwrotPrzesylki property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEZwrotPrzesylki().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EZwrotPrzesylkiType }
     * 
     * 
     */
    public List<EZwrotPrzesylkiType> getEZwrotPrzesylki() {
        if (eZwrotPrzesylki == null) {
            eZwrotPrzesylki = new ArrayList<EZwrotPrzesylkiType>();
        }
        return this.eZwrotPrzesylki;
    }

    /**
     * Gets the value of the idShop property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdShop() {
        return idShop;
    }

    /**
     * Sets the value of the idShop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdShop(Integer value) {
        this.idShop = value;
    }

    /**
     * Gets the value of the nazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Sets the value of the nazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwa(String value) {
        this.nazwa = value;
    }

    /**
     * Gets the value of the nazwa2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwa2() {
        return nazwa2;
    }

    /**
     * Sets the value of the nazwa2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwa2(String value) {
        this.nazwa2 = value;
    }

    /**
     * Gets the value of the przyjaznaNazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrzyjaznaNazwa() {
        return przyjaznaNazwa;
    }

    /**
     * Sets the value of the przyjaznaNazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrzyjaznaNazwa(String value) {
        this.przyjaznaNazwa = value;
    }

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlica(String value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the numerDomu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerDomu() {
        return numerDomu;
    }

    /**
     * Sets the value of the numerDomu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerDomu(String value) {
        this.numerDomu = value;
    }

    /**
     * Gets the value of the numerLokalu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerLokalu() {
        return numerLokalu;
    }

    /**
     * Sets the value of the numerLokalu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerLokalu(String value) {
        this.numerLokalu = value;
    }

    /**
     * Gets the value of the miejscowosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiejscowosc() {
        return miejscowosc;
    }

    /**
     * Sets the value of the miejscowosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiejscowosc(String value) {
        this.miejscowosc = value;
    }

    /**
     * Gets the value of the kodPocztowy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodPocztowy() {
        return kodPocztowy;
    }

    /**
     * Sets the value of the kodPocztowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodPocztowy(String value) {
        this.kodPocztowy = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the nip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNip() {
        return nip;
    }

    /**
     * Sets the value of the nip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNip(String value) {
        this.nip = value;
    }

    /**
     * Gets the value of the regon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegon() {
        return regon;
    }

    /**
     * Sets the value of the regon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegon(String value) {
        this.regon = value;
    }

    /**
     * Gets the value of the krs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKrs() {
        return krs;
    }

    /**
     * Sets the value of the krs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKrs(String value) {
        this.krs = value;
    }

    /**
     * Gets the value of the eZwrotTyp property.
     * 
     * @return
     *     possible object is
     *     {@link EZwrotTypZgodyType }
     *     
     */
    public EZwrotTypZgodyType getEZwrotTyp() {
        return eZwrotTyp;
    }

    /**
     * Sets the value of the eZwrotTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EZwrotTypZgodyType }
     *     
     */
    public void setEZwrotTyp(EZwrotTypZgodyType value) {
        this.eZwrotTyp = value;
    }

    /**
     * Gets the value of the wymagalnoscNumeruIdentyfikujacegoPrzesylke property.
     * 
     * @return
     *     possible object is
     *     {@link WymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum }
     *     
     */
    public WymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum getWymagalnoscNumeruIdentyfikujacegoPrzesylke() {
        return wymagalnoscNumeruIdentyfikujacegoPrzesylke;
    }

    /**
     * Sets the value of the wymagalnoscNumeruIdentyfikujacegoPrzesylke property.
     * 
     * @param value
     *     allowed object is
     *     {@link WymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum }
     *     
     */
    public void setWymagalnoscNumeruIdentyfikujacegoPrzesylke(WymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum value) {
        this.wymagalnoscNumeruIdentyfikujacegoPrzesylke = value;
    }

}
