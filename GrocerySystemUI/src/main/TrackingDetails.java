/**
 * TrackingDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface TrackingDetails extends java.rmi.Remote {
    public java.lang.String getTracking(int trackingNo) throws java.rmi.RemoteException;
    public void createTrackingDetails(int trackingNo, int courierNo) throws java.rmi.RemoteException;
    public int courierNo() throws java.rmi.RemoteException;
    public int getTrackingno() throws java.rmi.RemoteException;
}
