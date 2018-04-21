
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_5KM"/>
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_10KM"/>
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_15KM"/>
 *     &lt;enumeration value="MIEJSKI_DO_3H_POWYZEJ_15KM"/>
 *     &lt;enumeration value="BEZPOSREDNI_DO_20KG"/>
 *     &lt;enumeration value="EKSPRES24"/>
 *     &lt;enumeration value="PACZKA_24"/>
 *     &lt;enumeration value="PACZKA_48"/>
 *     &lt;enumeration value="LIST_ZWYKLY_PRIORYTETOWY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType")
@XmlEnum
public enum SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType {

    @XmlEnumValue("MIEJSKI_DO_3H_DO_5KM")
    MIEJSKI_DO_3_H_DO_5_KM("MIEJSKI_DO_3H_DO_5KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_DO_10KM")
    MIEJSKI_DO_3_H_DO_10_KM("MIEJSKI_DO_3H_DO_10KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_DO_15KM")
    MIEJSKI_DO_3_H_DO_15_KM("MIEJSKI_DO_3H_DO_15KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_POWYZEJ_15KM")
    MIEJSKI_DO_3_H_POWYZEJ_15_KM("MIEJSKI_DO_3H_POWYZEJ_15KM"),
    @XmlEnumValue("BEZPOSREDNI_DO_20KG")
    BEZPOSREDNI_DO_20_KG("BEZPOSREDNI_DO_20KG"),
    @XmlEnumValue("EKSPRES24")
    EKSPRES_24("EKSPRES24"),
    PACZKA_24("PACZKA_24"),
    PACZKA_48("PACZKA_48"),
    LIST_ZWYKLY_PRIORYTETOWY("LIST_ZWYKLY_PRIORYTETOWY");
    private final String value;

    SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType fromValue(String v) {
        for (SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType c: SposobPrzekazaniaPotwierdzeniaOdbioruKurierskaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
