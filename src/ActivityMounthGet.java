import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import connector.ActivityGetIMP;
import connector.ActivityMounthGetIMP;
import models.Activity;

public class ActivityMounthGet extends HttpServlet {

	
	List<Activity> o;
	JSONObject l=new JSONObject();
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        
	        
	        ActivityMounthGetIMP AGI=new ActivityMounthGetIMP();
	        int o=AGI.get();
			
			
			 PrintWriter out = response.getWriter();
			    response.setContentType("application/json");
			    response.setCharacterEncoding("UTF-8");
			    //CRIAS O OBJETO JSON
			    try {
					l.put("numero", o);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    
			    
			   	//
			 
					out.print(l);
			
			   	
			   	
			    
			    	
			    	
			    	
			    }
			    
	
	
	
	
	
}
