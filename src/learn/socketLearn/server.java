/**
 * @ClassName server
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/10/16 17:25
 */
package learn.socketLearn;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        try{
            ServerSocket serversocket = new ServerSocket(8088);
            System.out.println("阻塞");
            Socket socket = serversocket.accept();
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            System.out.println("阻塞结束");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
