public class VerificacaoDiaUtil {

    public void verificaDia(String dia) {
        if (dia.equals("segunda-feira") || dia.equals("terca-feira") || dia.equals("terça-feira") || dia.equals("quarta-feira") || dia.equals("quinta-feira") ||
                dia.equals("sexta-feira") || dia.equals("segunda") || dia.equals("terca") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") ||
                dia.equals("sexta"))
            System.out.println(dia + " é um dia útil");
        else if (dia.equals("sabado") || dia.equals("sábado") || dia.equals("domingo") )
            System.out.println(dia + " não é um dia útil");
        else
            System.out.println("Entrada inválida");
    }
}
