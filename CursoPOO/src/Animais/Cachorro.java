package Animais;

public class Cachorro extends Animal {
    //atributos
    static int numeroDeCachorros;

    //construtor definido pelo usuario
//    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspírito) {
//        this.nome = nome;
//        this.cor = cor;
//        this.altura = altura;
//        this.peso = peso;
//        this.tamanhoDoRabo = tamanhoDoRabo;
//        this.estadoDeEspírito = estadoDeEspírito;
//        //numero total de objetos
//        numeroDeCachorros++;
//    }

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspírito) {
        super(nome, cor, altura, peso, tamanhoDoRabo, estadoDeEspírito);
    }


//    public String getNome() {
//        return this.nome;
//    }

    //  public void setNome(String nome) {
//        if(nome.equals("lily")){
//            this.nome=null;
//        }
//        this.nome = nome;

//metodos

//static serve para usar nas classes.
//public String getCor() {return cor;}
//
//    public void setCor(String cor) {this.cor = cor;}
//
//    public int getAltura() {return altura;}
//
//    public void setAltura(int altura) {this.altura = altura;}
//
//    public double getPeso() {return peso;}
//
//    public void setPeso(double peso) {this.peso = peso;}
//
//    public int getTamanhoDoRabo() {return tamanhoDoRabo;}
//
//    public void setTamanhoDoRabo(int tamanhoDoRabo) {this.tamanhoDoRabo = tamanhoDoRabo;}
//
//    public String getEstadoDeEspírito() {return estadoDeEspírito;}
//
//    public void setEstadoDeEspírito(String estadoDeEspírito) {this.estadoDeEspírito = estadoDeEspírito;}


    //String pegar() {return "Bolinha";}

    // public String interagir(String acao){

    //enum java - pesquisar no google


    //funciona com int, string e enum
//        switch (acao){
//            case "carinho": this.estadoDeEspírito = "Feliz"; break;
//            case "vai dormir!": this.estadoDeEspírito = "Bravo"; break;
//            case "pisar na patinha": this.estadoDeEspírito = "Triste"; break;
//            default: this.estadoDeEspírito = "Neutro"; break;
//        }
//        return this.estadoDeEspírito;
//    }

    //public static int getNumeroDeCachorros() {return numeroDeCachorros;}

    //public static void setNumeroDeCachorros(int numeroDeCachorros) {Cachorro.numeroDeCachorros = numeroDeCachorros;}

    @Override
    public String toString() {
        return "Cachorro{"
                + "nome='" + nome + '\'' + '}';
    }

    @Override
    public void soar() {
        System.out.println("Au au");
    }
}
//        if (acao.equals("carinho")){
//            this.estadoDeEspírito = "feliz";
//        }else if(acao.equals("vai dormir!")){
//            this.estadoDeEspírito = "bravo";
//        }else{
//            this.estadoDeEspírito = "neutro";
//        }
//        return estadoDeEspírito;
//    }


