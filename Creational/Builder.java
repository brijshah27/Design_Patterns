package Creational;

public class Builder {

    public static class Build {

        private String addA;

        private String addB;

        private String addC;

        private String addD;

        public Builder build() {
            return new Builder(this);
        }

        public Build addA(String addA) {
            this.addA = addA;
            return this;
        }

        public Build addB(String addB) {
            this.addB = addB;
            return this;
        }

        public Build addC(String addC) {
            this.addC = addC;
            return this;
        }

        public Build addD(String addD) {
            this.addD = addD;
            return this;
        }
    }

    private String addA;

    private String addB;

    private String addC;

    private String addD;

    private Builder(Build build){
        this.addA = build.addA;
        this.addB = build.addB;
        this.addC = build.addC;
        this.addD = build.addD;
    }

    public String getAddA() {
        return addA;
    }

    public String getAddB() {
        return addB;
    }

    public String getAddC() {
        return addC;
    }

    public String getAddD() {
        return addD;
    }

}
