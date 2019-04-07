package krasius.ch3;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }

    int next();

    static IntSequence of(int... values) {
        return new IntSequence() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return i < values.length;
            }

            @Override
            public int next() {
                return values[i++];
            }
        };
    }

    static IntSequence constant(int value){
        return () -> value;
    }


}

