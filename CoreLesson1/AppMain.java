package CoreLesson1;

public class AppMain {

    public static void main(String[] args){

        Participant[] participant = new Participant[4];
        participant[0] = new Participant("Игорь Назаров", 50, 4);
        participant[1] = new Participant("Денис Назаров", 45, 5);
        participant[2] = new Participant("Леброн джеймс", 35, 3);
        participant[3] = new Participant("Лука Модрич", 55, 5);


        Team team = new Team("Россия", participant);

        Course course = new Course(5, 50);
        String result = course.doIt(team);
        System.out.println(result);
    }
}