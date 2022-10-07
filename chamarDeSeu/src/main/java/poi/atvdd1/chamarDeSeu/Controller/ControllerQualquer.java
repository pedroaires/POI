package poi.atvdd1.chamarDeSeu.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ControllerQualquer {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String exibindoQualquerCoisa(){
        return "Qualquer coisa!";
    }

}
