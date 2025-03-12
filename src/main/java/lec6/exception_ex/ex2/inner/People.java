package lec6.exception_ex.ex2.inner;

import lec6.exception_ex.ex2.exception.AmbiguousVocalException;
import lec6.exception_ex.ex2.exception.BadGrammerException;
import lec6.exception_ex.ex2.exception.CouldNotCommunicateException;

public class People implements Commuicable {

    private final LanguageType motherTongue;
    private boolean hasTranslator = false;

    //번역기를 안갖고, 모국어만 깆고 있는사람
    public People(LanguageType motherTongue) {
        this.motherTongue = motherTongue;
    }

    //번역기랑 모국어 둘다 가지고 있는 사람
    public People(LanguageType motherTongue, boolean hasTranslator) {
        this.motherTongue = motherTongue;
        this.hasTranslator = hasTranslator;
    }

    @Override
    public void commuicate(Commuicable target, String message) {
        //단어 선택
        //문법 선택(문장 만들기)
        //의사소통 불가능
        try{
            makeSentence(target);
            System.out.println("정상적으로 의사소통 가능합니다 !" + message);
        }catch(BadGrammerException e){
            //원인으로 e를 던저줌-나쁜 문법때문에 발생
            throw new CouldNotCommunicateException("정상적인 의사소통이 불가능합니다!",e);
        }

    }

    @Override
    public LanguageType getLanguageType() {
        return motherTongue;
    }

    @Override
    public boolean hasTranslator() {
        return hasTranslator;
    }

    //소통가능하니?
    private boolean canCoummunicateWith(Commuicable target) {
        //target에서 어떤 언어타입을 가지고 있는지 꺼내온다.
        LanguageType targetlanguageType = target.getLanguageType();

        //번역기를 갖고 있으면서 같은 나라 사람이면 리턴
        return this.getLanguageType().equals(targetlanguageType) || hasTranslator();
    }


    //문장 만들기
    private void makeSentence(Commuicable target){
        try{
            choiceVoca(target);
            System.out.println("적절한 문장을 만들었습니다!!");
        } catch (AmbiguousVocalException e) {
            new BadGrammerException("문법적으로 옳지 않은 문장을 만들기 시작합니다.", e);
        }
    }

    //단어고르기
    private void choiceVoca(Commuicable target) {
        //무조건 외국인인지 아닌지 알아야 하므로 관련 기능 필요 - canCoummunicateWith
        if( !canCoummunicateWith(target) ) {
            throw new AmbiguousVocalException("모호한 단어를 선택해서 이야기를 시작합니다.");
        }

        System.out.println("적절한 단어를 선택했습니다!");

    }
}
