
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusAccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WYLACZONY"/>
 *     &lt;enumeration value="ZABLOKOWANY"/>
 *     &lt;enumeration value="ODBLOKOWANY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusAccountType")
@XmlEnum
public enum StatusAccountType {

    WYLACZONY,
    ZABLOKOWANY,
    ODBLOKOWANY;

    public String value() {
        return name();
    }

    public static StatusAccountType fromValue(String v) {
        return valueOf(v);
    }

}
