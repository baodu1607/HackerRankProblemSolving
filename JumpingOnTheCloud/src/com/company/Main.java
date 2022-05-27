package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {0, 0, 1, 0, 0, 1, 0};

        System.out.println("1: " + jumpingOnClouds(array));
        System.out.println("2: " + jumpingOnClouds2(array));
    }

    private static int jumpingOnClouds(int[] c){
        int count = -1;
        for (int i = 0; i < c.length; i++) {
            count++;
            if (i<c.length-2 && c[i+2]==0) i++;
        }
        return count;
    }

    /*Key idea.
    * jump 2 every time, if encounter 1 so count++, i++ normal like c[i] == c[i+1],
    * but encounter 0 so count only +1 but i jump two step forward like i=i+2, actually i=i+2. */

    private static int jumpingOnClouds2(int[] c){
        int count = 0;
        for (int i = 0; i < c.length-1; i++) { //c.length - 1 la do truong hop 0 , 1, 0 o cuoi cung
            //có nghĩa là nếu có 7 phần tử, và c[5] == 1 thì chắc chắn phần tử cuối là 0 rồi,
            //và count bắt đầu từ 0 nữa nên phải kết thúc ở phần tử n-1 để không bị dư count.
            if (c[i] == 0) i++;
            count++;
        }
        return count;
    }

    //recursive solution
    /*def jumpingOnClouds(c):
            if len(c) == 1 : return 0
            if len(c) == 2: return 0 if c[1]==1 else 1
            if c[2]==1:
            return 1 + jumpingOnClouds(c[1:])
    if c[2]==0:
            return 1 + jumpingOnClouds(c[2:])*/
}
