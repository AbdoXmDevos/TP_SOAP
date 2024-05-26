package ma.karimi.enset;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String Url = "http://0.0.0.0:9092/";
        Endpoint.publish(Url,new BankService());
    }
}
