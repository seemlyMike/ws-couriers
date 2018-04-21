
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zwrotDokumentowPaczkowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zwrotDokumentowPaczkowaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EKSPRES24"/>
 *     &lt;enumeration value="PACZKA_EKSTRA_24"/>
 *     &lt;enumeration value="PACZKA_24"/>
 *     &lt;enumeration value="PACZKA_48"/>
 *     &lt;enumeration value="LIST_ZWYKLY_PRIORYTETOWY"/>
 *     &lt;enumeration value="LIST_ZWYKLY_EKONOMICZNY"/>
 *     &lt;enumeration value="LIST_POLECONY_PRIORYTETOWY"/>
 *     &lt;enumeration value="LIST_POLECONY_EKONOMICZNY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zwrotDokumentowPaczkowaType")
@XmlEnum
public enum ZwrotDokumentowPaczkowaType {

    @XmlEnumValue("EKSPRES24")
    EKSPRES_24("EKSPRES24"),
    PACZKA_EKSTRA_24("PACZKA_EKSTRA_24"),
    PACZKA_24("PACZKA_24"),
    PACZKA_48("PACZKA_48"),
    LIST_ZWYKLY_PRIORYTETOWY("LIST_ZWYKLY_PRIORYTETOWY"),
    LIST_ZWYKLY_EKONOMICZNY("LIST_ZWYKLY_EKONOMICZNY"),
    LIST_POLECONY_PRIORYTETOWY("LIST_POLECONY_PRIORYTETOWY"),
    LIST_POLECONY_EKONOMICZNY("LIST_POLECONY_EKONOMICZNY");
    private final String value;

    ZwrotDokumentowPaczkowaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ZwrotDokumentowPaczkowaType fromValue(String v) {
        for (ZwrotDokumentowPaczkowaType c: ZwrotDokumentowPaczkowaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
