//создал класс Авто, с двумя конструкторами (по умолчанию и с параметрами) и методом проверки цвета машины и
// изменения цены. Добавил метод печати информации об авто
package try2;

public class Auto {
    String carManufacture;
    String carModel;
    String carColor;
    String carVin;
    int carPrice;
    public Auto(String autoMan, String autoMod, String autoCol, String autoVin, int autoPrice){
        carManufacture = autoMan;
        carModel = autoMod;
        carColor = autoCol;
        carVin = autoVin;
        carPrice = autoPrice;
        //this.newPrice();

    }
    //void newPrice() {
    //    if (carColor == "Красный") {
    //        carPrice = (int) (carPrice + carPrice * 0.1);
    //    }
    //}
    //void printInfo() {
    //    System.out.println(carManufacture + " " + carModel + " " + carColor + " " + carVin + " " + carPrice);
    //}

}

