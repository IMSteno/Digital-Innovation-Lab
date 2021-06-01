package it.polimi.hand;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverController {

    String driverId = "57506d62f57802807471dd41";
    List<String> reportIds = new ArrayList<>();

    WebClient client = WebClient.builder()
            .baseUrl("http://localhost:8080")
            .defaultCookie("cookieKey", "cookieValue")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
            .build();

    public List<ReadableReportDriver> getAllReports(){
        WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = client.method(HttpMethod.GET);
        WebClient.RequestBodySpec bodySpec = uriSpec.uri("/drivers/" + driverId + "/reports");
        List<ReadableReportDriver> response = bodySpec.retrieve().bodyToFlux(ReadableReportDriver.class).collectList().block();
        return response;
    }

    public void insertNewReport(){
        //WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = client.method(HttpMethod.POST);
        ReportUser reportUser = new ReportUser("Posto occupato", "Carlo va licenziato",
                " 60b3604aa6cdbd0008d11683", "0");

        WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = client.post();
        WebClient.RequestBodySpec bodySpec = uriSpec.uri("/users/" + driverId + "/reports/insert");
        WebClient.RequestHeadersSpec<?> headersSpec = bodySpec.bodyValue(reportUser);
        List<ReadableReportUser> response = bodySpec.retrieve().bodyToFlux(ReadableReportUser.class).collectList().block();
        System.out.println(response);

    }

    public List<BookingInfoUser> getBookings(){
        WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = client.method(HttpMethod.GET);
        WebClient.RequestBodySpec bodySpec = uriSpec.uri("/users/" + driverId + "/bookings");
        List<BookingInfoUser> response = bodySpec.retrieve().bodyToFlux(BookingInfoUser.class).collectList().block();

        return response;
    }




}
