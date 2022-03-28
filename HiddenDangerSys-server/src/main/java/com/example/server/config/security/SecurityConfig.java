package com.example.server.config.security;


//import com.example.config.filter.CustomFilter;
import com.example.server.config.jwt.JwtAuthenticationTokenFilter;
import com.example.server.config.jwt.RestAuthorizationEntryPoint;
import com.example.server.config.jwt.RestfulAccessDeniedHandler;
import com.example.server.pojo.T01;
import com.example.server.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.Filter;

/**
 * security配置类
 *
 * @author zhanglishen
 */

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private IAdminService adminService;
    @Autowired
    private RestAuthorizationEntryPoint restAuthorizationEntryPoint;
    @Autowired
    private RestfulAccessDeniedHandler restfulAccessDeniedHandler;
//    @Autowired
//    private CustomUrlDecisionManager customUrlDecisionManager;
//    @Autowired
//    private CustomFilter customFilter;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
                "/login",
                "/logout",
                "/ws/**",
                "/css/**",
                "/js/**",
                "/index.html",
                "favicon.ico",
                "/doc.html",
                "/webjars/**",
                "/swagger-resources/**",
                "/v2/api-docs/**",
                "/captcha",
                "/getAdminUserByOpenID",
                "/addUserbywechat",
                "/LoginBywechat"
        );
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
//                .antMatchers(HttpMethod.OPTIONS) //跨域请求先进行一次options请求
                .antMatchers("/login","/logout") //跨域请求先进行一次options请求
                .permitAll()
                //下面的需要认证
                .anyRequest()
                .authenticated()
                //动态权限配置
//                .withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
//                    @Override
//                    public <O extends FilterSecurityInterceptor> O postProcess(O o) {
//                        o.setAccessDecisionManager(customUrlDecisionManager);
//                        o.setSecurityMetadataSource(customFilter);
//                        return o;
//                    }
//                })
                .and()
                //禁用缓存
                .headers()
                .cacheControl();
        //添加jwt登录授权过滤器
        http.addFilterBefore(jwtAuthenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
        //添加自定义未授权结果返回
        http.exceptionHandling()
//               接口权限不足
                .accessDeniedHandler(restfulAccessDeniedHandler)
//               未登录权限不足
                .authenticationEntryPoint(restAuthorizationEntryPoint);
    }

    /**
     * 设置执行自定义认证登录
     *
     * @param auth
     * @throws Exception
     * 为了让security走我们设定的UserDetailsService
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
    }

    /**
     * 重写 UserDetailsService
     *
     * @return
     * @throws Exception
     */
    @Override
    @Bean
    public UserDetailsService userDetailsService() {
        return username -> {
           T01 admin = adminService.getAdminByUserName(username);
            if (admin != null) {
//                admin.setRoles(adminService.getRolesByAdminId(admin.getId()));
                return admin;
            }
            return null;
        };
    }





    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public Filter jwtAuthenticationTokenFilter() {
        return new JwtAuthenticationTokenFilter();
    }
}
