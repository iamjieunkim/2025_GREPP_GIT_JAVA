package lec6.exception_ex.inner;

public class Battery {

    private int amount;

    public Battery(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void use(int amount) throws NoPowerException {

        //쓸려는 양이 amout양을 초과시켰어
        if(amount > this.amount) {
            //나는 배터리가없습니다라고 예외를 설명하고 싶어 근데 런타임오류는 단순 실행중에 터진 오류니까 어떻게 하냐면 inner에 클래스 하나를 만든다. NoPowerException
            //throw new RuntimeException();
            throw new NoPowerException("배터리가 충분하지 않습니다!");
        }

        System.out.println(amount + "만큼의 배터리를 사용해서 무언가를 했습니다!");

        this.amount -= amount;

    }
}
