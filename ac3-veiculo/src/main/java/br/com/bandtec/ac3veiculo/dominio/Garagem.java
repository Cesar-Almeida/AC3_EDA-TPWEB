package br.com.bandtec.ac3veiculo.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Garagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @NotNull
    @Size(min = 2, max = 40)
    private String dono;

    @NotNull
    private Boolean coberta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

//    public Integer getVaga() {
//        return vaga;
//    }
//
//    public void setVaga(Integer vaga) {
//        this.vaga = vaga;
//    }

    public Boolean getCoberta() {
        return coberta;
    }

    public void setCoberta(Boolean coberta) {
        this.coberta = coberta;
    }
}
