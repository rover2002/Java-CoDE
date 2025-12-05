import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormate;
import java.util.Calender;

public class DigitalClock extends JFrame {
  Calender calender;
  SimpleDateFormate timeFormat;
  SimpleDateFormate dayFormat;
  SimpleDateFormate dateFormat;
  
  JLabel timeLabel;
  JLabel dayLabel;
  JLabel dateLabel;
  String time;
  String day;
  String date;
  
  public DigitalClock()  {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Digital Clock");
    this.setLayout(new FlowLayout());
    this.setSize(350,200);
    this.setResizable(false);
    
    timeFormat = new SimpleDateFormat("hh:mm:ss a");
    dayFormat = new SimpleDateFormat("EEEE");
    dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
    
    timeLabel = new JLabel();
    timelabel.setFont(new Font("Verdana", Font.PLAIN, 35));
    timelabel.setForeground(new Color(0x00FF00));
    timelabel.setBackground(Color.black);
    timeLabel.setOpaque(true);
    
    dayLabel = new JLabel();
    dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
    dayLabel.setForeground(new Color(0x00FF00));
    dayLabel.setBackground(Color.black);
    dayLabel.setOpaque(true);
    
    dateLabel = new JLabel();
    dateLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
    dateLabel.setForeground(new Color(0x00FF00));
    dateLabel.setBackground(Color.black);
    dateLabel.setOpaque(true);
    
    
