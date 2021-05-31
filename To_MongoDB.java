import com.mongodb.*;
import com.mongodb.client.*;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;
import static com.mongodb.client.model.Updates.currentDate;

import org.bson.Document;
import org.bson.types.ObjectId;

import javax.print.Doc;
import java.text.SimpleDateFormat;
import java.util.*;

public class To_MongoDB{

    public MongoClient client;
    public MongoCollection<Document> users_collection;
    public MongoDatabase database;
    public MongoCollection<Document> drivers_collection;
    public MongoCollection<Document> bookings_collection;
    public MongoCollection<Document> vehicles_collection;
    public MongoCollection<Document> reports_collection;
    public MongoCollection<Document> vehicles_status_collection;
    public MongoCollection<Document> lines_collection;

    public To_MongoDB(){

        client = MongoClients.create("mongodb://dil:dil@localhost:27017");
        database = client.getDatabase("Digital_Innovation_Lab");
        users_collection = database.getCollection("users");
        drivers_collection = database.getCollection("drivers");
        bookings_collection = database.getCollection("bookings");
        vehicles_collection = database.getCollection("vehicles");
        reports_collection = database.getCollection("reports");
        vehicles_status_collection = database.getCollection("vehicles_status");
        lines_collection = database.getCollection("lines");
    }

    public List<String> getStopsName(String entry_id, String exit_id){

        Document temp = new Document();
        List<String> return_stops = new ArrayList<String>;

        temp = (Document) lines_collection.find({{Stops: {_id: entry_id});
        return_stops.add(temp.getString("Stop_Name"));

        temp = (Document) lines_collection.find({{Stops: {_id: exit_id});
        return_stops.add(temp.getString("Stop_Name"));

        return return_stops;
    }

    public List<Document> getUserBookings(String user_id){

        return bookings_collection.find(new Document("Booking_User_ID", user_id)).into(new ArrayList<>());
    }

    public List<Document> getAssociatedBookings(List <String> bookings_ids){

        List<Document> all_bookings = new ArrayList<Document>();

        for(String id : bookings_ids){
            Document temp = (Document) (bookings_collection.find(eq("_id",id)));
            all_bookings.add(temp);
        }
        return all_bookings;
    }

    public List<Document> getUserReports(String user_id){

        return reports_collection.find(new Document("Reporting_User_ID", user_id)).into(new ArrayList<>());
    }

    public void insertNewReport(String booking_id, String ReportType, String Description, String reporting_user_id ){

        SimpleDateFormat date_formatter = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat time_formatter = new SimpleDateFormat("HH:mm:ss");
        Date today = new Date();
        Date now = new Date();

        Document temp = (Document) bookings_collection.find(new Document("Booking_User_ID", reporting_user_id));
        ObjectId entry = temp.getObjectId("Entry_Stop");
        ObjectId exit = temp.getObjectId("Exit_Stop");
        ObjectId v_id = temp.getObjectId("Vehicle_ID");


        Document temp2 = (Document) vehicles_status_collection.find(and(eq("Vehicle_ID", v_id), eq("Date", date_formatter.format(today)), or(eq("Current_Stop", entry), eq("Current_Stop", exit))));
        ObjectId d_id = temp2.getObjectId("Current_Driver_ID");

        reports_collection.insertOne(new Document("ReportType",ReportType).append("Date", date_formatter.format(today)).append("Time_Reported", date_formatter.format(now)).append("Description", Description).append("Driver_Comment", null).append("Related_Booking_ID", booking_id).append("Verification_Status", 0).append("Verification_Date", null).append("Reporting_User_ID", reporting_user_id).append("Vehicle_ID", v_id).append("Driver_Validating_ID", d_id));
    }

    public List<Document> showUnconfirmedReports(String driver_id){

        int unconfirmed_status = 0;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date now = new Date();

        return reports_collection.find(and(eq("Driver_Validating_ID",driver_id), eq("Verification_Status", unconfirmed_status), eq("Date", formatter.format(now)))).into(new ArrayList<>());
    }

    public void consolidateReportStatus(String report_id, int verification_result){

        reports_collection.updateOne(eq("_id", report_id), combine(set("Verification_Status", verification_result), currentDate("Verification_Date")));
    }
}
