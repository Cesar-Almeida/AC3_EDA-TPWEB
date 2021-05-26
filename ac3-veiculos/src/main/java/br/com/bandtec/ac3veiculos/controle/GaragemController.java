package br.com.bandtec.ac3veiculos.controle;

import br.com.bandtec.ac3veiculos.dominio.Garagem;
import br.com.bandtec.ac3veiculos.repositorio.GaragemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/garagens")
public class GaragemController {
    @Autowired
    private GaragemRepository repository;
    
    @PostMapping("/cadastro")
    public ResponseEntity postGaragem(@RequestBody @Valid Garagem novaGaragem){
        repository.save(novaGaragem);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/listar")
    public ResponseEntity getGaragem(){
        return ResponseEntity.status(200).body(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity getGaragemPorId(@PathVariable Integer id) {
        Optional<Garagem> garagem = repository.findById(id);
        return ResponseEntity.status(200).body(garagem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteGaragem(@PathVariable Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.status(200).build();
        }else {
            return ResponseEntity.status(404).build();
        }
    }
}
