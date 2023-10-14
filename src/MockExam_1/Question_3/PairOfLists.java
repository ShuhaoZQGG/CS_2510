package MockExam_1.Question_3;

public class PairOfLists {
    ILoString first, second;

    public PairOfLists(ILoString first, ILoString second) {
        this.first = first;
        this.second = second;
    }

    // Produces a new pair of lists, with the given String added to
    // the front of the first list of this pair
    public PairOfLists addToFirst(String str) {
        ILoString newFirst = new LoString(str, first);
        return new PairOfLists(newFirst, second);
    }

    // Produces a new pair of lists, with the given String added to
    // the front of the second list of this pair
    public PairOfLists addToSecond(String str) {
        ILoString newSecond = new LoString(str, second);
        return new PairOfLists(first, newSecond);
    }
}
