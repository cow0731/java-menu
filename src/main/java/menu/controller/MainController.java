package menu.controller;

import menu.domain.Coach;
import menu.view.InputView;

import java.util.List;

public class MainController {
    private final InputView inputView = new InputView();

    public void start() {
        List<String> coachesName = inputView.readCoachName();
        List<Coach> coaches = inputView.readForbiddenMenu(coachesName);
        
    }
}
