import java.awt.*;
import java.awt.event.*;
class Lab_14 extends Frame implements ActionListener{
    TextField textFieldSum;
    TextField textFieldA;
    TextField textFieldB;
    Label labelA;
    Lab_14(String name){
        super(name);
        labelA = new Label("a");
        Label labelB = new Label("b");
        Label labelSum = new Label("sum");
        setLayout(null);
        labelA.setBounds(10,100,30,20);
        labelB.setBounds(10,150,30,20);
        labelSum.setBounds(10,200,30,20);
        add(labelA);
        add(labelB);
        add(labelSum);

        Button button1 = new Button("Calculate");
        button1.setBounds(50,300,100,20);
        button1.addActionListener(this);
        add(button1);
        Button button2 = new Button("Clear");
        button2.setBounds(50,350,100,20);
        button2.addActionListener(this);
        add(button2);

        textFieldA = new TextField();
        textFieldA.setBounds(50,100,100,20);
        add(textFieldA);
        textFieldB = new TextField();
        textFieldB.setBounds(50,150,100,20);
        add(textFieldB);
        textFieldSum = new TextField();
        textFieldSum.setBounds(50,200,100,20);
        add(textFieldSum);
        setSize(500,500);
        setVisible(true);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("Calculate")){
            float num1, num2, result;
            num1 = Float.parseFloat(textFieldA.getText());
            num2 = Float.parseFloat(textFieldB.getText());
            result = num1+num2;
            textFieldSum.setText(String.valueOf(result));
        } if (e.getActionCommand().equals("Clear")) {
            textFieldA.setText("");
            textFieldB.setText("");
            textFieldSum.setText("");
        }
    }

    public static void main(String[] args){
        new Lab_14("Sum of two digits");
    }
}