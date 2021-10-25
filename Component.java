package electronics;

public abstract class Component {
	protected int pin;
	protected eGPIO pinMode;
	protected ePinState pinState;

	public Component(int pin, eGPIO pinMode) {
		pin = this.pin;
		pinMode = this.pinMode;

	}

	String doTask() {

		return null;

	}

}
