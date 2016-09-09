//Exemplo de uma classe que possui objeto do tipo Lebre, onde duas ou mais podem realizar uma corrida

public class Lebre {

    //Variáveis do objeto Lebre
    int saltos;
    int idLebre;
    int distanciaPercorrida;
    static int id = 0;

    //Construtor que verifica inicializa o valor de saltos e o id da lebre
    public Lebre() {
        this.idLebre = id;
        this.saltos = 0; //Iniciando sempre com 0 saltos e na posicao 0 para todas as lebres
        
        //aumenta o numero do id da proxima lebre em uma unidade
        id++;
    }
}
