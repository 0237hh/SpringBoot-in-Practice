package com.manning.sbip.ch05;

import javax.servlet.*;
import java.io.IOException;

/** init() - 서블릿 컨테이너가 필터르르 등록하는 초기화 과정에서 호출된다.
 *  doFilter() - 필터의 실질적인 작업을 수행하는 메서드로서 요청, 응답, FilterChain 객체에 접근할 수 있음.
 *               FilterChain 은 필터의 작업이 완료된 후 체인에 있는 다음 필터를 호출
 *  destroy() - 서블릿 컨테이너가 필터를 제거할 때 호출된다. **/
public interface Filter {
    public default void init(FilterConfig filterConfig) throws ServletException {}
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException;
    public default void destroy() {}
}
