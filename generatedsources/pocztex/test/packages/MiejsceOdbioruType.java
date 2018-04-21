
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for miejsceOdbioruType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="miejsceOdbioruType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NADAWCA"/>
 *     &lt;enumeration value="URZAD_NADANIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "miejsceOdbioruType")
@XmlEnum
public enum MiejsceOdbioruType {

    NADAWCA,
    URZAD_NADANIA;

    public String value() {
        return name();
    }

    public static MiejsceOdbioruType fromValue(String v) {
        return valueOf(v);
    }

}
