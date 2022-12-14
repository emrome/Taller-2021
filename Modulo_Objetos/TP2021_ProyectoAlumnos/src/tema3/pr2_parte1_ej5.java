/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
A- Modifique el ejercicio 2-A. Ahora la balanza debe poder generar un resumen de 
compra más completo. Para eso agregue a la balanza la característica resumen (String). 
Modifique los métodos:
▪ iniciarCompra para que además inicie el resumen en el String vacío. 
▪ registrarProducto para que reciba un objeto Producto (que se caracteriza por peso en 
kg y descripción) y su precio por kg. La operación debe realizar las actualizaciones en 
monto /cantidad de ítems y adicionar al resumen (string) la descripción y el monto 
pagado por este producto. 
▪ devolverResumenDeCompra() para que retorne un String del siguiente estilo: 
“Naranja 100 pesos – Banana 40 pesos – Lechuga 50 pesos – Total a pagar 190 pesos 
por la compra de 3 productos” . La sección subrayada es el contenido de resumen.

Realice las modificaciones necesarias en el programa principal solicitado en 2-B para 
corroborar el funcionamiento de la balanza. 
NOTA: dispone en la carpeta tema 3 de la clase Producto ya implementada. 
Para adicionar la información del producto recibido al resumen use concatenación de 
Strings (operación +). 
 */
import PaqueteLectura.Lector;

//programa 2B MODIFICADO
public class pr2_parte1_ej5 {
    public static void main(String[]args){
        int CORTE=0;
        Balanza5 balanza=new Balanza5();
        
        
        balanza.iniciarCompra();
        double pesoEnKg,precioPorKg;
        
        System.out.println(">>Ingreso de items comprados");
        System.out.println(">>Peso en kg");
        pesoEnKg=Lector.leerDouble();
        while(pesoEnKg!=CORTE){
            Producto producto=new Producto();
            
            producto.setPesoEnKg(pesoEnKg);
            System.out.println(">>Descripcion");
            producto.setDescripcion(Lector.leerString());
            
            System.out.println(">>Precio por kg");
            precioPorKg=Lector.leerDouble();
            balanza.registrarProducto(producto, precioPorKg);
            
            //nueva lectura
            System.out.println(">>Peso en kg");
            pesoEnKg=Lector.leerDouble();
        }
        System.out.println(">>Resumen de la compra: "+balanza.devolverResumenDeCompra());
    }
}