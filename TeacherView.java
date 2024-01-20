package Homework4;

// Принцип единственной ответственности. Класс TeacherView решает одну задачу - отображает список учителей. 
// Принцип открытости-закрытости. Класс TeacherView можно расширить без изменения исходного кода.
// Принцип подстановки Барбары Лисков. Класс TeacherView не имеет производных классов, изменяющих его свойства.
// Принцип разделения интерфейса. Класс TeacherView не содержит неиспользуемые методы.
// Принцип инверсии зависимостей. Класс TeacherView зависит только от класса Teacher, что не нарушает данный принцип.

// Итак, класс TeacherView соответсвует принципам SOLID.

import java.util.List;

public class TeacherView<T extends Teacher> {

    // Метод для отображения всех учителей

    public void sendOnConsole(List<Teacher> items) {
        for (Teacher item : items) {
            System.out.println(
                    item.getId() + " " + item.getLastName() + " " + item.getFirstName() + " " + item.getMiddleName());
        }
    }
}
