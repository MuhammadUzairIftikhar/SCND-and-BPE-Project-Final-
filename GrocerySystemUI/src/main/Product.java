/**
 * Product.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface Product extends java.rmi.Remote {
    public boolean checkProductAvailability(java.lang.String productName) throws java.rmi.RemoteException;
    public main.ProductObject[] getAllProduct() throws java.rmi.RemoteException;
}
