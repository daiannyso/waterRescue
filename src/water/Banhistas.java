package water;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class Banhistas {
    private ArrayList<Banhista> banhistas = new ArrayList<>();
    private int[] x, y;
    private int total;

    public ArrayList<Banhista> getBanhistas() {
        return banhistas;
    }

    public int getTotal() {
        return total;
    }
    
    public void Salva(int i){
        banhistas.get(i).setSalvo(1);
    }

    public Banhistas(int vd, int am, int vm) {
        total = vd+am+vm;
        geraValores(vd, am, vm);
        int i;
        for(i=0; i< vd; i++) banhistas.add(new BanhistaVerde(x[i], y[i]));
        for(i=0; i< am; i++) banhistas.add(new BanhistaAmarelo(x[i+vd], y[i+vd]));
        for(i=0; i< vm; i++) banhistas.add(new BanhistaVermelho(x[i+vd+am], y[i+vd+am]));
    }

    private void geraValores(int vd, int am, int vm) {
        x = new int[total];
        y = new int[total];
        int xatual, yatual;
        
        Random ran = new Random();
        
        for(int i=0; i < total; i++){ // gera uma lista de valores aleatorios para x
            do{
                xatual = ran.nextInt(850); //gera um valor
                System.out.println("x");
            }while(avaliaColisao(x, i, xatual)); //testa se esse valor colide com algum outro
            x[i] = xatual;
        }
        
        for(int i=0; i < total; i++){ //gera uma lista de valores aleatorios para y
            do{
                yatual = ran.nextInt(600);
                System.out.println("y");
            }while(avaliaColisao(y, i, yatual));
            y[i] = yatual;
        }
        for(int i=0; i < total; i++) System.out.println(x[i]);
        System.out.println("comeca y");
        for(int i=0; i < total; i++) System.out.println(y[i]);
    }

    private boolean avaliaColisao(int[] vetor, int nv, int vatual) {
        for(int i = 0; i < nv; i++){
            int vi = vetor[i];
            if (vi <= vatual && vatual <= vi+45){ //testa se a pos atual esta num intervalo de alguma das pos da lista
                return true;
            }else if (vatual <= vi && vi <= vatual+45){
                return true;
            }
        }
        return false;
    }
    
    
    
}
