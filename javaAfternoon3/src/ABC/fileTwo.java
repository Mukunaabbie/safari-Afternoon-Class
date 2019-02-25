package ABC;

import javax.swing.*;

public class fileTwo {
    public static void main(String[] args) {
        String x,y;
        Double xConverted,yConverted,jibu;
        x = JOptionPane.showInputDialog("enter the first number");
        y =JOptionPane.showInputDialog("enter the second number");
        xConverted = Double.parseDouble(x);
        yConverted = Double.parseDouble(y);
        jibu = xConverted+yConverted;
        JOptionPane.showMessageDialog(null,String.valueOf(jibu));

    }
}
