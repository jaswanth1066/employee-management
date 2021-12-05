package com.asdc.payroll_management.UserAuthentication;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserAuthenticationController {

	    private UserAuthenticationConcreteFactory UACF=new UserAuthenticationConcreteFactory();
	    
	    @RequestMapping(value = "/UserAuthentication/check",method = RequestMethod.POST)
	    public String checkUserAuthentication(@RequestBody UserAuthentication ua,HttpServletRequest request) {	
	    	if(ua.validate())
	    	{	    		
		    	String userInfo=UACF.checkUserAuthentication(ua);
		    	if(userInfo!="Invalid User")
		    	{
			    	request.getSession().setAttribute("userInfo",userInfo);	
		    	}
		    	return userInfo;
	    	}
	    	else
	    	{
	    		return "Empty";
	    	}
	    }
	    
		@RequestMapping("/LoginSignup")
		public ModelAndView LoginSignup() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("LoginSignup");
			return mv;
		}
		
		@RequestMapping("/UserAuthentication/logout")
		public ModelAndView logout(HttpServletRequest request) {			
			request.getSession().removeValue("userInfo");
			return new ModelAndView("redirect:/LoginSignup");
		}
		
	       
}
