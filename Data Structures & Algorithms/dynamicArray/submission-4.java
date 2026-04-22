class DynamicArray {

    int[] array = new int[]{};

    // points to the next slot in the array that has no added element.
    int pointer = 0;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = new int[capacity];
        }
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (pointer == array.length){
            // the array is full, double the size
            this.resize();
        }
        this.array[this.pointer] = n;
        this.pointer++;
    }

    public int popback() {
        int element = this.array[pointer - 1];
        
        this.pointer--;

        return element;
        
    }

    private void resize() {
        int[] copy = new int[array.length * 2];

        for (int i = 0; i < array.length; i++) {

            copy[i] = array[i];

        }

        array = copy;


    }

    public int getSize() {

        if (pointer < 0){
            return 0;
        }

        return this.pointer;
    }

    public int getCapacity() {
        return array.length;
    }
}
