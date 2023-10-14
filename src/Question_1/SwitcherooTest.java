package Question_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
class SwitcherooTest {
    Switcheroo s1 = new Switcheroo(20);
    Switcheroo s2 = new Switcheroo(16);
    Switcheroo s3 = new Switcheroo(2510);
    @Test
    void choose() {
        /*
        this.s3.choose(s1, s2);

        this: s3, that: s1, other: s2
        this.value < that.value => s3.value < s1.value => 2510 < 20 => false
        =>
        that.value > other.value => s1.value > s2.value => 20 > 16 => true
        =>
        that.choose(other, new Switcheroo(this.value + 1));
        => this: s1, that: s2, other: s4: new Switcheroo(2511)
        => this.value < that.value => s1.value < s2.value => 20 < 16 => false
        => that.value > other.value => s2.value > s4.value => 20 > 2511 => false
        =>  return new Switcheroo(this.value * 10); => s1 * 10 => 200
         */
        Switcheroo expectedSwitcheroo = new Switcheroo(200);
        Switcheroo actualSwitcheroo = this.s3.choose(s1, s2);
        assertEquals(expectedSwitcheroo.value, actualSwitcheroo.value);
    }
}