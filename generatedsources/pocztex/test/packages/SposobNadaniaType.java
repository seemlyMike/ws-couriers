
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sposobNadaniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sposobNadaniaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WERYFIKACJA_WEZEL_DOCELOWY"/>
 *     &lt;enumeration value="WERYFIKACJA_WEZEL_NADAWCZY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sposobNadaniaType")
@XmlEnum
public enum SposobNadaniaType {

    WERYFIKACJA_WEZEL_DOCELOWY,
    WERYFIKACJA_WEZEL_NADAWCZY;

    public String value() {
        return name();
    }

    public static SposobNadaniaType fromValue(String v) {
        return valueOf(v);
    }

}
