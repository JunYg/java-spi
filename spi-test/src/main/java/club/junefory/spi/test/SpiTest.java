package club.junefory.spi.test;

import club.junefory.spi.define.SpiDemoInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author Jarvis
 * @version 1.0
 * @description: TODO
 * @date 2021/12/29 10:28
 */
public class SpiTest {
    public static void main(String[] args) {
        ServiceLoader<SpiDemoInterface> serviceLoader = ServiceLoader.load(SpiDemoInterface.class, Thread.currentThread().getContextClassLoader());
        Iterator<SpiDemoInterface> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            SpiDemoInterface next = iterator.next();
            next.spiMethodOne();
            next.spiMethodTwo();
            next.spiMethodThree();
        }
    }
}
