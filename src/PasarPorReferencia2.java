class Persona{
    private String nombre;
    private int edad;

    public void modificarNombre(String nuevoNombre) {
        this.nombre=nuevoNombre;
    }

    public String devuelveNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
Persona persona= new Persona();
persona.modificarNombre("Pepe");
     //ESto da error porque no es accesible la variable  System.out.println("persona.nombre = " + persona.nombre);
        System.out.println("persona nombre = " + persona.devuelveNombre());
        persona.setEdad(12);
        System.out.println("persona edad= " + persona.getEdad());
    }



    }

