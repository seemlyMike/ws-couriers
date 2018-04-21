
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kategoriaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="kategoriaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EKONOMICZNA"/>
 *     &lt;enumeration value="PRIORYTETOWA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "kategoriaType")
@XmlEnum
public enum KategoriaType {

    EKONOMICZNA,
    PRIORYTETOWA;

    public String value() {
        return name();
    }

    public static KategoriaType fromValue(String v) {
        return valueOf(v);
    }

}
