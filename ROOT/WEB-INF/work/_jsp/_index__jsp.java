/*
 * JSP generated by Resin-4.0.62 (built Wed, 22 May 2019 05:51:50 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import com.caucho.vfs.*;
import com.caucho.server.webapp.*;

public class _index__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, null, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html");

    out.write(_jsp_string0, 0, _jsp_string0.length);
    
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

    out.write(_jsp_string1, 0, _jsp_string1.length);
    
String client_id = "KegwQ6AHioQyu8iK6a2KoAbrLZL4rQJD";
String redirect_uri = "http://localhost:8080/";

    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print(( client_id));
    out.write(_jsp_string3, 0, _jsp_string3.length);
    out.print(( redirect_uri));
    out.write(_jsp_string4, 0, _jsp_string4.length);
    out.print(( request.getParameter("code")));
    out.write(_jsp_string5, 0, _jsp_string5.length);
    out.print(( request.getParameter("code")));
    out.write(_jsp_string6, 0, _jsp_string6.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != -1861954458465364108L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("index.jsp"), 6218242720669122326L, false);
    _caucho_depends.add(depend);
    loader.addDependency(depend);
  }

  final static class TagState {

    void release()
    {
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }

  private final static char []_jsp_string5;
  private final static char []_jsp_string3;
  private final static char []_jsp_string2;
  private final static char []_jsp_string6;
  private final static char []_jsp_string0;
  private final static char []_jsp_string1;
  private final static char []_jsp_string4;
  static {
    _jsp_string5 = "\r\n\r\n<form action=\"Main\" method=\"POST\">\r\n  <p>This is the button to get your token.</p>\r\n  <input type=\"text\" name=\"authorizationCode\" value=".toCharArray();
    _jsp_string3 = "&redirect_uri=".toCharArray();
    _jsp_string2 = "\r\n<html>\r\n<head><title>Resin&#174; Default Home Page</title></head>\r\n\r\n<body>\r\n\r\n<p>Use this button to get your authorization code.</p>\r\n<a href=\"https://identity-dev.fortellis.io/oauth2/aus1ni5i9n9WkzcYa2p7/v1/authorize?response_type=code&client_id=".toCharArray();
    _jsp_string6 = "></input>\r\n  <input type=\"submit\" value=\"Get Token\"></input>\r\n</form>\r\n\r\n</body>\r\n\r\n</html>\r\n".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string1 = "\r\n".toCharArray();
    _jsp_string4 = "&nonce=nonce&scope=openid&state=state\">Get Your Authorization Code</a>\r\n\r\n<p>This is your authorization code:</p>\r\n".toCharArray();
  }
}
