package dong.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller
public class TestController {

    @RequestMapping("/register.do")
    public String doRegister(String name, int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "redirect:other.do";
    }

    @RequestMapping("/other.do")
    public String doOther(String name, int age) {
        return "/welcome.jsp";
    }
}
