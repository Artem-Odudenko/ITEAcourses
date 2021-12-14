package homeWork5;
/*
Необхідно об'єднати класи в одну структуру
Результат :
хоча б один інтерфейс
хоча б один абстрактний клас
всі класи мають мати перевизначені методи: equals, hashCode, toString
Класи:
RubberDuck
резинова
має клюв
вміє плавати
птах
Martin
вміє літати
має клюв
їсть комах
птах
Swan
вміє літати
вміє плавати
їсть траву
птах
Platypus
вміє плавати
есть комах
ссавець


в цій задачі необхідно:
створити інтерфейс CanMove з  методом speed
зробити щоб speed повертав значення типу Double і нічого не приймав  якості аргумента
створити і наслідувати інтерфейс CanFly від CanMove
додати в інтерфейс CanFly метод speed
переконатись, що speed повертає значення типу Double и приймає один параметр типу CanFly
* методи equals, hashCode, toString можна сгенерувати через Idea
 */


public abstract class Birds {
        String name;
        String type;

        public Birds(String name, String type) {
            this.name = name;
            this.type = type;
        }
        public abstract void fly();
        public abstract void iAm();
}
