package CoreLesson1;

public class Course {

    String result;
    private int hits;
    private int speeds;

    public Course(int hits, int speeds) {
        this.hits = hits;
        this.speeds = speeds;
    }

    public String doIt(Team team) {
        result = "Результаты спортсменов команды по баскетболлу: " + team.getName() + "." + '\n';
        for(Participant participant: team.getPeoples()) {
            result += "Имя участников: " + participant.getName();
            int value1 = participant.getAccuracy();
            int value2 = participant.getSpeed();
            accuracyTest(value1);
            speedTest(value2);
        }

        return result;
    }

    private void accuracyTest(int value1) {
        if(value1 >= hits) {
            result += " забил двухочковый,";
        } else {
            result += " забил трёхочковый,";
        }
    }

    private void speedTest(int value2) {
        if(value2 >= speeds) {
            result += " успешно пробежал всю дистанцию." + '\n';
        } else {
            result += " уронил мяч пока бежал до финиша." + '\n';
        }
    }
}
