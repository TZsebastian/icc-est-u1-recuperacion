import models.Carro;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Asendentemente
    public void sortBYearWithBubbleAvnAsendente(Carro[] carros) {
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (carros[j].getYear() > carros[j + 1].getYear()) {
                    // Swap carross[j] and carross[j+1]
                    Carro temp = carros[j];
                    carros[j] = carros[j + 1];
                    carros[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort by year Desendentemente
    public void sortBYearWithBubbleAvnDesendente(Carro[] carros) {
        // TODO: Implement selection sort by height
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (carros[j].getYear() < carros[j + 1].getYear()) {
                    // Swap carross[j] and carross[j+1]
                    Carro temp = carros[j];
                    carros[j] = carros[j + 1];
                    carros[j + 1] = temp;
                }
            }
        }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] carros, int year) {
        // TODO: Implement binary search by height

        int izquierda = 0;
        int derecha = carros.length - 1;
        while (izquierda <= derecha) {
            int mid = izquierda + (derecha - izquierda) / 2;
            if (carros[mid].getYear() == year) {
                return mid;
            }
            if (carros[mid].getYear() < year) {
                izquierda = mid + 1;
            } else {
                derecha = mid - 1;
            }
        }
        return -1; 
    }

    // Metodo que imprime el listado de personas
    public void showCars(Carro[] carros) {
        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
}