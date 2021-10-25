package electronics;

public class LED extends Component implements Actuator {

	LED(int pin, eGPIO pinMode) {
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
