package OpinionPoll03;

public class Person { // когато класът е публик, може да го
    // достъпваме от други класове,
    // а ако е прайвът, не можем
    private String name;// Важно е тези полета да са прайвет!
    private int age; // а ги достъпваме чрез сетъри и гетъри
// полета на класа с характеристики
    public Person(String name, int age){
        this.name = name;
        this.age = age;
// конструкторът създава обект от класа
    }
    public String getName() {

        return this.name;
    }
    public int getAge() {
        return this.age;
        // методите са например гетърите... с тях достъпваме характеристиките на полетата
    }
}

