package cases;

import java.util.Scanner;
public class Case10 {

        public static void main(String[] args) {
            char[] directions = {'N', 'E', 'S', 'W'};

            Scanner scanner = new Scanner(System.in);

            char initialDirection = scanner.next().charAt(0);
            int instruction = scanner.nextInt();

            int currentDirectionIndex = 0;
            for (int i = 0; i < directions.length; i++) {
                if (directions[i] == initialDirection) {
                    currentDirectionIndex = i;
                    break;
                }
            }

            if (instruction == 1) {
                currentDirectionIndex = (currentDirectionIndex - 1 + 4) % 4;
            } else if (instruction == -1) {
                currentDirectionIndex = (currentDirectionIndex + 1) % 4;
            }

            System.out.println(directions[currentDirectionIndex]);

            scanner.close();
        }
    }

