class Calculate {
    double h, w, d;

    void find() {
        System.out.println("Volume of box is: " + h * w * d);
    }
}
class MainClass1 {
    public static void main(String[] args) {
       
        Calculate c = new Calculate(10, 20, 30);
        c.find(); 

    }
}

