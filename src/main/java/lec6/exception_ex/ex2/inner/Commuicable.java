package lec6.exception_ex.ex2.inner;

import javax.security.auth.callback.LanguageCallback;

public interface Commuicable {
    public abstract void commuicate(Commuicable target, String message);
    LanguageType getLanguageType();
    //번역기(번역기 갖고 있는건지 지정하는거)
    boolean hasTranslator();
}
