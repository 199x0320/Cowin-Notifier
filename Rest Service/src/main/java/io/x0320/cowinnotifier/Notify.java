package io.x0320.cowinnotifier;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.x0320.cowin.model.Session;

@RestController
@CrossOrigin
public class Notify {
	@RequestMapping("/")
	String home() {
		String date = "15-May-2021";

		DateTimeFormatter df = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		LocalDate localDate = LocalDate.parse(date, df);

		List<Session> sessions = CowinAPIService.getSessionsByPINCodeAndDate(581121, localDate, false);
		
		return "";
	}
}
