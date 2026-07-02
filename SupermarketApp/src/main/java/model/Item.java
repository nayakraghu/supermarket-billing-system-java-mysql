package model;
public class Item {
    private int id; private String name,category,brand,addedDate; private double price; private int stock;
    public Item(){}
    public Item(String name,String category,String brand,double price,int stock,String addedDate){this.name=name;this.category=category;this.brand=brand;this.price=price;this.stock=stock;this.addedDate=addedDate;}
    public int getId(){return id;} public void setId(int i){this.id=i;}
    public String getName(){return name;} public void setName(String n){this.name=n;}
    public String getCategory(){return category;} public void setCategory(String c){this.category=c;}
    public String getBrand(){return brand;} public void setBrand(String b){this.brand=b;}
    public double getPrice(){return price;} public void setPrice(double p){this.price=p;}
    public int getStock(){return stock;} public void setStock(int s){this.stock=s;}
    public String getAddedDate(){return addedDate;} public void setAddedDate(String d){this.addedDate=d;}
}
