/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Infosteam1 {

    private Usuario usu;
    private Juego game[];
    
    public Infosteam1()
    {
      this.usu = new Usuario();
      this.game = new Juego[5];
      
      for(int a=0; a<5;a++ )
      {
        game[a]=new Juego();
      }
      
      completaUsuario();
      completaJuego();
      
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public void setGame(Juego[] game) {
        this.game = game;
    }

    public Usuario getUsu() {
        return usu;
    }

    public Juego[] getGame() {
        return game;
    }
    
    public void completaJuego()
    {
        game[0].setNombre("F1 2021");
        game[0].setDesarrollador("Codemasters");
        game[0].setFechaLanzamiento(2021);
        game[0].setPrecio(214999);
        
        game[1].setNombre("The ramp");
        game[1].setDesarrollador("Hyperparadise");
        game[1].setFechaLanzamiento(2021);
        game[1].setPrecio(11900);
        
        game[2].setNombre("The Ascent");
        game[2].setDesarrollador("Neon Giant");
        game[2].setFechaLanzamiento(2021);
        game[2].setPrecio(99900);
        
        game[3].setNombre("Bless Unleashed");
        game[3].setDesarrollador("Neowiz Games, Round 8 Studio, R8S Entertainment Limited");
        game[3].setFechaLanzamiento(2021);
        game[3].setPrecio(0);
        
        game[4].setNombre("New World");
        game[4].setDesarrollador("Amazon Game Studios, Double Helix Games");
        game[4].setFechaLanzamiento(2021);
        game[4].setPrecio(79000);
        
        
        
     
    }
    public void completaUsuario()
    {
      usu.setUsuario("Mauricio.bravo");
      usu.setPass("NomelaC123");
      
    }
    
    public void menu()
    {
       System.out.println("Buen dia, bienvenido");
        Scanner keyboard = new Scanner(System.in);
        char inicio=' ';
        
        try{       
        System.out.println("si desea iniciar sesion digite la letra s, sino digite cualquier otra letra");
        inicio = keyboard.next().charAt(0);
        }catch(NumberFormatException error)
        {
             System.out.println("digite la opcion bien, por favor"+error.getClass());
        }
        
        while(inicio=='s'){
            
             System.out.println("ingrese el usuario por favor");
             String usu1 = keyboard.next();
         
             System.out.println("ingrese la contrasena por favor");
             String pass1 = keyboard.next();
          
            if(usu1.equals(usu.getUsuario()) && pass1.equals(usu.getPass())) {
             inicio='m';   
             int opcion =0;
            boolean salir = true;
             while(salir)
             {
                 System.out.println("1. Juego 1");
                 System.out.println("2. Juego 2");
                 System.out.println("3. Juego 3");
                 System.out.println("4. Juego 4");
                 System.out.println("5. juego 5");
                 System.out.println("6. Salir");
                 
                 try
                 {
                     System.out.println("Introduce tu opcion");
                     opcion = keyboard.nextInt();
                 }
                 catch(InputMismatchException efg)
                 {
                     System.out.println("Introduce bien tu opcion");
                     keyboard.nextLine();

                 }
                 switch(opcion)
                 {
                     case 1:
                     System.out.println("INFORMACION DEL JUEGO \nNombre: "+game[0].getNombre()+" \nDesarrollador: "+game[0].getDesarrollador()+" \nValor: "+game[0].getPrecio()+" \nAño "+game[0].getFechaLanzamiento());
                      break;
                   
                     case 2:
                     System.out.println("INFORMACION DEL JUEGO \nNombre: "+game[1].getNombre()+" \nDesarrollador: "+game[1].getDesarrollador()+" \nValor: "+game[1].getPrecio()+" \nAño "+game[1].getFechaLanzamiento()+"");
                     break;
                     
                     case 3:
                     System.out.println("INFORMACION DEL JUEGO \nNombre: "+game[2].getNombre()+" \nDesarrollador: "+game[2].getDesarrollador()+" \nValor: "+game[2].getPrecio()+" \nAño "+game[2].getFechaLanzamiento()+"");
                     break;
                     
                     case 4:
                     System.out.println("INFORMACION DEL JUEGO \nNombre: "+game[3].getNombre()+" \nDesarrollador: "+game[3].getDesarrollador()+" \nValor: "+game[3].getPrecio()+" \nAño "+game[3].getFechaLanzamiento()+"");
                     break;
                     
                     case 5:
                     System.out.println("INFORMACION DEL JUEGO \nNombre: "+game[4].getNombre()+" \nDesarrollador: "+game[4].getDesarrollador()+" \nValor: "+game[4].getPrecio()+" \nAño "+game[4].getFechaLanzamiento()+"");
                     break;
                     
                     case 6:                         
                     salir = false;
                     break;
                     
                     default:
                         System.out.println("el rango de opcione esta entre 1 y 6");
                     
                 
                 
                 
                 
                 
                 }
             
             }
               System.out.println("El programa ha finalizado, gracias por usarlo");
          
         }
         
       }
    }
    
   }
