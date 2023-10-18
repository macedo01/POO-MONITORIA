package org.example.poo.dia1aula;

public class Carro extends Veiculo {

    private int numerosDePortas;

    public Carro(String marca, int ano, double preco, int numerosDePortas) {
        super(marca, ano, preco);
        // pq o super nao pode ter nada antes ?
        this.numerosDePortas = numerosDePortas;
    }

    @Override
    public void imprimirInfos(){
        System.out.println("Carro: { Preço " + super.getPreco() +", Marca: " + super.getMarca() +
                " , Ano: " + super.getAno() + ", Numero de Portas: " + this.numerosDePortas + " }");
    }

    public int getNumerosDePortas() {
        return numerosDePortas;
    }

    public void setNumerosDePortas(int numerosDePortas) {
        this.numerosDePortas = numerosDePortas;
    }
}
