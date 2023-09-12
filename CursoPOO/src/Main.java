import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro5 = new Cachorro("Luma","preto",25,12.500,11,"carinho");
//        Cachorro cachorro2 = new Cachorro("Pipoca","Branco e marrom",30,14.00, 15,"nada");
//        Cachorro cachorro3 = new Cachorro("Hulk","branco",55,48,20,"vai dormir!");
        Cachorro cachorro1 = new Cachorro("Rex","Marrom", 30, 45, 14, "nada");

        Passaro passaro1 = new Passaro("Mordekai","Azul",130, 9000, 25,"nada");
        Gato gato2 = new Gato("0000","00000",1000,1000,1000,"nada");


        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspírito());

        petshop.darBanho(gato2);
        System.out.println(gato2.getEstadoDeEspírito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspírito());


    }
}