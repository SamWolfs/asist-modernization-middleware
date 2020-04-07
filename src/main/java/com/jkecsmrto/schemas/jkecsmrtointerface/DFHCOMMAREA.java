
package com.jkecsmrto.schemas.jkecsmrtointerface;

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
 *         &lt;element name="jkepcom_return_month_payment" form="qualified">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="-9999999.99"/>
 *               &lt;maxInclusive value="9999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="jkepcom_errmsg" form="qualified">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *               &lt;whiteSpace value="collapse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="jkepcom_program_retcode" form="qualified">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999"/>
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
    "jkepcomReturnMonthPayment",
    "jkepcomErrmsg",
    "jkepcomProgramRetcode"
})
public class DFHCOMMAREA {

    @XmlElement(name = "jkepcom_return_month_payment", required = true)
    protected BigDecimal jkepcomReturnMonthPayment;
    @XmlElement(name = "jkepcom_errmsg", required = true)
    protected String jkepcomErrmsg;
    @XmlElement(name = "jkepcom_program_retcode")
    protected short jkepcomProgramRetcode;

    /**
     * Gets the value of the jkepcomReturnMonthPayment property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getJkepcomReturnMonthPayment() {
        return jkepcomReturnMonthPayment;
    }

    /**
     * Sets the value of the jkepcomReturnMonthPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setJkepcomReturnMonthPayment(BigDecimal value) {
        this.jkepcomReturnMonthPayment = value;
    }

    /**
     * Gets the value of the jkepcomErrmsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJkepcomErrmsg() {
        return jkepcomErrmsg;
    }

    /**
     * Sets the value of the jkepcomErrmsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJkepcomErrmsg(String value) {
        this.jkepcomErrmsg = value;
    }

    /**
     * Gets the value of the jkepcomProgramRetcode property.
     * 
     */
    public short getJkepcomProgramRetcode() {
        return jkepcomProgramRetcode;
    }

    /**
     * Sets the value of the jkepcomProgramRetcode property.
     * 
     */
    public void setJkepcomProgramRetcode(short value) {
        this.jkepcomProgramRetcode = value;
    }

}
