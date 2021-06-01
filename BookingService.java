package it.polimi.hand;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.file.InvalidPathException;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookingService {

    @Autowired
    ToMongoDB databaseService;

    public List<BookingInfoUser> findUserBookings(String userID) throws EmptyListException{
        System.out.println("Sono qui");
        List<BookingInfoUser> bookingInfoUsers = new ArrayList<>();
        List<Document> bookingUserDocuments = databaseService.getUserBookings(userID);
        if(bookingUserDocuments.size() == 0)
            throw new EmptyListException();
        else {
            for (Document d : bookingUserDocuments) {
                String bookingId = d.getObjectId("_id").toString();
                String entryStop = (String) d.get("Entry_Stop");
                String exitStop = (String) d.get("Exit_Stop");
                String dateBooking = (String) d.get("Date");
                String timeBooked = (String) d.get("Arrival_At_Entry_Time");
                String vehicleType = (String) d.get("VehicleType");
                String bookedLine = (String) d.get("BookedLine");
                bookingInfoUsers.add(new BookingInfoUser(bookingId, entryStop, exitStop, vehicleType, bookedLine,
                        dateBooking, timeBooked));
            }
            System.out.println(bookingInfoUsers.size());
            System.out.println(bookingInfoUsers);
            return bookingInfoUsers;
        }
    }


}
