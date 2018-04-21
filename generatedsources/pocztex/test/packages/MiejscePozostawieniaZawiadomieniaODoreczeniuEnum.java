
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for miejscePozostawieniaZawiadomieniaODoreczeniuEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="miejscePozostawieniaZawiadomieniaODoreczeniuEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SKRZYNKA_ADRESATA"/>
 *     &lt;enumeration value="DRZWI_MIESZKANIA"/>
 *     &lt;enumeration value="INNE_WIDOCZNE_MIEJSCE"/>
 *     &lt;enumeration value="SKRYTKA_POCZTOWA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "miejscePozostawieniaZawiadomieniaODoreczeniuEnum")
@XmlEnum
public enum MiejscePozostawieniaZawiadomieniaODoreczeniuEnum {

    SKRZYNKA_ADRESATA,
    DRZWI_MIESZKANIA,
    INNE_WIDOCZNE_MIEJSCE,
    SKRYTKA_POCZTOWA;

    public String value() {
        return name();
    }

    public static MiejscePozostawieniaZawiadomieniaODoreczeniuEnum fromValue(String v) {
        return valueOf(v);
    }

}
