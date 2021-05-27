
package ativciclo3imc;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro.salles
 */
public class AtivCiclo3IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String alt;
        String peso;
        double xalt;
        int xpeso;
        double total;
        double metros;
        
        alt = JOptionPane.showInputDialog("DIGITE A ALTURA EM CM: EX: 170=1.70");
        xalt = Double.parseDouble(alt);
        
        metros = xalt / 100;
        
        peso = JOptionPane.showInputDialog("DIGITE O PESO: ");
        xpeso = Integer.parseInt(peso);
        
        total = xpeso / (metros * metros);
        JOptionPane.showMessageDialog(null,"SEU IMC É: " + total + " Kg/m");
        
        if (total < 17) {
            JOptionPane.showMessageDialog(null,"VOCÊ ESTÁ MUITO ABAIXO DO PESO");
        }
    }
    
}
