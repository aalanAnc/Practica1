package electronics;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class RaspPIDEMO {

	static ArrayList<Component> selectedComp = new ArrayList<Component>();
	static String[] Opciones = { "LED", "IR", "BUZZER" };

	public static void main(String[] args) {

		int seleccion = JOptionPane.showOptionDialog(null, "Elija la opcion", "Ventana de opciones",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, Opciones, Opciones[0]);
	}

}
