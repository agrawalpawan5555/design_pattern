package com.demo.dierector;

public class House {

    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    public House(HouseBuilder houseBuilder)
    {
        this.foundation = houseBuilder.foundation;
        this.structure = houseBuilder.structure;
        this.roof = houseBuilder.roof;
        this.hasGarage = houseBuilder.hasGarage;
        this.hasSwimmingPool = houseBuilder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }

    public static class HouseBuilder
    {
        private String foundation;
        private String structure;
        private String roof;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        public HouseBuilder foundation(String foundation)
        {
            this.foundation = foundation;
            return this;
        }
        public HouseBuilder structure(String structure)
        {
            this.structure = structure;
            return this;
        }
        public HouseBuilder roof(String roof)
        {
            this.roof = roof;
            return this;
        }
        public HouseBuilder garage(boolean hasGarage)
        {
            this.hasGarage = hasGarage;
            return this;
        }
        public HouseBuilder swimmingpool(boolean hasSwimmingPool)
        {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }
        public House build()
        {
            return new House(this);
        }
    }


}
