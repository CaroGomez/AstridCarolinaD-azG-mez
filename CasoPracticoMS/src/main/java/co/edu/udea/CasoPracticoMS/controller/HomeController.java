package co.edu.udea.CasoPracticoMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

    @GetMapping(value="/hello")
    public String getMensaje(){
        return "Hola mundo desde Spring Boot";
    }
}
