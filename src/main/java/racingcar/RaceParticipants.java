package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RaceParticipants {
    private final List<Car> participantList;

    public RaceParticipants() {
        participantList = new ArrayList<>();
    }
    public RaceParticipants(List<Car> participants) {
        this.participantList = participants;
    }
    public List<Car> getParticipantList() {
        return participantList;
    }

    public void addCar(final Car car){
        participantList.add(car);
    }
}
