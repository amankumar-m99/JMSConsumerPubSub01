package indeedcoder.jmsconsumerpubsub01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JmsConsumerPubSub01Application {

	public static void main(String[] args) {
		SpringApplication.run(JmsConsumerPubSub01Application.class, args);
	}

}
