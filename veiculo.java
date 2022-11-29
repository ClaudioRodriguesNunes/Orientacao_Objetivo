// private - não permite que as variáveis sejam usadas por outras classes

public class veiculo {
    private int anoDeFabricacao;
    private String modelo;
    private String marca;

    // Construtor
    veiculo(int adf, String m,String ma){
        anoDeFabricacao = adf;
        modelo = m;
        marca = ma;
    }

    //Para acessar atributos privados externamente
    //Metodos de acesso
    // this é ponteiro para o próprio objeto
    public int getAnoDeFabricacao(){
        return anoDeFabricacao;
    }
    public void setAnoDeFabricacao(int anoDeFabricacao){
        this.anoDeFabricacao = anoDeFabricacao;
    }

}
