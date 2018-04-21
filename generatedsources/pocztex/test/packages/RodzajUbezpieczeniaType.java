
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rodzajUbezpieczeniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rodzajUbezpieczeniaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="PRECJOZA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rodzajUbezpieczeniaType")
@XmlEnum
public enum RodzajUbezpieczeniaType {

    STANDARD,
    PRECJOZA;

    public String value() {
        return name();
    }

    public static RodzajUbezpieczeniaType fromValue(String v) {
        return valueOf(v);
    }

}
