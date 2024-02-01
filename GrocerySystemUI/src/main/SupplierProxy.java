package main;

public class SupplierProxy implements main.Supplier {
  private String _endpoint = null;
  private main.Supplier supplier = null;
  
  public SupplierProxy() {
    _initSupplierProxy();
  }
  
  public SupplierProxy(String endpoint) {
    _endpoint = endpoint;
    _initSupplierProxy();
  }
  
  private void _initSupplierProxy() {
    try {
      supplier = (new main.SupplierServiceLocator()).getSupplier();
      if (supplier != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)supplier)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)supplier)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (supplier != null)
      ((javax.xml.rpc.Stub)supplier)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Supplier getSupplier() {
    if (supplier == null)
      _initSupplierProxy();
    return supplier;
  }
  
  public main.SupplierObject getsupplier(int id) throws java.rmi.RemoteException{
    if (supplier == null)
      _initSupplierProxy();
    return supplier.getsupplier(id);
  }
  
  
}