package dong.handlers;

import dong.exceptions.AgeException;
import dong.exceptions.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller
public class TestController {

    @RequestMapping("/register.do")
    public String doRegister(String name, int age, Model model) throws NameException, AgeException {
        if (!"beijing".equals(name)) {
            throw new NameException("用户名不正确");
        }
        if (age > 60) {
            throw new AgeException("年龄！");
        }
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "redirect:other.do";
    }

    @RequestMapping("/other.do")
    public String doOther(String name, int age) {
        //int a = 1/0;
        return "/welcome.jsp";
    }
}
