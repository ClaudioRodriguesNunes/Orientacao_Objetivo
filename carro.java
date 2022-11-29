import java.util.stream.Stream;

//Carro é uma subclasse de veiculo
public class carro extends veiculo {
    private int cilindradas;
    private boolean airbag;

    //O construtor recebe as variaveis e no interior dele, precisa ser chamada a super classe, e suas variaveis, que serão usadas
    carro(int ano, String modelo, String marca, int cilindradas) {
        super(ano, modelo, marca);
        this.cilindradas = cilindradas;
    }

    //Impressão (usa herança)
    public String toString(){
        return "Carro fabricado em " + getAnoDeFabricacao() + " com " + cilindradas + " cilindradas";
    }


    //Método de execução de linha de comando
    public static void main(String args[]){

        //Instanciando carro
        carro fordbigode = new carro(1910, "bigode", "ford",2900);

        System.out.println("O veículo criado foi " + fordbigode);
    }
}
