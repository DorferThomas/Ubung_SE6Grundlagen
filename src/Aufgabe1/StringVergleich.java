package Aufgabe1;

import javax.swing.*;

public class StringVergleich {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Geben sie etwas ein: ");
        String b = JOptionPane.showInputDialog("Geben sie etwas ein: ");

        if(a.substring(0,2).equals(b.substring(0, 3)))
        {
            System.out.println("Der Nutzer hat die ersten 3 Variablen gleich befüllt.");

        }else System.out.println("Der Nutzer hat keine der ersten 3 Variable gleich befüllt.");
    }
}
