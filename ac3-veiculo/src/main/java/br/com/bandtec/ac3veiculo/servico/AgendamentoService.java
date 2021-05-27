package br.com.bandtec.ac3veiculo.servico;

import br.com.bandtec.ac3veiculo.repositorio.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {
    @Autowired
    private VeiculoRepository repository;

    @Scheduled(initialDelay = 1000, fixedRate = 3000)
    public void filosofar() {
//        System.out.println(repository.findAll());
        System.out.println("Não desista até conseguir 8");
    }
}
