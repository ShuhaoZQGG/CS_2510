package MockExam_1.Question_3;

public class LoString implements ILoString {
    private String first;
    private ILoString rest;

    // Constructor for a non-empty list
    public LoString(String first, ILoString rest) {
        this.first = first;
        this.rest = rest;
    }

    // Constructor for an empty list
    public LoString() {
        this.first = null;
        this.rest = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null && rest == null; // Check if both first and rest are null to indicate an empty list
    }

    @Override
    public String getFirst() {
        if (isEmpty()) {
            return null;
        }
        return first;
    }

    @Override
    public ILoString getRest() {
        if (isEmpty()) {
            return null;
        }
        return rest;
    }

    @Override
    public ILoString interleave(ILoString other) {
        if (isEmpty()) {
            return other;
        } else if (other.isEmpty()) {
            return this;
        } else {
            String newFirst = this.getFirst();
            ILoString newRest = this.getRest();
            return new LoString(newFirst, other.interleave(newRest));
        }
    }

    @Override
    public PairOfLists unzip() {
        ILoString list1 = unzipHelper(this, true);
        ILoString list2 = unzipHelper(this, false);
        return new PairOfLists(list1, list2);
    }

    private ILoString unzipHelper(ILoString input, boolean addToFirst) {
        if (input.isEmpty()) {
            return new LoString();
        }

        String element = input.getFirst();
        ILoString restOfList = unzipHelper(input.getRest(), !addToFirst);

        if (addToFirst) {
            return new LoString(element, restOfList);
        } else {
            return restOfList;
        }
    }
}
