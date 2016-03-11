package org.develnext.jphp.ext.javafx.classes;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import org.develnext.jphp.ext.javafx.JavaFXExtension;
import org.develnext.jphp.ext.javafx.classes.layout.UXFlowPane;
import org.develnext.jphp.ext.javafx.support.control.PaginationEx;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Property;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name(JavaFXExtension.NS + "UXPagination")
public class UXPagination extends UXFlowPane<PaginationEx> {
    interface WrappedInterface {
        @Property int total();
        @Property int pageSize();
        @Property int pageCount();
        @Property int maxPageCount();
        @Property int selectedPage();
        @Property String hintText();
        @Property boolean showTotal();
        @Property Font font();
        @Property Color textColor();
        @Property boolean showPrevNext();

        @Property Button previousButton();
        @Property Button nextButton();
    }

    public UXPagination(Environment env, PaginationEx wrappedObject) {
        super(env, wrappedObject);
    }

    public UXPagination(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Override
    @Signature
    public void __construct() {
        __wrappedObject = new PaginationEx();
    }
}
