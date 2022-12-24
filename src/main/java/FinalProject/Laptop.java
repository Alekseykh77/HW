package FinalProject;

/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков (ArrayList). Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет. Выводить только те ноутбуки,
что соответствуют условию*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Laptop {
    private int id;
    private String model;
    private int mainMemory;
    private int hardDisk;
    private String processor;
    private String videoCard;
    private String operatingSystem;
    private Double display;
    private String color;
    private Double weight;
    private int price;

    public Laptop(int id, String model, int mainMemory, int hardDisk,
                  String processor, String videoCard, String operatingSystem,
                  Double display, String color, Double weight, int price) {
        this.id = id;
        this.model = model;
        this.mainMemory = mainMemory;
        this.hardDisk = hardDisk;
        this.processor = processor;
        this.videoCard = videoCard;
        this.operatingSystem = operatingSystem;
        this.display = display;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getMainMemory() {


        return mainMemory;
    }

    public void setMainMemory(int mainMemory) {

        this.mainMemory = mainMemory;
    }

    public int getHardDisk() {

        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {

        this.hardDisk = hardDisk;
    }

    public String getProcessor() {

        return processor;
    }

    public void setProcessor(String processor) {

        this.processor = processor;
    }

    public String getVideoCard() {

        return videoCard;
    }

    public void setVideoCard(String videoCard) {

        this.videoCard = videoCard;
    }

    public String getOperatingSystem() {

        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {

        this.operatingSystem = operatingSystem;
    }

    public Double getDisplay() {

        return display;
    }

    public void setDisplay(Double display) {

        this.display = display;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public Double getWeight() {

        return weight;
    }

    public void setWeight(Double weight) {

        this.weight = weight;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {

        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id && mainMemory == laptop.mainMemory && hardDisk == laptop.hardDisk
                && Objects.equals(model, laptop.model) && Objects.equals(processor, laptop.processor)
                && Objects.equals(videoCard, laptop.videoCard) && Objects.equals(operatingSystem, laptop.operatingSystem)
                && Objects.equals(color, laptop.color)
                && Objects.equals(display, laptop.display) && Objects.equals(weight, laptop.weight);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, model);
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "id: " + id +
                ", Модель: " + model +
                ", ОЗУ: " + mainMemory +
                ", Объем HD: " + hardDisk +
                ", Процессор: " + processor +
                ", Видеокарта: " + videoCard +
                ", Операционная система: " + operatingSystem +
                ", Дисплей: " + display +
                ", Цвет: " + color +
                ", Вес: " + weight +
                ", Цена: " + price +
                '}';
    }

    public static Set<Laptop> createLaptopSet() {
        Set<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(new Laptop(1, "Samsung", 4, 256, "AMD Ryzen 5", "Intel UHD Graphics",
                "Windows 10 Pro", 15.6, "черный",2.0, 60000));
        laptopSet.add(new Laptop(2, "Dell", 8, 512, "Intel Core i3", "MSI GeForce",
                "Windows 10 Home", 17.3,"серый", 2.0, 70000));
        laptopSet.add(new Laptop(3, "Lenovo", 2, 128, "Intel Celeron", "Colorful GeForce",
                "DOS", 15.6, "белый",1.7, 35000));
        laptopSet.add(new Laptop(4, "HP", 4, 512, "Intel Core i7", "NVIDIA GeForce MX350",
                "без ОС", 14.0, "серебристый", 1.5, 45000));
        laptopSet.add(new Laptop(5, "Asus", 16, 256, "AMD Ryzen 7", "ASUS GeForce",
                "Linux", 15.6, "белый",1.9, 50000));
        laptopSet.add(new Laptop(6, "Acer", 16, 512, "Intel Core i7", "Intel UHD Graphics",
                "Endless OS", 17.3, "черный",2.1, 75000));
        for (Laptop i : laptopSet) {
            System.out.println(i);
        }
        return laptopSet;
    }

    public static Map<String, String> enterFilter() {
        Map<String, String> filterMap = new HashMap<>();
        String key = "";
        while (!key.equals("q")) {
            System.out.printf("Выберите необходимай критерий:\n" +
                    "1 - Модель ноутбука\n" +
                    "2 - ОЗУ, ГБ\n" +
                    "3 - Объем HD, ГБ\n" +
                    "4 - Процессор\n" +
                    "5 - Видеокарта\n" +
                    "6 - Операционная система\n" +
                    "7 - Размер дисплея, дюймов\n" +
                    "8 - Цвет\n" +
                    "9 - Вес, кг\n" +
                    "10 - Цена, руб.\n" +
                    "q - Сохранить критерий и выйти\n");
            Scanner scn = new Scanner(System.in);
            key = scn.nextLine();
            if (!key.equals("q")) {
                System.out.printf("Введите значение критерия: ");
                String value = scn.nextLine();
                filterMap.put(key, value);
            }
        }
        return filterMap;
    }

    public static boolean selectionByFilter(Laptop laptop, Map<String, String> filterMap) {
        Boolean result = false;
        Integer count = 0;
        for (String key : filterMap.keySet()) {
            if (key.equals("1")) {
                if (filterMap.get("1").equals(laptop.model)) {
                    count += 1;
                }
            }
            if (key.equals("2")) {
                int intValue = Integer.parseInt(filterMap.get("2"));
                if (intValue == laptop.mainMemory) {
                    count += 1;
                }
            }
            if (key.equals("3")) {
                int intValue = Integer.parseInt(filterMap.get("3"));
                if (intValue == laptop.hardDisk) {
                    count += 1;
                }
            }
            if (key.equals("4")) {
                if (filterMap.get("4").equals(laptop.processor)) {
                    count += 1;
                }
            }
            if (key.equals("5")) {
                if (filterMap.get("5").equals(laptop.videoCard)) {
                    count += 1;
                }
            }
            if (key.equals("6")) {
                if (filterMap.get("6").equals(laptop.operatingSystem)) {
                    count += 1;
                }
            }
            if (key.equals("7")) {
                double doubleValue = Double.parseDouble(filterMap.get("7"));
                if (doubleValue == laptop.display) {
                    count += 1;
                }
            }
            if (key.equals("8")) {
                if (filterMap.get("8").equals(laptop.color)) {
                    count += 1;
                }
            }
            if (key.equals("9")) {
                double doubleValue = Double.parseDouble(filterMap.get("9"));
                if (doubleValue == laptop.weight) {
                    count += 1;
                }
            }
            if (key.equals("10")) {
                int intValue = Integer.parseInt(filterMap.get("10"));
                if (intValue == laptop.price) {
                    count += 1;
                }
            }
        }
        if ((filterMap.keySet().size()) == count) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Laptop> laptopSet = createLaptopSet();
        Map<String, String> filterMap = enterFilter();
        for (Laptop laptop : laptopSet) {
            if (selectionByFilter(laptop, filterMap)) {
                System.out.println(laptop);
            }
        }
    }
}