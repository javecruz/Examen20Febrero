
public class Concesionario {

    //cambiar si quieres cambiar el tamaño del concesionario
    private Vehiculo[] conce = new Vehiculo[10];

    //ordena alfabeticamente por marca
    public void ordenarPorMarca() {

        //creo el auxiliar de turno...
        Vehiculo aux = new Vehiculo();

        //ordeno alfabeticamente
        for (int i = 0; i < getConce().length - 1 && getConce()[i + 1] != null; i++) {

            for (int j = i + 1; j < getConce().length; j++) {

                //ordeno alfabeticamente
                if (getConce()[i].getMarca().compareToIgnoreCase(getConce()[j].getMarca()) > 0) {
                    aux = getConce()[i];
                    getConce()[i] = getConce()[j];
                    getConce()[j] = aux;

                }

            }

        }

    }

    public void cuentaMarcas() {

        //creo array de string para guardar SOLO 1 vez todas las marcas, sin repetirlas
        String[] marcas = new String[conce.length];

        //relleno el array de marcas, seguiran estando duplicadas
        for (int i = 0; i < conce.length && conce[i] != null; i++) {

            marcas[i] = conce[i].getMarca();

        }

        //ahora voy a quitar las duplicadas y reordenar el array ya que posiblemente queden huecos nullos
        for (int i = 0; i < marcas.length && marcas[i] != null; i++) {

            // importante aqui nos interesa entrar en los nullos
            for (int j = i + 1; i < marcas.length; j++) {
                //pongo a null los duplicados
                if (marcas[i].compareToIgnoreCase(marcas[j]) == 0) {
                    marcas[i] = null;
                }
                

            }

        }
        
        //ahora tengo un array de Strings unicamente 1 vez cada marca y con posiblmente huecos nullos, voy a reestructurarlo
        
        //me interesa entrar en los nulos.
        for(int i=0;i<marcas.length;i++){
        
            //mueve todo hacia la izkierda...
            if(marcas[i]==null && marcas[i+1] != null){
            
            marcas[i] = marcas[i+1];
            marcas[i+1] = null;
            
            }
            
            
        }
        
        
        
        // ahora VOY A CONTAR el nº de veces de cada marca, guardare el numero en un array de ints y los indices del array de marcas y el array de ints correspondaran unos con otros
        
        int[] vecesMarcas = new int[marcas.length];
        int cont = 0;
        
        
        //este array recorrera el array de marcas
        for(int i=0;i<marcas.length && marcas[i] !=null;i++){
        
            
            //este array recorre todo el concesionario
        for(int j=0;i<conce.length && conce[j] !=null;j++){
        
        if(marcas[i].equalsIgnoreCase(conce[j].getMarca()))
        
        cont++;
        }
        
        vecesMarcas[i] = cont;
        cont = 0;
        }
        
        
        // ahora imprimo cuantas veces esta cada marca
        
        for(int i=0;i<marcas.length && marcas[i] != null;i++){
        
            System.out.println(marcas[i] + ":" + vecesMarcas[i]);
        
        
        }

        
        
        
    }



public void listadoOcasion() {

        //HACERRRRRRRRRRRRRR buscar clase fecha, metodo que devuelva un int con el mes actual 
        int mesActual = 5;
        int anioActual = 2017;
        int mesCoche = 0;
        int anioCoche = 0;
        int antiguedad = 0;

        for (int i = 0; i < getConce().length; i++) {

            // devuelve el mes del coche
            mesCoche = Integer.parseInt(getConce()[i].getFechaEntrada().substring(0, getConce()[i].getFechaEntrada().indexOf("/")));

            // devuelve el anio actual
            anioCoche = Integer.parseInt(getConce()[i].getFechaEntrada().substring(getConce()[i].getFechaEntrada().indexOf("/") + 1));

            //cojo la antiguedad del coche EN MESES, controlo si estamos en el mismo año y tal..
            if (anioActual == anioCoche) {

                antiguedad = mesActual - mesCoche;
            } else {
                antiguedad = ((anioActual - anioCoche) * 12) + (mesActual - mesCoche);

            }

            //miro si es de ocasion y lo imprimo
            if (getConce()[i].isMatricula()) {
                System.out.println("Coche nº" + (i + 1));
                System.out.println(getConce()[i].imprimirCoche());

                // ahora miro si a parte de ser de ocasion tiene mas de 6 meses de antigüedad
                if (antiguedad > 6) {
                    //rebajo 15% al precio, necesito castearlo a int porque l multiplicar por decimales, salen decimales como resultado
                    getConce()[i].setPrecio((int) (getConce()[i].getPrecio() * 0.85));

                    System.out.println("OFERTA");
                    System.out.println("NUEVO PRECIO DE: " + getConce()[i].getPrecio());

                }
            }

        }

    }

    public void añadirVehiculo(Vehiculo coche) {

        // busca la primera posicion no nula, y también entra si el array esta vacio o sea si conce[0] es nulo
        for (int i = 0; (i == 0 && conce[i] == null) || (i < conce.length && conce[i] != null); i++) {

            if (i == 0 && conce[i] == null) {
                conce[i] = coche;

            }

            if (i != conce.length - 1 && conce[i + 1] == null) {

                conce[i] = coche;
            }

            if (i == conce.length - 1) {

                System.out.println("NO HAY HUECO EN EL ARRAY");
            }

        }

    }

    //metodo imprimir
    public void imprimirConcesionario(Vehiculo[] conce) {

        for (int i = 0; i < conce.length; i++) {
            System.out.println("Coche nº " + (i + 1));
            System.out.println(conce[i].imprimirCoche());

        }

    }

    /**
     * @return the conce
     */
    public Vehiculo[] getConce() {
        return conce;
    }

    /**
     * @param conce the conce to set
     */
    public void setConce(Vehiculo[] conce) {
        this.conce = conce;
    }

}
