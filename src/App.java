
import models.Person;
import models.PersonasGenerator;
import models.Carro;
import models.CarrosGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        // Generar y mostrar personas
        PersonasGenerator personasGenerator = new PersonasGenerator();
        Person[] personas = personasGenerator.generarPersonas();

        System.out.println("Listado de personas generadas: ");
        for (Person persona : personas) {
            System.out.println(persona);
        }

        MetodosOrdenamientoBusqueda metodosPersonas = new MetodosOrdenamientoBusqueda();
        metodosPersonas.showPeople(personas);

        // Búsqueda binaria por edad
        int resultadoEdad = metodosPersonas.searchBinaryByAge(personas, 27);
        if (resultadoEdad == -1) {
            System.out.println("No se encontró esa edad");
        } else {
            System.out.println("Se encontró la edad en la posición: " + resultadoEdad);
        }

        // Búsqueda binaria por altura
        int resultadoAltura = metodosPersonas.searchBinaryByHeight(personas, 151);
        if (resultadoAltura == -1) {
            System.out.println("No se encontró la altura");
        } else {
            System.out.println("Se encontró en la altura en la posición: " + resultadoAltura);
        }

        // Generar y mostrar carros
        CarrosGenerator carrosGenerator = new CarrosGenerator();
        Carro[] carros = carrosGenerator.generarCarros();

        System.out.println("Listado de carros generados:");
        MetodosOrdenamientoBusquedaGrupoB metodosCarros = new MetodosOrdenamientoBusquedaGrupoB();
        metodosCarros.sortBYearWithBubbleAvnAsendente(carros);
        metodosCarros.showCars(carros);

        // Búsqueda binaria por año
        int resultadoAnio = metodosCarros.searchBinaryByYear(carros, 2020);
        if (resultadoAnio == -1) {
            System.out.println("No se encontró el carro");
        } else {
            System.out.println("El carro se encuentra en la posición: " + resultadoAnio);
        }
    }
}
