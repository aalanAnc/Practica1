package electronics;

import java.util.ArrayList;

public enum ComponentList {
	LED("LED"), IR("IR"), BUZZER("BUZZER");

	private final String compon;

	ComponentList(String compon) {
		this.compon = compon;
	}

	public String getComp() {
		return compon;
	}

	public static ArrayList<String> enumCOmp() {

		ComponentList[] components = ComponentList.values();
		ArrayList<String> stringComp = new ArrayList<String>();
		for (ComponentList component : components) {
			stringComp.add(component.toString());
		}
		return stringComp;
	}
}
