package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class MoveCount {
    private int moveCount;

    public MoveCount(String moveCount) throws IllegalArgumentException {
        validateMoveCount(moveCount);
        this.moveCount = Integer.parseInt(moveCount);
    }

    private void validateMoveCount(String moveCount) throws IllegalArgumentException {
        try {
            int inputNumber = Integer.parseInt(moveCount);
            if (inputNumber < 0) {
                throw new IllegalArgumentException(ErrorMessage.MINIMUM_TRY_NEEDED);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.MOVE_COUNT_IS_NOT_NUMBER);
        }
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void decreaseCount() {
        if (isRemained()) {
            moveCount--;
        }
    }

    public boolean isRemained() {
        return moveCount > 0;
    }
}
