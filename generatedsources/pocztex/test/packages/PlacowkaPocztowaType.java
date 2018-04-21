
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for placowkaPocztowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="placowkaPocztowaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lokalizacjaGeograficzna" type="{http://e-nadawca.poczta-polska.pl}lokalizacjaGeograficznaType" minOccurs="0"/>
 *         &lt;element name="godzinyPracy" type="{http://e-nadawca.poczta-polska.pl}godzinyPracyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="prefixNazwy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nazwa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wojewodztwo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="powiat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="miejsce" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="kodPocztowy">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="5"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="miejscowosc">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="30"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ulica" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numerDomu" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numerLokalu" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nazwaWydruk" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="punktWydaniaEPrzesylki" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="powiadomienieSMS" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="punktWydaniaPrzesylkiBiznesowejPlus" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="punktWydaniaPrzesylkiBiznesowej" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="siecPlacowek" type="{http://e-nadawca.poczta-polska.pl}siecPlacowekEnum" />
 *       &lt;attribute name="idZPO" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placowkaPocztowaType", propOrder = {
    "lokalizacjaGeograficzna",
    "godzinyPracy"
})
@XmlSeeAlso({
    UrzadWydaniaEPrzesylkiType.class
})
public class PlacowkaPocztowaType {

    protected LokalizacjaGeograficznaType lokalizacjaGeograficzna;
    protected GodzinyPracyType godzinyPracy;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "prefixNazwy")
    protected String prefixNazwy;
    @XmlAttribute(name = "nazwa")
    protected String nazwa;
    @XmlAttribute(name = "wojewodztwo", required = true)
    protected String wojewodztwo;
    @XmlAttribute(name = "powiat")
    protected String powiat;
    @XmlAttribute(name = "miejsce")
    protected String miejsce;
    @XmlAttribute(name = "kodPocztowy")
    protected String kodPocztowy;
    @XmlAttribute(name = "miejscowosc")
    protected String miejscowosc;
    @XmlAttribute(name = "ulica")
    protected String ulica;
    @XmlAttribute(name = "numerDomu")
    protected String numerDomu;
    @XmlAttribute(name = "numerLokalu")
    protected String numerLokalu;
    @XmlAttribute(name = "nazwaWydruk")
    protected String nazwaWydruk;
    @XmlAttribute(name = "punktWydaniaEPrzesylki")
    protected Boolean punktWydaniaEPrzesylki;
    @XmlAttribute(name = "powiadomienieSMS")
    protected Boolean powiadomienieSMS;
    @XmlAttribute(name = "punktWydaniaPrzesylkiBiznesowejPlus")
    protected Boolean punktWydaniaPrzesylkiBiznesowejPlus;
    @XmlAttribute(name = "punktWydaniaPrzesylkiBiznesowej")
    protected Boolean punktWydaniaPrzesylkiBiznesowej;
    @XmlAttribute(name = "siecPlacowek")
    protected String siecPlacowek;
    @XmlAttribute(name = "idZPO")
    protected String idZPO;

    /**
     * Gets the value of the lokalizacjaGeograficzna property.
     * 
     * @return
     *     possible object is
     *     {@link LokalizacjaGeograficznaType }
     *     
     */
    public LokalizacjaGeograficznaType getLokalizacjaGeograficzna() {
        return lokalizacjaGeograficzna;
    }

    /**
     * Sets the value of the lokalizacjaGeograficzna property.
     * 
     * @param value
     *     allowed object is
     *     {@link LokalizacjaGeograficznaType }
     *     
     */
    public void setLokalizacjaGeograficzna(LokalizacjaGeograficznaType value) {
        this.lokalizacjaGeograficzna = value;
    }

    /**
     * Gets the value of the godzinyPracy property.
     * 
     * @return
     *     possible object is
     *     {@link GodzinyPracyType }
     *     
     */
    public GodzinyPracyType getGodzinyPracy() {
        return godzinyPracy;
    }

    /**
     * Sets the value of the godzinyPracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GodzinyPracyType }
     *     
     */
    public void setGodzinyPracy(GodzinyPracyType value) {
        this.godzinyPracy = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the prefixNazwy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixNazwy() {
        return prefixNazwy;
    }

    /**
     * Sets the value of the prefixNazwy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixNazwy(String value) {
        this.prefixNazwy = value;
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
     * Gets the value of the wojewodztwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWojewodztwo() {
        return wojewodztwo;
    }

    /**
     * Sets the value of the wojewodztwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWojewodztwo(String value) {
        this.wojewodztwo = value;
    }

    /**
     * Gets the value of the powiat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowiat() {
        return powiat;
    }

    /**
     * Sets the value of the powiat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowiat(String value) {
        this.powiat = value;
    }

    /**
     * Gets the value of the miejsce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiejsce() {
        return miejsce;
    }

    /**
     * Sets the value of the miejsce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiejsce(String value) {
        this.miejsce = value;
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
     * Gets the value of the nazwaWydruk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaWydruk() {
        return nazwaWydruk;
    }

    /**
     * Sets the value of the nazwaWydruk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaWydruk(String value) {
        this.nazwaWydruk = value;
    }

    /**
     * Gets the value of the punktWydaniaEPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPunktWydaniaEPrzesylki() {
        return punktWydaniaEPrzesylki;
    }

    /**
     * Sets the value of the punktWydaniaEPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPunktWydaniaEPrzesylki(Boolean value) {
        this.punktWydaniaEPrzesylki = value;
    }

    /**
     * Gets the value of the powiadomienieSMS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowiadomienieSMS() {
        return powiadomienieSMS;
    }

    /**
     * Sets the value of the powiadomienieSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowiadomienieSMS(Boolean value) {
        this.powiadomienieSMS = value;
    }

    /**
     * Gets the value of the punktWydaniaPrzesylkiBiznesowejPlus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPunktWydaniaPrzesylkiBiznesowejPlus() {
        return punktWydaniaPrzesylkiBiznesowejPlus;
    }

    /**
     * Sets the value of the punktWydaniaPrzesylkiBiznesowejPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPunktWydaniaPrzesylkiBiznesowejPlus(Boolean value) {
        this.punktWydaniaPrzesylkiBiznesowejPlus = value;
    }

    /**
     * Gets the value of the punktWydaniaPrzesylkiBiznesowej property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPunktWydaniaPrzesylkiBiznesowej() {
        return punktWydaniaPrzesylkiBiznesowej;
    }

    /**
     * Sets the value of the punktWydaniaPrzesylkiBiznesowej property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPunktWydaniaPrzesylkiBiznesowej(Boolean value) {
        this.punktWydaniaPrzesylkiBiznesowej = value;
    }

    /**
     * Gets the value of the siecPlacowek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiecPlacowek() {
        return siecPlacowek;
    }

    /**
     * Sets the value of the siecPlacowek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiecPlacowek(String value) {
        this.siecPlacowek = value;
    }

    /**
     * Gets the value of the idZPO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdZPO() {
        return idZPO;
    }

    /**
     * Sets the value of the idZPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdZPO(String value) {
        this.idZPO = value;
    }

}
