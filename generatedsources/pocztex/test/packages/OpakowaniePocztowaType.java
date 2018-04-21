
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for opakowaniePocztowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="opakowaniePocztowaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PACZKA_DO_POL_KILO"/>
 *     &lt;enumeration value="FIRMOWA_DO_1KG"/>
 *     &lt;enumeration value="GABARYT_G1"/>
 *     &lt;enumeration value="GABARYT_G2"/>
 *     &lt;enumeration value="GABARYT_G3"/>
 *     &lt;enumeration value="GABARYT_G4"/>
 *     &lt;enumeration value="GABARYT_G5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "opakowaniePocztowaType")
@XmlEnum
public enum OpakowaniePocztowaType {

    PACZKA_DO_POL_KILO("PACZKA_DO_POL_KILO"),
    @XmlEnumValue("FIRMOWA_DO_1KG")
    FIRMOWA_DO_1_KG("FIRMOWA_DO_1KG"),
    @XmlEnumValue("GABARYT_G1")
    GABARYT_G_1("GABARYT_G1"),
    @XmlEnumValue("GABARYT_G2")
    GABARYT_G_2("GABARYT_G2"),
    @XmlEnumValue("GABARYT_G3")
    GABARYT_G_3("GABARYT_G3"),
    @XmlEnumValue("GABARYT_G4")
    GABARYT_G_4("GABARYT_G4"),
    @XmlEnumValue("GABARYT_G5")
    GABARYT_G_5("GABARYT_G5");
    private final String value;

    OpakowaniePocztowaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpakowaniePocztowaType fromValue(String v) {
        for (OpakowaniePocztowaType c: OpakowaniePocztowaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
