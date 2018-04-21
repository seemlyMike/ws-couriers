
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for podmiotDoreczeniaEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="podmiotDoreczeniaEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADRESAT"/>
 *     &lt;enumeration value="PELNOLETNI_DOMOWNIK"/>
 *     &lt;enumeration value="SASIAD"/>
 *     &lt;enumeration value="DOZORCA_DOMU"/>
 *     &lt;enumeration value="SOLTYS"/>
 *     &lt;enumeration value="ADMINISTRACJA_DOMU"/>
 *     &lt;enumeration value="UPOWAZNIONY_PRACOWNIK"/>
 *     &lt;enumeration value="PELNOMOCNIK_POCZTOWY"/>
 *     &lt;enumeration value="PRZEDSTAWICIEL_USTAWOWY"/>
 *     &lt;enumeration value="PELNOMOCNIK_ADRESATA"/>
 *     &lt;enumeration value="OSOBA_UPRAWNIONA_DO_REPREZENTACJI"/>
 *     &lt;enumeration value="SKRZYNKA_ODDAWCZA"/>
 *     &lt;enumeration value="ADRESAT_KTORY_NIE_MOGL"/>
 *     &lt;enumeration value="OSOBA_UPRAWNIONA_DO_ODBIORU"/>
 *     &lt;enumeration value="DOROSLY_DOMOWNIK"/>
 *     &lt;enumeration value="OSOBA_UPOWAZNIONA_DO_ODB_KORESP"/>
 *     &lt;enumeration value="KIEROWNIK_JEDNOSTKI_LUB_UPOWAZNIONY"/>
 *     &lt;enumeration value="PRZEDSTAWICIEL_ADRESATA"/>
 *     &lt;enumeration value="OSOBA_UPOWAZNIONA_DO_REPREZENT_ADRESATA"/>
 *     &lt;enumeration value="OSOBA_UPOWAZNIONA_PRZEZ_PRACODAWCE"/>
 *     &lt;enumeration value="PRZELOZONY_ABW"/>
 *     &lt;enumeration value="PRZELOZONY_AW"/>
 *     &lt;enumeration value="PRZELOZONY_CBA"/>
 *     &lt;enumeration value="PRZELOZONY_POLICJI"/>
 *     &lt;enumeration value="PRZELOZONY_SC"/>
 *     &lt;enumeration value="PRZELOZONY_SG"/>
 *     &lt;enumeration value="PRZELOZONY_SKW"/>
 *     &lt;enumeration value="PRZELOZONY_SW"/>
 *     &lt;enumeration value="PRZELOZONY_SWW"/>
 *     &lt;enumeration value="PRZELOZONY_ZOLNIERZA"/>
 *     &lt;enumeration value="SKRYTKA_POCZTOWA"/>
 *     &lt;enumeration value="PROKURENT"/>
 *     &lt;enumeration value="ZARZADCA_DOMU"/>
 *     &lt;enumeration value="OSOBA_UPOWAZNIONA_PRZEZ_KIER_WIEZIENIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "podmiotDoreczeniaEnum")
@XmlEnum
public enum PodmiotDoreczeniaEnum {

    ADRESAT,
    PELNOLETNI_DOMOWNIK,
    SASIAD,
    DOZORCA_DOMU,
    SOLTYS,
    ADMINISTRACJA_DOMU,
    UPOWAZNIONY_PRACOWNIK,
    PELNOMOCNIK_POCZTOWY,
    PRZEDSTAWICIEL_USTAWOWY,
    PELNOMOCNIK_ADRESATA,
    OSOBA_UPRAWNIONA_DO_REPREZENTACJI,
    SKRZYNKA_ODDAWCZA,
    ADRESAT_KTORY_NIE_MOGL,
    OSOBA_UPRAWNIONA_DO_ODBIORU,
    DOROSLY_DOMOWNIK,
    OSOBA_UPOWAZNIONA_DO_ODB_KORESP,
    KIEROWNIK_JEDNOSTKI_LUB_UPOWAZNIONY,
    PRZEDSTAWICIEL_ADRESATA,
    OSOBA_UPOWAZNIONA_DO_REPREZENT_ADRESATA,
    OSOBA_UPOWAZNIONA_PRZEZ_PRACODAWCE,
    PRZELOZONY_ABW,
    PRZELOZONY_AW,
    PRZELOZONY_CBA,
    PRZELOZONY_POLICJI,
    PRZELOZONY_SC,
    PRZELOZONY_SG,
    PRZELOZONY_SKW,
    PRZELOZONY_SW,
    PRZELOZONY_SWW,
    PRZELOZONY_ZOLNIERZA,
    SKRYTKA_POCZTOWA,
    PROKURENT,
    ZARZADCA_DOMU,
    OSOBA_UPOWAZNIONA_PRZEZ_KIER_WIEZIENIA;

    public String value() {
        return name();
    }

    public static PodmiotDoreczeniaEnum fromValue(String v) {
        return valueOf(v);
    }

}
