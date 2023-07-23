package baseball.controller;

import baseball.domain.BaseballNumbers;
import baseball.service.BaseballGameService;
import baseball.util.StringConverter;
import baseball.util.validator.InputValidator;
import baseball.view.input.InputView;
import camp.nextstep.edu.missionutils.Console;

import static baseball.constant.GameConstants.*;

public class BaseballGameController {

    private final BaseballGameService service;

    public BaseballGameController() {
        this.service = new BaseballGameService();
    }

    public void startGame() throws IllegalArgumentException {
        this.service.setTargetBaseballNumbers(BASEBALL_NUMBER_COUNT);
        InputView.printGameStartMessage();

        BaseballNumbers inputNumbers = getInputBaseballNumbers(BASEBALL_NUMBER_COUNT);
    }

    private BaseballNumbers getInputBaseballNumbers(int numberCount) throws IllegalArgumentException {
        InputView.printBaseballNumbersAskingMessage();

        String userInput = Console.readLine();

        InputValidator.validate(userInput);

        return this.service.makeUserBaseballNumbers(StringConverter.toIntegerList(userInput));
    }
}
