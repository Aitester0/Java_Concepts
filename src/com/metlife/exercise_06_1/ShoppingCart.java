package com.metlife.exercise_06_1;

public class ShoppingCart {
    public static void main(String[] args) {
        Item A=new Item();
        Item B=new Item();
        A.Descer="this is first product";
        B.Descer="This is second product";
        System.out.println(A.Descer);
        System.out.println(B.Descer);
        A.Descer=B.Descer;
        System.out.println(A.Descer);
        ShoppingCart s1=new ShoppingCart();
        s1.DiscountPrice();
    }
    public void DiscountPrice(){
        Item A=new Item();
        A.price=100;
        A.Quentity=10;
        if (A.Quentity==2)
        {
            double final_price=(A.price-(A.price*10/100))* A.Quentity;
            System.out.println(final_price);
        }
        else if (A.Quentity >=3&& A.Quentity<=5)
        {
            double final_price=(A.price-(A.price*15/100))* A.Quentity;
            System.out.println(final_price);
        }
        else if (A.Quentity>5)
        {
            double final_price=(A.price-(A.price*25/100))*A.Quentity;
            System.out.println(final_price);
        }
    }
}
