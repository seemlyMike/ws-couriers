
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminPaczkowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="terminPaczkowaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PACZKA_24"/>
 *     &lt;enumeration value="PACZKA_48"/>
 *     &lt;enumeration value="PACZKA_EKSTRA_24"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "terminPaczkowaType")
@XmlEnum
public enum TerminPaczkowaType {

    PACZKA_24,
    PACZKA_48,
    PACZKA_EKSTRA_24;

    public String value() {
        return name();
    }

    public static TerminPaczkowaType fromValue(String v) {
        return valueOf(v);
    }

}
