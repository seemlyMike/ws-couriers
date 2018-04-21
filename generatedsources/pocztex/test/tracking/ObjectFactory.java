
package pocztex.test.tracking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pocztex.test.tracking package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SprawdzPrzesylkiOdDoResponseReturn_QNAME = new QName("http://sledzenie.pocztapolska.pl", "return");
    private final static QName _PrzyczynaNazwa_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "nazwa");
    private final static QName _PrzyczynaKod_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "kod");
    private final static QName _SprawdzPrzesylkiOdDoPlOdDnia_QNAME = new QName("http://sledzenie.pocztapolska.pl", "odDnia");
    private final static QName _SprawdzPrzesylkiOdDoPlDoDnia_QNAME = new QName("http://sledzenie.pocztapolska.pl", "doDnia");
    private final static QName _WitajImie_QNAME = new QName("http://sledzenie.pocztapolska.pl", "imie");
    private final static QName _SzczDaneJednostkiGodzinyPracy_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "godzinyPracy");
    private final static QName _SzczDaneJednostkiNrDomu_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "nrDomu");
    private final static QName _SzczDaneJednostkiMiejscowosc_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "miejscowosc");
    private final static QName _SzczDaneJednostkiUlica_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "ulica");
    private final static QName _SzczDaneJednostkiPna_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "pna");
    private final static QName _SzczDaneJednostkiNrLokalu_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "nrLokalu");
    private final static QName _GodzinyPracyNiedzISw_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "niedzISw");
    private final static QName _GodzinyPracySoboty_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "soboty");
    private final static QName _GodzinyPracyDniRobocze_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "dniRobocze");
    private final static QName _ZdarzenieCzas_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "czas");
    private final static QName _ZdarzenieJednostka_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "jednostka");
    private final static QName _ZdarzeniePrzyczyna_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "przyczyna");
    private final static QName _DanePrzesylkiKodKrajuNadania_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "kodKrajuNadania");
    private final static QName _DanePrzesylkiZdarzenia_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "zdarzenia");
    private final static QName _DanePrzesylkiUrzadPrzezn_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "urzadPrzezn");
    private final static QName _DanePrzesylkiNumer_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "numer");
    private final static QName _DanePrzesylkiKrajNadania_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "krajNadania");
    private final static QName _DanePrzesylkiDataNadania_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "dataNadania");
    private final static QName _DanePrzesylkiKodKrajuPrzezn_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "kodKrajuPrzezn");
    private final static QName _DanePrzesylkiKrajPrzezn_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "krajPrzezn");
    private final static QName _DanePrzesylkiRodzPrzes_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "rodzPrzes");
    private final static QName _DanePrzesylkiMasa_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "masa");
    private final static QName _DanePrzesylkiKodRodzPrzes_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "kodRodzPrzes");
    private final static QName _DanePrzesylkiUrzadNadania_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "urzadNadania");
    private final static QName _JednostkaDaneSzczegolowe_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "daneSzczegolowe");
    private final static QName _SprawdzPrzesylkePlNumer_QNAME = new QName("http://sledzenie.pocztapolska.pl", "numer");
    private final static QName _PrzesylkaDanePrzesylki_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "danePrzesylki");
    private final static QName _GodzinyZUwagamiUwagi_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "uwagi");
    private final static QName _GodzinyZUwagamiGodziny_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "godziny");
    private final static QName _KomunikatPrzesylki_QNAME = new QName("http://ws.sledzenie.pocztapolska.pl/xsd", "przesylki");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pocztex.test.tracking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Przyczyna }
     * 
     */
    public Przyczyna createPrzyczyna() {
        return new Przyczyna();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylkiOdDoPl }
     * 
     */
    public SprawdzPrzesylkiOdDoPl createSprawdzPrzesylkiOdDoPl() {
        return new SprawdzPrzesylkiOdDoPl();
    }

    /**
     * Create an instance of {@link Witaj }
     * 
     */
    public Witaj createWitaj() {
        return new Witaj();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylkePlResponse }
     * 
     */
    public SprawdzPrzesylkePlResponse createSprawdzPrzesylkePlResponse() {
        return new SprawdzPrzesylkePlResponse();
    }

    /**
     * Create an instance of {@link WersjaResponse }
     * 
     */
    public WersjaResponse createWersjaResponse() {
        return new WersjaResponse();
    }

    /**
     * Create an instance of {@link GodzinyPracy }
     * 
     */
    public GodzinyPracy createGodzinyPracy() {
        return new GodzinyPracy();
    }

    /**
     * Create an instance of {@link Jednostka }
     * 
     */
    public Jednostka createJednostka() {
        return new Jednostka();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylkiResponse }
     * 
     */
    public SprawdzPrzesylkiResponse createSprawdzPrzesylkiResponse() {
        return new SprawdzPrzesylkiResponse();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylkePl }
     * 
     */
    public SprawdzPrzesylkePl createSprawdzPrzesylkePl() {
        return new SprawdzPrzesylkePl();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylkiPl }
     * 
     */
    public SprawdzPrzesylkiPl createSprawdzPrzesylkiPl() {
        return new SprawdzPrzesylkiPl();
    }

    /**
     * Create an instance of {@link Przesylka }
     * 
     */
    public Przesylka createPrzesylka() {
        return new Przesylka();
    }

    /**
     * Create an instance of {@link MaksymalnaLiczbaPrzesylekResponse }
     * 
     */
    public MaksymalnaLiczbaPrzesylekResponse createMaksymalnaLiczbaPrzesylekResponse() {
        return new MaksymalnaLiczbaPrzesylekResponse();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylkiOdDoPlResponse }
     * 
     */
    public SprawdzPrzesylkiOdDoPlResponse createSprawdzPrzesylkiOdDoPlResponse() {
        return new SprawdzPrzesylkiOdDoPlResponse();
    }

    /**
     * Create an instance of {@link GodzinyZUwagami }
     * 
     */
    public GodzinyZUwagami createGodzinyZUwagami() {
        return new GodzinyZUwagami();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylke }
     * 
     */
    public SprawdzPrzesylke createSprawdzPrzesylke() {
        return new SprawdzPrzesylke();
    }

    /**
     * Create an instance of {@link Komunikat }
     * 
     */
    public Komunikat createKomunikat() {
        return new Komunikat();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylkiOdDoResponse }
     * 
     */
    public SprawdzPrzesylkiOdDoResponse createSprawdzPrzesylkiOdDoResponse() {
        return new SprawdzPrzesylkiOdDoResponse();
    }

    /**
     * Create an instance of {@link SzczDaneJednostki }
     * 
     */
    public SzczDaneJednostki createSzczDaneJednostki() {
        return new SzczDaneJednostki();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylkiPlResponse }
     * 
     */
    public SprawdzPrzesylkiPlResponse createSprawdzPrzesylkiPlResponse() {
        return new SprawdzPrzesylkiPlResponse();
    }

    /**
     * Create an instance of {@link WitajResponse }
     * 
     */
    public WitajResponse createWitajResponse() {
        return new WitajResponse();
    }

    /**
     * Create an instance of {@link Zdarzenie }
     * 
     */
    public Zdarzenie createZdarzenie() {
        return new Zdarzenie();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylki }
     * 
     */
    public SprawdzPrzesylki createSprawdzPrzesylki() {
        return new SprawdzPrzesylki();
    }

    /**
     * Create an instance of {@link DanePrzesylki }
     * 
     */
    public DanePrzesylki createDanePrzesylki() {
        return new DanePrzesylki();
    }

    /**
     * Create an instance of {@link ListaPrzesylek }
     * 
     */
    public ListaPrzesylek createListaPrzesylek() {
        return new ListaPrzesylek();
    }

    /**
     * Create an instance of {@link ListaZdarzen }
     * 
     */
    public ListaZdarzen createListaZdarzen() {
        return new ListaZdarzen();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylkiOdDo }
     * 
     */
    public SprawdzPrzesylkiOdDo createSprawdzPrzesylkiOdDo() {
        return new SprawdzPrzesylkiOdDo();
    }

    /**
     * Create an instance of {@link SprawdzPrzesylkeResponse }
     * 
     */
    public SprawdzPrzesylkeResponse createSprawdzPrzesylkeResponse() {
        return new SprawdzPrzesylkeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Komunikat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "return", scope = SprawdzPrzesylkiOdDoResponse.class)
    public JAXBElement<Komunikat> createSprawdzPrzesylkiOdDoResponseReturn(Komunikat value) {
        return new JAXBElement<Komunikat>(_SprawdzPrzesylkiOdDoResponseReturn_QNAME, Komunikat.class, SprawdzPrzesylkiOdDoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "nazwa", scope = Przyczyna.class)
    public JAXBElement<String> createPrzyczynaNazwa(String value) {
        return new JAXBElement<String>(_PrzyczynaNazwa_QNAME, String.class, Przyczyna.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "kod", scope = Przyczyna.class)
    public JAXBElement<String> createPrzyczynaKod(String value) {
        return new JAXBElement<String>(_PrzyczynaKod_QNAME, String.class, Przyczyna.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "odDnia", scope = SprawdzPrzesylkiOdDoPl.class)
    public JAXBElement<String> createSprawdzPrzesylkiOdDoPlOdDnia(String value) {
        return new JAXBElement<String>(_SprawdzPrzesylkiOdDoPlOdDnia_QNAME, String.class, SprawdzPrzesylkiOdDoPl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "doDnia", scope = SprawdzPrzesylkiOdDoPl.class)
    public JAXBElement<String> createSprawdzPrzesylkiOdDoPlDoDnia(String value) {
        return new JAXBElement<String>(_SprawdzPrzesylkiOdDoPlDoDnia_QNAME, String.class, SprawdzPrzesylkiOdDoPl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "imie", scope = Witaj.class)
    public JAXBElement<String> createWitajImie(String value) {
        return new JAXBElement<String>(_WitajImie_QNAME, String.class, Witaj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GodzinyPracy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "godzinyPracy", scope = SzczDaneJednostki.class)
    public JAXBElement<GodzinyPracy> createSzczDaneJednostkiGodzinyPracy(GodzinyPracy value) {
        return new JAXBElement<GodzinyPracy>(_SzczDaneJednostkiGodzinyPracy_QNAME, GodzinyPracy.class, SzczDaneJednostki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "nrDomu", scope = SzczDaneJednostki.class)
    public JAXBElement<String> createSzczDaneJednostkiNrDomu(String value) {
        return new JAXBElement<String>(_SzczDaneJednostkiNrDomu_QNAME, String.class, SzczDaneJednostki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "miejscowosc", scope = SzczDaneJednostki.class)
    public JAXBElement<String> createSzczDaneJednostkiMiejscowosc(String value) {
        return new JAXBElement<String>(_SzczDaneJednostkiMiejscowosc_QNAME, String.class, SzczDaneJednostki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "ulica", scope = SzczDaneJednostki.class)
    public JAXBElement<String> createSzczDaneJednostkiUlica(String value) {
        return new JAXBElement<String>(_SzczDaneJednostkiUlica_QNAME, String.class, SzczDaneJednostki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "pna", scope = SzczDaneJednostki.class)
    public JAXBElement<String> createSzczDaneJednostkiPna(String value) {
        return new JAXBElement<String>(_SzczDaneJednostkiPna_QNAME, String.class, SzczDaneJednostki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "nrLokalu", scope = SzczDaneJednostki.class)
    public JAXBElement<String> createSzczDaneJednostkiNrLokalu(String value) {
        return new JAXBElement<String>(_SzczDaneJednostkiNrLokalu_QNAME, String.class, SzczDaneJednostki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Przesylka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "return", scope = SprawdzPrzesylkePlResponse.class)
    public JAXBElement<Przesylka> createSprawdzPrzesylkePlResponseReturn(Przesylka value) {
        return new JAXBElement<Przesylka>(_SprawdzPrzesylkiOdDoResponseReturn_QNAME, Przesylka.class, SprawdzPrzesylkePlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Komunikat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "return", scope = SprawdzPrzesylkiPlResponse.class)
    public JAXBElement<Komunikat> createSprawdzPrzesylkiPlResponseReturn(Komunikat value) {
        return new JAXBElement<Komunikat>(_SprawdzPrzesylkiOdDoResponseReturn_QNAME, Komunikat.class, SprawdzPrzesylkiPlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "return", scope = WersjaResponse.class)
    public JAXBElement<String> createWersjaResponseReturn(String value) {
        return new JAXBElement<String>(_SprawdzPrzesylkiOdDoResponseReturn_QNAME, String.class, WersjaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "return", scope = WitajResponse.class)
    public JAXBElement<String> createWitajResponseReturn(String value) {
        return new JAXBElement<String>(_SprawdzPrzesylkiOdDoResponseReturn_QNAME, String.class, WitajResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GodzinyZUwagami }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "niedzISw", scope = GodzinyPracy.class)
    public JAXBElement<GodzinyZUwagami> createGodzinyPracyNiedzISw(GodzinyZUwagami value) {
        return new JAXBElement<GodzinyZUwagami>(_GodzinyPracyNiedzISw_QNAME, GodzinyZUwagami.class, GodzinyPracy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GodzinyZUwagami }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "soboty", scope = GodzinyPracy.class)
    public JAXBElement<GodzinyZUwagami> createGodzinyPracySoboty(GodzinyZUwagami value) {
        return new JAXBElement<GodzinyZUwagami>(_GodzinyPracySoboty_QNAME, GodzinyZUwagami.class, GodzinyPracy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GodzinyZUwagami }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "dniRobocze", scope = GodzinyPracy.class)
    public JAXBElement<GodzinyZUwagami> createGodzinyPracyDniRobocze(GodzinyZUwagami value) {
        return new JAXBElement<GodzinyZUwagami>(_GodzinyPracyDniRobocze_QNAME, GodzinyZUwagami.class, GodzinyPracy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "nazwa", scope = Zdarzenie.class)
    public JAXBElement<String> createZdarzenieNazwa(String value) {
        return new JAXBElement<String>(_PrzyczynaNazwa_QNAME, String.class, Zdarzenie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "czas", scope = Zdarzenie.class)
    public JAXBElement<String> createZdarzenieCzas(String value) {
        return new JAXBElement<String>(_ZdarzenieCzas_QNAME, String.class, Zdarzenie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Jednostka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "jednostka", scope = Zdarzenie.class)
    public JAXBElement<Jednostka> createZdarzenieJednostka(Jednostka value) {
        return new JAXBElement<Jednostka>(_ZdarzenieJednostka_QNAME, Jednostka.class, Zdarzenie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "kod", scope = Zdarzenie.class)
    public JAXBElement<String> createZdarzenieKod(String value) {
        return new JAXBElement<String>(_PrzyczynaKod_QNAME, String.class, Zdarzenie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Przyczyna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "przyczyna", scope = Zdarzenie.class)
    public JAXBElement<Przyczyna> createZdarzeniePrzyczyna(Przyczyna value) {
        return new JAXBElement<Przyczyna>(_ZdarzeniePrzyczyna_QNAME, Przyczyna.class, Zdarzenie.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "kodKrajuNadania", scope = DanePrzesylki.class)
    public JAXBElement<String> createDanePrzesylkiKodKrajuNadania(String value) {
        return new JAXBElement<String>(_DanePrzesylkiKodKrajuNadania_QNAME, String.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaZdarzen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "zdarzenia", scope = DanePrzesylki.class)
    public JAXBElement<ListaZdarzen> createDanePrzesylkiZdarzenia(ListaZdarzen value) {
        return new JAXBElement<ListaZdarzen>(_DanePrzesylkiZdarzenia_QNAME, ListaZdarzen.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Jednostka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "urzadPrzezn", scope = DanePrzesylki.class)
    public JAXBElement<Jednostka> createDanePrzesylkiUrzadPrzezn(Jednostka value) {
        return new JAXBElement<Jednostka>(_DanePrzesylkiUrzadPrzezn_QNAME, Jednostka.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "numer", scope = DanePrzesylki.class)
    public JAXBElement<String> createDanePrzesylkiNumer(String value) {
        return new JAXBElement<String>(_DanePrzesylkiNumer_QNAME, String.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "krajNadania", scope = DanePrzesylki.class)
    public JAXBElement<String> createDanePrzesylkiKrajNadania(String value) {
        return new JAXBElement<String>(_DanePrzesylkiKrajNadania_QNAME, String.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "dataNadania", scope = DanePrzesylki.class)
    public JAXBElement<XMLGregorianCalendar> createDanePrzesylkiDataNadania(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DanePrzesylkiDataNadania_QNAME, XMLGregorianCalendar.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "kodKrajuPrzezn", scope = DanePrzesylki.class)
    public JAXBElement<String> createDanePrzesylkiKodKrajuPrzezn(String value) {
        return new JAXBElement<String>(_DanePrzesylkiKodKrajuPrzezn_QNAME, String.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "krajPrzezn", scope = DanePrzesylki.class)
    public JAXBElement<String> createDanePrzesylkiKrajPrzezn(String value) {
        return new JAXBElement<String>(_DanePrzesylkiKrajPrzezn_QNAME, String.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "rodzPrzes", scope = DanePrzesylki.class)
    public JAXBElement<String> createDanePrzesylkiRodzPrzes(String value) {
        return new JAXBElement<String>(_DanePrzesylkiRodzPrzes_QNAME, String.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "masa", scope = DanePrzesylki.class)
    public JAXBElement<Float> createDanePrzesylkiMasa(Float value) {
        return new JAXBElement<Float>(_DanePrzesylkiMasa_QNAME, Float.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "kodRodzPrzes", scope = DanePrzesylki.class)
    public JAXBElement<String> createDanePrzesylkiKodRodzPrzes(String value) {
        return new JAXBElement<String>(_DanePrzesylkiKodRodzPrzes_QNAME, String.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Jednostka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "urzadNadania", scope = DanePrzesylki.class)
    public JAXBElement<Jednostka> createDanePrzesylkiUrzadNadania(Jednostka value) {
        return new JAXBElement<Jednostka>(_DanePrzesylkiUrzadNadania_QNAME, Jednostka.class, DanePrzesylki.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "nazwa", scope = Jednostka.class)
    public JAXBElement<String> createJednostkaNazwa(String value) {
        return new JAXBElement<String>(_PrzyczynaNazwa_QNAME, String.class, Jednostka.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SzczDaneJednostki }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "daneSzczegolowe", scope = Jednostka.class)
    public JAXBElement<SzczDaneJednostki> createJednostkaDaneSzczegolowe(SzczDaneJednostki value) {
        return new JAXBElement<SzczDaneJednostki>(_JednostkaDaneSzczegolowe_QNAME, SzczDaneJednostki.class, Jednostka.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Komunikat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "return", scope = SprawdzPrzesylkiResponse.class)
    public JAXBElement<Komunikat> createSprawdzPrzesylkiResponseReturn(Komunikat value) {
        return new JAXBElement<Komunikat>(_SprawdzPrzesylkiOdDoResponseReturn_QNAME, Komunikat.class, SprawdzPrzesylkiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "numer", scope = SprawdzPrzesylkePl.class)
    public JAXBElement<String> createSprawdzPrzesylkePlNumer(String value) {
        return new JAXBElement<String>(_SprawdzPrzesylkePlNumer_QNAME, String.class, SprawdzPrzesylkePl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DanePrzesylki }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "danePrzesylki", scope = Przesylka.class)
    public JAXBElement<DanePrzesylki> createPrzesylkaDanePrzesylki(DanePrzesylki value) {
        return new JAXBElement<DanePrzesylki>(_PrzesylkaDanePrzesylki_QNAME, DanePrzesylki.class, Przesylka.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "numer", scope = Przesylka.class)
    public JAXBElement<String> createPrzesylkaNumer(String value) {
        return new JAXBElement<String>(_DanePrzesylkiNumer_QNAME, String.class, Przesylka.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Komunikat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "return", scope = SprawdzPrzesylkiOdDoPlResponse.class)
    public JAXBElement<Komunikat> createSprawdzPrzesylkiOdDoPlResponseReturn(Komunikat value) {
        return new JAXBElement<Komunikat>(_SprawdzPrzesylkiOdDoResponseReturn_QNAME, Komunikat.class, SprawdzPrzesylkiOdDoPlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "odDnia", scope = SprawdzPrzesylkiOdDo.class)
    public JAXBElement<String> createSprawdzPrzesylkiOdDoOdDnia(String value) {
        return new JAXBElement<String>(_SprawdzPrzesylkiOdDoPlOdDnia_QNAME, String.class, SprawdzPrzesylkiOdDo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "doDnia", scope = SprawdzPrzesylkiOdDo.class)
    public JAXBElement<String> createSprawdzPrzesylkiOdDoDoDnia(String value) {
        return new JAXBElement<String>(_SprawdzPrzesylkiOdDoPlDoDnia_QNAME, String.class, SprawdzPrzesylkiOdDo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Przesylka }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "return", scope = SprawdzPrzesylkeResponse.class)
    public JAXBElement<Przesylka> createSprawdzPrzesylkeResponseReturn(Przesylka value) {
        return new JAXBElement<Przesylka>(_SprawdzPrzesylkiOdDoResponseReturn_QNAME, Przesylka.class, SprawdzPrzesylkeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sledzenie.pocztapolska.pl", name = "numer", scope = SprawdzPrzesylke.class)
    public JAXBElement<String> createSprawdzPrzesylkeNumer(String value) {
        return new JAXBElement<String>(_SprawdzPrzesylkePlNumer_QNAME, String.class, SprawdzPrzesylke.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "uwagi", scope = GodzinyZUwagami.class)
    public JAXBElement<String> createGodzinyZUwagamiUwagi(String value) {
        return new JAXBElement<String>(_GodzinyZUwagamiUwagi_QNAME, String.class, GodzinyZUwagami.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "godziny", scope = GodzinyZUwagami.class)
    public JAXBElement<String> createGodzinyZUwagamiGodziny(String value) {
        return new JAXBElement<String>(_GodzinyZUwagamiGodziny_QNAME, String.class, GodzinyZUwagami.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPrzesylek }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", name = "przesylki", scope = Komunikat.class)
    public JAXBElement<ListaPrzesylek> createKomunikatPrzesylki(ListaPrzesylek value) {
        return new JAXBElement<ListaPrzesylek>(_KomunikatPrzesylki_QNAME, ListaPrzesylek.class, Komunikat.class, value);
    }

}
