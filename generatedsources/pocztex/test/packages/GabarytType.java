
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gabarytType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gabarytType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GABARYT_A"/>
 *     &lt;enumeration value="GABARYT_B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gabarytType")
@XmlEnum
public enum GabarytType {

    GABARYT_A,
    GABARYT_B;

    public String value() {
        return name();
    }

    public static GabarytType fromValue(String v) {
        return valueOf(v);
    }

}
