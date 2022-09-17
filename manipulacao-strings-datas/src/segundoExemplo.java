import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class segundoExemplo {
    public static void main(String[] args) {
        // Olá, (nome), Hoje é (dia-da-semana), Bom Dia !

        String nome = "Lucas";

        // ISO 8601

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));


    }
}
