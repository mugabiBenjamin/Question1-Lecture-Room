/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.lectureroom;

/**
 *
 * @author Benjn
 */
import java.util.Scanner;

public class LectureRoom {

    private int students;
    private boolean[] lights = new boolean[3]; // lights 1, 2, 3

    public LectureRoom() {
        students = 0;
    }

    public void addStudents(int count) {
        if (count < 0) {
            System.out.println("Invalid student count!");
            return;
        }
        students += count;
        System.out.println(count + " students added. Total students: " + students);
    }

    public void removeStudents(int count) {
        if (count < 0) {
            System.out.println("Invalid student count!");
            return;
        }
        students = Math.max(students - count, 0);
        System.out.println(count + " students removed. Total students: " + students);
    }

    public void turnOnLight(int lightNumber) {
        if (lightNumber < 1 || lightNumber > 3) {
            System.out.println("Invalid light number!");
            return;
        }
        lights[lightNumber - 1] = true;
        System.out.println("Light " + lightNumber + " is turned ON.");
    }

    public void turnOffLight(int lightNumber) {
        if (lightNumber < 1 || lightNumber > 3) {
            System.out.println("Invalid light number!");
            return;
        }
        lights[lightNumber - 1] = false;
        System.out.println("Light " + lightNumber + " is turned OFF.");
    }

    public static void main(String[] args) {
        LectureRoom room = new LectureRoom();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("W. Add students");
            System.out.println("X. Remove students");
            System.out.println("Y. Turn on light");
            System.out.println("Z. Turn off light");
            System.out.println("Q. Qxit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 'W':
                    System.out.print("Enter number of students to add: ");
                    int addCount = scanner.nextInt();
                    room.addStudents(addCount);
                    break;
                case 'X':
                    System.out.print("Enter number of students to remove: ");
                    int removeCount = scanner.nextInt();
                    room.removeStudents(removeCount);
                    break;
                case 'Y':
                    System.out.print("Enter light number to turn on: ");
                    int lightOn = scanner.nextInt();
                    room.turnOnLight(lightOn);
                    break;
                case 'Z':
                    System.out.print("Enter light number to turn off: ");
                    int lightOff = scanner.nextInt();
                    room.turnOffLight(lightOff);
                    break;
                case 'Q':
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
            scanner.close();
        }
    }
}
