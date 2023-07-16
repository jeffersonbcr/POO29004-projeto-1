package poo;

import java.util.UUID;

public class Uid {
    private UUID uid;

    public Uid() {
        this.uid = UUID.randomUUID();
    }
    @Override
    public String toString() {
        return "UID:" + uid.toString();
    }
}
