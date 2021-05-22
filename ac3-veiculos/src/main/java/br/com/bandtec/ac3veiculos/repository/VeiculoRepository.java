package br.com.bandtec.ac3veiculos.repository;

import br.com.bandtec.ac3veiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, String> {

}
