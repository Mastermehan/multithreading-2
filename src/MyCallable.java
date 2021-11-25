import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call()  {
        int count = 0;
        for (int i = 1; i < 5; i++) {
            count = i;
            System.out.println("Я поток " + Thread.currentThread().getName() + ". Вывожу № " + i);
        }
        return count + 1;
    }
}
