package algorithm_problem.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ServerScaleOutCount {

    public static void main(String[] args) {

        int[] players = {0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5};
        int m = 3;
        int k = 5;

        System.out.println(answer(players, m, k));
    }

    public static int answer(int[] players, int m, int k) {

        List<Integer> serverAdd = new ArrayList<Integer>(Arrays.stream(players)
                .map(player -> player / m)
                .boxed().toList());


//        1. 서버에 플레이어 수를 나누어서 진행 한 알고리즘
        for (int i = 0; i < serverAdd.size(); i++) {
            int current = serverAdd.get(i);
            if (current > 0) {
                int limit = Math.min(i + k, serverAdd.size());
                for (int j = i + 1; j < limit; j++) {
                    int updatedValue = serverAdd.get(j) - current;
                    serverAdd.set(j, Math.max(updatedValue, 0));
                }
            }
        }


        return serverAdd.stream().mapToInt(Integer::intValue).sum();



//        for(int i = 0 ; i <players.length; i++) {
//            players[i] = players[i] / m;
//        }
//
//        for (int i = 0; i < players.length; i++) {
//            if (players[i] > 0) {
//                if (i+k <= players.length){
//                    System.out.println("-------------------");
//                    System.out.println("i: " + i);
//                    for (int j = i+1; j < i+k; j++ ){
//                        System.out.println("j: " + j);
//                        if (players[j] - players[i] > 0) {
//                            players[j] = players[j] - players[i];
//                        } else {
//                            players[j] = 0;
//                        }
//                    }
//                } else {
//                    for (int j = i+1; j < players.length; j++ ){
//                        if (players[j] - players[i] > 0) {
//                            players[j] = players[j] - players[i];
//                        } else {
//                            players[j] = 0;
//                        }
//                    }
//                }
//            }
//        }
//
//        return Arrays.stream(players).sum();
    }
}
