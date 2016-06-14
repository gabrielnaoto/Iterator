/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.ppr.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ignoi
 */
public class Cesta implements Produtos {

    protected List<Produto> canais;

    public Cesta() {
        canais = new ArrayList<>();
        canais.add(new Produto("Banana Nanica"));
        canais.add(new Produto("Banana Maçã"));
        canais.add(new Produto("Banana Prata"));
        canais.add(new Produto("Banana Branca"));
        canais.add(new Produto("Banana Ouro"));
    }

    @Override
    public Iterator getIterator() {
        return new IteratorProduto(canais);
    }

}
