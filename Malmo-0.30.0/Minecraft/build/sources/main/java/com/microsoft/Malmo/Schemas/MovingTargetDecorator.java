//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.11 at 01:22:48 PM PDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ArenaBounds" type="{http://ProjectMalmo.microsoft.com}UnnamedGridDefinition"/>
 *         &lt;element name="StartPos" type="{http://ProjectMalmo.microsoft.com}Pos"/>
 *         &lt;element name="Seed">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="random|[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UpdateSpeed">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="turnbased|[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PermeableBlocks" type="{http://ProjectMalmo.microsoft.com}BlockSpec"/>
 *         &lt;element name="BlockType" type="{http://ProjectMalmo.microsoft.com}DrawBlockBasedObjectType"/>
 *       &lt;/all>
 *       &lt;attribute name="requiresAirAbove" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "MovingTargetDecorator")
public class MovingTargetDecorator {

    @XmlElement(name = "ArenaBounds", required = true)
    protected UnnamedGridDefinition arenaBounds;
    @XmlElement(name = "StartPos", required = true)
    protected Pos startPos;
    @XmlElement(name = "Seed", required = true)
    protected String seed;
    @XmlElement(name = "UpdateSpeed", required = true)
    protected String updateSpeed;
    @XmlElement(name = "PermeableBlocks", required = true)
    protected BlockSpec permeableBlocks;
    @XmlElement(name = "BlockType", required = true)
    protected DrawBlockBasedObjectType blockType;
    @XmlAttribute(name = "requiresAirAbove")
    protected Boolean requiresAirAbove;

    /**
     * Gets the value of the arenaBounds property.
     * 
     * @return
     *     possible object is
     *     {@link UnnamedGridDefinition }
     *     
     */
    public UnnamedGridDefinition getArenaBounds() {
        return arenaBounds;
    }

    /**
     * Sets the value of the arenaBounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnnamedGridDefinition }
     *     
     */
    public void setArenaBounds(UnnamedGridDefinition value) {
        this.arenaBounds = value;
    }

    /**
     * Gets the value of the startPos property.
     * 
     * @return
     *     possible object is
     *     {@link Pos }
     *     
     */
    public Pos getStartPos() {
        return startPos;
    }

    /**
     * Sets the value of the startPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pos }
     *     
     */
    public void setStartPos(Pos value) {
        this.startPos = value;
    }

    /**
     * Gets the value of the seed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeed() {
        return seed;
    }

    /**
     * Sets the value of the seed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeed(String value) {
        this.seed = value;
    }

    /**
     * Gets the value of the updateSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateSpeed() {
        return updateSpeed;
    }

    /**
     * Sets the value of the updateSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateSpeed(String value) {
        this.updateSpeed = value;
    }

    /**
     * Gets the value of the permeableBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link BlockSpec }
     *     
     */
    public BlockSpec getPermeableBlocks() {
        return permeableBlocks;
    }

    /**
     * Sets the value of the permeableBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockSpec }
     *     
     */
    public void setPermeableBlocks(BlockSpec value) {
        this.permeableBlocks = value;
    }

    /**
     * Gets the value of the blockType property.
     * 
     * @return
     *     possible object is
     *     {@link DrawBlockBasedObjectType }
     *     
     */
    public DrawBlockBasedObjectType getBlockType() {
        return blockType;
    }

    /**
     * Sets the value of the blockType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrawBlockBasedObjectType }
     *     
     */
    public void setBlockType(DrawBlockBasedObjectType value) {
        this.blockType = value;
    }

    /**
     * Gets the value of the requiresAirAbove property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRequiresAirAbove() {
        if (requiresAirAbove == null) {
            return true;
        } else {
            return requiresAirAbove;
        }
    }

    /**
     * Sets the value of the requiresAirAbove property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresAirAbove(Boolean value) {
        this.requiresAirAbove = value;
    }

}