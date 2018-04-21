
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rozstrzygniecieType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rozstrzygniecieType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UZASADNIONA"/>
 *     &lt;enumeration value="NIEUZASADNIONA"/>
 *     &lt;enumeration value="NIEWNIESIONA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rozstrzygniecieType")
@XmlEnum
public enum RozstrzygniecieType {

    UZASADNIONA,
    NIEUZASADNIONA,
    NIEWNIESIONA;

    public String value() {
        return name();
    }

    public static RozstrzygniecieType fromValue(String v) {
        return valueOf(v);
    }

}
