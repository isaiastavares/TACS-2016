//Exemplo de uma classe que possui objeto do tipo Lebre, onde duas ou mais podem realizar uma corrida
public class Lebre {

    //Variáveis do objeto Lebre
    int saltos;
    int idLebre;
    int distanciaPercorrida;
    
    //Variável que define se a corrida possui um vencedor
    static boolean hasWinner = false;

    //Construtor que verifica inicializa o valor de saltos e o id da lebre
    public Lebre(int saltos, int idLebre) {
        this.idLebre = idLebre;
        this.saltos = saltos;
    }

    //Método saltar utilizado pelas lebres
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
