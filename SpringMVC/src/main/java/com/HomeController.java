package com;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("login")	
	public String getLogin()
	{
		   return "login";
	 }
	
 // http://localhost:8080/SpringWebMvc/index	
   @RequestMapping("index")	
   public String getIndex(HttpServletRequest req,Model m)
   {
	   String uname=req.getParameter("uname");
       String upwd=req.getParameter("upwd");
       String msg="Invalid user name or password";
       if(uname.equals("admin") && upwd.equals("admin123"))
       {
    	    m.addAttribute("msg",uname);
    	    return "index";
       }
       else
    	m.addAttribute("msg",msg);
        return "login";
   }
// http://localhost:8080/SpringWebMvc/product	
   @RequestMapping("/product")	
   public String getProduct()
   {
	   return "product";
   }
	
}
