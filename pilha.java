/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Olaaa;

/**
 *
 * @author alunosepi
 */
public class pilha {

 public Object[] pilha;
    public int posicaoPilha;

    public pilha() {
        this.posicaoPilha = -1;
// indica que esta nula, vazia, pois posição um indica que contém informação
        this.pilha = new Object[1000];
// criando uma pilha com 1000 posições
    }

    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {
        // push
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public static void main(String args[]) {
        pilha p = new pilha();
        p.empilhar("Portuguesa ");
        p.empilhar("Frango com catupiry ");
        p.empilhar("Calabresa ");
        p.empilhar("Quatro queijos ");
        p.empilhar(10);
                while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
}
    
    