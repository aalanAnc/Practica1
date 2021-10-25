package electronics;

public class IR extends Component implements Sensor {

	IR(int pin, eGPIO pinMode) {
		super(pin, pinMode);

	}
	
	public String detect() {
		String frase="componente detectado";
		return frase;
	}
	
	public String doTask(){
		return null;
	}

}
