
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eSposobPowiadomieniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eSposobPowiadomieniaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="EMAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eSposobPowiadomieniaType")
@XmlEnum
public enum ESposobPowiadomieniaType {

    SMS,
    EMAIL;

    public String value() {
        return name();
    }

    public static ESposobPowiadomieniaType fromValue(String v) {
        return valueOf(v);
    }

}
