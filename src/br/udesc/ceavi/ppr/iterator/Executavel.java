/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.ppr.iterator;

/**
 *
 * @author ignoi
 */
public class Executavel {

    public static void main(String[] args) {
        Produtos cesta = new Cesta();
        System.out.println("-----------------");
        System.out.println("| Frutas: \t|");
        System.out.println("-----------------");
        for (Iterator it = cesta.getIterator(); !it.isDone(); it.next()) {
            System.out.println("| " + it.currentItem().getDescricao() + "\t|");
        }
        System.out.println("-----------------");
    }
}
