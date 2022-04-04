package org.praktikum.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.praktikum.demo.ToDoBusiness;
import org.praktikum.demo.ToDoService;

// Example adapted from: https://www.javatpoint.com/examples-of-mockito-and-junit-in-eclipse-ide
public class ToDoBusinessUnitTest {

	@Test 
    public void testusing_Mocks() {  
        // Arrange
        ToDoService doService = mock(ToDoService.class);  
        List<String> combinedlist = Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use w3eHibernate ", " Use Spring MVC ");  
        when(doService.getTodos("dummy")).thenReturn(combinedlist);  
        ToDoBusiness business = new ToDoBusiness(doService);  
      
        // Act
        List<String> alltd = business.getTodosforHibernate("dummy");   
          
        assertEquals(1, alltd.size());  
        assertEquals(" Use w3eHibernate ", alltd.get(0));
    }  

}
