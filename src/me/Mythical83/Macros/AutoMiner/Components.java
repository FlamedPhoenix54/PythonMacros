package me.Mythical83.Macros.AutoMiner;

import me.Mythical83.Macros.AutoMiner.Events;

import javax.swing.*;

public class Components {

    public static JCheckBox mineCoal() {
        JCheckBox check = new JCheckBox("Mine Coal");
        check.setBounds(0, 0, 150, 25);
        check.addActionListener(new Events());

        return check;
    }

    public static JCheckBox mineDiamonds() {
        JCheckBox check = new JCheckBox();

        return check;
    }

    public static JCheckBox mineRedstone() {
        JCheckBox check = new JCheckBox();

        return check;
    }

    public static JCheckBox mineLapis() {
        JCheckBox check = new JCheckBox();

        return check;
    }

    public static JCheckBox mineGold() {
        JCheckBox check = new JCheckBox();

        return check;
    }

    public static JCheckBox mineIron() {
        JCheckBox check = new JCheckBox();

        return check;
    }

    public static JCheckBox mineEmeralds() {
        JCheckBox check = new JCheckBox();

        return check;
    }

}
