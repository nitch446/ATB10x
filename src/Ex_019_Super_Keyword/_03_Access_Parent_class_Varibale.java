package Ex_019_Super_Keyword;

class Automobiles{
    int mileage = 20;
    String companyName = "Maruti Suzuki";
}

class FourWheeler extends Automobiles {
    void introduce()
    {
        System.out.println("Hello this is FourWheeler ShowRoom");
    }

    void CarInfo()
    {
        System.out.println("Company Name: "+super.companyName);
        System.out.println("Mileage: "+super.mileage);

    }
}

public class _03_Access_Parent_class_Varibale {
    public static void main(String[] args) {
        FourWheeler obj = new FourWheeler();
        obj.introduce();
        obj.CarInfo();
    }
}
