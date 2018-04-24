
package giszhkh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Импорт ОП
 * 
 * <p>Java class for SubsidiaryImportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubsidiaryImportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CreateSubsidiary"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://smev.gosuslugi.ru/rev120315}SubsidiaryType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}orgVersionGUID"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UpdateSubsidiary"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}orgVersionGUID"/&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}INN" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://smev.gosuslugi.ru/rev120315}OKOPF" minOccurs="0"/&gt;
 *                   &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FIASHouseGuid" type="{http://smev.gosuslugi.ru/rev120315}FIASHouseGUIDType" minOccurs="0"/&gt;
 *                   &lt;element name="ActivityEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidiaryImportType", propOrder = {
    "createSubsidiary",
    "updateSubsidiary"
})
public class SubsidiaryImportType {

    @XmlElement(name = "CreateSubsidiary")
    protected SubsidiaryImportType.CreateSubsidiary createSubsidiary;
    @XmlElement(name = "UpdateSubsidiary")
    protected SubsidiaryImportType.UpdateSubsidiary updateSubsidiary;

    /**
     * Gets the value of the createSubsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryImportType.CreateSubsidiary }
     *     
     */
    public SubsidiaryImportType.CreateSubsidiary getCreateSubsidiary() {
        return createSubsidiary;
    }

    /**
     * Sets the value of the createSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryImportType.CreateSubsidiary }
     *     
     */
    public void setCreateSubsidiary(SubsidiaryImportType.CreateSubsidiary value) {
        this.createSubsidiary = value;
    }

    /**
     * Gets the value of the updateSubsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryImportType.UpdateSubsidiary }
     *     
     */
    public SubsidiaryImportType.UpdateSubsidiary getUpdateSubsidiary() {
        return updateSubsidiary;
    }

    /**
     * Sets the value of the updateSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryImportType.UpdateSubsidiary }
     *     
     */
    public void setUpdateSubsidiary(SubsidiaryImportType.UpdateSubsidiary value) {
        this.updateSubsidiary = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://smev.gosuslugi.ru/rev120315}SubsidiaryType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}orgVersionGUID"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orgVersionGUID"
    })
    public static class CreateSubsidiary
        extends SubsidiaryType
    {

        @XmlElement(required = true)
        protected String orgVersionGUID;

        /**
         * Идентификатор головной организации версии записи в реестре организаций
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgVersionGUID() {
            return orgVersionGUID;
        }

        /**
         * Sets the value of the orgVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgVersionGUID(String value) {
            this.orgVersionGUID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}orgVersionGUID"/&gt;
     *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}INN" minOccurs="0"/&gt;
     *         &lt;element ref="{http://smev.gosuslugi.ru/rev120315}OKOPF" minOccurs="0"/&gt;
     *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FIASHouseGuid" type="{http://smev.gosuslugi.ru/rev120315}FIASHouseGUIDType" minOccurs="0"/&gt;
     *         &lt;element name="ActivityEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orgVersionGUID",
        "inn",
        "okopf",
        "address",
        "fiasHouseGuid",
        "activityEndDate"
    })
    public static class UpdateSubsidiary {

        @XmlElement(required = true)
        protected String orgVersionGUID;
        @XmlElement(name = "INN")
        protected String inn;
        @XmlElement(name = "OKOPF")
        protected String okopf;
        @XmlElement(name = "Address")
        protected String address;
        @XmlElement(name = "FIASHouseGuid")
        protected String fiasHouseGuid;
        @XmlElement(name = "ActivityEndDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar activityEndDate;

        /**
         * Gets the value of the orgVersionGUID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgVersionGUID() {
            return orgVersionGUID;
        }

        /**
         * Sets the value of the orgVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrgVersionGUID(String value) {
            this.orgVersionGUID = value;
        }

        /**
         * Gets the value of the inn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
            return inn;
        }

        /**
         * Sets the value of the inn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINN(String value) {
            this.inn = value;
        }

        /**
         * Gets the value of the okopf property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOKOPF() {
            return okopf;
        }

        /**
         * Sets the value of the okopf property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOKOPF(String value) {
            this.okopf = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * Gets the value of the fiasHouseGuid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIASHouseGuid() {
            return fiasHouseGuid;
        }

        /**
         * Sets the value of the fiasHouseGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFIASHouseGuid(String value) {
            this.fiasHouseGuid = value;
        }

        /**
         * Gets the value of the activityEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getActivityEndDate() {
            return activityEndDate;
        }

        /**
         * Sets the value of the activityEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setActivityEndDate(XMLGregorianCalendar value) {
            this.activityEndDate = value;
        }

    }

}
