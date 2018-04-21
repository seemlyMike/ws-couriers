
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NIEPOTWIERDZONA"/>
 *     &lt;enumeration value="POTWIERDZONA"/>
 *     &lt;enumeration value="NOWA"/>
 *     &lt;enumeration value="BRAK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusType")
@XmlEnum
public enum StatusType {

    NIEPOTWIERDZONA,
    POTWIERDZONA,
    NOWA,
    BRAK;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
