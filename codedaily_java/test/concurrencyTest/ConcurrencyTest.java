package concurrencyTest;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.mycila.junit.concurrent.Concurrency;
import com.mycila.junit.concurrent.ConcurrentJunitRunner;

@RunWith(ConcurrentJunitRunner.class)
@Concurrency(value = 6)
public class ConcurrencyTest {
  @Test
  public void test0() throws Throwable {
    printAndWait();
  }

  @Test
  public void test1() throws Throwable {
    printAndWait();
  }

  @Test
  public void test2() throws Throwable {
    printAndWait();
  }

  @Test
  public void test3() throws Throwable {
    printAndWait();
  }

  @Test
  public void test4() throws Throwable {
    printAndWait();
  }

  @Test
  public void test5() throws Throwable {
    printAndWait();
  }

  @Test
  public void test6() throws Throwable {
    printAndWait();
  }

  @Test
  public void test7() throws Throwable {
    printAndWait();
  }

  @Test
  public void test8() throws Throwable {
    printAndWait();
  }

  @Test
  public void test9() throws Throwable {
    printAndWait();
  }

  void printAndWait() throws Throwable {
    int w = new Random().nextInt(1000);
    System.out.println(String.format("[%s] %s %s %s", Thread.currentThread().getName(),
        getClass().getName(), new Throwable().getStackTrace()[1].getMethodName(), w));
    Thread.sleep(w);
  }
}
