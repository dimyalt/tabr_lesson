// Создал объекты класса авто, и вызов метододов по проверке цены и печати информации
package try2;

public class Garag{
    public static void main(String[] args) {

        AllCars car = new AllCars();
        //System.out.println(car.fillTestData());
        System.out.println(car.getManufacture(4));
        System.out.println(car.clearTestData());
        //System.out.println(car.getManufacture(1));

    }
}
