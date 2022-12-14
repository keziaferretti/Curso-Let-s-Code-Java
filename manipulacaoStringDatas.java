//Aula 6 - Manipulação de String e Datas 

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class manipulacaoStringDatas {
    public static void main(String[] args) {
        //Olá {nome}. Hoje é {dia da semana}, Bom dia.

        String nome = "Kézia";
        // System.out.println(nome.toUpperCase()); // Maiusculo 
        // System.out.println(nome.toLowerCase()); // minusculo
        // System.out.println(nome.length()); //tamanho

        // String nomeOutro = "eduardo";
        // System.out.println(nome.equals(nomeOutro));

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "Boa noite!";
        } else {
            saudacao = "olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

    }
}
