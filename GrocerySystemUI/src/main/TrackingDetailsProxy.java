package main;

public class TrackingDetailsProxy implements main.TrackingDetails {
  private String _endpoint = null;
  private main.TrackingDetails trackingDetails = null;
  
  public TrackingDetailsProxy() {
    _initTrackingDetailsProxy();
  }
  
  public TrackingDetailsProxy(String endpoint) {
    _endpoint = endpoint;
    _initTrackingDetailsProxy();
  }
  
  private void _initTrackingDetailsProxy() {
    try {
      trackingDetails = (new main.TrackingDetailsServiceLocator()).gettrackingDetails();
      if (trackingDetails != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)trackingDetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)trackingDetails)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (trackingDetails != null)
      ((javax.xml.rpc.Stub)trackingDetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.TrackingDetails getTrackingDetails() {
    if (trackingDetails == null)
      _initTrackingDetailsProxy();
    return trackingDetails;
  }
  
  public main.TrackingDetailsObject[] getAllTrackingDetails() throws java.rmi.RemoteException{
    if (trackingDetails == null)
      _initTrackingDetailsProxy();
    return trackingDetails.getAllTrackingDetails();
  }
  
  public void createTrackingDetails(main.TrackingDetailsObject order) throws java.rmi.RemoteException{
    if (trackingDetails == null)
      _initTrackingDetailsProxy();
    trackingDetails.createTrackingDetails(order);
  }
  
  
}