//Ejercicio 1
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.

//Ejercicio2
//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author camir
 */
public class NewMain {
    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in);
        
        
        int op = 0;
        while (op==0) {     //Pedir datos al usuarip y llenar lista       
            System.out.println("Introdusca la raza");
            String raza = leer.next();
            razas.add(raza);
            System.out.println("Desea guardar otra raza precione 0?");
            op = leer.nextInt();
        }
        
        for (String raza : razas) {  //mostrar lista
            System.out.println(raza);
        }
        
        Iterator<String> it = razas.iterator();
        
        System.out.println("Introdusca la raza que desee eliminar");
        String eliminar = leer.next();
        while (it.hasNext()){  //eliminar un elemento de la lista
            if (it.next().equals(eliminar)){
                it.remove();
            }
        }
        
        Collections.sort(razas); //Ordena alfabeticamente las razas
        
         for (String raza : razas) { //mostrar lista
            System.out.println(raza);
        }
        
        
        
        
    }
    
}
