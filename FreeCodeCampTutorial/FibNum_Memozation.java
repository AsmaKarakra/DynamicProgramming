/**

Fib through memozation 

**/


import java.util.*;

public class Playground {

    public static void main(String[] args) {

        int n = 8;
        int result = fibMemo(n);

        System.out.print(result);

    }

    public static int fibMemo(int fibNum){

        //Hashmap for instant access
        Map<Integer,Integer> fibMap = new HashMap<>();

        //if Map contains input, return value
        if (fibMap.containsKey(fibNum)){
                fibMap.get(fibMemo(fibNum-1) + fibMemo(fibNum-2));
        }

        //else: check if input is base case
        if(fibNum <=2){
            return 1;
        }


        //if input is not base case, store function call in map
        fibMap.put(fibNum, fibMemo(fibNum-1)+ fibMemo(fibNum-2));

        //return value and store in map
        return fibMap.get(fibNum);
    }
}
