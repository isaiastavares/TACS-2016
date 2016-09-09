public class Corrida {

    
    //Variável que define se a corrida possui um vencedor
    static boolean hasWinner = false;
    Lebre lebre = new Lebre();
    
    //MÃ©todo saltar utilizado pelas lebres
    public void saltar() {
        while (hasWinner == false) {
            int pulo = 1 + (int) (Math.random() * ((3 - 1) + 1));
            lebre.distanciaPercorrida = lebre.distanciaPercorrida + pulo;
            lebre.saltos = lebre.saltos + 1;

            System.out.println("A lebre " + lebre.idLebre + " saltou " + pulo + " metros");

            if (lebre.distanciaPercorrida >= 20) {
                hasWinner = true;
            }
        }
    }
}
