package br.com.bandtec.ac3veiculo.repositorio;

import br.com.bandtec.ac3veiculo.dominio.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, String> {

}
