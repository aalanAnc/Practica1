package electronics;

public class Buzzer extends Component implements Actuator {

	Buzzer(int pin, eGPIO pinMode) {
		super(pin, pinMode);

	}

	public String start() {

		String frase = "componente encendido";
		return frase;

	}

	public String stop() {

		String frase = "componente apagado";
		return frase;
	}

	public String doTask() {

		return null;

	}
}
