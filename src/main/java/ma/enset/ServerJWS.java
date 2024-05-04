package ma.enset;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String Url = "http://0.0.0.0:9090/";
        Endpoint.publish(Url,new BankService());
        System.out.println("Web Service déployé sur "+Url);
    }
}
