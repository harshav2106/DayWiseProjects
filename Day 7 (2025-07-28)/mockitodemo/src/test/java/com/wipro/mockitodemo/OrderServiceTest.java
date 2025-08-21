package com.wipro.mockitodemo;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    @Test
    void testPlaceOrderSuccess() {
    	OrderService orderService = mock(OrderService.class);
    	when(orderService.placeOrder("ORD-01")).thenReturn("Successful");
    	
    	assertEquals(orderService.placeOrder("ORD-01"),"Successful");
    	verify(orderService).placeOrder("ORD-01");
        
	}
}
