package in.onesoft.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

	Logger log = LoggerFactory.getLogger(LogController.class);

	@GetMapping("/hii")

	public String add() {
		log.info("im from info");
		log.debug("im from debug");
        log.error("here is error occured ");
		return "hii this is log4j test ";
	}

}
