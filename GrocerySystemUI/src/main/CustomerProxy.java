package main;

public class CustomerProxy implements main.Customer {
  private String _endpoint = null;
  private main.Customer customer = null;
  
  public CustomerProxy() {
    _initCustomerProxy();
  }
  
  public CustomerProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerProxy();
  }
  
  private void _initCustomerProxy() {
    try {
      customer = (new main.CustomerServiceLocator()).getCustomer();
      if (customer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customer != null)
      ((javax.xml.rpc.Stub)customer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Customer getCustomer() {
    if (customer == null)
      _initCustomerProxy();
    return customer;
  }
  
  public boolean signIn(java.lang.String customerName, java.lang.String cuspassword) throws java.rmi.RemoteException{
    if (customer == null)
      _initCustomerProxy();
    return customer.signIn(customerName, cuspassword);
  }
  
  public main.CustomerObject[] getAllCustomers() throws java.rmi.RemoteException{
    if (customer == null)
      _initCustomerProxy();
    return customer.getAllCustomers();
  }
  
  public void signUp(java.lang.String customerName, java.lang.String customerAddress, java.lang.String cuspassword) throws java.rmi.RemoteException{
    if (customer == null)
      _initCustomerProxy();
    customer.signUp(customerName, customerAddress, cuspassword);
  }
  
  
}