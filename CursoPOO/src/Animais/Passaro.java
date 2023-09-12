package Animais;

public class Passaro extends Animal {

    static int numeroDePassaros;

    public Passaro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspírito) {
        super(nome, cor, altura, peso, tamanhoDoRabo, estadoDeEspírito);
    }


    @Override
    //    @Override
    public String toString() {
        return "Passaro{"+ "nome'" + nome + '\''+'}';
    }

    @Override
    public void soar(){
        System.out.println(" PPPiiiUUUUUUiiiiiUUUuuuuuuuu ");
    }
}
