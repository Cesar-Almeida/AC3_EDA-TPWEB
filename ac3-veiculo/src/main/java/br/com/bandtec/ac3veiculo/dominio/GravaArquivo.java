package br.com.bandtec.ac3veiculo.dominio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GravaArquivo {

    public static void gravaRegistro(String nomeArq, String registro) {
        BufferedWriter saida = null;
        try {
            // o argumento true é para indicar que o arquivo não será sobrescrito e sim
            // gravado com append (no final do arquivo)
            saida = new BufferedWriter(new FileWriter(nomeArq, true));
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }

        try {
            saida.append(registro + "\n");
            saida.close();

        } catch (IOException e) {
            System.err.printf("Erro ao gravar arquivo: %s.\n", e.getMessage());
        }
    }


    public static void main(String[] args) {

        String nomeArq = "Veiculo.txt";
        String header = "";
        String corpo = "";
        String corpo2 = "";
        String trailer = "";
        int contRegDados = 0;
        int contRegDados2 = 0;

        // Monta o registro header
        Date dataDeHoje = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        header += "VEICULO2021";
        header += formatter.format(dataDeHoje);
        header += "01";

        // Grava o registro header
        gravaRegistro(nomeArq, header);

        // Monta o corpo

        // 1o registro de dados
        corpo += "02";
        // %-5s : para strings, usamos s
        //        - alinha para a esquerda, campo de 5 caracteres, completa
        //        espaços com brancos à direita
        corpo += String.format("%-17s", "1J9U905AKDm9Y0832");     // veiculo.getChassi()
        corpo += String.format("%-2s", "04");  // veiculo.getRodas()
        corpo += String.format("%-3s", "250"); // veiculo.getTanque()
        corpo += String.format("%-60s", "Uno Mille"); // veiculo.getModelo()
        corpo += String.format("%15s", "Fiat"); // veiculo.getMarca()
        corpo += String.format("%4s", "2018"); // veiculo.getAno()
        corpo += String.format("%5s", "30218"); // veiculo.getQuilometragem()
        // incrementa o contador de registros de dados
        contRegDados++;
        gravaRegistro(nomeArq, corpo);
        // chama o método para gravar um registro
        // 1o registro de dados
        corpo2 += "03";
        // %-5s : para strings, usamos s
        //        - alinha para a esquerda, campo de 5 caracteres, completa
        //        espaços com brancos à direita
        corpo2 += String.format("%-5s", "12345");     // garagem.getId()
        corpo2 += String.format("%-40s", "1234567890123456789012345678901234567890");     // garagem.getDono()
        corpo2 += String.format("%-2s", "90");     // garagem.getVaga()
        corpo2 += String.format("%-5s", "false");     // garagem.getCoberta()

        // incrementa o contador de registros de dados
        contRegDados2++;
        gravaRegistro(nomeArq, corpo2);

        // monta o trailer
        trailer += "01";
        trailer += String.format("%010d", contRegDados);
        gravaRegistro(nomeArq, trailer);
    }

}
