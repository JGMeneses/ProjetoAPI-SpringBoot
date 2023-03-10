package ufrn.edu.br.porjetoapi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class Controller {

    CarroRepository repository;
    
    //Mostar toda lista de carros
    @GetMapping("/carro")
    public List<Carro> getListCarro(){
        return repository.findAll();
    }

    //criar um carro
    @PostMapping("/carro")
    public Carro salvaCarro(@RequestBody Carro carro){
        return repository.save(carro);
    }

    @GetMapping("/carro/{id}")
    public Carro getCarro(@PathVariable Long id){
        return repository.findById(id).get();

    }

    @DeleteMapping("/carro/{id}")
    public void removerCarro(@PathVariable Long id){
        repository.deleteById(id);
    }

    


}
