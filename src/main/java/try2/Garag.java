package try2;

public class Garag{
    public static void main(String[] args) {

        AllCars car = new AllCars(); // создали объект car класса AllCars

        System.out.println(car.getCarInfo(4)); // вызвали метод getCarInfo у объекта car и на экран вывели
        // результат выполнения метода, метод нам вывел информацию по объекту 5 массива allCars

        car.clearTestData(); // "Очищаем" список авто

        System.out.println(car.getCarInfo(4)); // вызвали метод getCarInfo у объекта car и на экран вывели
        // результат выполнения метода, метод нам вывел информацию по объекту 5 массива allCars

    }
}
