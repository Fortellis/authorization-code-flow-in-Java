<%@ page session="false" import="com.caucho.vfs.*, com.caucho.server.webapp.*" %>

<%-- 
  This is the default start page for the Resin server.

  You can replace it as you wish, the documentation will
  still be available as /resin-doc if it is installed.
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

<p>Use this button to get your authorization code.</p>
<a href="https://identity.fortellis.io/oauth2/aus1p1ixy7YL8cMq02p7/v1/authorize?response_type=code&client_id=<%= client_id%>&redirect_uri=<%= redirect_uri%>&nonce=nonce&scope=openid&state=state">Get Your Authorization Code</a>

<p>This is your authorization code:</p>
<%= request.getParameter("code")%>

<form action="Main" method="POST">
  <p>This is the button to get your token.</p>
  <input type="text" name="authorizationCode" value=<%= request.getParameter("code")%>></input>
  <input type="submit" value="Get Token"></input>
</form>

</body>

</html>
