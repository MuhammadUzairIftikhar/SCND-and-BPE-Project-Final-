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
      trackingDetails = (new main.TrackingDetailsServiceLocator()).getTrackingDetails();
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
  
  public java.lang.String getTracking(int trackingNo) throws java.rmi.RemoteException{
    if (trackingDetails == null)
      _initTrackingDetailsProxy();
    return trackingDetails.getTracking(trackingNo);
  }
  
  public void createTrackingDetails(int trackingNo, int courierNo) throws java.rmi.RemoteException{
    if (trackingDetails == null)
      _initTrackingDetailsProxy();
    trackingDetails.createTrackingDetails(trackingNo, courierNo);
  }
  
  public int courierNo() throws java.rmi.RemoteException{
    if (trackingDetails == null)
      _initTrackingDetailsProxy();
    return trackingDetails.courierNo();
  }
  
  public int getTrackingno() throws java.rmi.RemoteException{
    if (trackingDetails == null)
      _initTrackingDetailsProxy();
    return trackingDetails.getTrackingno();
  }
  
  
}