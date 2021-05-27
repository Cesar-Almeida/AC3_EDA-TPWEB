package br.com.bandtec.ac3veiculo.controle;

import br.com.bandtec.ac3veiculo.dominio.Anexo;
import br.com.bandtec.ac3veiculo.dominio.Garagem;
import br.com.bandtec.ac3veiculo.repositorio.AnexoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArquivosControllerTest {
    @Autowired
    ArquivosController controller;

    @MockBean
    AnexoRepository repository;

//    @Test
//    @DisplayName("POST - /arquivos- cria arquivo")
//    void criarArquivo() {
//        Anexo anexo = new Anexo();
//        anexo.setNomeArquivo("blabla.txt");
//        anexo.setTipoArquivo(".txt");
//
//        ResponseEntity<List<Garagem>> resposta = controller.criarArquivo(anexo);
//
//        assertEquals(201, resposta.getStatusCodeValue());
//    }

//    @Test
//    @DisplayName("POST - /arquivos- cria arquivo")
//    void criarArquivo() {
//        Anexo anexo = new Anexo();
//        anexo.setNomeArquivo("blabla.txt");
//        anexo.setTipoArquivo(".txt");
//
//        ResponseEntity<List<Garagem>> resposta = controller.criarArquivo(anexo);
//
//        assertEquals(201, resposta.getStatusCodeValue());
//    }

//    @Test
//    @DisplayName("POST - /arquivos/anexo - faz upload de novo anexo")
//    void criarAnexo() {
//        Anexo anexo = new Anexo();
////        anexo.setConteudoArquivo("blabla");
//        anexo.setNomeArquivo("blabla.txt");
//        anexo.setTipoArquivo(".txt");
//
//        ResponseEntity<List<Garagem>> resposta = controller.criarAnexo(anexo);
//
//        assertEquals(201, resposta.getStatusCodeValue());
//    }

//    @Test
//    @DisplayName("POST - /arquivos/anexo - faz upload de novo anexo")
//    void criarAnexo() {
//        Anexo anexo = new Anexo();
////        anexo.setConteudoArquivo("blabla");
//        anexo.setNomeArquivo("blabla.txt");
//        anexo.setTipoArquivo(".txt");
//
//        ResponseEntity<List<Garagem>> resposta = controller.criarAnexo(anexo);
//
//        assertEquals(201, resposta.getStatusCodeValue());
//    }

    @Test
    @DisplayName("GET - /arquivos/{id}")
    void getArquivo() {
        List<Anexo> testeAnexo = Arrays.asList(new Anexo(), new Anexo(), new Anexo());

        Mockito.when(repository.findAll()).thenReturn(testeAnexo);

        ResponseEntity resposta = controller.getArquivo(2);

        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    @DisplayName("GET - /arquivos/{id}")
    void getArquivoInexistente() {
        List<Anexo> testeAnexo = Arrays.asList(new Anexo(), new Anexo(), new Anexo());

        Mockito.when(repository.findAll()).thenReturn(testeAnexo);

        ResponseEntity resposta = controller.getArquivo(9);

        assertEquals(404, resposta.getStatusCodeValue());
    }
}