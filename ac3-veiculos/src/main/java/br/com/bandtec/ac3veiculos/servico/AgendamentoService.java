package br.com.bandtec.ac3veiculos.servico;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {

    @Scheduled(fixedRate = 3000)
    public void filosofar() {
        System.out.println("Não desista até conseguir 8");
    }
}
