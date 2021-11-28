package entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEstoque() {
        return preco*quantidade;
    }

    public void addProduto(int quant) {
        quantidade += quant;
    }

    public void removeProduto(int quant) {
        quantidade -= quant;
    }

    public String toString() {
        return "O produto "+nome+", de preço "+preco+", possui "+quantidade+
                " qtd." + " totalizando "+valorTotalEstoque()+" reais ";
    }

}
