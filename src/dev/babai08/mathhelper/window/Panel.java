package dev.babai08.mathhelper.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel implements ActionListener {

    private final Font DefaultFont;

    public Panel() {
        this.DefaultFont = new Font("Times New Roman", Font.PLAIN, 30);
        this.setPreferredSize(new Dimension(100, 100));
        this.setFocusable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
