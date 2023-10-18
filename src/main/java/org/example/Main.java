package org.example;

import org.example.poo.dia1aula.Carro;
import org.example.poo.dia1aula.Moto;
import org.example.poo.dia1aula.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // variavel (objeto)    //instanciação
        Veiculo veiculo = new Veiculo("Toyota", 2003, 100.000);
//        veiculo.imprimirInfos();

        Carro carro = new Carro("Ford", 2023, 250.000, 4);
//        carro.imprimirInfos();

        Moto moto = new Moto("Yamaha", 2024, 40.000, 4000);
//        moto.imprimirInfos(3);
//        moto.imprimirInfos();

        List<Veiculo> variosVeiculos = new ArrayList<>();
        variosVeiculos.add(carro);
        variosVeiculos.add(moto);
        variosVeiculos.add(veiculo);


        // abstração & encapsulamento
        String string = "Blablabla";
        System.out.println(string.charAt(0));
        //uso do substring
        System.out.println(string.substring(0, 3));

//        variosVeiculos.forEach(value -> value.imprimirInfos());
//        variosVeiculos.forEach(Veiculo::imprimirInfos);

//        for (Veiculo value: variosVeiculos) {
//            value.imprimirInfos();
//        }
    }
}