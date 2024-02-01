/**
 * Paymentobject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Paymentobject  implements java.io.Serializable {
    private int paymentID;

    private int customerID;

    private java.lang.String paymentMethod;

    public Paymentobject() {
    }

    public Paymentobject(
           int paymentID,
           int customerID,
           java.lang.String paymentMethod) {
           this.paymentID = paymentID;
           this.customerID = customerID;
           this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the paymentID value for this Paymentobject.
     * 
     * @return paymentID
     */
    public int getPaymentID() {
        return paymentID;
    }


    /**
     * Sets the paymentID value for this Paymentobject.
     * 
     * @param paymentID
     */
    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }


    /**
     * Gets the customerID value for this Paymentobject.
     * 
     * @return customerID
     */
    public int getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this Paymentobject.
     * 
     * @param customerID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }


    /**
     * Gets the paymentMethod value for this Paymentobject.
     * 
     * @return paymentMethod
     */
    public java.lang.String getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this Paymentobject.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(java.lang.String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Paymentobject)) return false;
        Paymentobject other = (Paymentobject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.paymentID == other.getPaymentID() &&
            this.customerID == other.getCustomerID() &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod())));
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
        _hashCode += getPaymentID();
        _hashCode += getCustomerID();
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Paymentobject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://main", "Paymentobject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "PaymentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "customerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "PaymentMethod"));
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
