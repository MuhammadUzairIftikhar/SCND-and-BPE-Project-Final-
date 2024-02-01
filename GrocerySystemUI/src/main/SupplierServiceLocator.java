/**
 * SupplierServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class SupplierServiceLocator extends org.apache.axis.client.Service implements main.SupplierService {

    public SupplierServiceLocator() {
    }


    public SupplierServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SupplierServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Supplier
    private java.lang.String Supplier_address = "http://localhost:8080/GrocerySystem/services/Supplier";

    public java.lang.String getSupplierAddress() {
        return Supplier_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SupplierWSDDServiceName = "Supplier";

    public java.lang.String getSupplierWSDDServiceName() {
        return SupplierWSDDServiceName;
    }

    public void setSupplierWSDDServiceName(java.lang.String name) {
        SupplierWSDDServiceName = name;
    }

    public main.Supplier getSupplier() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Supplier_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSupplier(endpoint);
    }

    public main.Supplier getSupplier(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.SupplierSoapBindingStub _stub = new main.SupplierSoapBindingStub(portAddress, this);
            _stub.setPortName(getSupplierWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSupplierEndpointAddress(java.lang.String address) {
        Supplier_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Supplier.class.isAssignableFrom(serviceEndpointInterface)) {
                main.SupplierSoapBindingStub _stub = new main.SupplierSoapBindingStub(new java.net.URL(Supplier_address), this);
                _stub.setPortName(getSupplierWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Supplier".equals(inputPortName)) {
            return getSupplier();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "SupplierService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Supplier"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Supplier".equals(portName)) {
            setSupplierEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
