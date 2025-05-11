package com.aula5;

public class Carrinho {

    private Produto[] carrinho;
    private static final int QTD_MAX = 5;
    private int topo; //indice do topo da pilha

    public Carrinho() {

        carrinho = new Produto[QTD_MAX];
    }

    public void cadastrar(Produto p) {

        assert p != null : "Produto não pode ser nulo";
        assert topo < QTD_MAX : "topo exedico";
        carrinho[topo++] = p;

    }

    public Produto remover() {

        assert topo > 0 : "topo deve ser maior que 0";
        Produto prodTopo = carrinho[--topo];
        carrinho[topo] = null;

        return prodTopo;
    }

    public double calcularTotal() {
        double soma = 0;

        for (int i = 0; i < topo; i++) {
            soma = soma + carrinho[i].getPreco();
        }

        return soma;
    }

    public double calcularTotalTipo(Tipo t) {
        double soma = 0;

        for (int i = 0; i < topo; i++) {

            if (t == carrinho[i].getTipo()) {
                soma = soma + carrinho[i].getPreco();
            }

        }

        return soma;
    }

    public void listar() {
        for (int i = 0; i < topo; i++) {
            carrinho[i].mostrarInfo();
        }

    }

    public void buscarPorNome(String nm) {
        for (int i = 0; i < topo; i++) {
            if (nm == carrinho[i].getNome()) {
                carrinho[i].mostrarInfo();
            }

        }

    }
}
