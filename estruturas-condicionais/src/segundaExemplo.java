public class segundaExemplo {
    public static void main(String[] args) {

        // Segundo exemplo

        int nota = -1;

        // A 80 B 70 C 60 D 0

        if (nota >= 80) {
            System.out.println("Graduação A");
        } else if (nota < 80 && nota >= 70) {
            System.out.println("Graduação B");
        } else if (nota < 70 && nota >= 60) {
            System.out.println("Graduação C");
        } else if (nota < 60 && nota >= 0) {
            System.out.println("Graduação D");
        } else {
            System.out.println("Nota inválida!");
        }


    }
}