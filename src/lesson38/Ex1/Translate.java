package lesson38.Ex1;

public class Translate<K, V> {
    private K key;
    private V value;

    public Translate() {
    }

    public Translate(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Translate{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
