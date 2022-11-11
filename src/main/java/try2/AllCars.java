package try2;

public class AllCars {
    Auto[] allAuto;
    public AllCars() { // создали конструктор класса allCars
        Auto[] allAuto = fillTestData(); // заполнили переменную allAuto значениями при помощи метода fillTestData
    }

    public Auto[] fillTestData() { // создали метод fillTestData
        // это объекты, которые содержат данные с которыми мы работаем
        Auto car1 = new Auto("Chevrolet", "Camaro", "Черный", "SALVP2BG6DH766306", 100000);
        Auto car2 = new Auto("Chevrolet", "Camaro", "Желтый", "1J4GL48KX5W684430", 100000);
        Auto car3 = new Auto("Chevrolet", "Camaro", "Черный", "1B3HB48A99D289128", 100000);
        Auto car4 = new Auto("Chevrolet", "Camaro", "Красный", "2HNYD18246H584601", 100000);
        Auto car5 = new Auto("Chevrolet", "Camaro", "Красный", "5TFJU4GN1FX042985", 100000);
        Auto car6 = new Auto("Chevrolet", "Camaro", "Белый", "4T3ZK3BB4FU095555", 100000);
        Auto car7 = new Auto("Chevrolet", "Camaro", "Желтый", "2G1WC5E31D1116196", 100000);
        Auto car8 = new Auto("Chevrolet", "Camaro", "Белый", "1GTR2UEA7BZ133735", 100000);
        Auto car9 = new Auto("Chevrolet", "Camaro", "Серый", "5NPEB4AC9CH343008", 100000);
        Auto car10 = new Auto("Chevrolet", "Camaro", "Черный", "1J4FT28B99D116557", 100000);
        // метод нам возвращает массив allAuto, заполненный массивами значений машин
        return allAuto = new Auto[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};

    }

    public Auto[] clearTestData() { // метод очистки массива allAuto
        // Создаем пустой объект
        Auto carX = new Auto("Нет данных", "Нет данных", "Нет данных", "Нет данных", 0);
        return allAuto = new Auto[]{carX, carX, carX, carX, carX, carX, carX, carX, carX, carX}; // возвращаем allAuto, наполненный "пустыми объектами"
    }
    // метод получения производителя авто
    public String getManufacture (int id){
        return allAuto[id].carManufacture;
    }
    // метод получения модели авто
    public String getModel(int id){
        return allAuto[id].carModel;
    }
    // метод получения цвета авто
    public String getColor(int id){
        return allAuto[id].carColor;
    }
    // метод получения VIN номера авто
    public String getVin(int id){
        return allAuto[id].carVin;
    }
    // метод получения цены авто
    public int getPrice(int id){
        if (allAuto[id].carColor.equals("Красный")) {
            return allAuto[id].carPrice = (int) (allAuto[id].carPrice + allAuto[id].carPrice * 0.1);
        } else {
            return allAuto[id].carPrice;
        }

    }

    public String getCarInfo(int id){ // метод получения обзей информации по автомобилю
        return "Марка: " + getManufacture(id)  + ", "
               + "модель: " + getModel(id) + ", "
               + "цвет: " + getColor(id) + ", "
               + "VIN: " + getVin(id) + ", "
               + "цена: " + getPrice(id);
    }

}
