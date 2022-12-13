import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Geometria_Melani figuras = new Geometria_Melani();
            int op=0;
            String contin;
            try {
                do {
                    System.out.print("\t\033[36m-/-/-/-/-/ M E N U /-/-/-/-/-");
                    System.out.println("\n");
                    System.out.println("\033[36m|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                    System.out.println("|\t1) Areas                    |");
                    System.out.println("|\t2) Perimetros               |");
                    System.out.println("|\t3) Volumen                  |");
                    System.out.println("|/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-|");
                    System.out.println("Selecione una Opcion");
                    System.out.print(">> ");
                    op = sc.nextInt();

                    switch (op) {
                        case 1:
                            figuras.Ingreso_Areas();
                            break;
                        case 2:
                            figuras.Ingreso_Perimetro();
                            break;
                        case 3:
                            figuras.Ingreso_Volumen();
                            break;
                        default:
                            System.out.println("ERROR FUERA DE RANGO");
                    }
                    System.out.println("Desea Continuar \n Presione s o n ");
                    contin = sc.next();
                } while (contin.equals("S") || contin.equals("s"));

            }catch (Exception e) {
                System.out.println("Ingreso Erroneo de Datos " + e.getMessage());
            } finally {
                System.out.println("El a Programa Finalizado!!!!");
            }
            }
    }

