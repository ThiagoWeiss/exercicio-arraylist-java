package br.com.alura.exercicios;

public class ProdutoPerecivel extends Produto{

    private String validade;

    public ProdutoPerecivel(String nome, int quantidade, double preco) {
        super(nome, quantidade, preco);
        this.setValidade(validade);
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String dataValidade) {
        this.validade = dataValidade;
    }

    @Override
    public String toString () {
        return "Nome: " +this.getNome() +"( Quantidade: "+ this.getQuantidade() +", R$"+ this.getPreco() + " cada Validade: " + this.getValidade() + " )";
    }


}
