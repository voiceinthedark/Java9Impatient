package krasius.ch3;

import java.math.BigInteger;

public class SquareSequence implements Sequence<BigInteger> {

    private BigInteger n;
    public SquareSequence(){
        n = new BigInteger("2");
    }

    @Override
    public BigInteger next() {
        BigInteger number = n.multiply(n);
        n = n.add(new BigInteger("1"));
        return number;
    }
}
