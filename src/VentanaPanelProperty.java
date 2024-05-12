import javax.swing.*;

public class VentanaPanelProperty extends JFrame {



    public VentanaPanelProperty(){
        setTitle("Panel Property");
        setBounds(10,10,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaPanelProperty laminaPanelProperty=new LaminaPanelProperty();
        add(laminaPanelProperty);
        setVisible(true);

    }
}
