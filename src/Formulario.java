import java.awt.*;
import javax.swing.*;

public class Formulario extends JFrame {
    JList<String> lst;
    DefaultListModel<String> modeloLista;
    JComboBox<String> cb;

    public Formulario()  {
        super();
        setLayout(new FlowLayout());
        
        String[] dias={"Lunes", "Martes", "Miércoles", "Jueves",
                        "Biernes", "Sábado", "Domingo"
        };
        modeloLista= new DefaultListModel<>();
        lst= new JList<>(modeloLista);
        add(lst);
        
        for (String s:dias){
            modeloLista.addElement(s);
        }
                         
        modeloLista.setElementAt("Viernes", 4);
    }
}
