package main;

public class PaymentProxy implements main.Payment {
  private String _endpoint = null;
  private main.Payment payment = null;
  
  public PaymentProxy() {
    _initPaymentProxy();
  }
  
  public PaymentProxy(String endpoint) {
    _endpoint = endpoint;
    _initPaymentProxy();
  }
  
  private void _initPaymentProxy() {
    try {
      payment = (new main.PaymentServiceLocator()).getPayment();
      if (payment != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)payment)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)payment)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (payment != null)
      ((javax.xml.rpc.Stub)payment)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Payment getPayment() {
    if (payment == null)
      _initPaymentProxy();
    return payment;
  }
  
  public main.Paymentobject[] getAllPayment() throws java.rmi.RemoteException{
    if (payment == null)
      _initPaymentProxy();
    return payment.getAllPayment();
  }
  
  
}