package chapter03;

import java.util.ArrayList;

public class F_array {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;i<10;i++){
            arrayList.add(i+1);
        }
        System.out.println("원본리스트 : " +arrayList);

        //int length = arrayList.size();

        for(int j = 0;j<arrayList.size();j++){
                if(arrayList.get(j)%2==1) {
                    arrayList.remove(j);
                }
        }
        System.out.println("삭제리스트 : "+arrayList);
        arrayList.set(3,50);
        System.out.println("바꾼리스트 : "+arrayList);


    }
}
