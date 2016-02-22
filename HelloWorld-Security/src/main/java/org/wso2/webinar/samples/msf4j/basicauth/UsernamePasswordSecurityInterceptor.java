package org.wso2.webinar.samples.msf4j.basicauth;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UsernamePasswordSecurityInterceptor extends AbstractBasicAuthInterceptor {
    private final Log log = LogFactory.getLog(UsernamePasswordSecurityInterceptor.class);

    @Override
    protected boolean authenticate(String username, String password) {

        // The authentication logic goes in here. For simplicity, we just check that username == password
        if (username.equals(password)) {
            return true;
        }
        return false;
    }
}
