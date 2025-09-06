public class Processador {

    public int codigo;
    public String descricao;
    public String tipo;
    public double velocidade;

    public Processador(int codigo, String descricao, String tipo, double velocidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.velocidade = velocidade;
    }

    public void Acelerar(){
        System.out.println("O processador foi acelerado");
    }

    public void Desacelerar(){
        System.out.println("O processador foi desacelerado");
    }
}
