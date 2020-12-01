package music;

public class Piano extends Instrument {
    @Override
    protected void playNote(char note) {
        System.out.print("p:"+note+"|");
    }
}
