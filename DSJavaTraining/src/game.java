import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class game  extends JFrame implements ActionListener{
    JLabel num1Label,num2Label,quesLabel,timerLabel,scoreLabel,addLabel;
    JTextField answerField;
    JButton SubmitButton;
    int num1,num2,correctAnswer,timeLeft;
    int score=0;
    Timer timer;

    public game(){
        setTitle("Add GAME");
        setSize(500, 500);
        setLayout(null);

        num1Label=new JLabel();
        num1Label.setBounds(120,86,100,35);

        num2Label=new JLabel();
        num2Label.setBounds(190,86,100,35);

        quesLabel=new JLabel("Add the number");
        quesLabel.setBounds(120,70,110,35);

        addLabel=new JLabel("+");
        addLabel.setBounds(160,84,68,35);

        answerField =new JTextField();
        answerField.setBounds(110,120,90,35);


        SubmitButton=new JButton("submit");
        SubmitButton.setBounds(110,160,90,35);
        SubmitButton.addActionListener(this);

        timerLabel=new JLabel();
        timerLabel.setBounds(160,40,60,35);

        scoreLabel=new JLabel();
        scoreLabel.setBounds(120,190,90,35);

        add(num1Label);
        add(num2Label);
        add(quesLabel);
        add(answerField);
        add(SubmitButton);
        add(timerLabel);
        add(scoreLabel);
        add(addLabel);


        getContentPane().setBackground(new Color(135,206,250));
        newGame();
        setVisible(true);


    }

    void newGame(){
        Random rand = new Random();
        num1=rand.nextInt(1000);
        num2=rand.nextInt(1000);
        correctAnswer=num1+num2;
        num1Label.setText(Integer.toString(num1));
        num2Label.setText(Integer.toString(num2));
        answerField.setText("");
        startTimer();
    }

    void startTimer(){
        timeLeft=45;
        timer = new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                String t= String.valueOf((timeLeft));
                timerLabel.setText(t);
                if(timeLeft==0){
                    timer.stop();
                    gameOver();
                }
            }
        });
        timer.start();
    }
    void gameOver(){
        JOptionPane.showMessageDialog(this,"Game over, your score is "+score);
        System.exit(0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int userAnswer=Integer.parseInt(answerField.getText());
        if(userAnswer==correctAnswer){
            score++;
            scoreLabel.setText("Score: "+score);
            newGame();

        } else
        {
            gameOver();
        }
    }

    public static void main(String[] args) {
        new game();

    }
}
