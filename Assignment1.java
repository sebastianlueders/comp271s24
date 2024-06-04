public class DynamicArray {

    private String[] data;
    private int position;

    private static final int DEFAULT_SIZE = 10;

    public DynamicArray(int size) {
        this.data = new String[size];
        this.position = 0;
    }

    public DynamicArray() {
        this(DEFAULT_SIZE);
    }

    public void add(String string) {
        if (this.position == this.data.length) {
            resize();
        }

        this.data[this.position] = string;
        this.position++;
    }

    public void resize() {
        String[] resizedArray = new String[position + 10];

        for (int i = 0; i < position; i++) {
            resizedArray[i] = this.data[i];
        }

        this.data = resizedArray;
    }

    public int contains(String string) {
        int index = -1;
        int i = 0;
        while(index == -1 && i < data.length) {
            if (string.equals(data[i])) {
                index = i;
            }
        }
        return index;
    }

    public int countOf(String string) {
        int counter = 0;

        for(int i = 0; i < data.length; i++){
            if(string.equals(data[i])) {
                counter++;
            }
        }
        
        return counter;
    }
    
} 