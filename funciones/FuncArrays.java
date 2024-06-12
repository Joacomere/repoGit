public class FuncArrays {

    /**
     * Funcion para cargar arrays con numeros random
     *@param v el vector que recibe la funcion
     */
    public static void cargaarrays(int[] v) {
        for (int i = 0; i< v.length; i++){
            v[i] = (int)((Math.random()* 101) + 1);
        }
    }
    /**
     * Funcion para obtener el menor valor de un array
     * @param v el vector que recibe la funcion
     * @return menor valor
     */
    public static int menorValorArray(int[] v) {
      int menor = Integer.MAX_VALUE;
       for(int i = 0; i< v.length; i++){
           if(v[i]< menor){
             menor = v[i];
            }
        }
     return menor;
     }
 /**
  * funcion para obtener el mayor valor en un array
  * @param v el vector que recibe la funcion
  * @return valor mayor
  */
  public static int mayorValorArray(int[] v) {
    int mayor = Integer.MIN_VALUE;
       for(int i = 0; i< v.length; i++){
          if(v[i]>mayor){
            mayor = v[i];
          }
        }
    return mayor;
  }
}