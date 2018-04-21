
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for czynnoscUpustowaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="czynnoscUpustowaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POSORTOWANA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "czynnoscUpustowaType")
@XmlEnum
public enum CzynnoscUpustowaType {

    POSORTOWANA;

    public String value() {
        return name();
    }

    public static CzynnoscUpustowaType fromValue(String v) {
        return valueOf(v);
    }

}
