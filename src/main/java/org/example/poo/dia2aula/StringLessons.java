package org.example.poo.dia2aula;

public class StringLessons {

    public static void main(String[] args) {
        //primeiro temos que entender oque porque cada um desses existem, as Strings em java são imutáveis.
        //ou seja caso voce caso voce pegue uma string e concatene ela com outra, voce não está alterando
        // o valor dela e sim criando uma outra string com um valor novo
        // em situação basicas isso não tem muita diferença por não afetar o desempenho
        // mas existem concataenações gigantes de strings na vida real que podem ser melhoradas apenas por usar
        // o string buffer ou o string builder

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
    }
}
