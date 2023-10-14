package MockExam_1.Question_3;

public interface ILoString {

    /**
     * Check if the list is empty.
     *
     * @return true if the list is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Get the first element of the list.
     *
     * @return the first element.
     */
    String getFirst();

    /**
     * Get the rest of the list (all elements except the first).
     *
     * @return the rest of the list as an ILoString.
     */
    ILoString getRest();

    /**
     * Interleave the elements of this list with another list.
     *
     * @param other The other list to be interleaved.
     * @return a new ILoString with elements interleaved.
     */
    ILoString interleave(ILoString other);

    /**
     * Unzip the elements of this list into a pair of lists.
     *
     * @return a PairOfLists containing two ILoString lists.
     */
    PairOfLists unzip();
}
