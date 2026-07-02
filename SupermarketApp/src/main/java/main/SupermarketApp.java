package main; import java.util.Scanner; import dao.*; import model.Item;
public class SupermarketApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);ItemDAO dao=new ItemDAO();UserDAO u=new UserDAO();
        System.out.println("===== Admin Login =====");System.out.print("Username: ");String user=sc.nextLine();System.out.print("Password: ");String pass=sc.nextLine();
        if(!u.login(user,pass)){System.out.println("Invalid credentials");return;}System.out.println("Login Successful");
        while(true){
            System.out.println("\n===== Supermarket Billing System =====");
            System.out.println("1.Add Item\n2.View All\n3.Search by ID\n4.Search by Category\n5.Update Stock\n6.Delete Item\n7.Count Items\n8.Generate Bill\n9.Sort by Price\n10.Out of Stock Report\n11.Exit");
            System.out.print("Choice: ");int ch=sc.nextInt();sc.nextLine();
            switch(ch){
                case 1:System.out.print("Name: ");String n=sc.nextLine();System.out.print("Category: ");String cat=sc.nextLine();System.out.print("Brand: ");String br=sc.nextLine();System.out.print("Price: ");double p=sc.nextDouble();System.out.print("Stock: ");int s=sc.nextInt();sc.nextLine();System.out.print("Date: ");String d=sc.nextLine();System.out.println(dao.add(new Item(n,cat,br,p,s,d))?"Item Added":"Failed");break;
                case 2:dao.viewAll();break;case 3:System.out.print("ID: ");dao.searchById(sc.nextInt());break;
                case 4:System.out.print("Category: ");dao.searchByCategory(sc.nextLine());break;
                case 5:System.out.print("ID: ");int uid=sc.nextInt();System.out.print("New Stock: ");System.out.println(dao.updateStock(uid,sc.nextInt())?"Updated":"Failed");break;
                case 6:System.out.print("ID: ");System.out.println(dao.delete(sc.nextInt())?"Deleted":"Failed");break;
                case 7:dao.count();break;
                case 8:System.out.print("Item ID: ");int bid=sc.nextInt();System.out.print("Quantity: ");dao.generateBill(bid,sc.nextInt());break;
                case 9:dao.sortByPrice();break;case 10:dao.outOfStock();break;
                case 11:System.out.println("Thank you!");return;default:System.out.println("Invalid");
            }
        }
    }
}
