package ufrn.edu.br.porjetoapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name ="Carros")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        Long id;
        String marca;
        String modelo;
        Integer ano;
}


