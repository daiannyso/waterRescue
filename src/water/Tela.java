package water;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;


public class Tela extends JPanel{
    private Barco barco = new Barco();
    private Banhistas banhistas = new Banhistas(5, 2, 3);
    
    public Tela(){
        this.addKeyListener(new KeyListener(){ // cria o evento de clique no teclado
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_SPACE){
                    trataColisão();
                }else{
                barco.atualizaPos(ke); //chama a função que move o barco
                }
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
        imprimeBanhistas(g); //imprime os banhistas
        g.drawImage(barco.getIcon(), barco.getX(), barco.getY(), this); //imprime o barco
    }
    
    public void imprimeBanhistas(Graphics g){ //Não pode ser método de Banhistas por conta do contexto da impressão
        int total = banhistas.getTotal();
        for(int i=0; i< total; i++){ //imprime o vetor de banhistas em mar
            if(banhistas.getBanhistas().get(i).getSalvo() == 0){
                g.drawImage(banhistas.getBanhistas().get(i).getIcon(), banhistas.getBanhistas().get(i).getX(), banhistas.getBanhistas().get(i).getY(), this);
            }
        }
    }
    
    public void trataColisão(){
        boolean colidiu = false;
        for(int i=0; i< banhistas.getTotal(); i++){ //verifica a colisão do barco com algum dos banhistas
            int xb = banhistas.getBanhistas().get(i).getX();
            if(xb-94 <= barco.getX() && barco.getX() <= xb+68){
                int yb = banhistas.getBanhistas().get(i).getY();
                if(yb-58 <= barco.getY() && barco.getY() <= yb+58){
                    colidiu = true;
                    System.out.println("Colidiu!");
                    banhistas.Salva(i);
                }
            }
        }
        if(!colidiu) System.out.println("Não colidiu!");
    }
}
