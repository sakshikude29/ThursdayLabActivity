package com.question2;


class Ari{
    public int add(int a, int b){
        int sum = a + b; 
        return sum;
    }
}

class Adder extends Ari{  
    public int callAdd(int a, int b){
        return add(a, b);
    }
}



 class Solution {

	public static void main(String[] args) {
        Adder a = new Adder();
        
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());  
        
        System.out.print(a.add(15,39) + " " + a.add(19,40) + " " + a.add(25,30) + "\n");
	}

}