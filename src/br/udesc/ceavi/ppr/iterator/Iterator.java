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
public interface Iterator {

    public void first();

    public void next();

    public boolean isDone();

    public Produto currentItem();

}
