package br.com.bandtec.ac3veiculos.controler;

import br.com.bandtec.ac3veiculos.dominio.Veiculo;
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

    @PostMapping("/cadastro")
    public ResponseEntity<List<Veiculo>> postVeiculo(@RequestBody @Valid Veiculo novoVeiculo){
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

}
