import java.util.Arrays;
import java.util.List;

/* Prawdopobnie użycie Seta w metodzie transform jest niepotrzebne, gdyż sama
Mapa by wystarczyła ale na samym końcu zająłem sie
interfacem i nie chciałem w pośpiechu nic zmieniać.
W rozwiązaniu mogłaby sie znaleźć lepsza walidacja
inputu od użytkownika a zamiast zwykłych pętli for w "transform" można
by chyba użyć streamów ale
chciałem mieć pewność, że sie wyrobię"
 */

public class Application {

    public static void main(String[] args){

        Controller controller = new Controller();
        controller.run();

    }
}
