package core.hw1.task3;

public class Main {
    public static void getInfoCar(String brand, String model, float volume, String color, int yearOfProduction, String country) {
        System.out.println("Бренд: " + brand + ", Модель: " + model + ", Объем: " + volume + ", Цвет: " + color + ", Год производства: " + yearOfProduction + ", Страна: " + country);
    }

    public static void main(String[] args) {
        Car firstCar = new Car("Lada", "Grande", 1.7F, "Желтый", 2015, "Россия");
        Car secondCar = new Car("Audi", "A8 50 L TDI quattro", 3.0F, "Черный", 2020, "Германия");
        Car thirdCar = new Car("BMW", "Z8", 3.0F, "Черный", 2021, "Германия");
        Car fourthCar = new Car("Kia", "Sportage 4 поколение", 2.4F, "Красный", 2018, "Южная Корея");
        Car fifthCar = new Car("Hyundai", "Avante", 1.6F, "Оранжевый", 2016, "Южная Корея");

        getInfoCar(firstCar.getBrand(), firstCar.getModel(), firstCar.getVolume(), firstCar.getColor(), firstCar.getYearProduction(), firstCar.getCountry());
        getInfoCar(secondCar.getBrand(), secondCar.getModel(), secondCar.getVolume(), secondCar.getColor(), secondCar.getYearProduction(), secondCar.getCountry());
        getInfoCar(thirdCar.getBrand(), thirdCar.getModel(), thirdCar.getVolume(), thirdCar.getColor(), thirdCar.getYearProduction(), thirdCar.getCountry());
        getInfoCar(fourthCar.getBrand(), fourthCar.getModel(), fourthCar.getVolume(), fourthCar.getColor(), fourthCar.getYearProduction(), fourthCar.getCountry());
        getInfoCar(fifthCar.getBrand(), fifthCar.getModel(), fifthCar.getVolume(), fifthCar.getColor(), fifthCar.getYearProduction(), fifthCar.getCountry());
    }
}
