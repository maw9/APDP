package design_patterns;


import java.util.List;

public class IteratorUsage {

    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        for (Iterator iter = repository.getIterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
    }

}

interface Container {
    Iterator getIterator();
}

interface Iterator {

    boolean hasNext();

    Object next();

}

class NameRepository implements Container {

    public String[] names = {
            "Robert",
            "Richard",
            "Jessica",
            "Rose"
    };

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}

class NameIterator implements Iterator {
    int index = 0;

    String[] names;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return names[index++];
        }
        return null;
    }
}
