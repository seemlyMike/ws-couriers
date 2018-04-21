
package pocztex.test.packages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uslugaPaczkowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uslugaPaczkowaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType">
 *       &lt;sequence>
 *         &lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType" minOccurs="0"/>
 *         &lt;element name="potwierdzenieDoreczenia" type="{http://e-nadawca.poczta-polska.pl}potwierdzenieDoreczeniaType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="urzadWydaniaEPrzesylki" type="{http://e-nadawca.poczta-polska.pl}urzadWydaniaEPrzesylkiType" minOccurs="0"/>
 *           &lt;element name="subPrzesylka" type="{http://e-nadawca.poczta-polska.pl}subUslugaPaczkowaType" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="potwierdzenieOdbioru" type="{http://e-nadawca.poczta-polska.pl}potwierdzenieOdbioruPaczkowaType" minOccurs="0"/>
 *         &lt;element name="ubezpieczenie" type="{http://e-nadawca.poczta-polska.pl}ubezpieczenieType" minOccurs="0"/>
 *         &lt;element name="zwrotDokumentow" type="{http://e-nadawca.poczta-polska.pl}zwrotDokumentowPaczkowaType" minOccurs="0"/>
 *         &lt;element name="idDokumentyZwrotneAdresy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="doreczenie" type="{http://e-nadawca.poczta-polska.pl}doreczenieUslugaPocztowaType" minOccurs="0"/>
 *         &lt;element name="epo" type="{http://e-nadawca.poczta-polska.pl}EPOType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="zasadySpecjalne" type="{http://e-nadawca.poczta-polska.pl}zasadySpecjalneEnum" />
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" />
 *       &lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" />
 *       &lt;attribute name="ponadgabaryt" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="zawartosc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sprawdzenieZawartosciPrzesylkiPrzezOdbiorce" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ostroznie" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="uiszczaOplate" type="{http://e-nadawca.poczta-polska.pl}uiszczaOplateType" />
 *       &lt;attribute name="termin" type="{http://e-nadawca.poczta-polska.pl}terminPaczkowaType" />
 *       &lt;attribute name="opakowanie" type="{http://e-nadawca.poczta-polska.pl}opakowaniePocztowaType" />
 *       &lt;attribute name="numerPrzesylkiKlienta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numerTransakcjiOdbioru" type="{http://e-nadawca.poczta-polska.pl}numerTransakcjiOdbioruType" />
 *       &lt;attribute name="gabaryt" type="{http://e-nadawca.poczta-polska.pl}gabarytType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uslugaPaczkowaType", propOrder = {
    "pobranie",
    "potwierdzenieDoreczenia",
    "urzadWydaniaEPrzesylki",
    "subPrzesylka",
    "potwierdzenieOdbioru",
    "ubezpieczenie",
    "zwrotDokumentow",
    "idDokumentyZwrotneAdresy",
    "doreczenie",
    "epo"
})
public class UslugaPaczkowaType
    extends PrzesylkaRejestrowanaType
{

    protected PobranieType pobranie;
    protected PotwierdzenieDoreczeniaType potwierdzenieDoreczenia;
    protected UrzadWydaniaEPrzesylkiType urzadWydaniaEPrzesylki;
    protected List<SubUslugaPaczkowaType> subPrzesylka;
    protected PotwierdzenieOdbioruPaczkowaType potwierdzenieOdbioru;
    protected UbezpieczenieType ubezpieczenie;
    protected ZwrotDokumentowPaczkowaType zwrotDokumentow;
    protected Integer idDokumentyZwrotneAdresy;
    protected DoreczenieUslugaPocztowaType doreczenie;
    protected EPOType epo;
    @XmlAttribute(name = "zasadySpecjalne")
    protected ZasadySpecjalneEnum zasadySpecjalne;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "ponadgabaryt")
    protected Boolean ponadgabaryt;
    @XmlAttribute(name = "zawartosc")
    protected String zawartosc;
    @XmlAttribute(name = "sprawdzenieZawartosciPrzesylkiPrzezOdbiorce")
    protected Boolean sprawdzenieZawartosciPrzesylkiPrzezOdbiorce;
    @XmlAttribute(name = "ostroznie")
    protected Boolean ostroznie;
    @XmlAttribute(name = "uiszczaOplate")
    protected UiszczaOplateType uiszczaOplate;
    @XmlAttribute(name = "termin")
    protected TerminPaczkowaType termin;
    @XmlAttribute(name = "opakowanie")
    protected OpakowaniePocztowaType opakowanie;
    @XmlAttribute(name = "numerPrzesylkiKlienta")
    protected String numerPrzesylkiKlienta;
    @XmlAttribute(name = "numerTransakcjiOdbioru")
    protected String numerTransakcjiOdbioru;
    @XmlAttribute(name = "gabaryt")
    protected GabarytType gabaryt;

    /**
     * Gets the value of the pobranie property.
     * 
     * @return
     *     possible object is
     *     {@link PobranieType }
     *     
     */
    public PobranieType getPobranie() {
        return pobranie;
    }

    /**
     * Sets the value of the pobranie property.
     * 
     * @param value
     *     allowed object is
     *     {@link PobranieType }
     *     
     */
    public void setPobranie(PobranieType value) {
        this.pobranie = value;
    }

    /**
     * Gets the value of the potwierdzenieDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link PotwierdzenieDoreczeniaType }
     *     
     */
    public PotwierdzenieDoreczeniaType getPotwierdzenieDoreczenia() {
        return potwierdzenieDoreczenia;
    }

    /**
     * Sets the value of the potwierdzenieDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotwierdzenieDoreczeniaType }
     *     
     */
    public void setPotwierdzenieDoreczenia(PotwierdzenieDoreczeniaType value) {
        this.potwierdzenieDoreczenia = value;
    }

    /**
     * Gets the value of the urzadWydaniaEPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link UrzadWydaniaEPrzesylkiType }
     *     
     */
    public UrzadWydaniaEPrzesylkiType getUrzadWydaniaEPrzesylki() {
        return urzadWydaniaEPrzesylki;
    }

    /**
     * Sets the value of the urzadWydaniaEPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrzadWydaniaEPrzesylkiType }
     *     
     */
    public void setUrzadWydaniaEPrzesylki(UrzadWydaniaEPrzesylkiType value) {
        this.urzadWydaniaEPrzesylki = value;
    }

    /**
     * Gets the value of the subPrzesylka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPrzesylka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPrzesylka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubUslugaPaczkowaType }
     * 
     * 
     */
    public List<SubUslugaPaczkowaType> getSubPrzesylka() {
        if (subPrzesylka == null) {
            subPrzesylka = new ArrayList<SubUslugaPaczkowaType>();
        }
        return this.subPrzesylka;
    }

    /**
     * Gets the value of the potwierdzenieOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link PotwierdzenieOdbioruPaczkowaType }
     *     
     */
    public PotwierdzenieOdbioruPaczkowaType getPotwierdzenieOdbioru() {
        return potwierdzenieOdbioru;
    }

    /**
     * Sets the value of the potwierdzenieOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotwierdzenieOdbioruPaczkowaType }
     *     
     */
    public void setPotwierdzenieOdbioru(PotwierdzenieOdbioruPaczkowaType value) {
        this.potwierdzenieOdbioru = value;
    }

    /**
     * Gets the value of the ubezpieczenie property.
     * 
     * @return
     *     possible object is
     *     {@link UbezpieczenieType }
     *     
     */
    public UbezpieczenieType getUbezpieczenie() {
        return ubezpieczenie;
    }

    /**
     * Sets the value of the ubezpieczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link UbezpieczenieType }
     *     
     */
    public void setUbezpieczenie(UbezpieczenieType value) {
        this.ubezpieczenie = value;
    }

    /**
     * Gets the value of the zwrotDokumentow property.
     * 
     * @return
     *     possible object is
     *     {@link ZwrotDokumentowPaczkowaType }
     *     
     */
    public ZwrotDokumentowPaczkowaType getZwrotDokumentow() {
        return zwrotDokumentow;
    }

    /**
     * Sets the value of the zwrotDokumentow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZwrotDokumentowPaczkowaType }
     *     
     */
    public void setZwrotDokumentow(ZwrotDokumentowPaczkowaType value) {
        this.zwrotDokumentow = value;
    }

    /**
     * Gets the value of the idDokumentyZwrotneAdresy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDokumentyZwrotneAdresy() {
        return idDokumentyZwrotneAdresy;
    }

    /**
     * Sets the value of the idDokumentyZwrotneAdresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDokumentyZwrotneAdresy(Integer value) {
        this.idDokumentyZwrotneAdresy = value;
    }

    /**
     * Gets the value of the doreczenie property.
     * 
     * @return
     *     possible object is
     *     {@link DoreczenieUslugaPocztowaType }
     *     
     */
    public DoreczenieUslugaPocztowaType getDoreczenie() {
        return doreczenie;
    }

    /**
     * Sets the value of the doreczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoreczenieUslugaPocztowaType }
     *     
     */
    public void setDoreczenie(DoreczenieUslugaPocztowaType value) {
        this.doreczenie = value;
    }

    /**
     * Gets the value of the epo property.
     * 
     * @return
     *     possible object is
     *     {@link EPOType }
     *     
     */
    public EPOType getEpo() {
        return epo;
    }

    /**
     * Sets the value of the epo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPOType }
     *     
     */
    public void setEpo(EPOType value) {
        this.epo = value;
    }

    /**
     * Gets the value of the zasadySpecjalne property.
     * 
     * @return
     *     possible object is
     *     {@link ZasadySpecjalneEnum }
     *     
     */
    public ZasadySpecjalneEnum getZasadySpecjalne() {
        return zasadySpecjalne;
    }

    /**
     * Sets the value of the zasadySpecjalne property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZasadySpecjalneEnum }
     *     
     */
    public void setZasadySpecjalne(ZasadySpecjalneEnum value) {
        this.zasadySpecjalne = value;
    }

    /**
     * Gets the value of the masa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasa(Integer value) {
        this.masa = value;
    }

    /**
     * Gets the value of the wartosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWartosc() {
        return wartosc;
    }

    /**
     * Sets the value of the wartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWartosc(Integer value) {
        this.wartosc = value;
    }

    /**
     * Gets the value of the ponadgabaryt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPonadgabaryt() {
        return ponadgabaryt;
    }

    /**
     * Sets the value of the ponadgabaryt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPonadgabaryt(Boolean value) {
        this.ponadgabaryt = value;
    }

    /**
     * Gets the value of the zawartosc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZawartosc() {
        return zawartosc;
    }

    /**
     * Sets the value of the zawartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZawartosc(String value) {
        this.zawartosc = value;
    }

    /**
     * Gets the value of the sprawdzenieZawartosciPrzesylkiPrzezOdbiorce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSprawdzenieZawartosciPrzesylkiPrzezOdbiorce() {
        return sprawdzenieZawartosciPrzesylkiPrzezOdbiorce;
    }

    /**
     * Sets the value of the sprawdzenieZawartosciPrzesylkiPrzezOdbiorce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSprawdzenieZawartosciPrzesylkiPrzezOdbiorce(Boolean value) {
        this.sprawdzenieZawartosciPrzesylkiPrzezOdbiorce = value;
    }

    /**
     * Gets the value of the ostroznie property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOstroznie() {
        return ostroznie;
    }

    /**
     * Sets the value of the ostroznie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOstroznie(Boolean value) {
        this.ostroznie = value;
    }

    /**
     * Gets the value of the uiszczaOplate property.
     * 
     * @return
     *     possible object is
     *     {@link UiszczaOplateType }
     *     
     */
    public UiszczaOplateType getUiszczaOplate() {
        return uiszczaOplate;
    }

    /**
     * Sets the value of the uiszczaOplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link UiszczaOplateType }
     *     
     */
    public void setUiszczaOplate(UiszczaOplateType value) {
        this.uiszczaOplate = value;
    }

    /**
     * Gets the value of the termin property.
     * 
     * @return
     *     possible object is
     *     {@link TerminPaczkowaType }
     *     
     */
    public TerminPaczkowaType getTermin() {
        return termin;
    }

    /**
     * Sets the value of the termin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminPaczkowaType }
     *     
     */
    public void setTermin(TerminPaczkowaType value) {
        this.termin = value;
    }

    /**
     * Gets the value of the opakowanie property.
     * 
     * @return
     *     possible object is
     *     {@link OpakowaniePocztowaType }
     *     
     */
    public OpakowaniePocztowaType getOpakowanie() {
        return opakowanie;
    }

    /**
     * Sets the value of the opakowanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpakowaniePocztowaType }
     *     
     */
    public void setOpakowanie(OpakowaniePocztowaType value) {
        this.opakowanie = value;
    }

    /**
     * Gets the value of the numerPrzesylkiKlienta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerPrzesylkiKlienta() {
        return numerPrzesylkiKlienta;
    }

    /**
     * Sets the value of the numerPrzesylkiKlienta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerPrzesylkiKlienta(String value) {
        this.numerPrzesylkiKlienta = value;
    }

    /**
     * Gets the value of the numerTransakcjiOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerTransakcjiOdbioru() {
        return numerTransakcjiOdbioru;
    }

    /**
     * Sets the value of the numerTransakcjiOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerTransakcjiOdbioru(String value) {
        this.numerTransakcjiOdbioru = value;
    }

    /**
     * Gets the value of the gabaryt property.
     * 
     * @return
     *     possible object is
     *     {@link GabarytType }
     *     
     */
    public GabarytType getGabaryt() {
        return gabaryt;
    }

    /**
     * Sets the value of the gabaryt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GabarytType }
     *     
     */
    public void setGabaryt(GabarytType value) {
        this.gabaryt = value;
    }

}
