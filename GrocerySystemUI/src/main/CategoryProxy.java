package main;

public class CategoryProxy implements main.Category {
  private String _endpoint = null;
  private main.Category category = null;
  
  public CategoryProxy() {
    _initCategoryProxy();
  }
  
  public CategoryProxy(String endpoint) {
    _endpoint = endpoint;
    _initCategoryProxy();
  }
  
  private void _initCategoryProxy() {
    try {
      category = (new main.CategoryServiceLocator()).getCategory();
      if (category != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)category)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)category)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (category != null)
      ((javax.xml.rpc.Stub)category)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Category getCategory() {
    if (category == null)
      _initCategoryProxy();
    return category;
  }
  
  public main.CategoryObject[] getAllCategories() throws java.rmi.RemoteException{
    if (category == null)
      _initCategoryProxy();
    return category.getAllCategories();
  }
  
  
}