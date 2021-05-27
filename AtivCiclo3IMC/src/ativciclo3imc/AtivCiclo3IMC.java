
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
        /**DECLARAÇÃO DE VARIAVEIS**/
        String alt;
        String peso;
        double xalt;
        int xpeso;
        double total;
        double metros;
        
        alt = JOptionPane.showInputDialog("DIGITE A ALTURA EM CM: EX: 170=1.70");
        xalt = Double.parseDouble(alt);/*Converte String em double*/
        
        metros = xalt / 100; /*Realiza o calculo de cm para metros*/
        
        peso = JOptionPane.showInputDialog("DIGITE O PESO: ");
        xpeso = Integer.parseInt(peso);/*Converte String em inteiro*/
        
        total = xpeso / (metros * metros); /*Faz o calculo do IMC*/
        
        /***Apresenta o resultado do calculo IMC na tela***/
        JOptionPane.showMessageDialog(null,"SEU IMC É: " + total + " Kg/m");
        
        if (total < 17) {
            JOptionPane.showMessageDialog(null,"VOCÊ ESTÁ MUITO ABAIXO DO PESO");
        }else if (total >=17 && total <= 18.49) {
            JOptionPane.showMessageDialog(null,"VOCÊ ESTA ABAIXO DO PESO");
        }else if(total >= 18.50 && total <=24.99){
            JOptionPane.showMessageDialog(null,"PESO NORMAL");
        }else if (total >=25 && total <= 29.99) {
            JOptionPane.showMessageDialog(null,"ACIMA DO PESO");
        }else if (total >=30 && total <= 34.99) {
            JOptionPane.showMessageDialog(null,"OBESIDADE 1");
        }else if (total >=35 && total <=39.99) {
            JOptionPane.showMessageDialog(null,"OBESIDADE II (SEVERA)");
        }else{
            JOptionPane.showMessageDialog(null, "OBESIDADE III (MORBIDA");
        }
    }
    
}
