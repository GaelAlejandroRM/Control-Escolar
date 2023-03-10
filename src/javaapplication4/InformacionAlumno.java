package informacionalumno;
import java.util.Scanner;
/**
 *
 * @author Marcelo
 * este programa calcula el promedio de un alumno
 */
public class InformacionAlumno {
    Scanner lectura = new Scanner(System.in);
   public static String nombre ="";
   public static String fecha ="";
   public static String telefono ="";
   public static String direccion ="";
   public static String cuenta ="";
   public static String semestre ="";
   public static String horario ="";
   
    public void InformacionPersonal(String nombre, String fecha, String telefono, String direccion ){ //se ingresa la informacion personal del alumno
        
    
    System.out.println("ingrese el nombre completo del alumno:"); //1
   nombre =lectura.nextLine();
    System.out.println("ingrese la fecha de nacimiento del alumno:");//2
    fecha =lectura.nextLine();
    System.out.println("ingrese el numero telefonico completo del alumno:");//3
     telefono =lectura.nextLine();
    System.out.println("ingrese la direccion completa del alumno:");//4
     direccion =lectura.nextLine();
    System.out.println("los datos del alumno son:  " + nombre + fecha + telefono + direccion );
    }
     public void InformacionAcademica(String cuenta, String semestre){ //se ingresa la informacion academica del alumno
         
    System.out.println("ingrese el numero de cuenta del alumno:");//5
    cuenta =lectura.nextLine();
    System.out.println("ingrese el semestre que cursa alumno:");//6
    semestre =lectura.nextLine();
    System.out.println("su informacion academica es:  " + cuenta + semestre);
     }
     
      public void Horarios(String nombre){ // se ingresan el horario del alumno
    System.out.println("ingrese las materias que cursa alumno:");//7
     horario =lectura.nextLine();
    System.out.println("sus materias son:  " + horario);
    }
     
  public class Calificaciones {
     
           int promedio;
           int ingles = 7;
           int ihc = 9;
           int programacion = 8;
           int pmc = 8;
           int requisitos = 8;
           
           public void Materias (int ingles, int ihc, int programacion, int pmc, int requisitos){
                System.out.println("La calificacion de ingles es: " + ingles); 
                 System.out.println("La calificacion de inetarccion humano computadora es: " + ihc);
                  System.out.println("La calificacion de programacion es: " + programacion);
                   System.out.println("La calificacion de programacion de microcontroladores  es: " + pmc );
                    System.out.println("La calificacion de requisitos es: " + requisitos);
                
           }
           public void Promedio (int promedio) {
               System.out.println("el promedio de sus materias es :"+ ingles + ihc + programacion + pmc + requisitos /5 + promedio);
           }
           
          
      }
      public static void main(String[] args) {
          
InformacionAlumno alumno = new InformacionAlumno();

 alumno.InformacionPersonal(nombre, fecha, telefono, direccion);
alumno.InformacionAcademica (cuenta, semestre);
alumno.Horarios(horario);
Calificaciones cali = new Calificaciones();
cali.Calificaciones(ingles, ihc ,programacion, pmc, requisitos);


       
       
    }
    
}
