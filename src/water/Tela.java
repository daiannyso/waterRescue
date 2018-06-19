package water;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


public class Tela extends JPanel{
    private Barco barco = new Barco();
    private BanhistaVerde b1 = new BanhistaVerde(0, 470, 0, 320);
    private BanhistaVerde b2 = new BanhistaVerde(500, 920, 350, 670);
    public Tela(){
        this.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                barco.atualizaPos(ke);
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        
        });
        this.setFocusable(true);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(b1.getIcon(), b1.getX(), b1.getY(), this);
        g.drawImage(b2.getIcon(), b2.getX(), b2.getY(), this);
        g.drawImage(barco.getIcon(), barco.getX(), barco.getY(), this);
    }
}
