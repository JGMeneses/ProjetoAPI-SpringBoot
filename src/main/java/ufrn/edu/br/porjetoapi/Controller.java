package ufrn.edu.br.porjetoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String mensagem(){
        return "Hello World!!";
    }

    @GetMapping("/boas")
    public String boasVindas(){
        return "Seja bem vindo(a) ";
    }

    @GetMapping("/boas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem vindo(a) " + nome;
    }
    
}
