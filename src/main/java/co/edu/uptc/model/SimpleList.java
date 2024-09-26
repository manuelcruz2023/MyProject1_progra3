package co.edu.uptc.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import co.edu.uptc.pojos.Node;

public class SimpleList<T> implements List<T> {

    Node<T> header;
    Node<T> last;

    public int size = 0;
    private Node<T> lastget = null;

    public SimpleList() {
        header = null;
        last = null;
    }

    @Override
    public boolean add(T e) {
        Node<T> newNode = new Node<T>();
        newNode.setInfo(e);
        newNode.setNext(null);
        size = size + 1;
        if (header == null) {
            header = newNode;
            last = header;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        return true;
    }

    public void showList() {
        Node<T> aux = header;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        int conta = 0;
        Node<T> aux = header;
        while (aux != null) {
            if (conta == index) {
                return (T) aux.getInfo();
            }
            aux = aux.getNext();
            conta++;
        }
        if (lastget != null) {
            return lastget.getInfo();
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public Object[] toArray(Object[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean containsAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object set(int index, Object element) {
        int conta = 0;
        Node<T> aux = header;
        while (aux != null) {
            if (conta == index) {
                aux.setInfo((T) element);
                return aux.getInfo();
            }
            aux = aux.getNext();
            conta++;
        }
        return null;
    }

    @Override
    public void add(int index, Object element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public T remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }

}