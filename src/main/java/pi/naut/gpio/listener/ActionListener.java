package pi.naut.gpio.listener;

import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import pi.naut.gpio.display.ssd1306.layout.DefaultLayout;

public class ActionListener implements GpioPinListenerDigital {

	private DefaultLayout defaultLayout;
	private long actionSize;

	public ActionListener(DefaultLayout defaultLayout) {
		this.defaultLayout = defaultLayout;
		this.actionSize = defaultLayout.getActions().size();
	}

	@Override
	public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
		System.out.println("Do some action!");
	}

}
