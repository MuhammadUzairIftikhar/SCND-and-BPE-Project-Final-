/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface Customer extends java.rmi.Remote {
    public boolean signIn(java.lang.String customerName, java.lang.String cuspassword) throws java.rmi.RemoteException;
    public main.CustomerObject[] getAllCustomers() throws java.rmi.RemoteException;
    public void signUp(java.lang.String customerName, java.lang.String customerAddress, java.lang.String cuspassword) throws java.rmi.RemoteException;
}
