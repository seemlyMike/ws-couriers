
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusEPOEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusEPOEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="NADANIE"/>
 *     &lt;enumeration value="W_TRANSPORCIE"/>
 *     &lt;enumeration value="CLO"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="W_DORECZENIU"/>
 *     &lt;enumeration value="AWIZO"/>
 *     &lt;enumeration value="PONOWNE_AWIZO"/>
 *     &lt;enumeration value="ZWROT"/>
 *     &lt;enumeration value="DORECZONA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusEPOEnum")
@XmlEnum
public enum StatusEPOEnum {

    ERROR,
    NADANIE,
    W_TRANSPORCIE,
    CLO,
    SMS,
    W_DORECZENIU,
    AWIZO,
    PONOWNE_AWIZO,
    ZWROT,
    DORECZONA;

    public String value() {
        return name();
    }

    public static StatusEPOEnum fromValue(String v) {
        return valueOf(v);
    }

}
