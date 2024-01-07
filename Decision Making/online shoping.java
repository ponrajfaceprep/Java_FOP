import java.util.Scanner;



class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int price1 = sc.nextInt();

        int discount1 = sc.nextInt();

        int shipping1 = sc.nextInt();



        int price2 = sc.nextInt();

        int discount2 = sc.nextInt();

        int shipping2 = sc.nextInt();



        int price3 = sc.nextInt();

        int discount3 = sc.nextInt();

        int shipping3 = sc.nextInt();



        int flipkart_price = (int)(price1 - (price1*(discount1*0.01)) + shipping1);

        int snapdeal_price = (int)(price2 - (price2*(discount2*0.01)) + shipping2);

        int amazon_price   = (int)(price3 - (price3*(discount3*0.01)) + shipping3);



        System.out.println("In Flipkart: Rs." + flipkart_price);

        System.out.println("In Snapdeal: Rs." + snapdeal_price);

        System.out.println("In Amazon: Rs." + amazon_price);



        if(flipkart_price <= snapdeal_price && flipkart_price <= amazon_price){

            System.out.println("Choose Flipkart");

        }

        else if(snapdeal_price < flipkart_price && snapdeal_price <= amazon_price){

            System.out.println("Choose Snapdeal");

        }

        else{

            System.out.println("Choose Amazon");

        }

    }

}
