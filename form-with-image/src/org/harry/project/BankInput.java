package org.harry.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class BankInput {
    private JTextField textNomorKartu;
    private JComboBox comboJenisAtm;
    private JComboBox comboBank;
    private JTextField textNamaPemilik;
    private JButton simpanButton;
    private JButton browserButton;
    private JTextArea textUser;
    private JPanel rootPanel;
    private JLabel viewgambar;

    public String getnamagambar;

    public void masukanData(String inputData) throws IOException{
        FileWriter hf = new FileWriter("FileSistem.txt",true);
        hf.write(inputData);
        hf.close();

    }

    public BankInput() {
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getNomorKartu = textNomorKartu.getText();
                String getJenisAtm = (String) comboJenisAtm.getSelectedItem();
                String getBank = (String) comboBank.getSelectedItem();
                String getNamaPemilik = textNamaPemilik.getText();
                String result = "\nNomor Kartu :" + getNomorKartu + "\njenis Atm :" + getJenisAtm + "\nBank :" + getBank + "\nNama Pemilik :" + getNamaPemilik + "\nNama File Gambar ;" + getnamagambar;
                textUser.append(result);
                try{
                    FileWriter hf = new FileWriter("FileSistem.txt",true);
                }catch(IOException ex){
                    throw new RuntimeException(ex);
                }
                try{
                    masukanData(result + "\n\n");
                }catch (IOException ex){
                    throw new RuntimeException(ex);
                }
            }
        });

        browserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser image = new JFileChooser();
                int diPilih = image.showSaveDialog(null);
                if(diPilih == JFileChooser.APPROVE_OPTION){
                    String fileImage = image.getSelectedFile().getName();
                    getnamagambar = fileImage;
                }
                ImageIcon hr = new ImageIcon(new ImageIcon(image.getSelectedFile().getAbsolutePath()).getImage().getScaledInstance(120,100, Image.SCALE_SMOOTH));
                viewgambar.setIcon(hr);

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
