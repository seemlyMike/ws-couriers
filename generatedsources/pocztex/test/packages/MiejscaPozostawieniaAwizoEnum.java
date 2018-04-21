
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for miejscaPozostawieniaAwizoEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="miejscaPozostawieniaAwizoEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SKRZYNKA_ODDAWCZA"/>
 *     &lt;enumeration value="DRZWI_MIESZKANIA"/>
 *     &lt;enumeration value="DRZWI_INNEGO_POMIESZCZENIA"/>
 *     &lt;enumeration value="PRZY_WEJSCIU_NA_POSESJE"/>
 *     &lt;enumeration value="SKRYTKA_POCZTOWA"/>
 *     &lt;enumeration value="INNE_WIDOCZNE_MIEJSCE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "miejscaPozostawieniaAwizoEnum")
@XmlEnum
public enum MiejscaPozostawieniaAwizoEnum {

    SKRZYNKA_ODDAWCZA,
    DRZWI_MIESZKANIA,
    DRZWI_INNEGO_POMIESZCZENIA,
    PRZY_WEJSCIU_NA_POSESJE,
    SKRYTKA_POCZTOWA,
    INNE_WIDOCZNE_MIEJSCE;

    public String value() {
        return name();
    }

    public static MiejscaPozostawieniaAwizoEnum fromValue(String v) {
        return valueOf(v);
    }

}
