
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eZwrotTypZgodyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="eZwrotTypZgodyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ZGODA_BRAK"/>
 *     &lt;enumeration value="ZGODA_AUTOMATYCZNA"/>
 *     &lt;enumeration value="ZGODA_INDYWIDUALNA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "eZwrotTypZgodyType")
@XmlEnum
public enum EZwrotTypZgodyType {

    ZGODA_BRAK,
    ZGODA_AUTOMATYCZNA,
    ZGODA_INDYWIDUALNA;

    public String value() {
        return name();
    }

    public static EZwrotTypZgodyType fromValue(String v) {
        return valueOf(v);
    }

}
