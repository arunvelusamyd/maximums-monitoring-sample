package com.flexy.filters;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginResponseFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        /*if(httpServletRequest.getMethod().equals("OPTIONS")) {
            return;
        }*/

        filterChain.doFilter(httpServletRequest, httpServletResponse);
        httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");
    }
}
