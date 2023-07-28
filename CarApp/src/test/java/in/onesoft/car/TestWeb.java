package in.onesoft.car;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class TestWeb extends CarAppApplicationTests {

	@Autowired WebApplicationContext webApplicationContext ;
	 private MockMvc mockMvc;
	 
	 @Before
	 
	 public void setup() {
			mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		}
	 
	@Test 
	
	public void testCarDetails () throws Exception {
		
		mockMvc.perform(get("/cars")).andExpect(jsonPath("$.id").value("emp1")).andExpect(jsonPath("$.designation").value("manager"))
		.andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(3000));
	}
}
