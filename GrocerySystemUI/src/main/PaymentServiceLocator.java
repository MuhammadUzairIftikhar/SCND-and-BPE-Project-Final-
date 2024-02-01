/**
 * PaymentServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class PaymentServiceLocator extends org.apache.axis.client.Service implements main.PaymentService {

    public PaymentServiceLocator() {
    }


    public PaymentServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PaymentServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Payment
    private java.lang.String Payment_address = "http://localhost:8080/GrocerySystem/services/Payment";

    public java.lang.String getPaymentAddress() {
        return Payment_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PaymentWSDDServiceName = "Payment";

    public java.lang.String getPaymentWSDDServiceName() {
        return PaymentWSDDServiceName;
    }

    public void setPaymentWSDDServiceName(java.lang.String name) {
        PaymentWSDDServiceName = name;
    }

    public main.Payment getPayment() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Payment_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPayment(endpoint);
    }

    public main.Payment getPayment(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.PaymentSoapBindingStub _stub = new main.PaymentSoapBindingStub(portAddress, this);
            _stub.setPortName(getPaymentWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPaymentEndpointAddress(java.lang.String address) {
        Payment_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Payment.class.isAssignableFrom(serviceEndpointInterface)) {
                main.PaymentSoapBindingStub _stub = new main.PaymentSoapBindingStub(new java.net.URL(Payment_address), this);
                _stub.setPortName(getPaymentWSDDServiceName());
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
        if ("Payment".equals(inputPortName)) {
            return getPayment();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "PaymentService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Payment"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Payment".equals(portName)) {
            setPaymentEndpointAddress(address);
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
