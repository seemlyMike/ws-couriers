
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for terminZwrotDokumentowPaczkowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="terminZwrotDokumentowPaczkowaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PACZKA_24"/>
 *     &lt;enumeration value="PACZKA_48"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "terminZwrotDokumentowPaczkowaType")
@XmlEnum
public enum TerminZwrotDokumentowPaczkowaType {

    PACZKA_24,
    PACZKA_48;

    public String value() {
        return name();
    }

    public static TerminZwrotDokumentowPaczkowaType fromValue(String v) {
        return valueOf(v);
    }

}
