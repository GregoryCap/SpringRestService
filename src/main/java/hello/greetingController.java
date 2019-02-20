package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	@GetMapping(value="/greeting",
			produces = {MediaType.APPLICATION_JSON_VALUE})
	
	public greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new greeting(counter.incrementAndGet(),String.format(template, name));
	}
}
