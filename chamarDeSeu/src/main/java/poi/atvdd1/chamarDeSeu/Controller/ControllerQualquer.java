package poi.atvdd1.chamarDeSeu.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;
@RestController
@RequestMapping(path = "/api")
public class ControllerQualquer {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String exibindoQualquerCoisa(){
        return "Pra chamar de seu!\n" +
                "acesse \"/sorteio\"";
    }

    @GetMapping(value = "/sorteio")
    @ResponseStatus(HttpStatus.OK)
    public String sorteio(@RequestParam List<String> nomes){
        if (nomes.size() == 0){
            return "A lista de participantes está vazia";
        }
        Random rand = new Random(System.currentTimeMillis());
        String sorteado = nomes.get(rand.nextInt(nomes.size()));


        return sorteado;
    }

}
