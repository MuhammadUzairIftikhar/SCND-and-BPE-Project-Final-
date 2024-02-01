/**
 * SupplierObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class SupplierObject  implements java.io.Serializable {
    private int supplierID;

    private java.lang.String supplierName;

    private java.lang.String supplierAddress;

    public SupplierObject() {
    }

    public SupplierObject(
           int supplierID,
           java.lang.String supplierName,
           java.lang.String supplierAddress) {
           this.supplierID = supplierID;
           this.supplierName = supplierName;
           this.supplierAddress = supplierAddress;
    }


    /**
     * Gets the supplierID value for this SupplierObject.
     * 
     * @return supplierID
     */
    public int getSupplierID() {
        return supplierID;
    }


    /**
     * Sets the supplierID value for this SupplierObject.
     * 
     * @param supplierID
     */
    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }


    /**
     * Gets the supplierName value for this SupplierObject.
     * 
     * @return supplierName
     */
    public java.lang.String getSupplierName() {
        return supplierName;
    }


    /**
     * Sets the supplierName value for this SupplierObject.
     * 
     * @param supplierName
     */
    public void setSupplierName(java.lang.String supplierName) {
        this.supplierName = supplierName;
    }


    /**
     * Gets the supplierAddress value for this SupplierObject.
     * 
     * @return supplierAddress
     */
    public java.lang.String getSupplierAddress() {
        return supplierAddress;
    }


    /**
     * Sets the supplierAddress value for this SupplierObject.
     * 
     * @param supplierAddress
     */
    public void setSupplierAddress(java.lang.String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplierObject)) return false;
        SupplierObject other = (SupplierObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.supplierID == other.getSupplierID() &&
            ((this.supplierName==null && other.getSupplierName()==null) || 
             (this.supplierName!=null &&
              this.supplierName.equals(other.getSupplierName()))) &&
            ((this.supplierAddress==null && other.getSupplierAddress()==null) || 
             (this.supplierAddress!=null &&
              this.supplierAddress.equals(other.getSupplierAddress())));
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
        _hashCode += getSupplierID();
        if (getSupplierName() != null) {
            _hashCode += getSupplierName().hashCode();
        }
        if (getSupplierAddress() != null) {
            _hashCode += getSupplierAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupplierObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://main", "SupplierObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "SupplierID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "SupplierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "SupplierAddress"));
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
