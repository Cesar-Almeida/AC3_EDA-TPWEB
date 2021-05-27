package br.com.bandtec.ac3veiculos.repositorio;

import br.com.bandtec.ac3veiculos.dominio.Garagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GaragemRepository extends JpaRepository<Garagem, Integer> {

}
