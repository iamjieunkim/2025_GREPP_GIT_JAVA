package lec7.s3.box;

import lec7.s3.tools.Portable;
import lec7.s3.tools.Tool;

public class PortableToolBox<T extends Tool & Portable> extends Box<T> {


    public PortableToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        System.out.println("content.getName() = " + content.getName());
        content.portable();
    }
}
