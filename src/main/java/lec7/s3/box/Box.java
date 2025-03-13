package lec7.s3.box;

public class Box <T>{

    T content;

    public Box(T content) {
        this.content = content;
    }

    //상자를 열고
    public void open(){
        System.out.println("저는 열렸습니다!");
        System.out.println("저는" + content + "을/를 갖고 있습니다!");
    }

    //닫을 수 있다.
    public void close(){
        System.out.println("저는 닫혔습니다!");
    }
}
