
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rodzajPaletyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rodzajPaletyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="POLPALETA"/>
 *     &lt;enumeration value="INNA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rodzajPaletyType")
@XmlEnum
public enum RodzajPaletyType {

    EUR,
    POLPALETA,
    INNA;

    public String value() {
        return name();
    }

    public static RodzajPaletyType fromValue(String v) {
        return valueOf(v);
    }

}
