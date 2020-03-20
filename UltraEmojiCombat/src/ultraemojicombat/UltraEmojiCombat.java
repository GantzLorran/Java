package ultraemojicombat;
public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
                
                l[0] = new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 68.9f, 1.75f);
                
                l[1] = new Lutador("Putscript", "Brasil", 29, 10, 1, 1, 79.6f, 1.80f);
                
                l[2] = new Lutador("Snapshadow", "EUA", 35, 12, 2, 2, 81.6f, 1.85f);
                l[3] = new Lutador("Dead code", "Austrália", 29, 10, 1, 1, 45.6f, 1.83f);
                l[4] = new Lutador("UFOCobol", "Brasil", 29, 10, 1, 1, 67.6f, 1.82f);
                l[5] = new Lutador("Nerdaart", "EUA", 29, 13, 2, 4, 105.6f, 1.80f);
                
                Luta UFC01 = new Luta();
                UFC01.marcarLuta(l[1], l[5]);
                UFC01.luta();
    }   
}
