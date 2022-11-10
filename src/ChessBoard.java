import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    List<List<Integer>> biDemArrList = new ArrayList<>();

    public ChessBoard() {
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j, 0);
            }
        }
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    String str = biDemArrList.get(i).get(j) + " ";
                    if (j % 2 == 0) {
                        str = str.replace('0', '●');
                    } else {
                        str = str.replace('0', '◯');
                    }
                    System.out.print(str);
                }
            } else {
                for (int j = 0; j < 8; j++) {
                    String str = biDemArrList.get(i).get(j) + " ";
                    if (j % 2 != 0) {
                        str = str.replace('0', '●');
                    } else {
                        str = str.replace('0', '◯');
                    }
                    System.out.print(str);
                }
            }

            System.out.println("\n");
        }
    }
}
