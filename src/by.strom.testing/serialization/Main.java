package by.strom.testing.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        UserChild user = new UserChild();

        user.life= 90;
        user.statField=45;
        Sword sword = new Sword();
        sword.level = 5;
        user.sword=sword;
        user.childlevel = 65;

        FileOutputStream fileOutputStream = new FileOutputStream("tempfile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.flush();
        objectOutputStream.close();

        user.statField = 35;

        FileInputStream fileInputStream = new FileInputStream("tempfile");
        ObjectInputStream objectImputStream = new ObjectInputStream(fileInputStream);
        UserChild newUser = (UserChild) objectImputStream.readObject();
        objectImputStream.close();

        System.out.println(newUser.life);
        System.out.println(newUser.statField);
        System.out.println(newUser.sword);
        System.out.println(newUser.childlevel);
    }
}
