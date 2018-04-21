
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uiszczaOplateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="uiszczaOplateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADAWCA"/>
 *     &lt;enumeration value="ADRESAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "uiszczaOplateType")
@XmlEnum
public enum UiszczaOplateType {

    NADAWCA,
    ADRESAT;

    public String value() {
        return name();
    }

    public static UiszczaOplateType fromValue(String v) {
        return valueOf(v);
    }

}
