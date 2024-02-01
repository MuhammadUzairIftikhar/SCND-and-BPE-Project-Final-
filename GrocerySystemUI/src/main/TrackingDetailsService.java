/**
 * TrackingDetailsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface TrackingDetailsService extends javax.xml.rpc.Service {
    public java.lang.String getTrackingDetailsAddress();

    public main.TrackingDetails getTrackingDetails() throws javax.xml.rpc.ServiceException;

    public main.TrackingDetails getTrackingDetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
