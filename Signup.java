package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.classfile.instruction.StackInstruction;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1, r2, M1, M2, M3;
    JButton next;
    JTextField textName ,textFN, textEmail, textMS, textadd, textcity, textpin, textstate;
    JDateChooser dateChooser;
    Random ran_num = new Random();
    long first4 = (ran_num.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup(){

        super ("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel((i3));
        image.setBounds(25, 10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name: ");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFN = new JLabel("Father's Name: ");
        labelFN.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFN.setBounds(100,240,200,30);
        add(labelFN);

        textFN = new JTextField();
        textFN.setFont(new Font("Raleway", Font.BOLD, 14));
        textFN.setBounds(300,240,400,30);
        add(textFN);

        JLabel DOB = new JLabel("Date Of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender: ");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address: ");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMS = new JLabel("Marital Status: ");
        labelMS.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        M1 = new JRadioButton("Married");
        M1.setFont(new Font("Raleway", Font.BOLD, 14));
        M1.setBackground(new Color(222,255,228));
        M1.setBounds(300,440,100,30);
        add(M1);

        M2 = new JRadioButton("Unmarried");
        M2.setFont(new Font("Raleway", Font.BOLD, 14));
        M2.setBackground(new Color(222,255,228));
        M2.setBounds(450,440,100,30);
        add(M2);

        M3 = new JRadioButton("Other");
        M3.setFont(new Font("Raleway", Font.BOLD, 14));
        M3.setBackground(new Color(222,255,228));
        M3.setBounds(635,440,100,30);
        add(M3);

        ButtonGroup MbuttonGroup = new ButtonGroup();
        MbuttonGroup.add(M1);
        MbuttonGroup.add(M2);
        MbuttonGroup.add(M3);

        JLabel labelAdd = new JLabel("Address: ");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway", Font.BOLD, 14));
        textadd.setBounds(300,490,400,30);
        add(textadd);

        JLabel labelcity = new JLabel("City: ");
        labelcity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway", Font.BOLD, 14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelpin = new JLabel("Pincode: ");
        labelpin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway", Font.BOLD, 14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel labelstate = new JLabel("State: ");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway", Font.BOLD, 14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        next = new JButton(("Next"));
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible((true));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFN.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(M1.isSelected()) {
            marital = "Married";
        }else if(M2.isSelected()){
            marital = "Unmarried";
        }else if(M3.isSelected()){
            marital = "Other";
        }

        String address = textadd.getText();
        String city = textcity.getText();
        String pincode = textpin.getText();
        String state = textstate.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else{
                Connector con1 = new Connector();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Signup();
    }
}
