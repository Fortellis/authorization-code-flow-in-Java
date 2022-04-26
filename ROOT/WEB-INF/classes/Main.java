import java.io.IOException;
import java.io.PrintWriter;
  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


@WebServlet("/Main")
public class Main extends HttpServlet{

    public Main(){
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        String authorizationCode = request.getParameter("authorizationCode");
        System.out.println("This is your authorizationCode" + authorizationCode);
        URL url = new URL("https://identity-dev.fortellis.io/oauth2/aus1ni5i9n9WkzcYa2p7/v1/token");
        String postData = "grant_type=authorization_code&redirect_uri=http://localhost:8080/&code=" + authorizationCode;
 
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic S2Vnd1E2QUhpb1F5dThpSzZhMktvQWJyTFpMNHJRSkQ6b0FoVEV4NFFmSHQzSmRQdw==");
        conn.setRequestProperty("Accept", "application/json");
        conn.setRequestProperty("Cache-Control", "no-cache");
        conn.setRequestProperty("Content-Length", Integer.toString(postData.length()));
 
        try (DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
            dos.writeBytes(postData);
        }
 
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream())))
        {
            String line;
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
                out.print(line);
            }
        }
    }
}