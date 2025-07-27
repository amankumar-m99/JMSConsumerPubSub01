package indeedcoder.jmsconsumerpubsub01.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

	@Value("${spring.application.name}")
	private String appName;

	@JmsListener(destination = "${my.own.key.for.destination}")
	public void readMessage(String message) {
		System.out.println(String.format("Msg received at %s:", appName) + message);
	}
}
