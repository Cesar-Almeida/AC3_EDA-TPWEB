package br.com.bandtec.ac3veiculo.servico;

import br.com.bandtec.ac3veiculo.dominio.Garagem;
import br.com.bandtec.ac3veiculo.repositorio.GaragemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {
    @Autowired
    private GaragemRepository repository;

    Garagem ultimaGaragem = new Garagem();
    @Scheduled(initialDelay = 1000, fixedRate = 3000000)
    public void tema() {
        while (repository.findAll().isEmpty()){
            System.out.println(repository.findById(1));
        }
//        System.out.println(repository.findAll());
        System.out.println(
          " ##   ##             ##                        ###                               ####   ##   ##    ##\n" +
          " ##   ##                                        ##                              ##  ##  ### ###   ####\n" +
          "  ## ##    ####     ###      ####    ##  ##     ##      ####     #####         ##       #######  ##  ##\n" +
          "  ## ##   ##  ##     ##     ##  ##   ##  ##     ##     ##  ##   ##             ##       #######  ##  ##\n" +
          "   ###    ######     ##     ##       ##  ##     ##     ##  ##    #####         ##       ## # ##  ######\n" +
          "   ###    ##         ##     ##  ##   ##  ##     ##     ##  ##        ##         ##  ##  ##   ##  ##  ##\n" +
          "    #      #####    ####     ####     ######   ####     ####    ######           ####   ##   ##  ##  ##\n" +
                "\n");
    }
}
