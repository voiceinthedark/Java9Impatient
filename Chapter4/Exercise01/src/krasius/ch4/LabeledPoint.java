package krasius.ch4;

import java.util.Objects;

public class LabeledPoint extends Point {
    private String label;
    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }


    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + " label=" + this.getLabel();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj)
                && this.getLabel() == ((LabeledPoint) obj).getLabel();
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hashCode(this.getLabel());
    }
}
