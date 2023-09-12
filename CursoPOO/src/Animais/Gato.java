package Animais;

public class Gato extends Animal{

    static int numeroDeGatos;

    public Gato(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspírito) {
        super(nome, cor, altura, peso, tamanhoDoRabo, estadoDeEspírito);
    }


    @Override
    //    @Override
    public String toString() {
        return "Gato{"+ "nome'" + nome + '\''+'}';
   }
   @Override
    public  void soar(){
       System.out.println("MIIIAAAAUUUU");
   }
}
