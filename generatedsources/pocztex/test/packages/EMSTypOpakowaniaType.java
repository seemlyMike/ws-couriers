
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMSTypOpakowaniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMSTypOpakowaniaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZWYKLY"/>
 *     &lt;enumeration value="DOKUMENT_PACK"/>
 *     &lt;enumeration value="KILO_PACK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EMSTypOpakowaniaType")
@XmlEnum
public enum EMSTypOpakowaniaType {

    ZWYKLY,
    DOKUMENT_PACK,
    KILO_PACK;

    public String value() {
        return name();
    }

    public static EMSTypOpakowaniaType fromValue(String v) {
        return valueOf(v);
    }

}
