package cosastolocas;

/**
  @author ArbDhaNooB
 */
public class CosasToLocas {

    public static void main(String[] args) {
        int o = 4; 
        int i=2;
        double a=9.1;
        int j = 0;
        int suma = 0;
        int sumatorio= 5;
      
      //primeros 100 numeros primos
      while(suma<=100){
        boolean primo = true;
        //saber si un numero es primo
        for(int w =j-1;primo && w>1;w--){
            if (j%w==0){
                primo = false;
            break;
            }    
        }
        if(primo && j!=1){
        System.out.println(j+" es primo y esta en la posición nª "+ suma);
        suma++;
        }
        j++;
        }
      
      //numeros primos de donde tu quiras al 1000
      while(j<100){
        boolean primo = true;
        //saber si un numero es primo
        for(int w =j-1;primo && w>1;w--){
            if (j%w==0){
                primo = false;
            break;
            }    
        }
        if(primo && j!=1){
        System.out.println(j+" es primo");
        }
        j++;
        }
      
        Cosa2 cosa = new Cosa2();
        int num;
        num =cosa.llegirSencer();
      
      //saber si el valor introducido es primo
        boolean primo = true;
        //saber si un numero es primo
        for(int w =num-1;primo && w>1;w--){
            if (num%w==0){
                primo = false;
            break;
            }    
        }
        if(primo && num!=1){
        System.out.println("primo");
        }
        else{
        System.out.println("no primo");
        }
      
      
        //divisores de un numero que tu das
        int begin=num;
        for(int w =num;w>0;w--){
        if (num%w==0){
            System.out.println(w);
            }
        }
        
        
        //lo mismo con while
        while(0<begin){
            if (num%begin==0){
            System.out.println(begin);
            }
        begin--;
        
        }
        //Decide si los numeros introducido son  par o impar
        while(num !=0){
            if(num%2==0){
                System.out.println( num+ " Es par");
            }
            else{
                System.out.println(num + " Es impar");
            }
            num =cosa.llegirSencer();
        }
       //suma de numeros introducidos por teclado
        while(num !=0){
        suma=num+suma;
        num =cosa.llegirSencer();
        }
        System.out.println(suma);
       
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
       //En el   
       int año= 1998;
       switch (año % 12){
           case 0:System.out.println("Mono");
           break;
           case 1:System.out.println("Gallo");
           break;
           case 2:System.out.println("Perro");
           break;
           case 3:System.out.println("Cerdo");
           break;
           case 4:System.out.println("Rata");
           break;
           case 5:System.out.println("Buey");
           break;
           case 6:System.out.println("Tigre");
           break;
           case 7:System.out.println("Conejo");
           break;
           case 8:System.out.println("Dragón");
           break;
           case 9:System.out.println("Serpiente");
           break;
           case 10:System.out.println("Caballo");
           break;
           case 11:System.out.println("Cabra");
           break;
       }
       //sumatorio while
       while(j<sumatorio){
            j++;
            suma=j+suma;
            //System.out.println(i);
            System.out.println(suma);
       }
       //do while de sumatorio
       do{
            j++;
            suma=j+suma;
            //System.out.println(i);
            System.out.println(suma);
       }
       while(j<sumatorio);
        
       //for de sumatorio
       for(int p =0; p<sumatorio;p++){
            suma=p+suma;
            System.out.println(suma);
       }
       //sacar muchos 0 en linea sin tener que escribirlos tu
       for(int p = 0; p<=10; p++){
           
           System.out.print("0");
       }
       //sacar una "matriz" de o sin tener que escribirlos tu 
       for(int p = 0; p<=10; p++){
           for(int w=0; w<=10;w++){
               System.out.print("0");
           }
           System.out.println();
       }
      //"matriz" con 1 en la diagonal 
      for(int p = 0; p<=4; p++){
           for(int w=0; w<=4;w++){
               
               if(w==p){
               System.out.print("1");
               }
               else{
               System.out.print("0");
               }
           }
           System.out.println();
       }
               
    }
    
}
