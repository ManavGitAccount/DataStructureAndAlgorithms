package Stacks.GeekForGeeks.ArrayList;

import java.util.ArrayList;

public class MyStack {

    ArrayList<Integer> arrList = new ArrayList<>();

    public void push(int x){
        arrList.add(x);
    }

    public int pop(){
        int res = arrList.get(arrList.size()-1);
        arrList.remove(arrList.size()-1);
        return res;
    }

    public int peek(){
        return arrList.get(arrList.size()-1);
    }

    public int size(){
        return arrList.size();
    }

    public boolean isEmpty(){
        return arrList.isEmpty();
    }

    public void display(){
        /*
        Iterate over the arraylist to display all the elements present in the stack
         */
    }
}
