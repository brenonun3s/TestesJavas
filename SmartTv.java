public class SmartTv {
    boolean ligada = false;
    int canal=1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void diminuirCanalCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para:" + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para:" + volume);
        //volume = volume - 1;
    }

    public void ligar(){
        ligada=true;
    }
    
    public void desligar(){
        ligada=false;
    }
}