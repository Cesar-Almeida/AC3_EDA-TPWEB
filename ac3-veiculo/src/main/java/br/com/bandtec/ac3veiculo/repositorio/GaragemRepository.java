package br.com.bandtec.ac3veiculo.repositorio;

import br.com.bandtec.ac3veiculo.dominio.Garagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GaragemRepository extends JpaRepository<Garagem, Integer> {

}
