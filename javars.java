import java.util.Random;
public class javars {
    public static void main(String[] args) {
        int kaitou = 2;
        String[] hands = {"グー","チョキ","パー"};
        Random r = new Random();
        int bad = r.nextInt(3);
        System.out.println(bad);
        if (kaitou < bad){System.out.println("あなたの勝ちです" + hands[bad]);}else if (kaitou > bad){if (bad == 0){System.out.println("あなたの勝ちです" + hands[bad]);return;}
            System.out.println("あなたの負けです" + hands[bad]);
        }else if (kaitou == bad){System.out.println("あいこです" + hands[bad]);}
    }
}
