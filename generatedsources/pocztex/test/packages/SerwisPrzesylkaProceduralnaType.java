
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serwisPrzesylkaProceduralnaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serwisPrzesylkaProceduralnaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROCEDURALNA_STANDARD_DWA_STOPNIE"/>
 *     &lt;enumeration value="PROCEDURALNA_VIP_DWA_STOPNIE"/>
 *     &lt;enumeration value="PROCEDURALNA_STANDARD_TRZY_STOPNIE"/>
 *     &lt;enumeration value="PROCEDURALNA_VIP_TRZY_STOPNIE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serwisPrzesylkaProceduralnaType")
@XmlEnum
public enum SerwisPrzesylkaProceduralnaType {

    PROCEDURALNA_STANDARD_DWA_STOPNIE,
    PROCEDURALNA_VIP_DWA_STOPNIE,
    PROCEDURALNA_STANDARD_TRZY_STOPNIE,
    PROCEDURALNA_VIP_TRZY_STOPNIE;

    public String value() {
        return name();
    }

    public static SerwisPrzesylkaProceduralnaType fromValue(String v) {
        return valueOf(v);
    }

}
