
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sposobPrzekazaniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sposobPrzekazaniaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIST_ZWYKLY_PRIOTYTET"/>
 *     &lt;enumeration value="POCZTEX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sposobPrzekazaniaType")
@XmlEnum
public enum SposobPrzekazaniaType {

    LIST_ZWYKLY_PRIOTYTET,
    POCZTEX;

    public String value() {
        return name();
    }

    public static SposobPrzekazaniaType fromValue(String v) {
        return valueOf(v);
    }

}
