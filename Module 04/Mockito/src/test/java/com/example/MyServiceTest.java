package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;

public class MyServiceTest {

    @Test
    public void testMockingAndStubbing() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        assertEquals("Mock Data", service.fetchData());
    }

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();

        verify(mockApi).getData();
    }

    @Test
    public void testArgumentMatching() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.fetchById(anyInt())).thenReturn("Result");

        MyService service = new MyService(mockApi);
        assertEquals("Result", service.fetchById(42));

        verify(mockApi).fetchById(eq(42));
    }

    @Test
    public void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.saveData("Data");

        verify(mockApi).save("Data");
    }

    @Test
    public void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getStatus()).thenReturn("Loading", "Ready");

        assertEquals("Loading", mockApi.getStatus());
        assertEquals("Ready", mockApi.getStatus());
    }

    @Test
    public void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();
        service.saveData("Done");

        InOrder order = inOrder(mockApi);
        order.verify(mockApi).getData();
        order.verify(mockApi).save("Done");
    }

    @Test
    public void testVoidMethodWithException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("Error")).when(mockApi).save(anyString());

        final MyService service = new MyService(mockApi);
        assertThrows(RuntimeException.class, () -> service.saveData("Test"));
    }
}
