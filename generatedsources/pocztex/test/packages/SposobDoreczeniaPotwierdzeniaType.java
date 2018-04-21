
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sposobDoreczeniaPotwierdzeniaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sposobDoreczeniaPotwierdzeniaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TELEFON"/>
 *     &lt;enumeration value="TELEFAX"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="EMAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sposobDoreczeniaPotwierdzeniaType")
@XmlEnum
public enum SposobDoreczeniaPotwierdzeniaType {

    TELEFON,
    TELEFAX,
    SMS,
    EMAIL;

    public String value() {
        return name();
    }

    public static SposobDoreczeniaPotwierdzeniaType fromValue(String v) {
        return valueOf(v);
    }

}
