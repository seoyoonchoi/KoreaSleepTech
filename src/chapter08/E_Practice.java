package chapter08;

//추상 클래스
abstract class MobileApp{
    // 추상메서드 : 실행에 대한 동작을 정의한다
    // 각 앱마다 고유한 실행의 정의는 상속받은 클래스에서 구현하게 된다.
    abstract void execute();
    //일반 구현 메서드

    void appInfo(){
        System.out.println("this is a mobile application");
    }
}
//----------game application
class GameApp extends MobileApp{
    @Override
    void execute() {
        System.out.println("Game app executes");
    }
}

// --------------SNS application
class SocialApp extends MobileApp{
    String name;

    SocialApp(String name) {
        this.name = name;
    }

    @Override
    void execute() {
        System.out.println(name +"app excute");
    }

    @Override
    void appInfo(){
        System.out.println(name+"app is the most popular SNS");
    }

    //social App의 고유 메서드
    void shareContent(String content){
        System.out.println(name+"shares : "+content);
    }
}
public class E_Practice {
    public static void main(String[] args) {
        //다형성 적용하기
        MobileApp gameApp = new GameApp();
        MobileApp socialApp = new SocialApp("Instagram");

        //다형성 적용에 의해 공통된 메서드 호출이 가능하다.
        gameApp.execute();//Game app executes
        gameApp.appInfo();//This is a mobile app

        socialApp.execute();
        socialApp.appInfo();

        //socialApp.shareContent("images");
        //업캐스팅시 하위 클래스의 고유메서드에 접근 불가

        //형 변환
        if(socialApp instanceof GameApp){
            System.out.println("socialApp 이 GameApp type의 객체");
            GameApp onlyGameApp = (GameApp) socialApp;
        }else if(socialApp instanceof SocialApp){
            System.out.println("socialApp이 socialApptype의 객체");
            SocialApp onlySocialApp = (SocialApp) socialApp;
            onlySocialApp.shareContent("images");
        }

        //객체배열 &다형성 활용
        MobileApp[] apps = {
                //생성과 동시에 업캐스팅 - 묵시적 형 변환
                new GameApp(), new SocialApp("facebook"), new SocialApp("kakao")
        };

        for(MobileApp app : apps){
            app.execute();
            app.appInfo();

            if(app instanceof SocialApp){
                //다운 캐스팅
                SocialApp specificSocialApp = (SocialApp) app;
                specificSocialApp.shareContent("Files");
            }
        }


    }
}
