package cases;

import java.util.Scanner;
public class Case11 {

        public static void main(String[] args) {
            char[] directions = {'N', 'E', 'S', 'W'};

            Scanner scanner = new Scanner(System.in);

            char initialDirection = scanner.next().charAt(0);
            int N1 = scanner.nextInt();
            int N2 = scanner.nextInt();

            int currentDirectionIndex = 0;
            for (int i = 0; i < directions.length; i++) {
                if (directions[i] == initialDirection) {
                    currentDirectionIndex = i;
                    break;
                }
            }

            currentDirectionIndex = applyInstruction(currentDirectionIndex, N1);

            currentDirectionIndex = applyInstruction(currentDirectionIndex, N2);

            System.out.println(directions[currentDirectionIndex]);

            scanner.close();
        }

        public static int applyInstruction(int currentDirectionIndex, int instruction) {
            if (instruction == 1) {
                currentDirectionIndex = (currentDirectionIndex - 1 + 4) % 4;
            } else if (instruction == -1) {
                currentDirectionIndex = (currentDirectionIndex + 1) % 4;
            } else if (instruction == 2) {
                currentDirectionIndex = (currentDirectionIndex + 2) % 4;
            }
            return currentDirectionIndex;
        }
    }

