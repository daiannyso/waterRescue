package water;
 
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Barco {
    private int x, y;
    private Image icon;

    public Image getIcon() {
        return icon;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public Barco() {
        icon = new ImageIcon("src/Imagens/barco.png").getImage();
        x = 200;
        y = 200;
    }

    void atualizaPos(KeyEvent ke) { //recebe o botão pressionado e compara
        if (ke.getKeyCode() == KeyEvent.VK_UP){
            if(y > 0){ //não deixa o barco sair das margens da tela
                y-=7;
            }
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            if(y < 595){
                y+=7;
            }
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT){
            if(x > 0){
                x-=7;
            }
        }
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT){
            if(x < 885){
                x+=7;
            }
        }
    }
    
}
