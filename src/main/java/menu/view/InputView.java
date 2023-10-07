package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.domain.Coach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final String INPUT_COACH_NAMES = "코치의 이름을 입력해 주세요. (, 로 구분)";
    private static final String INPUT_FORBIDDEN_MENU = "(이)가 못 먹는 메뉴를 입력해 주세요.";

    public List<String> readCoachName() {
        System.out.println(INPUT_COACH_NAMES);
        return Arrays.asList(Console.readLine().split(","));
    }

    public List<Coach> readForbiddenMenu(List<String> coachesName) {
        List<Coach> coaches = new ArrayList<>();
        for (String coachName : coachesName) {
            System.out.println(coachName + INPUT_FORBIDDEN_MENU);
            List<String> forbiddenMenus = Arrays.asList(Console.readLine().split(","));
            Coach coach = new Coach(coachName, forbiddenMenus);
            coaches.add(coach);
        }
        return coaches;
    }
}
