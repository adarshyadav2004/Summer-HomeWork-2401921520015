interface Playable {
    void play();
}

class Veena implements Playable {
    public void play() {
        System.out.println("Playing Veena");
    }
}

class Saxophone implements Playable{
    public void play() {
        System.out.println("Playing Saxophone");
    }
}
public class playableTest {
    public static void main(String[] args) {
  //a
        Veena v = new Veena();
      v.play();
 //b
        Saxophone s = new Saxophone();
        s.play();

        // c
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}
    

