//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tela tela1 = new Tela(1,"plana","Samsung",20.5);

        Processador processador1 = new Processador(1,"AMD","Ryzen",200);

        Memoria memoria1 = new Memoria(1,"SSD","DDR4",250);

        Jogo Zelda = new Jogo(1,"Zelda","Ação", 100);
        Jogo Mario = new Jogo(2,"Mario","Ação",50);

        tela1.Ligar();
        tela1.Desligar();


        processador1.Acelerar();
        processador1.Desacelerar();

        memoria1.Alocar();
        memoria1.Desalocada();

        Zelda.Iniciar();
        Zelda.Encerrar();

        Celular celular1 = new Celular(1,"Samsung","Motorola", tela1, processador1, memoria1);

        celular1.AddJogo(Zelda);
        celular1.AddJogo(Mario);
        celular1.ligar();
        celular1.chamar();
        celular1.Desligar();
        celular1.listarJogos();
    }
}