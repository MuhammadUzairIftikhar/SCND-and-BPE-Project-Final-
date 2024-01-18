/**
 * TrackingDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface TrackingDetails extends java.rmi.Remote {
    public main.TrackingDetailsObject[] getAllTrackingDetails() throws java.rmi.RemoteException;
    public void createTrackingDetails(main.TrackingDetailsObject order) throws java.rmi.RemoteException;
}
