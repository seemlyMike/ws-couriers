
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typOpakowanieType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typOpakowanieType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KL1"/>
 *     &lt;enumeration value="KL2"/>
 *     &lt;enumeration value="KL3"/>
 *     &lt;enumeration value="S21"/>
 *     &lt;enumeration value="S22"/>
 *     &lt;enumeration value="S23"/>
 *     &lt;enumeration value="P31"/>
 *     &lt;enumeration value="P32"/>
 *     &lt;enumeration value="P33"/>
 *     &lt;enumeration value="SP41"/>
 *     &lt;enumeration value="SP42"/>
 *     &lt;enumeration value="WKL51"/>
 *     &lt;enumeration value="K1"/>
 *     &lt;enumeration value="K2"/>
 *     &lt;enumeration value="K3"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="W"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typOpakowanieType")
@XmlEnum
public enum TypOpakowanieType {

    @XmlEnumValue("KL1")
    KL_1("KL1"),
    @XmlEnumValue("KL2")
    KL_2("KL2"),
    @XmlEnumValue("KL3")
    KL_3("KL3"),
    @XmlEnumValue("S21")
    S_21("S21"),
    @XmlEnumValue("S22")
    S_22("S22"),
    @XmlEnumValue("S23")
    S_23("S23"),
    @XmlEnumValue("P31")
    P_31("P31"),
    @XmlEnumValue("P32")
    P_32("P32"),
    @XmlEnumValue("P33")
    P_33("P33"),
    @XmlEnumValue("SP41")
    SP_41("SP41"),
    @XmlEnumValue("SP42")
    SP_42("SP42"),
    @XmlEnumValue("WKL51")
    WKL_51("WKL51"),
    @XmlEnumValue("K1")
    K_1("K1"),
    @XmlEnumValue("K2")
    K_2("K2"),
    @XmlEnumValue("K3")
    K_3("K3"),
    P("P"),
    W("W");
    private final String value;

    TypOpakowanieType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypOpakowanieType fromValue(String v) {
        for (TypOpakowanieType c: TypOpakowanieType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
