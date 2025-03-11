package chapter03;

public class C_array {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        //선언과 동시에 초기화하는 방법 - 3행 3열
        int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        //출력은 바로 향상된 for 문으로 하면 됨


    }
}
