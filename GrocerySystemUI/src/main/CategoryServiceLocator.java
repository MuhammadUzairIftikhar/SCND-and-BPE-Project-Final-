/**
 * CategoryServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class CategoryServiceLocator extends org.apache.axis.client.Service implements main.CategoryService {

    public CategoryServiceLocator() {
    }


    public CategoryServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CategoryServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Category
    private java.lang.String Category_address = "http://localhost:8080/GrocerySystem/services/Category";

    public java.lang.String getCategoryAddress() {
        return Category_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CategoryWSDDServiceName = "Category";

    public java.lang.String getCategoryWSDDServiceName() {
        return CategoryWSDDServiceName;
    }

    public void setCategoryWSDDServiceName(java.lang.String name) {
        CategoryWSDDServiceName = name;
    }

    public main.Category getCategory() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Category_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCategory(endpoint);
    }

    public main.Category getCategory(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.CategorySoapBindingStub _stub = new main.CategorySoapBindingStub(portAddress, this);
            _stub.setPortName(getCategoryWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCategoryEndpointAddress(java.lang.String address) {
        Category_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Category.class.isAssignableFrom(serviceEndpointInterface)) {
                main.CategorySoapBindingStub _stub = new main.CategorySoapBindingStub(new java.net.URL(Category_address), this);
                _stub.setPortName(getCategoryWSDDServiceName());
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
        if ("Category".equals(inputPortName)) {
            return getCategory();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "CategoryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Category"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Category".equals(portName)) {
            setCategoryEndpointAddress(address);
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
