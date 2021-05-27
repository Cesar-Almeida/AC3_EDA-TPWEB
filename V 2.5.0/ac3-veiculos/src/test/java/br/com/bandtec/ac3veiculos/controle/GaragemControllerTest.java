package br.com.bandtec.ac3veiculos.controle;

import br.com.bandtec.ac3veiculos.dominio.Garagem;
import br.com.bandtec.ac3veiculos.dominio.Veiculo;
import br.com.bandtec.ac3veiculos.repositorio.GaragemRepository;
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

class GaragemControllerTest {
//    @Autowired
//    GaragemController controller;
//
//    @MockBean
//    GaragemRepository repository;
//
//    @Test
//    @DisplayName("Post /garagem/cadastro -> Cadastro de garagem")
//    void postGaragem() {
//        Garagem garagem = new Garagem();
//        garagem.setId(1);
//        garagem.setCoberta(true);
//        garagem.setDono("César de Moura Almeida");
//
//        ResponseEntity<List<Garagem>> resposta = controller.postGaragem(garagem);
//
//        assertEquals(201, resposta.getStatusCodeValue());
//    }
//
//    @Test
//    @DisplayName("Post /garagem/cadastro -> Cadastro de garagem")
//    void postGaragemInvalido() {
//        Garagem garagem = new Garagem();
//        garagem.setId(1);
//        garagem.setCoberta(true);
//        garagem.setDono("I");
//
//        ResponseEntity<List<Garagem>> resposta = controller.postGaragem(garagem);
//
//        assertEquals(204, resposta.getStatusCodeValue());
//    }
//
//    @Test
//    @DisplayName("GET /garagens/listar -> Lista de garagens")
//    void getGaragem() {
//        List<Garagem> testeGaragem = Arrays.asList(new Garagem(), new Garagem(), new Garagem());
//
//        Mockito.when(repository.findAll()).thenReturn(testeGaragem);
//
//        ResponseEntity resposta = controller.getGaragem();
//
//        assertEquals(200, resposta.getStatusCodeValue());
//    }
//
//    @Test
//    @DisplayName("GET /garagens/listar -> Lista de garagens")
//    void getGaragemSemRegistro() {
//        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>());
//
//        ResponseEntity resposta = controller.getGaragem();
//
//        assertEquals(204, resposta.getStatusCodeValue());
//        assertNull(resposta.getBody());
//    }
//
//    @Test
//    @DisplayName("GET /garagens/{id} -> Traz uma garagem específica")
//    void getGaragemPorId() {
//        List<Garagem> testeGaragem = Arrays.asList(new Garagem(), new Garagem(), new Garagem());
//
//        Mockito.when(repository.findById(1));
//
//        ResponseEntity resposta = controller.getGaragem();
//
//        assertEquals(200, resposta.getStatusCodeValue());
//    }
//
//    @Test
//    @DisplayName("GET /garagens/{id} -> Traz uma garagem específica")
//    void getGaragemPorIdInexistente() {
//        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>());
//
//        ResponseEntity resposta = controller.getGaragem();
//
//        assertEquals(204, resposta.getStatusCodeValue());
//        assertNull(resposta.getBody());
//    }

//    @Test
//    @DisplayName("DELETE /garagens/{id} -> Apaga veiculo")
//    void deleteGaragem() {
//        List<Garagem> testeGaragem = Arrays.asList(new Garagem(), new Garagem(), new Garagem());
//
//        Mockito.when(repository.deleteById(1);
//
//        ResponseEntity resposta = controller.getGaragem();
//
//        assertEquals(200, resposta.getStatusCodeValue());
//    }
//
//    @Test
//    @DisplayName("DELETE /garagens/{id} -> Apaga veiculo")
//    void deleteGaragemInexistente() {
//        List<Garagem> testeGaragem = Arrays.asList(new Garagem(), new Garagem(), new Garagem());
//
//        Mockito.when(repository.deleteById(5);
//
//        ResponseEntity resposta = controller.getGaragem();
//
//        assertEquals(204, resposta.getStatusCodeValue());
//    }
}