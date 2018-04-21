
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eZwrotPrzesylkiType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eZwrotPrzesylkiType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZWROTPACZKA48"/>
 *     &lt;enumeration value="ZWROTKURIEREKSPRES24"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eZwrotPrzesylkiType")
@XmlEnum
public enum EZwrotPrzesylkiType {

    @XmlEnumValue("ZWROTPACZKA48")
    ZWROTPACZKA_48("ZWROTPACZKA48"),
    @XmlEnumValue("ZWROTKURIEREKSPRES24")
    ZWROTKURIEREKSPRES_24("ZWROTKURIEREKSPRES24");
    private final String value;

    EZwrotPrzesylkiType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EZwrotPrzesylkiType fromValue(String v) {
        for (EZwrotPrzesylkiType c: EZwrotPrzesylkiType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
