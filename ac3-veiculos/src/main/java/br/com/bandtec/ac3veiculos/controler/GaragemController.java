package br.com.bandtec.ac3veiculos.controler;

import br.com.bandtec.ac3veiculos.dominio.Garagem;
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
@RequestMapping("/garagens")
public class GaragemController {
    @Autowired
    private GaragemRepository repositoryGaragem;
    
    @PostMapping("/cadastro")
    public ResponseEntity postGaragem(@RequestBody @Valid Garagem novaGaragem){
        repositoryGaragem.save(novaGaragem);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/listar")
    public ResponseEntity getGaragem(){
        return ResponseEntity.status(200).body(repositoryGaragem.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity getGaragemPorId(@PathVariable Integer id) {
        Optional<Garagem> garagem = repositoryGaragem.findById(id);
        return ResponseEntity.status(200).body(garagem);
    }


}
