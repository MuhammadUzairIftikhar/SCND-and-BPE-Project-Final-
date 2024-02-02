/**
 * TrackingDetailsObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class TrackingDetailsObject  implements java.io.Serializable {
    private int trackingNo;

    private int courierNo;

    public TrackingDetailsObject() {
    }

    public TrackingDetailsObject(
           int trackingNo,
           int courierNo) {
           this.trackingNo = trackingNo;
           this.courierNo = courierNo;
    }


    /**
     * Gets the trackingNo value for this TrackingDetailsObject.
     * 
     * @return trackingNo
     */
    public int getTrackingNo() {
        return trackingNo;
    }


    /**
     * Sets the trackingNo value for this TrackingDetailsObject.
     * 
     * @param trackingNo
     */
    public void setTrackingNo(int trackingNo) {
        this.trackingNo = trackingNo;
    }


    /**
     * Gets the courierNo value for this TrackingDetailsObject.
     * 
     * @return courierNo
     */
    public int getCourierNo() {
        return courierNo;
    }


    /**
     * Sets the courierNo value for this TrackingDetailsObject.
     * 
     * @param courierNo
     */
    public void setCourierNo(int courierNo) {
        this.courierNo = courierNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackingDetailsObject)) return false;
        TrackingDetailsObject other = (TrackingDetailsObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.trackingNo == other.getTrackingNo() &&
            this.courierNo == other.getCourierNo();
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
        _hashCode += getTrackingNo();
        _hashCode += getCourierNo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrackingDetailsObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://main", "TrackingDetailsObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "TrackingNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courierNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "courierNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
