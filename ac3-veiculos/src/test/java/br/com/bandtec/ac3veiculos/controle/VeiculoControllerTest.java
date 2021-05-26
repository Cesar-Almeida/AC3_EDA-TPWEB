package br.com.bandtec.ac3veiculos.controle;

import br.com.bandtec.ac3veiculos.dominio.Garagem;
import br.com.bandtec.ac3veiculos.dominio.Veiculo;
import br.com.bandtec.ac3veiculos.repositorio.VeiculoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoControllerTest {
    @Autowired
    VeiculoController controller;

    @MockBean
    VeiculoRepository repository;

    @Test
    @DisplayName("Post /veiculos/cadastro -> Cadastro de veículo")
    void postVeiculo() {
        Veiculo veiculo = new Veiculo();
        veiculo.setChassi("shkg4jfd7fgzk9z");
        veiculo.setAno(2019);
        veiculo.setMarca("Fiat");
        veiculo.setModelo("Toro");
        veiculo.setQuilometragem(123.5);
        veiculo.setRodas(4);

        ResponseEntity<List<Veiculo>> resposta = controller.postVeiculo(veiculo);

        assertEquals(201, resposta.getStatusCodeValue());
    }

    @Test
    @DisplayName("POST /veiculos/cadastro -> Cadastro de veículo")
    void postVeiculoInvalido() {
        Veiculo veiculo = new Veiculo();
        veiculo.setChassi("shkg4jfd7fgzk9z");
        veiculo.setAno(2019);
        veiculo.setMarca("Fiat");
        veiculo.setModelo("Toro");
        veiculo.setQuilometragem(123.5);
        veiculo.setRodas(4);

        ResponseEntity<List<Veiculo>> resposta = controller.postVeiculo(veiculo);

        assertEquals(204, resposta.getStatusCodeValue());
    }

    @Test
    @DisplayName("GET /veiculos/listar -> Lista de veículos")
    void getVeiculo() {

        List<Veiculo> testeVeiculo = Arrays.asList(new Veiculo(), new Veiculo(), new Veiculo());

        Mockito.when(repository.findAll()).thenReturn(testeVeiculo);

        ResponseEntity resposta = controller.getVeiculo();

        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    @DisplayName("GET /veiculos/listar -> Sem registro")
    void getVeiculoSemRegistro() {

        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>());

        ResponseEntity resposta = controller.getVeiculo();

        assertEquals(204, resposta.getStatusCodeValue());
        assertNull(resposta.getBody());
    }

    @Test
    @DisplayName("GET /veiculos/{chassi} -> Traz o veículo específico")
    void getVeiculoPorChassi() {
        List<Veiculo> testeVeiculo = Arrays.asList(new Veiculo(), new Veiculo(), new Veiculo());

        Mockito.when(repository.findById("1odjksi1"));

        ResponseEntity resposta = controller.getVeiculo();

        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    @DisplayName("GET /veiculos/{chassi} -> Traz o veículo específico")
    void getVeiculoPorChassiInvalido() {
        List<Veiculo> testeVeiculo = Arrays.asList(new Veiculo(), new Veiculo(), new Veiculo());

        Mockito.when(repository.findById(1));

        ResponseEntity resposta = controller.getVeiculo();

        assertEquals(400, resposta.getStatusCodeValue());
    }

    @Test
    @DisplayName("DELETE /veiculos/{chassi} -> Apaga veiculo")
    void deleteVeiculo() {
        List<Veiculo> testeVeiculo = Arrays.asList(new Veiculo(), new Veiculo(), new Veiculo());

        Mockito.when(repository.deleteById("1");

        ResponseEntity resposta = controller.getVeiculo();

        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    @DisplayName("DELETE /veiculos/{chassi} -> Apaga veiculo")
    void deleteVeiculoInexistente() {
        List<Veiculo> testeVeiculo = Arrays.asList(new Veiculo(), new Veiculo(), new Veiculo());

        Mockito.when(repository.deleteById("3dyerfrgersusfd");

        ResponseEntity resposta = controller.getVeiculo();

        assertEquals(200, resposta.getStatusCodeValue());
    }
}