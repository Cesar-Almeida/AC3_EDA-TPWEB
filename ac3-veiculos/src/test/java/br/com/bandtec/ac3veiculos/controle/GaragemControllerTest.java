package br.com.bandtec.ac3veiculos.controle;

import br.com.bandtec.ac3veiculos.dominio.Garagem;
import br.com.bandtec.ac3veiculos.repositorio.GaragemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GaragemControllerTest {
    @Autowired
    GaragemController controller;

    @MockBean
    GaragemRepository repository;

    @Test
    void postGaragem() {
        Garagem garagem = new Garagem();
        garagem.setId(1);
        garagem.setCoberta(true);
        garagem.setDono("César de Moura Almeida");

        ResponseEntity<List<Garagem>> resposta = controller.postGaragem(garagem);

        assertEquals(201, resposta.getStatusCodeValue());
    }

    @Test
    void getGaragem() {
    }

    @Test
    void getGaragemPorId() {
    }

    @Test
    void deleteGaragem() {
    }
}