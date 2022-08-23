class ParkingSystem {

    private int counter;

    public ParkingSystem(int big, int medium, int small) {
        counter = big | medium << 10 | small << 20;
    }

    public boolean addCar(int carType) {
        int bits = (carType - 1) * 10;
        int cnt = (counter >> bits) & 0b1111111111;
        if (cnt > 0) {
            counter -= 1 << bits;
            return true;
        }
        return false;
    }
}
