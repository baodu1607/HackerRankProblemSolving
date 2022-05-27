package com.company;

public class Main {

    public static void main(String[] args) {
        String countingValleys = "DDUUUUDD";
        System.out.println(countingValleys(8,countingValleys));
    }

    private static int countingValleys(int steps, String path) {
        int count = 0;
        char[] ch = path.toCharArray();
        int sum = 0;
        int i = 0;
        while(i <steps){
            if(ch[i] == 'D'){
                sum--;
            }else{
                sum++;
            }
            if(sum == 0 && ch[i] == 'U'){ //key problem
                count++;
            }
            i++;
        }

        return count;
    }

}
