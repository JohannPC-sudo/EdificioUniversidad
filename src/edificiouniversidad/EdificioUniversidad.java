/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edificiouniversidad;

/**
 *
 * @Johann Lopez
 */
public class EdificioUniversidad {
        // Método para calcular el número de salones necesarios
    public int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    // Método para calcular el número de pisos necesarios
    public int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {
        return (int) Math.ceil((double) numeroSalones / salonesPorPiso);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // Crear una instancia de la clase EdificioUniversidad
        EdificioUniversidad edificio = new EdificioUniversidad();

        // Leer datos desde el teclado
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese el numero de estudiantes: ");
        int numeroEstudiantes = scanner.nextInt();
        System.out.print("Ingrese la capacidad de un salon: ");
        int capacidadSalon = scanner.nextInt();
        System.out.print("Ingrese el numero de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        // Calcular el número de salones y pisos
        int numeroSalones = edificio.calcularNumeroSalones(numeroEstudiantes, capacidadSalon);
        int numeroPisos = edificio.calcularNumeroPisos(numeroSalones, salonesPorPiso);

        // Imprimir resultados
        System.out.println("Numero de salones necesarios: " + numeroSalones);
        System.out.println("Numero de pisos necesarios: " + numeroPisos);
    }        
        
  }
    

