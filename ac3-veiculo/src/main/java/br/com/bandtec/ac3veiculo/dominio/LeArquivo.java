package br.com.bandtec.ac3veiculo.dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivo {

    public static void leArquivo(String nomeArq) {
        BufferedReader entrada = null;
        String registro;
        String tipoRegistro;
        String curso, chassi, tanque, rodas, quilometragem, ano, marca, modelo;
        String id, dono, vaga, coberta, entradaV;
        int contRegistro = 0;
        int contRegistro2 = 0;

        // Abre o arquivo
        try {
            entrada = new BufferedReader(new FileReader(nomeArq));
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }

        // Lê os registros do arquivo
        try {
            // Lê um registro
            registro = entrada.readLine();

            while (registro != null) {
                // Obtém o tipo do registro
                tipoRegistro = registro.substring(0, 2); // obtém os 2 primeiros caracteres do registro

                if (tipoRegistro.equals("00")) {
                    System.out.println("Header");
                    System.out.println("Tipo de arquivo: " + registro.substring(2, 9));
                    System.out.println("Chassi: " + registro.substring(9, 26));
                    System.out.println("Data/hora de geração do arquivo: " + registro.substring(26, 45));
                    System.out.println("Versão do layout: " + registro.substring(45, 47));
                } else if (tipoRegistro.equals("01")) {
                    System.out.println("\nTrailer");
                    int qtdRegistro = Integer.parseInt(registro.substring(2, 12));
                    if (qtdRegistro == contRegistro) {
                        System.out.println("Quantidade de registros gravados compatível com quantidade lida");
                    } else {
                        System.out.println("Quantidade de registros gravados não confere com quantidade lida");
                    }
                } else if (tipoRegistro.equals("02")) {
                    if (contRegistro == 0) {
                        System.out.println();
                        System.out.printf("%-17s %-2s %-3s %-60s %15s %4s %5s\n", "CHASSI", "RODAS", "TANQUE",
                                "MODELO", "MARCA", "ANO", "QULIOMETRAGEM");
                    }

                    chassi = registro.substring(2, 19).trim();
                    rodas = registro.substring(19, 21).trim();
                    tanque = registro.substring(21, 24).trim();
                    modelo = registro.substring(24, 84).trim();
                    marca = registro.substring(84, 99).trim();
                    ano = registro.substring(99, 103).trim();
                    quilometragem = registro.substring(103, 108).trim();

                    System.out.printf("%-17s %-5s %-6s %-60s %15s %4s %5s\n", chassi, rodas, tanque, modelo,
                            marca, ano, quilometragem);
                    contRegistro++;
                } else if (tipoRegistro.equals("03")) {
                    if (contRegistro2 == 0) {
                        System.out.println();
                        System.out.printf("%-5s %-40s %-2s %-5s\n", "ID", "DONO", "VAGA", "COBERTA");
                    }

                    id = registro.substring(2, 7).trim();
                    dono = registro.substring(7, 47).trim();
                    vaga = registro.substring(47, 49).trim();
                    coberta = registro.substring(49, 54).trim();

                    System.out.printf("%-5s %-41s %-3s %-6s\n", id, dono, vaga, coberta);
                    contRegistro2++;
                } else {
                    System.out.println("Tipo de registro inválido");
                }

                // lê o próximo registro
                registro = entrada.readLine();
            }

            // Fecha o arquivo
            entrada.close();
        } catch (IOException e) {
            System.err.printf("Erro ao ler arquivo: %s.\n", e.getMessage());
        }

    }

    public static void main(String[] args) {
        String nomeArq = "Veiculo.txt";
        leArquivo(nomeArq);
    }

}
