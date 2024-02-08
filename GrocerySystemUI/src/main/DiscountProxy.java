package main;

public class DiscountProxy implements main.Discount {
  private String _endpoint = null;
  private main.Discount discount = null;
  
  public DiscountProxy() {
    _initDiscountProxy();
  }
  
  public DiscountProxy(String endpoint) {
    _endpoint = endpoint;
    _initDiscountProxy();
  }
  
  private void _initDiscountProxy() {
    try {
      discount = (new main.DiscountServiceLocator()).getDiscount();
      if (discount != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)discount)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)discount)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (discount != null)
      ((javax.xml.rpc.Stub)discount)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Discount getDiscount() {
    if (discount == null)
      _initDiscountProxy();
    return discount;
  }
  
  public java.lang.String getDiscount(java.lang.String d_name, java.lang.String percentage) throws java.rmi.RemoteException{
    if (discount == null)
      _initDiscountProxy();
    return discount.getDiscount(d_name, percentage);
  }
  
  
}