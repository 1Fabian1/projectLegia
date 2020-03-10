package pl.Legia.filters;

import pl.Legia.model.User;
import pl.Legia.serviceLayer.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "loginFilter")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {


        HttpServletRequest httpReq = (HttpServletRequest) req;
        if (httpReq.getUserPrincipal() != null && httpReq.getSession().getAttribute("user") == null) {
            System.out.println("Sprawdź czy admin");

        }
        System.out.println("Filter -Nazwa użytkownika: " + httpReq.getSession().getAttribute("user"));
        System.out.println("Filter -Nazwa administratora: " + httpReq.getSession().getAttribute("admin"));
        chain.doFilter(req, resp);

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
