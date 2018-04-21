
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rodzajPrzypisaniaDoJednostkiEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rodzajPrzypisaniaDoJednostkiEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RAPORTOWANIE"/>
 *     &lt;enumeration value="NADAWANIE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rodzajPrzypisaniaDoJednostkiEnum")
@XmlEnum
public enum RodzajPrzypisaniaDoJednostkiEnum {

    RAPORTOWANIE,
    NADAWANIE;

    public String value() {
        return name();
    }

    public static RodzajPrzypisaniaDoJednostkiEnum fromValue(String v) {
        return valueOf(v);
    }

}
