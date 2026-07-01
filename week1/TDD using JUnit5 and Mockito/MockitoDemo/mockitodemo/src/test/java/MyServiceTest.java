// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;
// import org.mockito.Mockito;
// import static org.mockito.Mockito.when;

// public class MyServiceTest {

//     @Test
//     public void testExternalApi() {

//         // Step 1: Create mock object
//         ExternalApi mockApi = Mockito.mock(ExternalApi.class);

//         // Step 2: Stub the method
//         when(mockApi.getData()).thenReturn("Mock Data");

//         // Step 3: Pass mock object
//         MyService service = new MyService(mockApi);

//         // Step 4: Call method
//         String result = service.fetchData();

//         // Step 5: Verify output
//         assertEquals("Mock Data", result);
//     }
// }

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Pass mock to service
        MyService service = new MyService(mockApi);

        // Call the method
        service.fetchData();

        // Verify getData() was called
        verify(mockApi).getData();
    }
}