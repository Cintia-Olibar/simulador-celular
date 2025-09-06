public class Tela {

    public int codigo;
    public String descricao;
    public String tipo;
    public double tamanho;
    public boolean status = false;

    public Tela(int codigo, String descricao, String tipo, double tamanho) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    public void Ligar(){
        if(!status){
            status = true;
            System.out.println("A Tela foi ligada");
        }
    }
    public void Desligar(){
        if(status){
            status = false;
            System.out.println("A tela foi desligada");
        }
    }
}
