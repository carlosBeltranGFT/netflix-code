package com.netflix.database.hateoas;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.*;

import com.netflix.database.entities.Actor;
import com.netflix.database.service.ActorService;



@WebMvcTest
class ActorTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	private ActorService actorService;
	
	@Test
	void testWineByName() throws Exception {
		Actor actor = new Actor(1,"test");
		Mockito.when(actorService(1)).thenReturn(winery);
		
		mockMvc.perform(get("/api/winery/{id}",1)).andExpect(status().isOk()).andExpect(jsonPath("$.id",is(1)));
				
		
	}
	
	
	
	

}

