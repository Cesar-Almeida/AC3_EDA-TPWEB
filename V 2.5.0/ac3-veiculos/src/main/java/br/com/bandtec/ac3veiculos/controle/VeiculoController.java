package br.com.bandtec.ac3veiculos.controle;

import br.com.bandtec.ac3veiculos.dominio.VeiculoSimplesResposta;
import br.com.bandtec.ac3veiculos.dominio.Veiculo;
import br.com.bandtec.ac3veiculos.repositorio.GaragemRepository;
import br.com.bandtec.ac3veiculos.repositorio.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoRepository repository;

    @Autowired
    private GaragemRepository repositoryGaragem;

    @PostMapping("/cadastro")
    public ResponseEntity<List<Veiculo>> postVeiculo(@RequestBody @Valid Veiculo novoVeiculo){
//        novoVeiculo.setVaga(repository.existsById(novoVeiculo.getVaga().getId());
        repository.save(novoVeiculo);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/listar")
    public ResponseEntity getVeiculo(){
        return ResponseEntity.status(200).body(repository.findAll());
    }

    @GetMapping("/{chassi}")
    public ResponseEntity getVeiculoPorId(@PathVariable String chassi) {
        Optional<Veiculo> veiculo = repository.findById(chassi);
        return ResponseEntity.status(200).body(veiculo);
    }

    @DeleteMapping("/{chassi}")
    public ResponseEntity deleteVeiculo(@PathVariable String chassi) {
        if (repository.existsById(chassi)) {
            repository.deleteById(chassi);
            return ResponseEntity.status(200).build();
        }else {
            return ResponseEntity.status(404).build();
        }
    }

//    @PutMapping("/{chassi}")
//    public String putPokemon(@PathVariable String chassi, @RequestBody Veiculo veiculoAlterado) {
//        if (repository.existsById(chassi)) {
//            return repository.save(chassi, veiculoAlterado)
//        } else {
//            return "Veiculo não encontrado";
//        }
//    }

//    @GetMapping
//    public ResponseEntity getVeiculos() {
//        return ResponseEntity.status(200).body(
//                repository.findAll().stream().map(VeiculoSimplesResposta::new).collect(Collectors.toList())
//        );
//    }
}
