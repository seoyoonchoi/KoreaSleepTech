package chapter11;

interface Musical{
    void act(String sceneMusicTitle);
    String getMusicalName();
}


class Cyrano implements Musical{

    @Override
    public void act(String sceneMusicTitle) {
        System.out.println("시라노의 " + sceneMusicTitle+"넘버가 공연중 입니다.");
    }

    @Override
    public String getMusicalName() {
        return "시라노";
    }
}

class JekyllAndHyde implements Musical{

    @Override
    public void act(String sceneMusicTitle) {
        System.out.println("지킬앤 하이드의 "+sceneMusicTitle+"넘버가 공연중 입니다.");
    }

    @Override
    public String getMusicalName() {
        return "지킬앤 하이드";
    }
}

class ArtCenter{
    private Musical musical;
    public ArtCenter(Musical musical){
        this.musical = musical;
    }
    public void listenMusic(String sceneMusicTitle){
        musical.act(sceneMusicTitle);
    }
}

class Audience{
    private String name;

    public Audience(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Attendance{
    public void checkAttendance(Musical musical, Audience audience){
        if(audience == null) {
            System.out.println("공연을 보러 온 관객이 없습니다.");
        }else{
        System.out.println(audience.getName()+"이"+ musical.getMusicalName()+"공연을 보러 왔습니다.");}
    }
}

public class D_Coupling_Cohension {
    public static void main(String[] args) {
        Audience audience1 = new Audience("Bergerac");
        Audience audience2 = new Audience("Christian");

        Musical cyrano = new Cyrano();
        Musical jekyllAndHyde = new JekyllAndHyde();

        Attendance attendance = new Attendance();
        attendance.checkAttendance(cyrano,audience1);
        attendance.checkAttendance(cyrano,audience2);

        cyrano.act("Bring me Giant");

    }
}

