package pk;

import pk.annotation.LabelOne;
import pk.contants.DemoContants;

import java.lang.reflect.Field;

/**
 * @author : WiuLuS
 * @version : v1.0 06.16.2020
 * @discription :
 * @date : 2020-06-16 09:06:50
 * @email : m13886933623@163.com
 */
public class Dog {

    @LabelOne("key")
    public static String key ;
    @LabelOne
    public static String value ;
    public static void main(String[] args) {
        System.out.println("---------------");
        Dog dog = new Dog() ;
        Class<? extends Dog> clazz = dog.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (field.isAnnotationPresent(LabelOne.class)) {
                LabelOne findView = field.getAnnotation(LabelOne.class);
                String val = findView.value();
                System.out.println(val);
                if (DemoContants.KEY.equals(val)){
                    // TODO : 条件满足，处理一些业务逻辑
                    System.out.println("the condition is " + true);
                }
            }
        }

    }

}
