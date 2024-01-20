package Homework4;

// Принцип единственной ответственности. Класс TeacherService решает одну задачу - сортирует список учителей. 
// Принцип открытости-закрытости. Класс TeacherService можно изменить, добавив свойства для сравнения в случае полного совпадения ФИО. Добавление других методов сравнения по иным свойствам нарушит первый принцип.
// Принцип подстановки Барбары Лисков. Класс TeacherService не имеет производных классов, изменяющих его свойства.
// Принцип разделения интерфейса. Класс TeacherService использует и реализует только интерфейс Comparator.
// Принцип инверсии зависимостей. Класс TeacherService зависит только от класса Teacher, что не нарушает данный принцип.

// Итак, класс Teacher соответсвует принципам SOLID.

import java.util.Comparator;
import java.util.Collections;
import java.util.List;


public class TeacherService<T extends Teacher> implements Comparator<Teacher> {

    // Метод для сортировки списка учителей

    @Override
    public int compare(Teacher teacher1, Teacher teacher2) {
        if (teacher1.getLastName().equals(teacher2.getLastName())) {
            if (teacher1.getFirstName().equals(teacher2.getFirstName())) {
                return teacher1.getMiddleName().compareTo(teacher2.getMiddleName());
            }
            return teacher1.getFirstName().compareTo(teacher2.getFirstName());
        }
        return teacher1.getLastName().compareTo(teacher2.getLastName());
    }

    public void sortTeachers(List<Teacher> teachers) {
        Collections.sort(teachers, new TeacherService<>());
    }
}
