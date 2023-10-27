package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {

    private static final String STARTING_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String ATTEMPT_QUESTION = "시도할 회수는 몇회인가요?";

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println(STARTING_MESSAGE);
        String line = Console.readLine();
        String splitKeyword = ",";
        String[] inputNames = line.split(splitKeyword);

        System.out.println(ATTEMPT_QUESTION);
        int movingCount = 0;
        try {
            String input = Console.readLine();
            movingCount = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }

        while (movingCount != 0) {
            movingCount--;
        }
    }
}
