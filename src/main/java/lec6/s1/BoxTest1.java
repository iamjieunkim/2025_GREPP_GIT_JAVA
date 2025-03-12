package lec6.s1;

public class BoxTest1 {

    public static void main(String[] args) {
        //test1();
        test2();
    }

    private static void test2() {

        try{
            Box.of(null);
        } catch (NullPointerException e){
            System.out.println("Null은 보관할 수 없습니다!");
            System.out.println(e.getMessage());
        }

        //널을 집어넣을 수 있을때
        Box<Object> empty = Box.empty();

        boolean isEmpty = empty.isEmpty();
        boolean isPresent = empty.isPresent();

        System.out.println("isEmpty = " + isEmpty);
        System.out.println("isPresent = " + isPresent);

        try{
            empty.get();
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }

    private static void test1() {

        //private이라서 이거는 쓰지 못함
        //new Box<String>;

        String rawString = "안녕하세요!";

        Box<String> stringBox = Box.of(rawString);

        boolean isEmpty = stringBox.isEmpty();
        boolean isPresent = stringBox.isPresent();

        boolean result = rawString.equals(stringBox.get());
        System.out.println("result = " + result);

        System.out.println("isEmpty = " + isEmpty);
        System.out.println("isPresent = " + isPresent);

    }
}
