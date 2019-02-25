package abc;

import javax.swing.*;

public class fileFour {
    public static void main(String[] args) {
        String h,r;
        Double hConverted,rConverted,vol;
        h = JOptionPane.showInputDialog("Enter Height");
        r = JOptionPane.showInputDialog("Enter Radius");
        hConverted = Double.parseDouble(h);
        rConverted = Double.parseDouble(r);
        vol = Math.pow(rConverted,2)*Math.PI*hConverted;
        JOptionPane.showMessageDialog(null,String.valueOf(vol));

    }

}
