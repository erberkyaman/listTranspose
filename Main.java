import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void printList(int array[][]){
        for (int i[]: array){
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int index1,index2,number;
        Scanner input = new Scanner(System.in);

        System.out.print("Satır Sayısı : ");
        index1 = input.nextInt();
        System.out.print("Sütun Sayısı : ");
        index2 = input.nextInt();

        int [][] list = new int[index1][index2];
        int [][] transposeList = new int[index2][index1];

        for (int i=0; i < index1; i++){
            for (int j=0; j< index2; j++){
                System.out.print("Sayı Giriniz: ");
                number = input.nextInt();
                list[i][j] = number;
            }
        }
        for (int i=0; i < index1; i++){
            for (int j=0; j< index2; j++){
                transposeList[j][i] = list[i][j];
            }
        }
        printList(list);
        printList(transposeList);



    }


}
