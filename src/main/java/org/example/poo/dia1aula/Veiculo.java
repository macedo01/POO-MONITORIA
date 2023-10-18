package org.example.poo.dia1aula;

public class Veiculo {

    private String marca;
    private int ano;
    private double preco;

    public Veiculo(String marca, int ano, double preco){
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public void imprimirInfos(){
        System.out.println("Veiculo { Preço: " + this.preco +", Marca: " + this.marca + "" +
                ", Ano: " + this.ano + " }");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
