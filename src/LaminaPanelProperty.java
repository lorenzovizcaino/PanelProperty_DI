import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LaminaPanelProperty extends JPanel {


    private JButton start, stop;
    private MiPanel miPanel;
    private JPanel panelSur;
    private Timer timer;



    public LaminaPanelProperty(){
        setLayout(new BorderLayout());
        miPanel=new MiPanel();
        miPanel.addPropertyChangeListener(new PanelPropertyChangeListener());
        panelSur=new JPanel(new FlowLayout());

        start=new JButton("Start");
        stop=new JButton("Stop");
        panelSur.add(start);
        panelSur.add(stop);
        add(miPanel,BorderLayout.CENTER);
        add(panelSur,BorderLayout.SOUTH);

        start.addActionListener(e->{
            start.setEnabled(false);
            stop.setEnabled(true);
            timer=new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Random random=new Random();
                    int rojo=random.nextInt(255);
                    int verde=random.nextInt(255);
                    int azul=random.nextInt(255);
                    miPanel.setColor(new Color(rojo,verde,azul));
                    //miPanel.setColor(Color.GRAY);
                    miPanel.cambiarColor();
                }
            });
            timer.start();


        });

        stop.addActionListener(e->{
            stop.setEnabled(false);
            start.setEnabled(true);
            timer.stop();
        });
    }
}
