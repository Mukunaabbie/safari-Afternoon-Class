package ABC;

import javax.swing.*;

public class fileThree {
    public static void main(String[] args) {
        String p,r,t;
        Double pConverted, rConverted, tConverted,jibu;
        p = JOptionPane.showInputDialog("enter the principle");
        r = JOptionPane.showInputDialog("enter the rate per year");
        t = JOptionPane.showInputDialog("enter the time is years");
        pConverted = Double.parseDouble(r);
        rConverted = Double.parseDouble(r);
        tConverted = Double.parseDouble(t);
        jibu = (pConverted*rConverted*tConverted)/100.0;
        JOptionPane.showMessageDialog(null,String.valueOf(jibu));
    }
}
