
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="wymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BRAK"/>
 *     &lt;enumeration value="WYMAGANY"/>
 *     &lt;enumeration value="NIEWYMAGANY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "wymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum")
@XmlEnum
public enum WymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum {

    BRAK,
    WYMAGANY,
    NIEWYMAGANY;

    public String value() {
        return name();
    }

    public static WymagalnoscNumeruIdentyfikujacegoPrzesylkeEnum fromValue(String v) {
        return valueOf(v);
    }

}
