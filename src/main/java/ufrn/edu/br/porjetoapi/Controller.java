package ufrn.edu.br.porjetoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ufrn.edu.br.porjetoapi.modelo.Pessoa;

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
    
    @PostMapping("/pessoa")
    public Pessoa salvarPessoa(@RequestBody Pessoa pessoa){
    return pessoa;
}
}
