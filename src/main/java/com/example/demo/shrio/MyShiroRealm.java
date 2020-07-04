package com.example.demo.shrio;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.web.subject.WebSubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.util.HashSet;
import java.util.Set;

public class MyShiroRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.getLogger(MyShiroRealm.class);

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        logger.info("开始授权(doGetAuthorizationInfo)");
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        HttpServletRequest request = (HttpServletRequest)((WebSubject)
                SecurityUtils.getSubject()).getServletRequest();
        /*String username = (String) prin*/

        Set<String> roles = new HashSet<String>();

        roles.add("role1");
        simpleAuthorizationInfo.setRoles(roles);

        HashSet<String> permissions = new HashSet<>();

        permissions.add("user:list");

        simpleAuthorizationInfo.setStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        logger.info("开始认证(doGetAuthenticationInfo)");
        //UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        HttpServletRequest request = (HttpServletRequest) ((WebSubject) SecurityUtils
                .getSubject()).getServletRequest();
        UsernamePasswordToken token = new UsernamePasswordToken (request.getParameter("userName"),request.getParameter("password"));
        //获取用户输入的账号
        String userName = (String)token.getPrincipal();
        //通过userName去数据库中匹配用户信息，通过查询用户的情况做下面的处理
        //这里暂时就直接写死,根据登录用户账号的情况做处理
        logger.info("账号："+userName);
        if("passwordError".equals(userName)){//密码错误
            throw new IncorrectCredentialsException();
        }else if("lockAccount".equals(userName)){// 用户锁定
            throw new LockedAccountException();
        }else{
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    userName, //用户名
                    "123456", //密码，写死
                    ByteSource.Util.bytes(userName+"salt"),//salt=username+salt
                    getName()  //realm name
            );
            return authenticationInfo;
        }
    }
}
