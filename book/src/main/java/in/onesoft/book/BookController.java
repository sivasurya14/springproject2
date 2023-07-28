package in.onesoft.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookController {
@Autowired
BookRepository bookRepo;


@Bean
public RestTemplate getRestTemplate() {
	
	return new RestTemplate ();
}
@Autowired
RestTemplate rest;

    
 @GetMapping("/show")
 
 public String  message() {
	 
	 return rest.exchange("http://localhost:8081/cars/", HttpMethod.GET,null, String.class).getBody();
 }
//@GetMapping(value="/show")
// 
// public String  message1() {
//	 ResponseEntity<String> a = rest.exchange("http://localhost:8081/cars/", HttpMethod.GET,null, String.class);
//	 String result =a.getBody();	 
//	 return result ;
// } 
 
	@GetMapping("/")
	public String showMessage() {		
		return "hello java";		
	}
	@GetMapping("/book/")
	public List <BookEntity> findAll(){
		List<BookEntity> li =bookRepo.findAll();
		return li;
	}
	
}
