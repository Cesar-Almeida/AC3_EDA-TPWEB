package br.com.bandtec.ac3veiculos.controller;

import br.com.bandtec.ac3veiculos.model.Veiculo;
import br.com.bandtec.ac3veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoRepository repository;

    private List<Veiculo> veiculos = new ArrayList<>();
    private int contador = 0;

    @PostMapping("/veiculo/teste")
    public List<Veiculo> listar() {
        if (veiculos.isEmpty() && contador == 0) {
            this.veiculos.add(new Veiculo("XFDS4",4, 40, "UNO", "Fiat",
                    2012, 1_248));
            this.veiculos.add(new Veiculo("1SFD542", 2, 32, "Z1000 R", "Kawasaki",
                    2012, 876));
            this.veiculos.add(new Veiculo("DGF345",6, 120, "P310 BiTruck", "Scania",
                    2016, 6_492));
            this.contador = 1;
        }
        return this.veiculos;
    }
    @PostMapping("/cadastro")
    public ResponseEntity postVeiculo(@RequestBody Veiculo novoVeiculo){
        repository.save(novoVeiculo);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/listar")
    public ResponseEntity getVeiculo(){
        return ResponseEntity.status(200).body(repository.findAll());
    }
}
