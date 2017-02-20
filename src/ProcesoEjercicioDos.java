
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcesoEjercicioDos {
    
    
    static BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
    
    
    
    
    public static void main(String[] args) {
     int opt = 0;
     
     Concesionario random = new Concesionario();
     
     do{
         try {
             System.out.println("---MENU PRINCIPAL---");
             System.out.println("1 == Punto 1 del ejercicio");
             System.out.println("2 == Punto 2 del ejercicio");
             System.out.println("3 == Punto 3 del ejercicio");
             System.out.println("4 == ---SALIR---");
             try {
                 opt = Integer.parseInt(tec.readLine());
             } catch (IOException ex) {
                 Logger.getLogger(ProcesoEjercicioDos.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             if(opt<1 || opt>4){
                 System.out.println("ERROR VUELVE A INTRODUCIR NUMERO");
             }
             
            
             
             
             switch(opt){
                 
                 
                 
                 case 1:
                     
                     random.ordenarPorMarca();
                     System.out.println("LISTADO ORDENADO POR MARCA:\n");
                     random.imprimirConcesionario(random.getConce());
                     random.cuentaMarcas();
                     
                     
                     
                     
                     break;
                     
                     
                     
                 case 2:
                     
                     random.listadoOcasion();
                     
                     break;
                     
                     
                 case 3:
                     
                     //HACERRRRRRRRRRRRRR buscar clase fecha, metodo que devuelva un int con el mes actual y el anio
                     int mesActual = 5;
                     int anioActual = 2000;
                     
                     
                     String marca;
                     String modelo;
                     int gama;
                     String fechaEntrada = mesActual + "/" + anioActual;
                     boolean matricula;
                     int precio;
                     
                     System.out.println("Dime la marca");
                     marca = tec.readLine();
                     
                     System.out.println("Dime el modelo");
                     modelo = tec.readLine();
                     
                     System.out.println("Dime la gama");
                     gama = Integer.parseInt(tec.readLine());
                     
                     
                     // no valido, me falta tiempo
                     System.out.println("Tiene matricula? Si/No");
                     if(tec.readLine().equalsIgnoreCase("si")){
                         matricula = true;
                     }else{
                         matricula = false;
                     }
                     
                     System.out.println("Dame el precio");
                     precio = Integer.parseInt(tec.readLine());
                     
                     Vehiculo nuevo = new Vehiculo(marca, modelo, gama, fechaEntrada, matricula, precio);
                     
                     
                     random.añadirVehiculo(nuevo);
                     
                   
                     break;
                     
                     
                     
                 case 4:
                     System.exit(0);
                     
                     
                     break;
                     
                     
                     
             }
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
         } catch (IOException ex) {
             Logger.getLogger(ProcesoEjercicioDos.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
     }while(opt<1 || opt>4);

        
        
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
}
