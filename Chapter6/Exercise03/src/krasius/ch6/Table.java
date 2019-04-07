/**
 * Implement a class Table<K, V> that manages an array list of Entry<K, V> elements.
 * Supply methods to get the value associated with a key, to put a
 * value for a key, and to remove a key.
 */
package krasius.ch6;

import java.util.ArrayList;

public class Table<K, V> {

    private K key;
    private V value;
    private ArrayList<Entry<K, V>> arrayList;

    public Table(){
        arrayList = new ArrayList<>();
    }

    public V getValue(K key){
        V value = null;
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).getKey() == key){
                value = arrayList.get(i).getValue();
            }
        }
        return value;
    }

    public void setValue(K key, V value){
        /*for(Entry e : arrayList){
            if(e.getKey() == key){
                e.setValue(value);
            }
        }*/

        boolean contains = false;
        int index = -1;
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).getKey() == key) {
                contains = true;
                index = i;
            }
        }

        if(contains){
            arrayList.get(index).setValue(value);
        }else arrayList.add(new Entry<>(key,value));
    }

    public void removeKey(K key){
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i).getKey() == key) {
                arrayList.remove(i);
                break;
            }
        }
    }
}
