package org.example.poo.dia1aula;


// herança
public class Moto extends Veiculo {

    //encapsulamento
    private int cilidradas;


    //constructor usando herança
    public Moto(String marca, int ano, double preco, int cilidradas) {
        super(marca, ano, preco);
        this.cilidradas = cilidradas;
    }


    //polimorfismo overriding
    @Override
    public void imprimirInfos(){
        System.out.println("Moto { Preço: " + super.getPreco() +", Marca: " + super.getMarca() +
                " , Ano: " + super.getAno() + ", Cilidradas: " + this.cilidradas + " }");
    }

    //polimorfismo overloading
    public void imprimirInfos(int qntdDeVezesParaImprimir){
        for (int i = 0; i < qntdDeVezesParaImprimir; i++) {
            System.out.println("Moto { Preço: " + super.getPreco() +", Marca: " + super.getMarca() +
                    " , Ano: " + super.getAno() + ", Cilidradas: " + this.cilidradas + " }");
        }
    }

    public int getCilidradas() {
        return cilidradas;
    }

    public void setCilidradas(int cilidradas) {
        this.cilidradas = cilidradas;
    }
}
