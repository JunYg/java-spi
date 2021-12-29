package club.junefory.spi.achieve;

import club.junefory.spi.define.SpiDemoInterface;

/**
 * @author Jarvis
 * @version 1.0
 * @description: TODO
 * @date 2021/12/29 10:25
 */
public class SpiDemoAchieveTwo implements SpiDemoInterface {
    public String spiMethodOne() {
        String format = String.format("%s -> spiMethodOne \n", this.getClass().getSimpleName());
        System.out.print(format);
        return format;
    }

    public String spiMethodTwo() {
        String format = String.format("%s -> spiMethodTwo \n", this.getClass().getSimpleName());
        System.out.print(format);
        return format;
    }

    public String spiMethodThree() {
        String format = String.format("%s -> spiMethodThree \n", this.getClass().getSimpleName());
        System.out.print(format);
        return format;
    }
}
