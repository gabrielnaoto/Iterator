/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.ppr.iterator;

import java.util.List;

/**
 *
 * @author ignoi
 */
public class IteratorProduto implements Iterator {

    protected List<Produto> lista;
    protected int contador;

    protected IteratorProduto(List<Produto> lista) {
        this.lista = lista;
        contador = 0;
    }

    @Override
    public void first() {
        contador = 0;
    }

    @Override
    public void next() {
        contador++;
    }

    @Override
    public boolean isDone() {
        return contador == lista.size();
    }

    public Produto currentItem() {
        if (isDone()) {
            contador = lista.size() - 1;
        } else if (contador < 0) {
            contador = 0;
        }
        return lista.get(contador);
    }

}
