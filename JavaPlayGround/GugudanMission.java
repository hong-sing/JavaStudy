package JavaPlayGround;

import java.util.Scanner;

public class GugudanMission {

    public static void xxdan(String insertNum) {
        int insertNumber = Integer.parseInt(insertNum);
        int[] result = new int[insertNumber];
        for (int i=2; i<insertNumber+1; i++) {
            for (int j=0; j<insertNumber; j++) {
                result[j] = i * (j + 1);
                System.out.println(result[j]);
            }
        }
    }

    public static void xydan(String insertNum) {
        String[] splitNum = insertNum.split(",");
        int firstNum = Integer.parseInt(splitNum[0]);
        int secondNum = Integer.parseInt(splitNum[1]);
        int[] result = new int[secondNum];

        for (int i=2; i<=firstNum; i++) {
            for (int j=0; j<secondNum; j++) {
                result[j] = i * (j + 1);
                System.out.println(result[j]);
            }
        }
    }



    public static void main(String[] args) {
        System.out.println("값을 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String insertNum = scanner.nextLine();
        System.out.println("입력값 : " + insertNum);

        //xxdan(insertNum);

        xydan(insertNum);


    }
}
