import javax.xml.transform.Source;

public class Memoria {
    public int codigo;
    public String descricao;
    public String tipo;
    public double capacidade;

    public Memoria(int codigo, String descricao, String tipo, double capacidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public void Alocar(){
        System.out.println("A memória foi alocada");
    }
    public void Desalocada(){
        System.out.println("A memória foi desalocada");
    }
}
