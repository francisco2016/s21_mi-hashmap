
import java.util.Arrays;
/**
 * Francisco, septiembre.
 */
public class MiHashMap
{
    private int[] valores;
    private String[] claves;
    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        valores= new int[0];
        claves = new String[0];
    }

    /**
     *Asocia el valor especificado con la clave especificada. Si la clave existía,
     *entonces sobreescribe su valor y devuelve el valor antiguo. Si no existía devuelve -1.
     */
    public int put(String clave, int valor){
        //para saber si la clave existe tenemos que recorrer la colección.
        int sol = 0;// variable a devolver en caso de no existir clave igual.
        int index = 0;
        boolean encontrado = false;
        //recorremos la colección "claves"
        while(index < claves.length && !encontrado){
            if(claves[index] == clave){
                sol = valores[index];//guardo el valor de valores[index]en la VL que tengo que retornar.
                valores[index] = valor;//cambio el valor de valores[index] por tener la misma clave que el parámetro
                encontrado = true;
            }
            index ++;
        }
        //Ahora supongo que la clave no existe, luego, tengo que aumentar la colección para almacenar la clave y su valor¡¡¡.
        if(!encontrado){
            int[] valores2 = new int[valores.length + 1];
            String[] claves2 = new String[claves.length + 1];
            //creamos un bucle para copiar "valores" en "valores2".
            sol = -1;  //variable a devolver en caso de no existir clave igual.
            int cont = 0;
            while(cont < claves.length){
                claves2[cont] = claves[cont];
                valores2[cont] = valores[cont];
                cont ++;
            }
            //una vez copiada, pasamos los valores dados en los parámetros, a la colección.
            claves2[claves2.length - 1] = clave;
            valores2[valores2.length - 1] = valor;
            claves = claves2;
            valores = valores2;
        }
        return sol; //devuelvo el valor.
    }

    /**
     * Devuelve el valor asociado con la clave especificada o -1 en caso de que la clave no exista.
     */
    public int get(String clave){
        int sol = -1;
        int cont = 0;
        boolean encontrado = false;
        while(cont < claves.length && !encontrado){
            if(claves[cont] == clave){
                sol = valores[cont];
                encontrado = true;
            }
            cont ++;
        }
        return sol;
    }

    /**
     * devuelve true si el mapa no contiene elementos.
     */
    public boolean isEmpty(){
        boolean empty = true;
        if(claves.length > 0){
            empty = false;
        }
        return empty;
    }

    /**
     * devuelve el número de elementos del mapa.
     */
    public int size(){
        return claves.length;
    }

    /**
     * elimina del mapa el elemento con la clave dada y devuelve su valor. Si no hay esa clave en el mapa devuelve -1.
     */
    public int remove(String clave){
        int sol = -1;//VL para retornar la solución.
        int sol2 = 0; //VL para guardar el índice de la coincidente con la clave dada.
        int cont = 0;
        boolean encontrado = false;
        while(cont < valores.length && !encontrado){
            if(claves[cont] == clave){
                sol2 = cont;//almaceno el índice donde se encuentra la clave coincidente con la pasada como parámetro.
                sol = valores[cont]; //almaceno el valor de la clave.
                encontrado = true;
            }
            cont ++;
        }

        if(sol2 < claves.length && sol2 >= 0){
            int[] valores3 = valores;
            valores = new int[valores3.length -1];
            String[] claves3 = claves;
            claves = new String[claves.length -1];

            for(int i = 0; i < sol2; i ++){                   
                valores[i] = valores3[i];
                claves[i] = claves3[i];
            }
            for(int z = sol2; z < claves.length; z ++){
                sol2 = cont;
                valores[z] = valores3[z +1];
                claves[z] = claves3[z +1];
            }

        }
        return sol;
    }
    
    /**
     * vacía el mapa.
     */
    public void clear(){
          valores = new int[0];;
          claves = new String[0];;
        
    }
}
































