package ClasesEmpresa;

public class Supervisor {
    String nombre,rol,email;

    public Supervisor(String nombre, String rol, String email) {
        this.nombre = nombre;
        this.rol = rol;
        this.email = email;
    }

    public void mostardetalles(){
    System.out.println("mostar");
    }
    public void AsignarTareas(){
System.out.println("asignando");
    }
}
