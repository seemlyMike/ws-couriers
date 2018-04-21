
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serwisNierejestrowanaZNumeremType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="serwisNierejestrowanaZNumeremType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NIEREJESTROWANA"/>
 *     &lt;enumeration value="HANDLOWA"/>
 *     &lt;enumeration value="LIST_BIZNESOWY"/>
 *     &lt;enumeration value="MARKETINGOWA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serwisNierejestrowanaZNumeremType")
@XmlEnum
public enum SerwisNierejestrowanaZNumeremType {

    NIEREJESTROWANA,
    HANDLOWA,
    LIST_BIZNESOWY,
    MARKETINGOWA;

    public String value() {
        return name();
    }

    public static SerwisNierejestrowanaZNumeremType fromValue(String v) {
        return valueOf(v);
    }

}
