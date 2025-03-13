package lec7.s3.componet;

import lec7.s3.box.Box;
import lec7.s3.tools.Installable;
import lec7.s3.tools.Portable;

public class Packager<T> {

    public static void closePortableBox(Box<? extends Portable> box) {
        box.close();
    }

    public static void closeInstallableBox(Box<? extends Installable> box) {
        box.close();
    }


    public static void closeBox(Box<?> box){
        box.close();
    }

    public void close(Box<T> box) {
        box.close();
    }

}
