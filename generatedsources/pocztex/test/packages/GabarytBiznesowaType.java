
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gabarytBiznesowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gabarytBiznesowaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="XS"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="XL"/>
 *     &lt;enumeration value="XXL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gabarytBiznesowaType")
@XmlEnum
public enum GabarytBiznesowaType {

    XS,
    S,
    M,
    L,
    XL,
    XXL;

    public String value() {
        return name();
    }

    public static GabarytBiznesowaType fromValue(String v) {
        return valueOf(v);
    }

}
