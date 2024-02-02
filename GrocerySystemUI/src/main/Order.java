/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface Order extends java.rmi.Remote {
    public main.OrderObject getOrder(int id) throws java.rmi.RemoteException;
    public int generateOrderId() throws java.rmi.RemoteException;
    public void createOrder(main.OrderObject order) throws java.rmi.RemoteException;
}
