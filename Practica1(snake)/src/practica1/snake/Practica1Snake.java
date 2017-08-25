package practica1.snake;
import java.util.Scanner;
import java.util.Random;

public class Practica1Snake {
    static String usuario="";
    static int tamañox=0;
    static int tamañoy=0;
    static int tamañosnake=0;
    static int record=0;
    static int [][] matrizjuego;
    static String [] partidasjugadas=new String[10];
    static String [][]matrizD;
    static int[] snake;
    static String[] psnake;
    static int[]pfruto;
    static String [] posicion;
    static int frutopoint=0;
    static Scanner opcion =new Scanner(System.in);
    static int contadorp=0;
    
    public static void main(String[] args) {
    
            Menu(); 
    }
    public static void limpiar(){
        int lineas=100;
        for (int i=0; i < lineas; i++)
        {
            System.out.println();
        }
    }
    
    public static void Menu(){   
            int opmenu=0;
            System.out.println("\033[34m +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("\033[34m +            Bienvenido al Juego de Snake               +");
            System.out.println("\033[34m +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("\033[34m +        Seleccione un de las siguientes opciones       +");
            System.out.println("\033[34m +           1. Inicio del juego                         +");
            System.out.println("\033[34m +           2. Datos del alumno                         +");
            System.out.println("\033[34m +           3. Historial de partidas                    +");
            System.out.println("\033[34m +           4. Salir                                    +");
            System.out.println("\033[34m +++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
      
            opmenu=opcion.nextInt();
            
        switch(opmenu)
           {
          
               case 1:
                 //limpiar();
                 InicioJuego();
               break;
               case 2:
                 
                  DatosAlumno();
               break;
               case 3:
                   
                   Historial();
               break;
               case 4:
                   
                   System.out.println("adios");
                   System.out.close();
                 
               break;
               
               default: 
                   System.out.println("Escriba una opcion valida ");

           }
    }
    public static void DatosAlumno(){
        
            System.out.println("\033[34m -----------------------------@@@@@@@@@@------------------");
            System.out.println("\033[34m ----------------------------+@@´´´´´´´´@@@---------------");
            System.out.println("\033[34m -------------*@@@@@@@@1´´´´@@´´´´´´´´´´´´@@--------------");
            System.out.println("\033[34m -----------@@@´´´´´´´´@@@´´@´´´´´´´´´´´´´´@@--------------");
            System.out.println("\033[34m ---------@@@´´´´´´´´´´´´@@@@´´´´´´´´´´´´´´´@@-------------");
            System.out.println("\033[34m -------@@´´´´´´´´´´´´´´´´@@´´@@@@´´´´´´´´´´@@--------------");
            System.out.println("\033[34m -------@@´´´´´´´@@@´´´´´´´@´´@@@@´´´´´´´´´´@@--------------");
            System.out.println("\033[34m -------@´´´´´´´@@@@@´´´´´´@@´´@@´´´´´´´´´´´@@--------------");
            System.out.println("\033[34m -------@´´´´´´´´@@@´´´´´´´@@@´´´´´´´´´´´´@@@@--------------");
            System.out.println("\033[34m -------@@´´´´´´´´´´´´´´´´´@´@@@´´´´´´´´@@@´´@@-------------"); 
            System.out.println("\033[34m --------@@@´´´´´´´´´´´´´@@@´´´´@@@@@@@@´´´´´´@@------------");
            System.out.println("\033[34m ----------@@´´´´´´´´@@@´´´´´´´´´´´´´´´´´´´´´´´@------------");
            System.out.println("\033[34m -----------@@@@@@@@@´´´´´´´´´´´´´´´´´´´´´´´´´´@@-----------");
            System.out.println("\033[34m ----------@@´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´´@@----------"); 
            System.out.println("\033[34m ---------@@´´´´´´´´´´´´´´´´´´´´´´@´´´´´´´´´´´´´@@----------");
            System.out.println("\033[34m ----------@@´´´´´´´´´@@´´´´´´´´´@@´´´´´´´´´´´´@@-----------");
            System.out.println("\033[34m -----------@@´´´´´´´´´@@@´´´´´´@@´´´´´´´´´´´´@@------------");
            System.out.println("\033[34m ------------@@´´´´´´´´´´´@@@@@@@´´´´´´´´´´´@@--------------");
            System.out.println("\033[34m -------------@@@´´´´´´´´´´´´´´´´´´´´´´´´´@@----------------");
            System.out.println("\033[34m ---------------@@@@@@@@@@@@@@@@@@@@@@@@@@------------------");
            System.out.println("\033[34m -                                                         -");
            System.out.println("\033[34m -                José David Aldana Estrada                -");
            System.out.println("\033[34m -                  Carne:  201602467                      -");
            System.out.println("\033[34m -        Introduccion a la Programacion y Computacion 1   -");
            System.out.println("\033[34m -----------------------------------------------------------");
            System.out.println("\033[34m Regresar al menu principal 1 o 2 para salir del programa.");
            
            Scanner opcion =new Scanner(System.in);
            int regreso=opcion.nextInt();
            if(regreso==1){
                Menu();
            }
            else if(regreso==2){
                System.out.close();
            }else{
                
                System.out.println("Elija un una opcion valida");
            }
               
           
    }
    public static void InicioJuego(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario");
        usuario=entrada.next();
        System.out.println("Tamaño de su tablero, ser mayor a 10x10 porfavor :)");
        System.out.println("Tamaño en x");
        tamañox=entrada.nextInt();
        System.out.println("Tamaño en y");
        tamañoy=entrada.nextInt();
        System.out.println("Tamaño de la Snake inicial");
      
        tamañosnake=entrada.nextInt();
        
        
       matrizD= new String[tamañoy][tamañox];
       matrizjuego= new int[tamañoy][tamañox]; 
       psnake = new String[tamañox*tamañoy];
       Juego();
       
    }
    public static void Juego(){
        
         Imprimirinicio();
         String paso =" ";  
        System.out.println("Presione cualquiera de estas teclas para empezar el juego");
        System.out.println("Presione a para ir al lado izquierdo, d para ir a lado derecho");
        System.out.println("Presione w para ir arriba y s para ir  abajo");
        Scanner mov=new Scanner(System.in);
       
        try{
            String movi=" ";
            while(!"e".equals(movi)){
                movi=mov.nextLine();
                Movimiento(movi);
            }
        }
        catch(Exception e){
            Menu();
        }
       //ahora lee los movimeintos1
    }
    
    public static void Movimiento(String po)	
    {   
       int limite=0;
       int contador=0;
        String direccion=" ";

                            int xpos=0;
                            int ypos=0;
                            String ubicacion="";
                            
          switch (po) {
                        case "s":
                          direccion="abajo";
                           limite=0;
                              for(int i=0;i<psnake.length;i++){
                            if(psnake[i]!=null ){
                            ubicacion=psnake[i];
                            posicion= ubicacion.split(","); 
                                
                                if(direccion=="abajo" && limite==0){ 
                                    xpos=Integer.parseInt(posicion[0]);
                                    ypos=Integer.parseInt(posicion[1]);
                                 try{
                                    if(matrizjuego[xpos+1][ypos]==2){
                                        matrizjuego[xpos+1][ypos]=1;
                                          limite=ypos;                                            
                                    contador++;
                                    record=record+frutopoint;
                                    Random();
                                    psnake[i]=Integer.toString(xpos+1)+","+Integer.toString(ypos);
                                    }else{
                                    xpos=Integer.parseInt(posicion[0])+1;
                                    ypos=Integer.parseInt(posicion[1]);
                                   
                                    limite=ypos;                                            
                                    contador++;
                                    }
                                 }       catch(Exception e){
                                 
                                        partidasjugadas[contadorp]=usuario+","+Integer.toString(record)+","+Integer.toString(tamañox)+","+Integer.toString(tamañoy)+","+Integer.toString(tamañosnake);
                                        contadorp++;
                                        Menu();
                                    }
                                }
                                else if(ypos==Integer.parseInt(posicion[1])&&limite==Integer.parseInt(posicion[1])) {
                              
                                    xpos=Integer.parseInt(posicion[0])+1;
                                    ypos=Integer.parseInt(posicion[1]);
                                     
                                }
                                else{                                   
                                      xpos=Integer.parseInt(posicion[0]);
                                      ypos=Integer.parseInt(posicion[1])+1;
                                    }
                                
                              
                              psnake[i]=Integer.toString(xpos)+","+Integer.toString(ypos);
                            }
                            }
                             
                          Modificarmatriz();
                          Imprimir();
                            break;
                        case "w":  
                            direccion="arriba";
                           limite=0;
                              for(int i=0;i<psnake.length;i++){
                            if(psnake[i]!=null ){
                            ubicacion=psnake[i];
                            posicion= ubicacion.split(","); 
                                
                                if(direccion=="arriba" && limite==0){ 
                                   
                                    xpos=Integer.parseInt(posicion[0]);
                                    ypos=Integer.parseInt(posicion[1]);
                                try{
                                    if(matrizjuego[xpos-1][ypos]==2){ 
                                         matrizjuego[xpos-1][ypos]=1;
                                         limite=ypos;                                            
                                        contador++;
                                        record=record+frutopoint;
                                        Random();
                                     psnake[i]=Integer.toString(xpos-1)+","+Integer.toString(ypos);    
                                    }      
                                    else{
                                        xpos=Integer.parseInt(posicion[0])-1;
                                        ypos=Integer.parseInt(posicion[1]);
                                        limite=ypos;                                            
                                        contador++;
                                    }
                                    
                                    }       catch(Exception e){
                                 
                                        partidasjugadas[contadorp]=usuario+","+Integer.toString(record)+","+Integer.toString(tamañox)+","+Integer.toString(tamañoy)+","+Integer.toString(tamañosnake);
                                        contadorp++;
                                        Menu();
                                    }
                                }
                                else if(ypos==Integer.parseInt(posicion[1])&&limite==Integer.parseInt(posicion[1])) {
                                       
                                    xpos=Integer.parseInt(posicion[0])-1;
                                    ypos=Integer.parseInt(posicion[1]);
                                     
                                }else {
                                
                                    xpos=Integer.parseInt(posicion[0]);
                                      ypos=Integer.parseInt(posicion[1])-1;
                                }
                              
                              psnake[i]=Integer.toString(xpos)+","+Integer.toString(ypos);
                            }
                            }
                             
                          Modificarmatriz();
                          Imprimir();
                            break;
                        case "d":
                           direccion="derecha";
                           limite=0;
                              for(int i=0;i<psnake.length;i++){
                            if(psnake[i]!=null ){
                            ubicacion=psnake[i];
                            posicion= ubicacion.split(","); 
                                
                                if(direccion=="derecha" && limite==0){ 
                                    xpos=Integer.parseInt(posicion[0]);
                                    ypos=Integer.parseInt(posicion[1]);
                                  try{
                                    if(matrizjuego[xpos][ypos+1]==2){ 
                                        
                                        matrizjuego[xpos][ypos+1]=1;
                                         limite=xpos;                                            
                                        contador++;
                                        record=record+frutopoint;
                                        Random();
                                         psnake[i]=Integer.toString(xpos)+","+Integer.toString(ypos+1);
                                    }else
                                    {
                                    xpos=Integer.parseInt(posicion[0]);
                                    ypos=Integer.parseInt(posicion[1])+1;
                                   
                                        limite=xpos;                                            
                                        contador++;
                                    }
                                  }
                                  catch(Exception e){
                                 
                                        partidasjugadas[contadorp]=usuario+","+Integer.toString(record)+","+Integer.toString(tamañox)+","+Integer.toString(tamañoy)+","+Integer.toString(tamañosnake);
                                        contadorp++;
                                        Menu();
                                    }
                                }
                                else if(xpos==Integer.parseInt(posicion[0])&&limite==Integer.parseInt(posicion[0])) {
                                       
                                    xpos=Integer.parseInt(posicion[0]);
                                    ypos=Integer.parseInt(posicion[1])+1;
                                     
                                }else{
                                     xpos=Integer.parseInt(posicion[0])-1;
                                      ypos=Integer.parseInt(posicion[1]);
                                }
                              
                              psnake[i]=Integer.toString(xpos)+","+Integer.toString(ypos);
                            }
                            }
                             
                          Modificarmatriz();
                          Imprimir();
                              
                              
                            break;
                        case "a":
                             direccion="izquierda";
                           limite=0;
                              for(int i=0;i<psnake.length;i++){
                            if(psnake[i]!=null ){
                            ubicacion=psnake[i];
                            posicion= ubicacion.split(","); 
                                
                                if(direccion=="izquierda" && limite==0){ 
                                   
                                       xpos=Integer.parseInt(posicion[0]);
                                    ypos=Integer.parseInt(posicion[1]);
                                try{
                                    if(matrizjuego[xpos][ypos-1]==2){ 
                                        
                                        matrizjuego[xpos][ypos-1]=1;
                                         limite=xpos;                                            
                                        contador++;
                                        record=record+frutopoint;
                                        Random();
                                         psnake[i]=Integer.toString(xpos)+","+Integer.toString(ypos-1);
                                    }else
                                  {
                                    xpos=Integer.parseInt(posicion[0]);
                                    ypos=Integer.parseInt(posicion[1])-1;
                                   
                                    limite=xpos;                                            
                                    contador++;
                                  }
                                }
                                       catch(Exception e){
                                 
                                        partidasjugadas[contadorp]=usuario+","+Integer.toString(record)+","+Integer.toString(tamañox)+","+Integer.toString(tamañoy)+","+Integer.toString(tamañosnake);
                                        contadorp++;
                                        Menu();
                                    }
                                }
                                else if(xpos==Integer.parseInt(posicion[0])&&limite==Integer.parseInt(posicion[0])) {
                                       
                                    xpos=Integer.parseInt(posicion[0]);
                                    ypos=Integer.parseInt(posicion[1])-1;
                                     
                                }else{
                                     xpos=Integer.parseInt(posicion[0])+1;
                                      ypos=Integer.parseInt(posicion[1]);
                                }
                              
                              psnake[i]=Integer.toString(xpos)+","+Integer.toString(ypos);
                            }
                            }
                             
                          Modificarmatriz();
                          Imprimir();
                            break;
                        default:
                            break;
                    }
    }
    public static void Modificarmatriz(){
   
    for(int i=0; i<matrizjuego.length;i++){
                
                for(int j=0; j<matrizjuego[i].length;j++){     
                         
                        if(matrizjuego[i][j]==1){
                            matrizjuego[i][j]=0;
                             
                        }
                    }
                   
                }
    int x=0;
    int y=0;
    String ubicacion="";
    int contador=0;
                             for(int i=0;i<psnake.length;i++){
                            if(psnake[i]!=null ){
                            ubicacion=psnake[i];
                            posicion= ubicacion.split(","); 
                               x=Integer.parseInt(posicion[0]);
                               y=Integer.parseInt(posicion[1]);
                            if(-1<x && x<tamañox && -1<y && y<tamañoy){
                                 matrizjuego[x][y]=1;
                            
                           } 
                            else
                            {
                                
                                partidasjugadas[contadorp]=usuario+","+Integer.toString(record)+","+Integer.toString(tamañox)+","+Integer.toString(tamañoy)+","+Integer.toString(tamañosnake);
                                contadorp++;
                               Menu();
                           }
                               
                              
                            }
                        }
}
    public static void Imprimir(){
            //for de agregar de la matriz juego a matriz de dibujo
            for(int i=0; i<matrizD.length;i++){
                
                for(int j=0; j<matrizD[i].length;j++){     
                         
                    switch (matrizjuego[i][j]) {
                        case 0:
                            matrizD[i][j]=" ";
                            break;
                        case 1:
                            matrizD[i][j]="\033[34m *";
                            break;
                        case 2:
                            matrizD[i][j]="\033[33m (´)";
                            break;
                        default:
                            break;
                    }
                   
                }
            
            } 
            //for de impresion
            System.out.println();System.out.println();
            System.out.println("Puntos: "+record+"             Jugador: "+usuario);
            System.out.println();
            for(int i=0;i<matrizD.length+1;i++){
                System.out.print("\033[36m @\t");
                
            }
            System.out.println();
        for (String[] matrizD1 : matrizD) {
            System.out.print("\033[36m @\t");
            for (int j = 0; j < matrizD1.length; j++) {
                System.out.print(matrizD1[j]);
                if (j != matrizD1.length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("\033[36m @\t");
        }      
            for(int i=0;i<matrizD.length+1;i++){
                System.out.print("\033[36m @\t");
                
            }
            System.out.println();
            for(int i=0;i<matrizjuego.length;i++){
                for(int j=0; j<matrizjuego[i].length;j++){
                    if(matrizjuego[i][j]==2)
                   System.out.println("Fruto en la posicion: "+i+","+j+" y su valor es "+frutopoint);
                }
            }
    
    
    
    }
    public static void Imprimirinicio(){
      
        snake=new int[tamañosnake];
            for(int i=0; i<snake.length;i++){
 
                snake[i]=1;
                matrizjuego[i+1][4]=snake[i];
           }
            Random();
         
              int contador=0;
              for(int i=0; i<matrizD.length;i++){
                
                for(int j=0; j<matrizD[i].length;j++){     
                         
                        if(matrizjuego[i][j]==1){
                           
                            psnake[contador]=Integer.toString(i) +","+ Integer.toString(j)+",";
                            contador++;
                            
                             
                        }
                    }
                   
                }
              
            
            //for de agregar de la matriz juego a matriz de dibujo
            for(int i=0; i<matrizD.length;i++){
                
                for(int j=0; j<matrizD[i].length;j++){     
                         
                    switch (matrizjuego[i][j]) {
                        case 0:
                            matrizD[i][j]=" ";
                            break;
                        case 1:
                            matrizD[i][j]="\033[35m *";
                            break;
                        case 2:
                            matrizD[i][j]="\033[33m (´)";
                            break;
                        default:
                            break;
                    }
                   
                }
            
            } 
            //for de impresion
            System.out.println();System.out.println();
            System.out.println("Puntos: "+record+"             Jugador: "+usuario);
            System.out.println();
            for(int i=0;i<matrizD.length+1;i++){
                System.out.print("\033[36m @\t");
                
            }
            System.out.println();
        for (String[] matrizD1 : matrizD) {
            System.out.print("\033[36m @\t");
            for (int j = 0; j < matrizD1.length; j++) {
                System.out.print(matrizD1[j]);
                if (j != matrizD1.length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("\033[36m @\t");
        }      
            for(int i=0;i<matrizD.length+1;i++){
                System.out.print("\033[36m @\t");
                
            }
            System.out.println();
            for(int i=0;i<matrizjuego.length;i++){
                for(int j=0; j<matrizjuego[i].length;j++){
                    if(matrizjuego[i][j]==2)
                    System.out.println("Fruto en la posicion: "+i+","+j+" y su valor es "+frutopoint);
                }
            }
    }
    public static void Random(){
        
        Random  fruto= new  Random();
        
      int encontrado=0;
       int x=0;
       int y=0; 
     try{
       while(encontrado<1){
        x= fruto.nextInt(tamañox+1);
        y= fruto.nextInt(tamañoy+1);
            
            if (matrizjuego[x][y]==0)
            {
                matrizjuego[x][y]=2;
                encontrado=1;
            }
        }
      if(x<y){
      frutopoint= Math.abs(tamañox/2 - x) ;
      
      
      }
      else if(y<x){
      frutopoint= Math.abs(tamañoy/2 - y) ;
      }
      else{
      frutopoint= Math.abs(tamañox/2 - x) ;
      
      }
     }
    catch (Exception e) {
            System.out.println("error en el x "+x+" o error en el y "+y);
            Random();
    }
        
    }
    public static void Historial(){
            try{
            String historial="";
            String [] mostrarhistorial;
            String user, puntos,tablero,snake="";
            for(int i=0;i<partidasjugadas.length;i++){
             historial=partidasjugadas[i];
               mostrarhistorial=historial.split(",");
               user=mostrarhistorial[0];
               puntos=mostrarhistorial[1];
               tablero=mostrarhistorial[2]+"X"+mostrarhistorial[3];
               snake=mostrarhistorial[4];
                System.out.println("Nombre de Usuario: "+user+" puntuacion: "+puntos+" Tablero: "+tablero+" tamaño de la snake inicial "+snake);
            }
           
            System.out.println("Regresar al menu principal precione m");
            historial=opcion.nextLine();
            if(historial=="m"){
            Menu();
            
            }else{
            Historial();
            }
            }
            catch(Exception e){
            Menu();
            }
    }
   
        
}
    
    
    



