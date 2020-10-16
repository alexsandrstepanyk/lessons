public class Lessons_15 {
    public static void main(String[] args) {

        Person homo = new Person();
        homo.name = "alex";
        homo.age = 50;

        Person homo_1 = new Person();
        homo_1.name = "ivan";
        homo_1.age = 22;

    }
}
class Person{
    // у класса можуть бути
    // даны та (поля); человек: вес, рост, возраст и тд
    // действия которие может совершать клас(методи): говорить, пригать и тд
    String name;
    int age;
    void speak(){
        System.out.println("my name "+name +"," + "i have "+age+" age");
    }
}

