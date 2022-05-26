package com.ivoronline.springboot_interceptor_exclude.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {

  //====================================================================
  // PRE HANDLE
  //====================================================================
  @Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		System.out.print("MyInterceptor");
		System.out.println(request.getMethod());
		return true;
	}

}
