
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sposobPobraniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sposobPobraniaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRZEKAZ"/>
 *     &lt;enumeration value="RACHUNEK_BANKOWY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sposobPobraniaType")
@XmlEnum
public enum SposobPobraniaType {

    PRZEKAZ,
    RACHUNEK_BANKOWY;

    public String value() {
        return name();
    }

    public static SposobPobraniaType fromValue(String v) {
        return valueOf(v);
    }

}
