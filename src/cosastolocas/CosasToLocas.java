package cosastolocas;

/**
  @author ArbDhaNooB
 */
public class CosasToLocas {

    public static void main(String[] args) {
        int o = 4; 
        int i=2;
        double a=9.1;
        
       /*
        //variable de la que dependera el resultado
       //bucle
       while(i<4000){
       i++;
       System.out.println(i);
       }
       //respuesta para numero pequeño
       if(i<20){
       System.out.println("ehto eh un ñordo zolo " + i);
       }
       //respuesta para numero grande
       else{
       System.out.println( i+ " zuper jrande");
       }
        
     
               if(-1<=0 && o<=1){
               System.out.println(o);
               }
           
               if(o % 2 ==0){
               System.out.println(o+ " es multiple de 2");
               }
               else{
                   System.out.println( o+" no es multiple de 2");
               }
            
               if(o % i ==0){
               System.out.println(o+ " es multiple de " + i);
               }
               else{
                   System.out.println( o+" no es multiple de " + i);
               }
               
       if(a<=4.9 && a>=0){
        System.out.println("suspendido con: " +a );
       }
       else if (a<=6.9){
       System.out.println("aprovdo con: " +a );
       }
       else if (a<=8.5){
       System.out.println("notable de: " +a );
       }
       else if (a<=9.5){
       System.out.println("excelente de: " +a );
       }
       else if (a<=9.6){
       System.out.println("Matricula de honor");
       }
       else{
       System.out.println("Nota no valida");
       }
          */
       int año= 1998;
       switch (año % 12){
           case 0:System.out.println("Rata");
           break;
           case 1:System.out.println("Buey");
           break;
           case 2:System.out.println("Tigre");
           break;
           case 3:System.out.println("Conejo");
           break;
           case 4:System.out.println("Dragón");
           break;
           case 5:System.out.println("Serpiente");
           break;
           case 6:System.out.println("Caballo");
           break;
           case 7:System.out.println("Cabra");
           break;
           case 8:System.out.println("Mono");
           break;
           case 9:System.out.println("Gallo");
           break;
           case 10:System.out.println("Perro");
           break;
           case 11:System.out.println("Cerdo");
           break;
           
       }
               
    }
    
}
