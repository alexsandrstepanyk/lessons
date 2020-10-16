public class lesson_14 {
    public static void main(String[] args) {
    Person homo = new Person();
    homo.name = "alex";
    homo.age = 50;
        System.out.println("my name "+homo.name + ","  + " i have "+homo.age +" age");
    Person homo_1 = new Person();
    homo_1.name = "ivan";
    homo_1.age = 22;
        System.out.println("my name "+homo_1.name + ","  + " i have "+homo_1.age +" age");

    }
}

public class Person{
    // у класса можуть бути
    // даны та (поля); человек: вес, рост, возраст и тд
    // действия которие может совершать клас(методи): говорить, пригать и тд
    String name;
    int age;
}

