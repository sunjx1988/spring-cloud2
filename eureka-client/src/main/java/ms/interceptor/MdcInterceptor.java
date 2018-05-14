package ms.interceptor;

import org.slf4j.MDC;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * Created by sunjx on 2018/5/14.
 */
public class MdcInterceptor extends HandlerInterceptorAdapter {

    private static final String MDC_ID = "MDC_ID";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        MDC.put(MDC_ID, UUID.randomUUID().toString());
        return super.preHandle(request, response, handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        MDC.remove(MDC_ID);
        super.afterCompletion(request, response, handler, ex);
    }


}
