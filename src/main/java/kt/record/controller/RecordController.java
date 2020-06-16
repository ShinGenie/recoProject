package kt.record.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RecordController {
	
	private static final Logger logger = LoggerFactory.getLogger(RecordController.class);
	
	@GetMapping("/papa")
	String index() {
		System.out.println("222");
		return "hello world! jpa!";
	}

}
