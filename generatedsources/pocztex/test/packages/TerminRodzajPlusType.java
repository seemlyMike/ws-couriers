
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminRodzajPlusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="terminRodzajPlusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PORANEK"/>
 *     &lt;enumeration value="POLUDNIE"/>
 *     &lt;enumeration value="STANDARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "terminRodzajPlusType")
@XmlEnum
public enum TerminRodzajPlusType {

    PORANEK,
    POLUDNIE,
    STANDARD;

    public String value() {
        return name();
    }

    public static TerminRodzajPlusType fromValue(String v) {
        return valueOf(v);
    }

}
