package Aufgabe1;

public class Student<T> {
	T value = null;

	void setValue(T o) {
		value = o;
	}

	T getValue() {
		return value;
	}


}