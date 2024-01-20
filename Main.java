package Homework4;

public class Main {
    public static void main(String[] args) {

        TeacherService<Teacher> teacherService = new TeacherService<>();
        TeacherView<Teacher> teacherView = new TeacherView<>();
        TeacherController<Teacher> teacherController = new TeacherController<>(teacherService, teacherView);

        teacherController.createTeacher(new Teacher(0, "Анна", "Попова", "Александровна"));
        teacherController.createTeacher(new Teacher(1, "Иван", "Андреев", "Сергеевич"));
        teacherController.createTeacher(new Teacher(2, "Инга", "Попова", "Ивановна"));

        teacherController.printTeachers();

        System.out.println("");

        teacherController.editTeacher(0, "Кашин", "Андрей", "Георгиевич");

        teacherController.printTeachers();
    }
}
