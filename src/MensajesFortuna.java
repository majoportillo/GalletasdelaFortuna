import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MensajesFortuna {
    private List<String> fortunas;
    private Random rand = new Random();

    public static void main(String[] args) {
        Random rand = new Random();
        List<String> fortunas = new ArrayList<String>();
        fortunas.add("No podemos dirigir el viento pero si ajustar las velas");
        fortunas.add("El amor y la tos no se pueden ocultar");
        fortunas.add("Siempre da lo mejor de ti y lo mejor vendrá");
        fortunas.add("Compartir momentos es compartir vida");
        fortunas.add("Una sonrisa cuesta menos que la electricidad y da más luz");
        fortunas.add("El agradecimiento es la memoria del corazón");
        fortunas.add("Que nadie venga a tí sin irse mejor y más feliz");
        fortunas.add("Ella no te ama y nunca te amo");
        fortunas.add("Todo ira bien en tu nuevo proyecto");
        fortunas.add("El trabajo mañana estara pesado");
        fortunas.add("Confia en ti");
        fortunas.add("Suerte!!");
    }

    public String AbrirGalleta(){
        return fortunas.get(rand.nextInt(fortunas.size()));
    }
}
