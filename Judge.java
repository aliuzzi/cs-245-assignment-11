import java.util.*;

public class Judge {
    public int findJudge(int num, int[][] trust) {
        int judge = -1;
        LinkedList[] list = new LinkedList[num];
        for (int i = 0; i < num; i++) {
            list[i] = new LinkedList();
        }
        
        for (int i = 0; i < list.length; i++) {
            if (list[i].contains(judge)) {
                return -1;
            }
        }

        for (int i = 0; i < trust.length; i++) {
            list[trust[i][1] - 1].add(trust[i][0]);
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i].size() == num - 1) {
                judge = i + 1;
            }
        }

        return judge;

    }
}
