import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PanelPropertyChangeListener implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyName = evt.getPropertyName ( );
        Object oldValue = evt.getOldValue ( );
        Object newValue = evt.getNewValue ( );

//        System.out.println ("La propiedad " + propertyName + " ha cambiado.");
//        System.out.println ("Valor anterior: " + oldValue);
//        System.out.println ("Nuevo valor: " + newValue);

        MiPanel miPanel;
        miPanel =(MiPanel) evt.getSource();



        if(propertyName.equals("Cambio Color")){
            if(!oldValue.equals(newValue)){
                System.out.println("AQUI");
                miPanel.setActivo(true);
            }
        }




    }
    }

