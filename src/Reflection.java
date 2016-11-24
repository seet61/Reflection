import java.lang.reflect.Method;

/**
 * получение метаданных
 * Created by dmitry.arefyev on 24.11.2016.
 */
public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class info = args.getClass();
        System.out.println(info.isArray());
        System.out.println(info.getName());

        info = Class.forName("java.lang.Math");
        Method []m = info.getMethods();
        for (Method i: m)
            System.out.println(i.getName());
        System.out.println(info.getSuperclass().getName());
    }
}
