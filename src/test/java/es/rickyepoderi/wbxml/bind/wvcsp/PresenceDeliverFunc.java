//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.25 at 05:48:09 PM CEST 
//


package es.rickyepoderi.wbxml.bind.wvcsp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getpr",
    "updpr"
})
@XmlRootElement(name = "PresenceDeliverFunc")
public class PresenceDeliverFunc {

    @XmlElement(name = "GETPR")
    protected GETPR getpr;
    @XmlElement(name = "UPDPR")
    protected UPDPR updpr;

    /**
     * Gets the value of the getpr property.
     * 
     * @return
     *     possible object is
     *     {@link GETPR }
     *     
     */
    public GETPR getGETPR() {
        return getpr;
    }

    /**
     * Sets the value of the getpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GETPR }
     *     
     */
    public void setGETPR(GETPR value) {
        this.getpr = value;
    }

    /**
     * Gets the value of the updpr property.
     * 
     * @return
     *     possible object is
     *     {@link UPDPR }
     *     
     */
    public UPDPR getUPDPR() {
        return updpr;
    }

    /**
     * Sets the value of the updpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UPDPR }
     *     
     */
    public void setUPDPR(UPDPR value) {
        this.updpr = value;
    }

}
