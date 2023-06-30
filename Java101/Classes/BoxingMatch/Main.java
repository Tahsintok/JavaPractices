public class Main {
    public static void main(String[] args) throws Exception {
        
        Fighter ali = new Fighter("ali",15,100,90,0);
        Fighter ahmet = new Fighter("ahmet",15,100,100,0);
        Match a = new Match(ali, ahmet, 90, 100);
        a.run();
    }
}
