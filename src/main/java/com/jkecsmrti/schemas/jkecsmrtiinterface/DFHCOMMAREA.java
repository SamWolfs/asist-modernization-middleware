
package com.jkecsmrti.schemas.jkecsmrtiinterface;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DFHCOMMAREA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DFHCOMMAREA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jkepcom_principle_data" form="qualified">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="-999999999.99"/>
 *               &lt;maxInclusive value="999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="jkepcom_number_of_years" form="qualified">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="-9999"/>
 *               &lt;maxInclusive value="9999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="jkepcom_quoted_interest_rate" form="qualified">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="-99.999"/>
 *               &lt;maxInclusive value="99.999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DFHCOMMAREA", propOrder = {
    "jkepcomPrincipleData",
    "jkepcomNumberOfYears",
    "jkepcomQuotedInterestRate"
})
public class DFHCOMMAREA {

    @XmlElement(name = "jkepcom_principle_data", required = true)
    protected BigDecimal jkepcomPrincipleData;
    @XmlElement(name = "jkepcom_number_of_years")
    protected short jkepcomNumberOfYears;
    @XmlElement(name = "jkepcom_quoted_interest_rate", required = true)
    protected BigDecimal jkepcomQuotedInterestRate;

    /**
     * Gets the value of the jkepcomPrincipleData property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJkepcomPrincipleData() {
        return jkepcomPrincipleData;
    }

    /**
     * Sets the value of the jkepcomPrincipleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJkepcomPrincipleData(BigDecimal value) {
        this.jkepcomPrincipleData = value;
    }

    /**
     * Gets the value of the jkepcomNumberOfYears property.
     * 
     */
    public short getJkepcomNumberOfYears() {
        return jkepcomNumberOfYears;
    }

    /**
     * Sets the value of the jkepcomNumberOfYears property.
     * 
     */
    public void setJkepcomNumberOfYears(short value) {
        this.jkepcomNumberOfYears = value;
    }

    /**
     * Gets the value of the jkepcomQuotedInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJkepcomQuotedInterestRate() {
        return jkepcomQuotedInterestRate;
    }

    /**
     * Sets the value of the jkepcomQuotedInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJkepcomQuotedInterestRate(BigDecimal value) {
        this.jkepcomQuotedInterestRate = value;
    }

}
