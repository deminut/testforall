package by.strom.testing.serialization;

import java.io.Serializable;

public class User implements Serializable {
    int life;
    static int statField;
    transient Sword sword;
}
