
package pocztex.test.packages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for przesylkaPaletowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaPaletowaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType">
 *       &lt;sequence>
 *         &lt;element name="miejsceOdbioru" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/>
 *         &lt;element name="miejsceDoreczenia" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/>
 *         &lt;element name="paleta" type="{http://e-nadawca.poczta-polska.pl}paletaType"/>
 *         &lt;element name="platnik" type="{http://e-nadawca.poczta-polska.pl}platnikType"/>
 *         &lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType" minOccurs="0"/>
 *         &lt;element name="subPaleta" type="{http://e-nadawca.poczta-polska.pl}subPrzesylkaPaletowaType" maxOccurs="32" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="zawartosc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" />
 *       &lt;attribute name="dataZaladunku" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="dataDostawy" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" />
 *       &lt;attribute name="iloscZwracanychPaletEUR" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="zalaczonaFV" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="zalaczonyWZ" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="zalaczoneInne" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="zwracanaFV" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="zwracanyWZ" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="zwracaneInne" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="powiadomienieNadawcy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="powiadomienieOdbiorcy" type="{http://e-nadawca.poczta-polska.pl}eSposobPowiadomieniaType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaPaletowaType", propOrder = {
    "miejsceOdbioru",
    "miejsceDoreczenia",
    "paleta",
    "platnik",
    "pobranie",
    "subPaleta"
})
public class PrzesylkaPaletowaType
    extends PrzesylkaRejestrowanaType
{

    protected AdresType miejsceOdbioru;
    protected AdresType miejsceDoreczenia;
    @XmlElement(required = true)
    protected PaletaType paleta;
    @XmlElement(required = true)
    protected PlatnikType platnik;
    protected PobranieType pobranie;
    protected List<SubPrzesylkaPaletowaType> subPaleta;
    @XmlAttribute(name = "zawartosc")
    protected String zawartosc;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "dataZaladunku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataZaladunku;
    @XmlAttribute(name = "dataDostawy")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDostawy;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "iloscZwracanychPaletEUR")
    protected Integer iloscZwracanychPaletEUR;
    @XmlAttribute(name = "zalaczonaFV")
    protected String zalaczonaFV;
    @XmlAttribute(name = "zalaczonyWZ")
    protected String zalaczonyWZ;
    @XmlAttribute(name = "zalaczoneInne")
    protected String zalaczoneInne;
    @XmlAttribute(name = "zwracanaFV")
    protected String zwracanaFV;
    @XmlAttribute(name = "zwracanyWZ")
    protected String zwracanyWZ;
    @XmlAttribute(name = "zwracaneInne")
    protected String zwracaneInne;
    @XmlAttribute(name = "powiadomienieNadawcy")
    protected String powiadomienieNadawcy;
    @XmlAttribute(name = "powiadomienieOdbiorcy")
    protected ESposobPowiadomieniaType powiadomienieOdbiorcy;

    /**
     * Gets the value of the miejsceOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getMiejsceOdbioru() {
        return miejsceOdbioru;
    }

    /**
     * Sets the value of the miejsceOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setMiejsceOdbioru(AdresType value) {
        this.miejsceOdbioru = value;
    }

    /**
     * Gets the value of the miejsceDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getMiejsceDoreczenia() {
        return miejsceDoreczenia;
    }

    /**
     * Sets the value of the miejsceDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setMiejsceDoreczenia(AdresType value) {
        this.miejsceDoreczenia = value;
    }

    /**
     * Gets the value of the paleta property.
     * 
     * @return
     *     possible object is
     *     {@link PaletaType }
     *     
     */
    public PaletaType getPaleta() {
        return paleta;
    }

    /**
     * Sets the value of the paleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaletaType }
     *     
     */
    public void setPaleta(PaletaType value) {
        this.paleta = value;
    }

    /**
     * Gets the value of the platnik property.
     * 
     * @return
     *     possible object is
     *     {@link PlatnikType }
     *     
     */
    public PlatnikType getPlatnik() {
        return platnik;
    }

    /**
     * Sets the value of the platnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatnikType }
     *     
     */
    public void setPlatnik(PlatnikType value) {
        this.platnik = value;
    }

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
     * Gets the value of the subPaleta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subPaleta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubPaleta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubPrzesylkaPaletowaType }
     * 
     * 
     */
    public List<SubPrzesylkaPaletowaType> getSubPaleta() {
        if (subPaleta == null) {
            subPaleta = new ArrayList<SubPrzesylkaPaletowaType>();
        }
        return this.subPaleta;
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
     * Gets the value of the dataZaladunku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataZaladunku() {
        return dataZaladunku;
    }

    /**
     * Sets the value of the dataZaladunku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataZaladunku(XMLGregorianCalendar value) {
        this.dataZaladunku = value;
    }

    /**
     * Gets the value of the dataDostawy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDostawy() {
        return dataDostawy;
    }

    /**
     * Sets the value of the dataDostawy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDostawy(XMLGregorianCalendar value) {
        this.dataDostawy = value;
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
     * Gets the value of the iloscZwracanychPaletEUR property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscZwracanychPaletEUR() {
        return iloscZwracanychPaletEUR;
    }

    /**
     * Sets the value of the iloscZwracanychPaletEUR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscZwracanychPaletEUR(Integer value) {
        this.iloscZwracanychPaletEUR = value;
    }

    /**
     * Gets the value of the zalaczonaFV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZalaczonaFV() {
        return zalaczonaFV;
    }

    /**
     * Sets the value of the zalaczonaFV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZalaczonaFV(String value) {
        this.zalaczonaFV = value;
    }

    /**
     * Gets the value of the zalaczonyWZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZalaczonyWZ() {
        return zalaczonyWZ;
    }

    /**
     * Sets the value of the zalaczonyWZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZalaczonyWZ(String value) {
        this.zalaczonyWZ = value;
    }

    /**
     * Gets the value of the zalaczoneInne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZalaczoneInne() {
        return zalaczoneInne;
    }

    /**
     * Sets the value of the zalaczoneInne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZalaczoneInne(String value) {
        this.zalaczoneInne = value;
    }

    /**
     * Gets the value of the zwracanaFV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwracanaFV() {
        return zwracanaFV;
    }

    /**
     * Sets the value of the zwracanaFV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwracanaFV(String value) {
        this.zwracanaFV = value;
    }

    /**
     * Gets the value of the zwracanyWZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwracanyWZ() {
        return zwracanyWZ;
    }

    /**
     * Sets the value of the zwracanyWZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwracanyWZ(String value) {
        this.zwracanyWZ = value;
    }

    /**
     * Gets the value of the zwracaneInne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZwracaneInne() {
        return zwracaneInne;
    }

    /**
     * Sets the value of the zwracaneInne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZwracaneInne(String value) {
        this.zwracaneInne = value;
    }

    /**
     * Gets the value of the powiadomienieNadawcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowiadomienieNadawcy() {
        return powiadomienieNadawcy;
    }

    /**
     * Sets the value of the powiadomienieNadawcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowiadomienieNadawcy(String value) {
        this.powiadomienieNadawcy = value;
    }

    /**
     * Gets the value of the powiadomienieOdbiorcy property.
     * 
     * @return
     *     possible object is
     *     {@link ESposobPowiadomieniaType }
     *     
     */
    public ESposobPowiadomieniaType getPowiadomienieOdbiorcy() {
        return powiadomienieOdbiorcy;
    }

    /**
     * Sets the value of the powiadomienieOdbiorcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESposobPowiadomieniaType }
     *     
     */
    public void setPowiadomienieOdbiorcy(ESposobPowiadomieniaType value) {
        this.powiadomienieOdbiorcy = value;
    }

}
