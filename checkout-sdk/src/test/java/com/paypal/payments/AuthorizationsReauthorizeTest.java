package com.paypal.payments;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.HttpClient;
import com.braintreepayments.http.serializer.Json;
import com.paypal.TestHarness;
import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

public class AuthorizationsReauthorizeTest extends TestHarness {

    @Test(enabled=false)
    public void testAuthorizationsReauthorizeRequest() throws IOException {
        AuthorizationsReauthorizeRequest request = new AuthorizationsReauthorizeRequest("AUTHORIZATION-ID");

        HttpResponse<Authorization> response = client().execute(request);
        assertEquals(response.statusCode(), 201);
        assertNotNull(response.result());
    }
}
