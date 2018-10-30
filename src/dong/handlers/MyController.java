package dong.handlers;

import dong.beans.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Controller
public class MyController {
    @RequestMapping({"/my.do", "/hello.do"})
    @ResponseBody
    public Object handleRequest(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", 29));
        students.add(new Student("李四", 21));
        students.add(new Student("王五", 20));
        return students;
    }
}
