/**
 * TrackingDetailsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class TrackingDetailsServiceLocator extends org.apache.axis.client.Service implements main.TrackingDetailsService {

    public TrackingDetailsServiceLocator() {
    }


    public TrackingDetailsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TrackingDetailsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for trackingDetails
    private java.lang.String trackingDetails_address = "http://localhost:8080/GrocerySystem/services/trackingDetails";

    public java.lang.String gettrackingDetailsAddress() {
        return trackingDetails_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String trackingDetailsWSDDServiceName = "trackingDetails";

    public java.lang.String gettrackingDetailsWSDDServiceName() {
        return trackingDetailsWSDDServiceName;
    }

    public void settrackingDetailsWSDDServiceName(java.lang.String name) {
        trackingDetailsWSDDServiceName = name;
    }

    public main.TrackingDetails gettrackingDetails() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(trackingDetails_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return gettrackingDetails(endpoint);
    }

    public main.TrackingDetails gettrackingDetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.TrackingDetailsSoapBindingStub _stub = new main.TrackingDetailsSoapBindingStub(portAddress, this);
            _stub.setPortName(gettrackingDetailsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void settrackingDetailsEndpointAddress(java.lang.String address) {
        trackingDetails_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.TrackingDetails.class.isAssignableFrom(serviceEndpointInterface)) {
                main.TrackingDetailsSoapBindingStub _stub = new main.TrackingDetailsSoapBindingStub(new java.net.URL(trackingDetails_address), this);
                _stub.setPortName(gettrackingDetailsWSDDServiceName());
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
        if ("trackingDetails".equals(inputPortName)) {
            return gettrackingDetails();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "trackingDetailsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "trackingDetails"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("trackingDetails".equals(portName)) {
            settrackingDetailsEndpointAddress(address);
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
