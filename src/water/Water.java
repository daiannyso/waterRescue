/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package water;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author rafae
 */
public class Water {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame janela = new JFrame("WaterRescue");
        Tela tela = new Tela(); 
        janela.add(tela); //adiciona a tela no container principal da janela
        janela.setVisible(true); //torna ela visivel
        janela.setSize(1000,700); //tamanho da tela
        janela.setLocationRelativeTo(null); //posiciona no meio
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerra quando fecha a janela
        while(true)
            tela.repaint(); //reimprime os objetos na tela a cada iteração (para que o barco se mova)
    }
    
}
