/**
 * CustomerObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class CustomerObject  implements java.io.Serializable {
    private int customerID;

    private java.lang.String cuspassword;

    private java.lang.String customerName;

    private java.lang.String customerAddress;

    public CustomerObject() {
    }

    public CustomerObject(
           int customerID,
           java.lang.String cuspassword,
           java.lang.String customerName,
           java.lang.String customerAddress) {
           this.customerID = customerID;
           this.cuspassword = cuspassword;
           this.customerName = customerName;
           this.customerAddress = customerAddress;
    }


    /**
     * Gets the customerID value for this CustomerObject.
     * 
     * @return customerID
     */
    public int getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this CustomerObject.
     * 
     * @param customerID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }


    /**
     * Gets the cuspassword value for this CustomerObject.
     * 
     * @return cuspassword
     */
    public java.lang.String getCuspassword() {
        return cuspassword;
    }


    /**
     * Sets the cuspassword value for this CustomerObject.
     * 
     * @param cuspassword
     */
    public void setCuspassword(java.lang.String cuspassword) {
        this.cuspassword = cuspassword;
    }


    /**
     * Gets the customerName value for this CustomerObject.
     * 
     * @return customerName
     */
    public java.lang.String getCustomerName() {
        return customerName;
    }


    /**
     * Sets the customerName value for this CustomerObject.
     * 
     * @param customerName
     */
    public void setCustomerName(java.lang.String customerName) {
        this.customerName = customerName;
    }


    /**
     * Gets the customerAddress value for this CustomerObject.
     * 
     * @return customerAddress
     */
    public java.lang.String getCustomerAddress() {
        return customerAddress;
    }


    /**
     * Sets the customerAddress value for this CustomerObject.
     * 
     * @param customerAddress
     */
    public void setCustomerAddress(java.lang.String customerAddress) {
        this.customerAddress = customerAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerObject)) return false;
        CustomerObject other = (CustomerObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.customerID == other.getCustomerID() &&
            ((this.cuspassword==null && other.getCuspassword()==null) || 
             (this.cuspassword!=null &&
              this.cuspassword.equals(other.getCuspassword()))) &&
            ((this.customerName==null && other.getCustomerName()==null) || 
             (this.customerName!=null &&
              this.customerName.equals(other.getCustomerName()))) &&
            ((this.customerAddress==null && other.getCustomerAddress()==null) || 
             (this.customerAddress!=null &&
              this.customerAddress.equals(other.getCustomerAddress())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCustomerID();
        if (getCuspassword() != null) {
            _hashCode += getCuspassword().hashCode();
        }
        if (getCustomerName() != null) {
            _hashCode += getCustomerName().hashCode();
        }
        if (getCustomerAddress() != null) {
            _hashCode += getCustomerAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://main", "CustomerObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "CustomerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuspassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "cuspassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "CustomerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "CustomerAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
