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
        janela.add(tela);
        janela.setVisible(true);
        janela.setSize(1000,700);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.revalidate();
        tela.repaint();
        tela.requestFocus();
        while(true)
            tela.repaint();
    }
    
}
