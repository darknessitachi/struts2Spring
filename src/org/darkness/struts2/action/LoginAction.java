package org.darkness.struts2.action;

import org.darkness.struts2.service.ILoginService;

import com.opensymphony.xwork2.Action;

/**
 * @author Darkness
 *
 * 		  QQ:	 893951837
 * 		  Email: darkness_sky@qq.com
 * 		  Blog:  http://depravedAngel.javaeye.com/
 *
 * 	      Copyright (c) 2009 by Darkness
 *
 * @date Aug 5, 2009 7:03:20 PM
 * @version 1.0
 */
public class LoginAction {

	private ILoginService loginService;
	private String userName;
	private String password;
	
	/**
	 * @return the loginService
	 */
	public ILoginService getLoginService() {
		return loginService;
	}

	/**
	 * @param loginService the loginService to set
	 */
	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}

	public String execute(){
		
		if(loginService.login(userName, password))
			return Action.SUCCESS;
		
		return Action.INPUT;
	}
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	
}
