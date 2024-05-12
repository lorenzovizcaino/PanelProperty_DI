import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class MiPanel extends JPanel implements Serializable {
    private Color color;
    private int id;
    private String texto;
    private boolean activo;
    private PropertyChangeSupport changeSupport;

    public MiPanel() {
        setLayout(new GridLayout(1,1));

        this.id=0;
        this.color=Color.GRAY;
        this.texto="Panel de puebas ChangeListener";
        this.activo=false;
        changeSupport=new PropertyChangeSupport(this);
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        Color oldColor=this.color;
        this.color=color;
        changeSupport.firePropertyChange("Cambio Color",oldColor,color);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public PropertyChangeSupport getChangeSupport() {
        return changeSupport;
    }

    public void setChangeSupport(PropertyChangeSupport changeSupport) {
        this.changeSupport = changeSupport;
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial",Font.BOLD,20));
        g.drawString(texto,10,getHeight()/2);

    }

    public void cambiarColor() {
        if(activo){
            setBackground(color);
        }

    }
}
