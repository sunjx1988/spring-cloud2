package ms.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class ZuulDefaultFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        System.out.printf("\n[ZuulDefaultFilter] Request Method: %s, Request Url: %s \n", request.getMethod(), request.getRequestURL().toString());

        //是否通过zuul响应
        requestContext.setSendZuulResponse(true);
        //响应状态码
        requestContext.setResponseStatusCode(200);

        return null;
    }
}
