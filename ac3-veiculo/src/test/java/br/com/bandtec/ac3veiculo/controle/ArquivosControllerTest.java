package br.com.bandtec.ac3veiculo.controle;

import br.com.bandtec.ac3veiculo.dominio.Anexo;
import br.com.bandtec.ac3veiculo.dominio.Garagem;
import br.com.bandtec.ac3veiculo.repositorio.AnexoRepository;
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
//    void criarArquivo() {
//        Anexo anexo = new Anexo();
//        anexo.setConteudoArquivo("blabla");
//        anexo.setNomeArquivo("blabla.txt");
//        anexo.setTipoArquivo(".txt");
//
//        ResponseEntity<List<Garagem>> resposta = controller.criarArquivo(anexo);
//
//        assertEquals(201, resposta.getStatusCodeValue());
//    }
//
//    @Test
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
//
//    @Test
//    void getArquivo() {
//        List<Anexo> testeAnexo = Arrays.asList(new Anexo(), new Anexo(), new Anexo());
//
//        Mockito.when(repository.findAll()).thenReturn(testeAnexo);
//
//        ResponseEntity resposta = controller.getArquivo();
//
//        assertEquals(200, resposta.getStatusCodeValue());
//    }
}