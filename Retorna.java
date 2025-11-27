package br.com.alura.exercicios;

import java.util.ArrayList;

public class Retorna {
    public static void main(String[] args) {



        var produto1 = new Produto("Carne", 5, 56.80);

        var produto2 = new Produto("Chocolate", 2, 3.50);

        var produto3 = new Produto("Refrigerante", 1, 8.99);

        var produtoPerecivel = new ProdutoPerecivel("Leite", 1, 6.00);
        produtoPerecivel.setValidade("18/02/2026");


        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produtoPerecivel);


        System.out.println("O tamanho da lista de produtos é: " + listaDeProdutos.size());
        System.out.println(listaDeProdutos);
        System.out.println(listaDeProdutos.get(1));



    }
}
