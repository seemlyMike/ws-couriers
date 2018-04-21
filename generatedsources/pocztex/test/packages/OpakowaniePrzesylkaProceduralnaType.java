
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for opakowaniePrzesylkaProceduralnaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="opakowaniePrzesylkaProceduralnaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIRMOWA_DO_1KG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "opakowaniePrzesylkaProceduralnaType")
@XmlEnum
public enum OpakowaniePrzesylkaProceduralnaType {

    @XmlEnumValue("FIRMOWA_DO_1KG")
    FIRMOWA_DO_1_KG("FIRMOWA_DO_1KG");
    private final String value;

    OpakowaniePrzesylkaProceduralnaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpakowaniePrzesylkaProceduralnaType fromValue(String v) {
        for (OpakowaniePrzesylkaProceduralnaType c: OpakowaniePrzesylkaProceduralnaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
