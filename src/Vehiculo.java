public class Vehiculo {
    
    
    private String marca;
    private String modelo;
    private int gama;
    private String fechaEntrada;  //formato dd/aaaa
    private boolean matricula;
    private int precio;
    
    public Vehiculo(String marca, String modelo, int gama, String fechaEntrada, boolean matricula, int precio){


    this.marca = marca;
    this.modelo = modelo;
    this.gama = gama;
    this.fechaEntrada = fechaEntrada;
    this.matricula = matricula;
    this.precio = precio;
  
}
    
    //necesito este constructor para crearme un auxiliar todo a nulo que luego igualare a otro objeto para ordenar por marca
    public Vehiculo(){
    }
    
    public String imprimirCoche(){

        return "Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nGama: "+getGama()+"\nFecha de entrada: "+getFechaEntrada()+"\nMAtricula: "+isMatricula()+"\nPrecio: "+getPrecio();

}

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the gama
     */
    public int getGama() {
        return gama;
    }

    /**
     * @param gama the gama to set
     */
    public void setGama(int gama) {
        this.gama = gama;
    }

    /**
     * @return the fechaEntrada
     */
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * @param fechaEntrada the fechaEntrada to set
     */
    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * @return the matricula
     */
    public boolean isMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    
}
