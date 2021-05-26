package br.com.bandtec.ac3veiculos.controle;

import br.com.bandtec.ac3veiculos.dominio.Garagem;
import br.com.bandtec.ac3veiculos.dominio.Veiculo;
import br.com.bandtec.ac3veiculos.repositorio.VeiculoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoControllerTest {
    @Autowired
    VeiculoController controller;

    @MockBean
    VeiculoRepository repository;

    @Test
    void postVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setChassi("shkg4jfd7fgzk9z");
        veiculo.setAno(2019);
        veiculo.setMarca("Fiat");
        veiculo.setModelo("Toro");
        veiculo.setQuilometragem(123.5);
        veiculo.setRodas(4);
        veiculo.setVaga(new Garagem());
        ResponseEntity<List<Veiculo>> resposta = controller.postVeiculo(veiculo);

        assertEquals(201, resposta.getStatusCodeValue());
    }

    @Test
    void getVeiculo() {

        List<Veiculo> testeVeiculo = Arrays.asList(new Veiculo(), new Veiculo(), new Veiculo());

        Mockito.when(repository.findAll()).thenReturn(testeVeiculo);

        ResponseEntity resposta = controller.getVeiculo();

        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    void getVeiculoPorId() {
    }

    @Test
    void deleteVeiculo() {
    }
}