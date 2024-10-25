import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {

        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (people[j].getAge() < people[minIndex].getAge()) {
                    minIndex = j;
                }
            }
            Person temp = people[minIndex];
            people[minIndex] = people[i];
            people[i] = temp;
        }
    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {

        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (people[j].getHeight() < people[minIndex].getHeight()) {
                    minIndex = j;
                }
            }
            Person temp = people[minIndex];
            people[minIndex] = people[i];
            people[i] = temp;
        }
    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        
        int n = people.length;
        for (int i = 1; i < n; i++) {
            Person personaAux = people[i];
            int j = i - 1;
            while(j >= 0 && people[j].getAge() > personaAux.getAge()){
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = personaAux;
        }
    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        int n = people.length;
        for (int i = 1; i < n; i++) {
            Person personaAux = people[i];
            int j = i - 1;
            while(j >= 0 && people[j].getHeight() > personaAux.getHeight()){
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = personaAux;
        }
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (people[mid].getAge() == age) {
                return mid;
            }
            if (people[mid].getAge() < age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        // TODO: Implement binary search by height
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (people[mid].getHeight() == height) {
                return mid;
            }
            if (people[mid].getHeight() > height) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}