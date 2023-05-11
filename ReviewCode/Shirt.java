public class Shirt {
    public  String size;
    public  String color;
    public  double price;

    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }
     public double getDiscountPrice(){
        double discount = 0;
        if(size.equals("S")){
            discount = 0.1;
        } else if (size.equals("M")) {
            discount = 0.2;
        } else if (size.equals("L")) {
            discount = 0.3;
        }
        // discount is calculate By Size for "S" for 10% "M" for 20% "L" for 30%
         // Calculate  Discount  discount Subtracting OriginalPrice
        return price - (price*discount);
     }
      // For Print The Shirt Details
    public void shirtDetails(){
        double discountedPrice = getDiscountPrice();
        System.out.println("Size:"+size);
        System.out.println("Color:"+color);
        System.out.println("Discounted Price: "+discountedPrice);
    }
}
