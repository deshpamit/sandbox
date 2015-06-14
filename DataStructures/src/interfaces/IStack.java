package interfaces;

/**
 * A stack is a last in, first out (LIFO) abstract data type and linear
 * data structure. A stack can have any abstract data type as an element, but is
 * characterized by two fundamental operations, called push and pop. The push
 * operation adds a new item to the top of the stack, or initializes the stack
 * if it is empty. If the stack is full and does not contain enough space to
 * accept the given item, the stack is then considered to be in an overflow
 * state. The pop operation removes an item from the top of the stack.
 *
 * http://en.wikipedia.org/wiki/Stack_(abstract_data_type)
 *
 * Original implementation borrowed from https://github.com/phishman3579/java-algorithms-implementation
 */
public interface IStack<T> {
    /**
     * Push value on top of stack
     *
     * @param value to push on the stack.
     */
    boolean push(T value);

    /**
     * Pop the value from the top of stack.
     *
     * @return value popped off the top of the stack.
     */
    T pop();

    /**
     * Peek the value from the top of stack.
     *
     * @return value popped off the top of the stack.
     */
    T peek();

    /**
     * Remove value from stack.
     *
     * @param value to remove from stack.
     * @return True if value was removed.
     */
    boolean remove(T value);

    /**
     * Clear the entire stack.
     */
    void clear();

    /**
     * Does stack contain object.
     *
     * @param value object to find in stack.
     * @return True is stack contains object.
     */
    boolean contains(T value);

    /**
     * Size of the stack.
     *
     * @return size of the stack.
     */
    int size();

    /**
     * Validate the stack according to the invariants.
     *
     * @return True if the stack is valid.
     */
    boolean validate();
}
