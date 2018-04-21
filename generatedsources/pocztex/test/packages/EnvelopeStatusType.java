
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for envelopeStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="envelopeStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WYSLANY"/>
 *     &lt;enumeration value="DOSTARCZONY"/>
 *     &lt;enumeration value="PRZYJETY"/>
 *     &lt;enumeration value="WALIDOWANY"/>
 *     &lt;enumeration value="BLEDNY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "envelopeStatusType")
@XmlEnum
public enum EnvelopeStatusType {

    WYSLANY,
    DOSTARCZONY,
    PRZYJETY,
    WALIDOWANY,
    BLEDNY;

    public String value() {
        return name();
    }

    public static EnvelopeStatusType fromValue(String v) {
        return valueOf(v);
    }

}
