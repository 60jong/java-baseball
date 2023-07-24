package baseball.controller;

import baseball.domain.BaseballNumbers;
import baseball.domain.BaseballGameResult;
import baseball.service.BaseballGameService;
import baseball.util.StringConverter;
import baseball.util.validator.InputValidator;
import baseball.view.input.InputView;
import baseball.view.output.OutputView;
import camp.nextstep.edu.missionutils.Console;

import static baseball.constant.GameConstants.*;

public class BaseballGameController {

    private BaseballGameService service;

    public void startGame() throws IllegalArgumentException {
        do {
            // 게임 세팅 초기화
            initialize();

            // 게임 진행
            playing();

            // 게임 종료
            end();
        } while (playerWantToRestart());

        exitGame();
    }

    private void initialize() {
        InputView.printGameStartMessage();
        this.service = new BaseballGameService();
    }

    private void playing() throws IllegalArgumentException {
        while (!this.service.isGameDone()) {
            BaseballNumbers inputBaseballNumbers = getInputBaseballNumbers(BASEBALL_NUMBER_COUNT);

            BaseballGameResult baseBaseballGameResult = this.service.makeBaseballResult(inputBaseballNumbers);

            OutputView.printResult(baseBaseballGameResult);
        }
    }

    private BaseballNumbers getInputBaseballNumbers(int numberCount) throws IllegalArgumentException {
        InputView.printBaseballNumbersAskingMessage();

        String userInput = Console.readLine();

        InputValidator.validateNumbers(userInput);

        return this.service.makeUserBaseballNumbers(StringConverter.toIntegerList(userInput));
    }

    private void end() throws IllegalArgumentException {
        OutputView.printGameEndMessage();
    }

    private boolean playerWantToRestart() {
        InputView.printAskingExitCodeMessage();

        String exitCode = Console.readLine();
        InputValidator.validateExitCode(exitCode);

        return exitCode.equals(GAME_EXIT_CODE_RESTART);
    }

    private void exitGame() {}
}
