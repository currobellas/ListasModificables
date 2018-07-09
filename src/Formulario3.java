import java.awt.FlowLayout;

import javax.swing.*;

public class Formulario3 extends JFrame {
	 JComboBox<StringBuilder> cb;

	    public Formulario3()  {
	        super();
	        setLayout(new FlowLayout());
	        
	        StringBuilder[] dias={
	        		new StringBuilder("Lunes"),
	        		new StringBuilder("Martes"), 
	        		new StringBuilder("Miércoles"), 
	        		new StringBuilder("Jueves"),
	        		new StringBuilder("Biernes"),
	        		new StringBuilder("Sábado"), 
	        		new StringBuilder("Domingo")
	        };        
	        cb= new JComboBox<>(dias);
	        add(cb);
	        
//	        cb.getItemAt(4).deleteCharAt(0);
//	        cb.getItemAt(4).insert(0,"Viii");
	        cb.getItemAt(4).setCharAt(0,'V');
	        

	    }
}
