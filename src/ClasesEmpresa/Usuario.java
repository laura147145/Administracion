package ClasesEmpresa;
import java.util.Scanner;
public class Usuario {

    String nombre,rol,email;

    public void mostarDetalles( String nombre, String rol,String email){
        this.nombre = nombre;
        this.rol = rol;
        this.email = email;
    }
  static EmpleadoRegular empleado1 = new EmpleadoRegular("sara", "vendedora", "sara12@gmail.com");
   static  Supervisor supervisor = new Supervisor("camilo","supervisor", "camilo34@gmail.com");
   static Administrador administrador = new Administrador("romeo","administrador", "romeo15@gmail.com");

   public  static void main( String [] args){
       Scanner sc= new Scanner(System.in);
       int op = sc.nextInt();
       System.out.println("ingrese tipo de empleado ");
       System.out.println("1: EmpleadoRegular /n2: Supervisor /n3 Administrador");
       switch (op){
           case 1:
               System.out.println("Empleado regular");
               int sele = 0;
               sele = sc.nextInt();
               if (sele == 1){
                   empleado1.mostrardetalles();
               } else if (sele == 2) {
                   empleado1.RealizarTareas();
               }
               break;
           case 2:
               int opcion = 0;
               opcion = sc.nextInt();
               if (opcion == 1){
                   supervisor.mostardetalles();
               } else if (opcion == 2) {
                   supervisor.AsignarTareas();
               }else {
                   System.out.println("opocion incorrecta");
               }
               break;

           case 3:
               System.out.println("Administrador");
int elecion = 0;
elecion = sc.nextInt();
               if (elecion == 1){
                   administrador.mostrarDetalles();
               } else if (elecion == 2) {
                   administrador.Cambiarempleado();
               } else if (elecion == 3) {
                   administrador.ModificarEmpleado();
               } else if (elecion == 4) {
                   administrador.Eliminaremploado();
               }else {
                   System.out.println("opocion incorrecta");
               }

       }






   }

}
