
import java.net.*;
import java.io.*;
public class TelegramSend {
    public static void main(String[] args) throws Exception {
        String token = args[0];
        String chatId = args[1];
        String message = args[2];
        String urlStr = "https://api.telegram.org/bot" + token + "/sendMessage";
        URL url = new URL(urlStr);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        String body = "chat_id=" + chatId + "&text=" + URLEncoder.encode(message, "UTF-8");
        con.getOutputStream().write(body.getBytes("UTF-8"));
        System.out.println(con.getResponseCode());
    }
}
