<%@ page session="false" import="com.caucho.vfs.*, com.caucho.server.webapp.*" %>

<%-- 
  This is the default start page for the Resin server.

  You can replace it as you wish, the documentation will
  still be available as /resin-doc if it is installed.
  You need to store your client_id somewhere.
  You need to include the redirect URI.
  You need to have the token variable.
  You need to keep the token in the URL.


  --%>

<%
/**
 * See if the resin-doc webapp is installed
 */
boolean hasResinDoc = false;
boolean hasOrientation = false;

ServletContext docApp = application.getContext("/resin-doc");  

if (docApp != null) {
  String rp = docApp.getRealPath("index.xtp");

  if (rp != null && (new java.io.File(rp)).exists())
    hasResinDoc = true;

  if (hasResinDoc) {
    rp = docApp.getRealPath("orientation.xtp");
    if (rp != null && (new java.io.File(rp)).exists())
      hasOrientation = true;
  }
}
%>
<%
String client_id = "{yourAPIKey}";
String redirect_uri = "http://localhost:8080/";
%>

<html>
<head><title>Resin&#174; Default Home Page</title></head>

<body>

<p>This is the link to get your token.</p>
<a href="https://identity.fortellis.io/oauth2/aus1p1ixy7YL8cMq02p7/v1/authorize?response_type=token&client_id=<%= client_id %>&redirect_uri=<%= redirect_uri %>&nonce=nonce&scope=openid&state=state">Get Token</a>

</body>

</html>
