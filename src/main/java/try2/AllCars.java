package try2;

public class AllCars {
    Auto[] allAuto;
    public AllCars() {
        Auto[] allAuto = fillTestData();
    }

    public Auto[] fillTestData() {

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

        return allAuto = new Auto[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};

    }

    public Auto[] clearTestData() {
        allAuto = null;
        //for (Auto[] i : allAuto) {
        //for (int i = 0; i < allAuto.length; i++) {
        //    System.out.println(allAuto[i].carColor);
        //}
        return allAuto;
    }


    public String getManufacture (int id){
        return allAuto[id].carManufacture;
    }

    public String getModel(int id){
        return allAuto[id].carModel;
    }

    public String getColor(int id){
        return allAuto[id].carColor;
    }

    public String getVin(int id){
        return allAuto[id].carVin;
    }
    public int getPrice(int id){
        if (allAuto[id].carColor == "Красный") {
            return allAuto[id].carPrice = (int) (allAuto[id].carPrice + allAuto[id].carPrice * 0.1);
        } else {
            return allAuto[id].carPrice;
        }

    }
    //return "Марка: " + getManufacture(id)  + ", "
    //        + "модель: " + getModel(id) + ", "
    //        + "цвет: " + getColor(id) + ", "
    //        + "VIN: " + getVin(id) + ", "
    //        + "цена: " + getPrice(id);

}
