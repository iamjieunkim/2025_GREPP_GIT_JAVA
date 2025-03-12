package lec6.exception_ex.ex2.inner;

public class LocalPeople extends People{

    public static String MOTHER_TONGUE = "KOREAN";

    public LocalPeople() {
        super(new LanguageType(MOTHER_TONGUE));
    }

    public LocalPeople(boolean hasTranslator) {
        super(new LanguageType(MOTHER_TONGUE), hasTranslator);
    }
}
