package lebre;

public class Lebre {

    int saltos;
    int idLebre;
    int distanciaPercorrida;
    static boolean hasWinner = false;

    public Lebre(int saltos, int idLebre) {
        this.idLebre = idLebre;
        this.saltos = saltos;
    }

    public void saltar() {
        while (hasWinner == false) {
            int pulo = 1 + (int) (Math.random() * ((3 - 1) + 1));
            distanciaPercorrida = distanciaPercorrida + pulo;
            saltos = saltos + 1;

            System.out.println("A lebre " + idLebre + " saltou " + pulo + " metros");

            if (distanciaPercorrida >= 20) {
                hasWinner = true;
            }
        }
    }
}
