package edu.unbosque.websocketstutorial;

import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.google.gson.Gson;
import edu.unbosque.websocketstutorial.model.Message;

public class MessageEncoder implements Encoder.Text<Message> {

    private static Gson gson = new Gson();

    @Override
    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
    }

    @Override
    public String encode(Message message) {
        String json = gson.toJson(message);
        return json;
    }



    @Override
    public void destroy() {
        // Close resources
    }
}