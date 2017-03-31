package sympozjummorskie.sympozjummorskie;

import java.util.ArrayList;

/**
 * Created by michael on 14.04.15.
 */
public class Abstract {


    public int id;
    public String author;
    public String info;


    public String tytul;
    public String streszczenie;

    public Abstract(int id, String author, String info, String tytul, String streszczenie) {
        this.id = id;
        this.author = author;
        this.info = info;
        this.tytul = tytul;
        this.streszczenie = streszczenie;
    }


    public static class List extends ArrayList<Abstract> {
    }
}