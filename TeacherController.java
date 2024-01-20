package Homework4;

import java.util.ArrayList;
import java.util.List;

public class TeacherController<T extends Teacher> {

    TeacherService<Teacher> teacherComparator = new TeacherService<>();
    TeacherView<Teacher> teacherView = new TeacherView<>();

    public TeacherController(TeacherService<Teacher> teacherComparator, TeacherView<Teacher> teacherView) {
        this.teacherComparator = teacherComparator;
        this.teacherView = teacherView;
    }

    private List<Teacher> teachers = new ArrayList<>();

    // Метод для создания учителя

    public void createTeacher(Teacher teacher) {
        teachers.add(teacher);
        teacherComparator.sortTeachers(teachers);
    }

    // Метод для редактирования учителя

    public void editTeacher(int oldId, String newLastName, String newFirstname, String newMiddleName) {
        for (Teacher teacher : teachers) {
            if (oldId == teacher.getId()) {
                teacher.setFirstName(newFirstname);
                teacher.setLastName(newLastName);
                teacher.setMiddleName(newMiddleName);
            }
        }
        teacherComparator.sortTeachers(teachers);
    }

    // Метод для вывода списка учителей

    public void printTeachers() {
        teacherView.sendOnConsole(teachers);
        ;
    }
}
