/**
 * @ClassName Clint
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/10/16 17:27
 */
package learn.socketLearn;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Clint {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost",8088);

        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
