import java.util.Arrays;
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    //private int[] key;
    //private String[] value;
    private int[] valores;
    private String[] claves;

    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        // key = new int[0];
        //value = new String[0];
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
        
        
        
        
        
        
        
        
        
        //         int sol = 0;///////////////////////////////////añadido el 16-07-2016 //////////////////////////////
        //         int index = 0;
        //         boolean claveRepetida = false;
        //         while (index<valores.length && !claveRepetida ) {
        //             if (clave == claves[index]) {
        //                 claveRepetida = true;
        //                 sol = valores[index];///////////////////////añadido el 16-07-2016 //////////////////////////////////////
        //                 valores[index] = valor;
        //             }
        //             index++;
        //         }
        //         if (!claveRepetida) {
        //             sol = -1;
        //             //index = -1;
        //             int cont = 0;
        //             String[] nuevasClaves = new String[claves.length + 1];
        //             int[] nuevosValores = new int[valores.length + 1];
        //             while (cont<claves.length) {
        //                 nuevasClaves[cont] = claves[cont];
        //                 nuevosValores[cont] = valores[cont];                
        //                 cont++;
        //             }
        //             nuevasClaves[nuevasClaves.length - 1] = clave;
        //             nuevosValores[nuevosValores.length - 1] = valor;
        //             claves = nuevasClaves;
        //             valores = nuevosValores;
        //         }
        //         return sol;////////////////////////////////////  añadido el 16-07-2016//////////////////////////////////////////
        //         //return index; ////////////////////////////// comentado el 16-07-2016//////////////////////////////////////////////
    }
}


