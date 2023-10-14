package Question_1;

public class Switcheroo {
    int value;

    Switcheroo(int value) {
        this.value = value;
    }

    Switcheroo choose(Switcheroo that, Switcheroo other) {
        if (this.value < that.value) {
            return other.choose(this, that);
        }

        else if (that.value > other.value) {
            return that.choose(other, new Switcheroo(this.value + 1));
        }

        else {
            return new Switcheroo(this.value * 10);
        }
    }
}
