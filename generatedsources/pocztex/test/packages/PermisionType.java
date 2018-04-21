
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permisionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="permisionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MANAGE_USERS"/>
 *     &lt;enumeration value="TRANSMIT"/>
 *     &lt;enumeration value="MANAGE_PROFILES"/>
 *     &lt;enumeration value="MANAGE_ORGANIZATION_UNIT"/>
 *     &lt;enumeration value="MANAGE_TEMPLATES"/>
 *     &lt;enumeration value="EDIT_PARCELS"/>
 *     &lt;enumeration value="EDIT_PARCELS_FROM_TEMPLATES"/>
 *     &lt;enumeration value="MANAGE_ADDRESS_BOOK"/>
 *     &lt;enumeration value="SAVE_SELF_SETTINGS"/>
 *     &lt;enumeration value="MANAGE_DICTIONARIES"/>
 *     &lt;enumeration value="MANAGE_RETURN_DOCUMENTS_ADDRESSES"/>
 *     &lt;enumeration value="VIEW_INVOICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "permisionType")
@XmlEnum
public enum PermisionType {

    MANAGE_USERS,
    TRANSMIT,
    MANAGE_PROFILES,
    MANAGE_ORGANIZATION_UNIT,
    MANAGE_TEMPLATES,
    EDIT_PARCELS,
    EDIT_PARCELS_FROM_TEMPLATES,
    MANAGE_ADDRESS_BOOK,
    SAVE_SELF_SETTINGS,
    MANAGE_DICTIONARIES,
    MANAGE_RETURN_DOCUMENTS_ADDRESSES,
    VIEW_INVOICE;

    public String value() {
        return name();
    }

    public static PermisionType fromValue(String v) {
        return valueOf(v);
    }

}
