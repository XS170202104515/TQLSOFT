package com.tqlsoft.interceptor;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor{

	public String intercept(ActionInvocation ai) throws Exception {
		Map session=ai.getInvocationContext().getSession();
		String userName=(String)session.get("userName");
		if(userName!=null){
			return ai.invoke(); 
		}else{
			ActionContext ac=ai.getInvocationContext();
			ac.put("message", "Äú»¹Ã»µÇÂ¼£¬ÇëÏÈµÇÂ¼");
			return "login"; 
		}
	}

}
