import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuni Yulistianti
 */
public class soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaTeman = JOptionPane.showInputDialog("Anda sedang belajar apa? ");
        JOptionPane.showMessageDialog(null, "Belajar "+namaTeman+" Sangat mudah   ");
    }

}