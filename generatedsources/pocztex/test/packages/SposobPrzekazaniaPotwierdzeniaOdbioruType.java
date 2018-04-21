
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sposobPrzekazaniaPotwierdzeniaOdbioruType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sposobPrzekazaniaPotwierdzeniaOdbioruType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_5KM"/>
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_10KM"/>
 *     &lt;enumeration value="MIEJSKI_DO_3H_DO_15KM"/>
 *     &lt;enumeration value="MIEJSKI_DO_3H_POWYZEJ_15KM"/>
 *     &lt;enumeration value="MIEJSKI_DO_4H_DO_10KM"/>
 *     &lt;enumeration value="MIEJSKI_DO_4H_DO_15KM"/>
 *     &lt;enumeration value="MIEJSKI_DO_4H_DO_20KM"/>
 *     &lt;enumeration value="MIEJSKI_DO_4H_DO_30KM"/>
 *     &lt;enumeration value="MIEJSKI_DO_4H_DO_40KM"/>
 *     &lt;enumeration value="EKSPRES24"/>
 *     &lt;enumeration value="LIST_ZWYKLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sposobPrzekazaniaPotwierdzeniaOdbioruType")
@XmlEnum
public enum SposobPrzekazaniaPotwierdzeniaOdbioruType {

    @XmlEnumValue("MIEJSKI_DO_3H_DO_5KM")
    MIEJSKI_DO_3_H_DO_5_KM("MIEJSKI_DO_3H_DO_5KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_DO_10KM")
    MIEJSKI_DO_3_H_DO_10_KM("MIEJSKI_DO_3H_DO_10KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_DO_15KM")
    MIEJSKI_DO_3_H_DO_15_KM("MIEJSKI_DO_3H_DO_15KM"),
    @XmlEnumValue("MIEJSKI_DO_3H_POWYZEJ_15KM")
    MIEJSKI_DO_3_H_POWYZEJ_15_KM("MIEJSKI_DO_3H_POWYZEJ_15KM"),
    @XmlEnumValue("MIEJSKI_DO_4H_DO_10KM")
    MIEJSKI_DO_4_H_DO_10_KM("MIEJSKI_DO_4H_DO_10KM"),
    @XmlEnumValue("MIEJSKI_DO_4H_DO_15KM")
    MIEJSKI_DO_4_H_DO_15_KM("MIEJSKI_DO_4H_DO_15KM"),
    @XmlEnumValue("MIEJSKI_DO_4H_DO_20KM")
    MIEJSKI_DO_4_H_DO_20_KM("MIEJSKI_DO_4H_DO_20KM"),
    @XmlEnumValue("MIEJSKI_DO_4H_DO_30KM")
    MIEJSKI_DO_4_H_DO_30_KM("MIEJSKI_DO_4H_DO_30KM"),
    @XmlEnumValue("MIEJSKI_DO_4H_DO_40KM")
    MIEJSKI_DO_4_H_DO_40_KM("MIEJSKI_DO_4H_DO_40KM"),
    @XmlEnumValue("EKSPRES24")
    EKSPRES_24("EKSPRES24"),
    LIST_ZWYKLY("LIST_ZWYKLY");
    private final String value;

    SposobPrzekazaniaPotwierdzeniaOdbioruType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SposobPrzekazaniaPotwierdzeniaOdbioruType fromValue(String v) {
        for (SposobPrzekazaniaPotwierdzeniaOdbioruType c: SposobPrzekazaniaPotwierdzeniaOdbioruType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
