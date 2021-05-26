package br.com.bandtec.ac3veiculos.dominio;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

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
