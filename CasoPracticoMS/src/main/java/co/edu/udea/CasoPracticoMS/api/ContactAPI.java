package co.edu.udea.CasoPracticoMS.api;

import co.edu.udea.CasoPracticoMS.DTO.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactAPI {

    @GetMapping(value="/user")
    public User getContact(){
        return new User(10L, "Carolina","Díaz","+57 3203672835",
                "astridc.diaz@udea.edu.co");
    }
}
