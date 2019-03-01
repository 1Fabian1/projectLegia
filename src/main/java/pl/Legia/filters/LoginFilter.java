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
            //checkIfAdmin(httpReq);
            //saveUserInSession(httpReq);

        }
        System.out.println("Filter -Nazwa użytkownika: " + httpReq.getSession().getAttribute("user"));
        System.out.println("Filter -Nazwa administratora: " + httpReq.getSession().getAttribute("admin"));
        chain.doFilter(req, resp);

    }

    public void init(FilterConfig config) throws ServletException {

    }

    /*
    private void saveUserInSession(HttpServletRequest request) {
        UserService userService = new UserService();
        String username = request.getUserPrincipal().getName();
        User userByUsername = userService.getUserByUsername(username);
        request.getSession(true).setAttribute("user", userByUsername);
        System.out.println("Nazwa użytkownika: " + userByUsername);
    }

    private void checkIfAdmin(HttpServletRequest request) {
        System.out.println("sprawdzam czy admin");
        UserService userService = new UserService();
        String username = request.getUserPrincipal().getName();
        User adminByUsername = userService.checkIfAdmin(username);
        if (adminByUsername != null) {
            request.getSession(true).setAttribute("admin", adminByUsername);
            System.out.println("Nazwa administratora: " + adminByUsername);
        }

    }

    */

}
