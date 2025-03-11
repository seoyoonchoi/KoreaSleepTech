package chapter10;

import java.util.ArrayList;
import java.util.LinkedList;

class EventManagement{

    //필드
    ArrayList<String> participantList = new ArrayList<>();//이벤트 참가자 명단
    LinkedList<String> waitingQueue = new LinkedList<>();//대기열 명단

    //메서드
    void addParticipant(String name){
        participantList.add(name);
    }

    void addToWaitingQueue(String name){
        waitingQueue.add(name);
    }

    void leaveParticipant(String name){
        //대기열의 인원이 존재해야만 인원을 참가자 명단에 추가가 가능하다
        //대기열 크기(.size())가 0 이상이어야 한다.
        if(waitingQueue.size()>0){
            String nextParticipant = waitingQueue.remove(0);//대기열에서 제거
            addParticipant(nextParticipant);//참가자 명단에 추가
        }
    }

    boolean checkParticipant(String name){
        return participantList.contains(name);
    }

}

public class C_Practice {
    public static void main(String[] args) {
        EventManagement eventManagement = new EventManagement();
        eventManagement.addParticipant("cyrano");
        eventManagement.addParticipant("de");
        eventManagement.addParticipant("bergerac");
        eventManagement.addParticipant("crystiang");
        eventManagement.addParticipant("Ragueneau");
        //원 잠가자 명단

        eventManagement.addToWaitingQueue("Gascoyne");
        eventManagement.addToWaitingQueue("Christian");
        eventManagement.addToWaitingQueue("Ssalrano");
        eventManagement.addToWaitingQueue("korano");
        eventManagement.addToWaitingQueue("jamrano");
        //대기열 명단

        System.out.println(eventManagement.participantList);
        System.out.println(eventManagement.waitingQueue);
        //원 참가자 명단 출력 및 대기열 명단 출력

        eventManagement.addToWaitingQueue("beluga");

        eventManagement.leaveParticipant("cyrano");//cyrano는 구경 다하고 떠남
        eventManagement.leaveParticipant("Raqueneau");//Ragueneau도 시라노랑 같이 떠남

        System.out.println(eventManagement.participantList);
        //대기열에 있던 Gascoyne과 Christian이 추가됨(총 관람인원 관리)

        System.out.println(eventManagement.checkParticipant("bergerac"));
        System.out.println(eventManagement.checkParticipant("Ssalrano"));
        //Ssalrano는 아직 대기열에서 추가 되지 않았음으로 false 가 뜨게 되고,
        //bergerac의 경우에는 participantList에 추가되어 있으므로 true 가 뜨게 된다.

    }
}
