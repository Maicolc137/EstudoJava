import Animais.Animal;
import Animais.Cachorro;

public class Petshop {

    public void darBanho(Animal animal){
animal.setEstadoDeEspírito("Limpo");
    }
    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspírito("Tosado");
    }
    public void deixarHotel(Animal animal){
        animal.setEstadoDeEspírito("Com saudades.");
    }
}
