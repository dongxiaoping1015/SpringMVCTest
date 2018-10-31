package dong.handlers;

import dong.exceptions.AgeException;
import dong.exceptions.NameException;
import dong.exceptions.StudentException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.Date;

@RequestMapping("/test")
@Controller
public class TestController {

    @RequestMapping("/register.do")
    public ModelAndView doRegister(int age, Date birthday) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("birthday", birthday);
        mv.addObject("age", age);
        mv.setViewName("/WEB-INF/jsp/welcome.jsp");
        return mv;
    }

    @RequestMapping("/other.do")
    public String doOther(String name, int age) {
        //int a = 1/0;
        return "/welcome.jsp";
    }

    @ExceptionHandler(NameException.class)
    public ModelAndView handlerNameException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);


        mv.setViewName("/error/nameError.jsp");

        return mv;
    }
    @ExceptionHandler(AgeException.class)
    public ModelAndView handlerAgeException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);


        mv.setViewName("/error/ageError.jsp");

        return mv;
    }
    @ExceptionHandler
    public ModelAndView handlerException(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);

        mv.setViewName("/error/errors.jsp");


        return mv;
    }

    @ExceptionHandler(TypeMismatchException.class)
    public ModelAndView exceptionResolver(HttpServletRequest request, Exception ex) {
        String age = request.getParameter("age");
        String birthday = request.getParameter("birthday");
        ModelAndView mv = new ModelAndView();
        mv.addObject("age", age);
        mv.addObject("birthday", birthday);
        mv.setViewName("/Req.jsp");
        return mv;
    }


}
