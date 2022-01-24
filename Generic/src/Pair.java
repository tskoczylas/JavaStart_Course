public class Pair<T,V> {

    public Pair() {
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecound() {
        return secound;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", secound=" + secound +
                '}';
    }

    public void setSecound(V secound) {
        this.secound = secound;
    }

    public Pair(T first, V secound) {
        this.first = first;
        this.secound = secound;
    }

   private T first;
    private V secound;
}
