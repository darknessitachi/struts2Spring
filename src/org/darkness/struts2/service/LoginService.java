package org.darkness.struts2.service;


/**
 * @author Darkness
 * 
 * QQ: 893951837 Email: darkness_sky@qq.com Blog:
 * http://depravedAngel.javaeye.com/
 * 
 * Copyright (c) 2009 by Darkness
 * 
 * @date Aug 5, 2009 7:09:09 PM
 * @version 1.0
 */
public class LoginService implements ILoginService {

	/* (non-Javadoc)
	 * @see org.darkness.struts2.service.ILoginService#login(java.lang.String, java.lang.String)
	 */
	public boolean login(String userName, String password) {

		if ("darkness".equals(userName) && "sky".equals(password)) {
			return true;
		}

		return false;
	}
}
