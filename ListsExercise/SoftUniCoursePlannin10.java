package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlannin10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lessonsArr = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while (!inputLine.contains("course start")) {
            String[] commandArr = inputLine.split(":");
            String commandTitle = commandArr[0];
            String lessonTitle = commandArr[1];
            switch (commandTitle){
                case "Add":
                    if (!lessonsArr.contains(lessonTitle)){
                        lessonsArr.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandArr[2]);
                    if (!lessonsArr.contains(lessonTitle)){
                        lessonsArr.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    if (lessonsArr.contains(lessonTitle)){
                        lessonsArr.remove(lessonTitle);
                    }
                    int indexLesson = lessonsArr.indexOf(lessonTitle);
                    if (lessonsArr.get(indexLesson + 1).equals(lessonTitle+"-Exercise")){
                        lessonsArr.remove(indexLesson + 1);
                    }
                    break;
                case "Swap":
                    String lessonTitle2 = inputLine.split(":")[2];

                    if (lessonsArr.contains(lessonTitle) && (lessonsArr.contains(lessonTitle2))) {
                        int indexLesson1 = lessonsArr.indexOf(lessonTitle);
                        int indexLesson2 = lessonsArr.indexOf(lessonTitle2);
                        lessonsArr.set(indexLesson1, lessonTitle2);
                        lessonsArr.set(indexLesson2, lessonTitle);

                        String exo1 = lessonTitle + "-Exercise";
                        String exo2 = lessonTitle2 + "-Exercise";
                        if (lessonsArr.contains(exo1)) {
                            lessonsArr.remove(lessonsArr.indexOf(exo1));
                            lessonsArr.add(lessonsArr.indexOf(lessonTitle) + 1, exo1);
                        }
                        if (lessonsArr.contains(exo2)) {
                            lessonsArr.remove(lessonsArr.indexOf(exo2));
                            lessonsArr.add(lessonsArr.indexOf(lessonTitle2) + 1, exo2);

                        }
                    }
                    break;
                    case "Exercise":
                    String exercise = lessonTitle + "-Exercise";

                    if (lessonsArr.contains(lessonTitle)) {
                        int indexLessonTitleExercise = lessonsArr.indexOf(lessonTitle);
                        if (indexLessonTitleExercise == lessonsArr.size() - 1) {
                            lessonsArr.add(indexLessonTitleExercise + 1, exercise);

                        } else if (!lessonsArr.get(indexLessonTitleExercise + 1).equals(exercise)) {
                            lessonsArr.add(indexLessonTitleExercise + 1, exercise);
                        }
                    } else {
                            lessonsArr.add(lessonTitle);
                            lessonsArr.add(exercise);
                        }
                    break;
            }

            inputLine = scanner.nextLine();
        }
        printList(lessonsArr);
    }
    public static void printList (List<String> elements){
        int count = 1;
        for (String element: elements ) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}
