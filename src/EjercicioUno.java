
public class EjercicioUno {

    public int[] crearArray() {

        int[] arrayOriginal = new int[10];
        //relleno el array de numeros aleatorios

        System.out.println("Array Original\n");
        for (int i = 0; i < arrayOriginal.length; i++) {
            // aleatorio de 1 a 10 e imprime array para verlo
            arrayOriginal[i] = (int) (Math.random() * 10 + 1);

        }

        return arrayOriginal;
    }

    public int[] ordenarArray(int[] original) {

        //clono array para trabajar con el
        int[] arrayOrdenado = original.clone();
        int aux = 0;
        //se puede hacer de muchas otras formas,por ejemplo, creando 2 arrays uno para pares y otro para impares meto en cada uno los pertinentes, los ordeno y luego los meto en el array que tiene que devolver, pero no quiero crear tantas variables y quiero hacerlo todo con el array clonado

        //pone pares primero
        for (int i = 0; i < arrayOrdenado.length - 1; i++) {

            for (int j = i + 1; j < arrayOrdenado.length; j++) {

                //miro si indice de i y j son pares y si i es mayor a j, entonces cambia orden
                if (arrayOrdenado[i] % 2 != 0 && arrayOrdenado[j] % 2 == 0) {
                    aux = arrayOrdenado[i];
                    arrayOrdenado[i] = arrayOrdenado[j];
                    arrayOrdenado[j] = aux;

                }

            }

        }

        //ordeno pares
        for (int i = 0; i < arrayOrdenado.length - 1; i++) {

            for (int j = i + 1; j < arrayOrdenado.length; j++) {

                //miro si indice de i y j son pares y si i es mayor a j, entonces cambia orden
                if (arrayOrdenado[i] % 2 == 0 && arrayOrdenado[j] % 2 == 0 && arrayOrdenado[i] > arrayOrdenado[j]) {
                    aux = arrayOrdenado[i];
                    arrayOrdenado[i] = arrayOrdenado[j];
                    arrayOrdenado[j] = aux;

                }

            }

        }

        //ordeno impares
        for (int i = 0; i < arrayOrdenado.length - 1; i++) {

            for (int j = i + 1; j < arrayOrdenado.length; j++) {

                if (arrayOrdenado[i] % 2 != 0 && arrayOrdenado[j] % 2 != 0 && arrayOrdenado[i] > arrayOrdenado[j]) {
                    aux = arrayOrdenado[i];
                    arrayOrdenado[i] = arrayOrdenado[j];
                    arrayOrdenado[j] = aux;

                }

            }

        }

        return arrayOrdenado;
    }

    // metodo para imprimir
    public void imprimir(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t");

        }

    }

    //constructor
    public EjercicioUno() {
    }

    //ejecución del programa
    public static void main(String[] args) {

        //creo un objeto de la clase Ejercicio1
        EjercicioUno random = new EjercicioUno();

        //creo array
        int[] original = random.crearArray();

        //imprimo original
        System.out.println("ARRAY ORIGINAL\n");
        random.imprimir(original);

        //clono y ordeno
        int[] ordenado = random.ordenarArray(original);

        //imprimo el clonado
        System.out.println("\n\nARRAY ORDENADO\n");
        random.imprimir(ordenado);

    }

}
