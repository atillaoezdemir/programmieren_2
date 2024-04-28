package de.thws.klausursuebungen.ss2020.nummer3;

import java.util.ArrayList;
import java.util.Collection;

public class ImmutableArrayList<E> extends ArrayList<E> {
    
    public ImmutableArrayList(Collection<? extends E> c) {
        super(c);
    }
/*
    public boolean add(E e) {
        throw new UnsupportedOperationException("Cannot add elements to ImmutableArrayList");
    }

    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Cannot add elements to ImmutableArrayList");
    }

    public void add(int index, E element) {
        throw new UnsupportedOperationException("Cannot add elements to ImmutableArrayList");
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Cannot add elements to ImmutableArrayList");
    }

    class UnsupportedOperationException {
        public UnsupportedOperationException() {

        }
    }
 */
}
