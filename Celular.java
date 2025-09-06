import java.util.ArrayList;
import java.util.List;

public class Celular {
    public int codigo;
    public String modelo;
    public String marca;
    public List<Jogo> jogos = new ArrayList<>();
    public Tela tela;
    public Processador processador;
    public Memoria memoria;

    public Celular(int codigo, String marca, String modelo, Tela tela, Processador processador, Memoria memoria) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.tela = tela;
        this.processador = processador;
        this.memoria = memoria;
    }

    public void AddJogo(Jogo jogo){
        this.jogos.add(jogo);
    }

    public void ligar(){
        System.out.println("O celular foi ligado");
    }
    public void Desligar(){
        System.out.println("O celular foi desligado");
    }
    public void chamar(){
        System.out.println("O celular está em chamada");
    }

    public void listarJogos(){
        System.out.println("A lista de jogos do celular " + modelo + " é: ");
        for(int i = 0; i< jogos.size(); i++){
            System.out.println(jogos.get(i).nome);
        }
    }
}
