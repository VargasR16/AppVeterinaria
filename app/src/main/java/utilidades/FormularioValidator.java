/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/**
 *
 * @author fl1pc08
 */
public class FormularioValidator {

    // Método para validar que un nombre no esté vacío
    public static boolean validarNombre(String nombre) {
        return !nombre.trim().isEmpty();
    }

    // Método para validar que el correo electrónico tenga un formato válido
    public static boolean validarCorreo(String correo) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

    // Método para validar si la edad es un número positivo
    public static boolean validarEdad(int edad) {
        return edad > 0;
    }

    // Método para mostrar un formulario interactivo y validado
    public static void mostrarFormulario() {
        Scanner scanner = new Scanner(System.in);

        // Validar nombre
        String nombre;
        do {
            System.out.print("Introduce tu nombre: ");
            nombre = scanner.nextLine();
            if (!validarNombre(nombre)) {
                System.out.println("El nombre no puede estar vacío.");
            }
        } while (!validarNombre(nombre));

        // Validar correo
        String correo;
        do {
            System.out.print("Introduce tu correo electrónico: ");
            correo = scanner.nextLine();
            if (!validarCorreo(correo)) {
                System.out.println("El correo electrónico no es válido.");
            }
        } while (!validarCorreo(correo));

        // Validar edad
        int edad;
        do {
            System.out.print("Introduce tu edad: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número válido. Intenta de nuevo.");
                scanner.next(); // Limpiar el buffer
            }
            edad = scanner.nextInt();
            if (!validarEdad(edad)) {
                System.out.println("La edad debe ser un número positivo.");
            }
        } while (!validarEdad(edad));

        System.out.println("\nFormulario enviado correctamente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Edad: " + edad);
        
        scanner.close();
    }

    public static void main(String[] args) {
        // Llamada al método para mostrar el formulario
        mostrarFormulario();
    }
}
