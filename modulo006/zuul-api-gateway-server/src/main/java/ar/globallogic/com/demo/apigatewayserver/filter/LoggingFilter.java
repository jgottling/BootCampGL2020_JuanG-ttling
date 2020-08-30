package ar.globallogic.com.demo.apigatewayserver.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class LoggingFilter extends ZuulFilter {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  // ejecuto el filtro o no?
  @Override
  public boolean shouldFilter() {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public Object run() throws ZuulException {
    // TODO Auto-generated method stub

    HttpServletRequest request = RequestContext.getCurrentContext().getRequest();

    logger.info("request -> {} request uri -> {}", request, request.getRequestURI());

    return null;
  }

  // cuando el ejecuto, antes de que se ejecute el request, despues o en un error?

  @Override
  public String filterType() {
    // TODO Auto-generated method stub
    return "pre"; // before execution
  }

  // prioriza el orden de los filtros existentes
  @Override
  public int filterOrder() {
    // TODO Auto-generated method stub
    return 1;
  }
}
