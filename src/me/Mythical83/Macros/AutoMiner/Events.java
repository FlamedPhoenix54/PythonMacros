package me.Mythical83.Macros.AutoMiner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Events implements ActionListener {

    private static boolean coal = false;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Mine Coal")) {
            coal = !coal;
            try {
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\artin\\Desktop\\AutoMiner\\Bot.py"));

                String string;

                while ((string = br.readLine()) != null) {
                    System.out.println(string);
                }
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
