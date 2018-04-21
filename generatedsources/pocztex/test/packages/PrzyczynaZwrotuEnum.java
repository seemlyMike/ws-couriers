
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przyczynaZwrotuEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="przyczynaZwrotuEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ODMOWA"/>
 *     &lt;enumeration value="ADRESAT_ZMARL"/>
 *     &lt;enumeration value="ADRESAT_NIEZNANY"/>
 *     &lt;enumeration value="ADRESAT_WYPROWADZIL_SIE"/>
 *     &lt;enumeration value="ADRESAT_NIE_PODJAL"/>
 *     &lt;enumeration value="INNA"/>
 *     &lt;enumeration value="ADRES_NIEPELNY"/>
 *     &lt;enumeration value="ADRES_BLEDNY"/>
 *     &lt;enumeration value="ADRES_NIEZGODNY"/>
 *     &lt;enumeration value="ADRES_NIEZNALEZIONY"/>
 *     &lt;enumeration value="ADRESAT_NIE_ZASTANO"/>
 *     &lt;enumeration value="ADRESAT_NIE_ZGLASZA_SIE"/>
 *     &lt;enumeration value="ADRESAT_NIEOBECNY"/>
 *     &lt;enumeration value="ADRESAT_NIEODNALEZIONY"/>
 *     &lt;enumeration value="ADRESAT_STRAJKUJE"/>
 *     &lt;enumeration value="DO_NADAWCY_NA_POZNIEJ"/>
 *     &lt;enumeration value="MYLNE_SKIEROWANIE"/>
 *     &lt;enumeration value="NADAWCA_ODMOWIL"/>
 *     &lt;enumeration value="NIE_PODJETO"/>
 *     &lt;enumeration value="NIEZGODNE_WYMAGANIA"/>
 *     &lt;enumeration value="ODMOWA_USZKODZENIA"/>
 *     &lt;enumeration value="POBRANIE_NIEZGODNE"/>
 *     &lt;enumeration value="USZKODZONA"/>
 *     &lt;enumeration value="ZAMKNIETA_SIEDZIBA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "przyczynaZwrotuEnum")
@XmlEnum
public enum PrzyczynaZwrotuEnum {

    ODMOWA,
    ADRESAT_ZMARL,
    ADRESAT_NIEZNANY,
    ADRESAT_WYPROWADZIL_SIE,
    ADRESAT_NIE_PODJAL,
    INNA,
    ADRES_NIEPELNY,
    ADRES_BLEDNY,
    ADRES_NIEZGODNY,
    ADRES_NIEZNALEZIONY,
    ADRESAT_NIE_ZASTANO,
    ADRESAT_NIE_ZGLASZA_SIE,
    ADRESAT_NIEOBECNY,
    ADRESAT_NIEODNALEZIONY,
    ADRESAT_STRAJKUJE,
    DO_NADAWCY_NA_POZNIEJ,
    MYLNE_SKIEROWANIE,
    NADAWCA_ODMOWIL,
    NIE_PODJETO,
    NIEZGODNE_WYMAGANIA,
    ODMOWA_USZKODZENIA,
    POBRANIE_NIEZGODNE,
    USZKODZONA,
    ZAMKNIETA_SIEDZIBA;

    public String value() {
        return name();
    }

    public static PrzyczynaZwrotuEnum fromValue(String v) {
        return valueOf(v);
    }

}
