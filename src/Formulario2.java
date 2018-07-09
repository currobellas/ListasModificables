import java.awt.*;
import javax.swing.*;

public class Formulario2 extends JFrame {
    JComboBox<String> cb;

    public Formulario2()  {
        super();
        setLayout(new FlowLayout());
        
        String[] dias={"Lunes", "Martes", "Miércoles", "Jueves",
                        "Biernes", "Sábado", "Domingo"
        };        
        cb= new JComboBox<>(dias);
        add(cb);
        
        cb.removeItemAt(4);
        cb.insertItemAt("Viernes",4);
    }
}
