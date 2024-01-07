import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int price1 = sc.nextInt(); // Flipkart price
        int discount1 = sc.nextInt(); // Flipkart discount
        int shipping1 = sc.nextInt(); // Flipkart charges.

        int price2 = sc.nextInt(); // Snapdeal price
        int discount2 = sc.nextInt(); // Snapdeal discount
        int shipping2 = sc.nextInt(); // Snapdeal charges.

        int price3 = sc.nextInt(); // Amazon price
        int discount3 = sc.nextInt(); // Amazon discount
        int shipping3 = sc.nextInt(); // Amazon charges.

        int flipkart_price = (int)(price1 - (price1*(discount1*0.01)) + shipping1); // Final price of the t-shirt in Flipkart
        int snapdeal_price = (int)(price2 - (price2*(discount2*0.01)) + shipping2); // Final price of the t-shirt in Snapdeal
        int amazon_price   = (int)(price3 - (price3*(discount3*0.01)) + shipping3); // Final price of the t-shirt in Amazon

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
