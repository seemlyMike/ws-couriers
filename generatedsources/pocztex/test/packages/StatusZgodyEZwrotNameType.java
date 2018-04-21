
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusZgodyEZwrotNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusZgodyEZwrotNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOWY"/>
 *     &lt;enumeration value="ZAAKCEPTOWANY"/>
 *     &lt;enumeration value="ODRZUCONY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusZgodyEZwrotNameType")
@XmlEnum
public enum StatusZgodyEZwrotNameType {

    NOWY,
    ZAAKCEPTOWANY,
    ODRZUCONY;

    public String value() {
        return name();
    }

    public static StatusZgodyEZwrotNameType fromValue(String v) {
        return valueOf(v);
    }

}
