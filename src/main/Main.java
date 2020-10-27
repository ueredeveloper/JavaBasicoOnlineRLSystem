package main;
import model.*;

public class Main {

  //metodo principal
  public static void main(String[] args) {
  
    Carro c1 = new Carro();
    c1.ligar();
    
    // o carro acelera se estiver com freio = false
    c1.freio = false;
    c1.trocarMarcha();
    c1.acelerar(19);
    
    c1.trocarMarcha();
    c1.acelerar(39);
    
    c1.trocarMarcha();
    c1.acelerar(89);
    
    c1.desligar();

  }

}
