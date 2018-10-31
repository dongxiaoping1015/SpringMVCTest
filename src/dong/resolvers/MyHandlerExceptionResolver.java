package dong.resolvers;

import dong.exceptions.AgeException;
import dong.exceptions.NameException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);

        mv.setViewName("/error/errors.jsp");

        if (ex instanceof NameException) {
            //
            mv.setViewName("/error/nameError.jsp");
        }
        if (ex instanceof AgeException) {
            //
            mv.setViewName("/error/ageError.jsp");
        }

        return mv;
    }
}
