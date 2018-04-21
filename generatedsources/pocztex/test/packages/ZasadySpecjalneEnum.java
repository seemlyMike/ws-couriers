
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zasadySpecjalneEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zasadySpecjalneEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADMINISTRACYJNA"/>
 *     &lt;enumeration value="PODATKOWA"/>
 *     &lt;enumeration value="SADOWA_CYWILNA"/>
 *     &lt;enumeration value="SADOWA_KARNA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "zasadySpecjalneEnum")
@XmlEnum
public enum ZasadySpecjalneEnum {

    ADMINISTRACYJNA,
    PODATKOWA,
    SADOWA_CYWILNA,
    SADOWA_KARNA;

    public String value() {
        return name();
    }

    public static ZasadySpecjalneEnum fromValue(String v) {
        return valueOf(v);
    }

}
