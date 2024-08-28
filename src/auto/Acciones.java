package auto;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Acciones {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Auto auto = new Auto();

        auto.setMarca("Kia");
        auto.setModelo("Soreto");
        auto.setColor("Gris");
        auto.setVelocidadMaxima(100);
        auto.setEncendido(false);

        System.out.println("Felicidades: "+ auto.toString());

        while (opcion != 4) {

            System.out.println("Seleccione que desea hacer: ");
            System.out.println("1.- Encender el auto ");
            System.out.println("2.- Apagar el auto ");
            System.out.println("3.- Acelerar el auto ");
            System.out.println("4.- Salir ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if ((auto.isEncendido())) {
                        System.out.println("El auto ya se encuentra encendido");
                    } else {
                        auto.setEncendido(true);
                        System.out.println("Prendiste el auto");
                    }
                    break;
                case 2:
                    if (!(auto.isEncendido())) {
                        System.out.println("El auto ya se encuentra apagado");
                    } else {
                        auto.setEncendido(false);
                        System.out.println("Apagaste el auto");
                    }
                    break;
                case 3:
                    if ((auto.isEncendido())) {
                        System.out.println("Aceleraste");
                    } else {
                        System.out.println("No puedes acelerar el auto, esta apagado");
                    }
                    break;
            }
        }

    }
}
