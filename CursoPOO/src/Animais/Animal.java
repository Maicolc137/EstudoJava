package Animais;

public abstract class Animal {

    protected String nome = null;
    protected String cor;s
    protected int altura;
    protected double peso;
    protected int tamanhoDoRabo;
    protected String estadoDeEspírito;

    public Animal(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspírito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspírito = estadoDeEspírito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspírito() {
        return estadoDeEspírito;
    }

    public void setEstadoDeEspírito(String estadoDeEspírito) {
        this.estadoDeEspírito = estadoDeEspírito;
    }

    protected void comer(){

}

    protected void dormir(){

}

    public abstract void soar();
}