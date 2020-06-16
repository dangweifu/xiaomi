package pk.annotation;

import pk.contants.DemoContants;

import java.lang.annotation.*;

/**
 * @author : WiuLuS
 * @version : v1.0 06.16.2020
 * @discription :
 * @date : 2020-06-16 09:08:28
 * @email : m13886933623@163.com
 */
@Documented
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface LabelOne {
    String value() default DemoContants.VALUE ;
}
