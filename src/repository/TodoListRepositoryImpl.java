package repository;

import entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository {

    public Todolist[] data = new Todolist[10];

    private boolean isFull() {
        var isFull = true;

        // cek apakah model penuh
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    private void resizeIfFull() {
        // jika penuh resize ukuran array 2x lipat
        if (isFull()) {
            var tmp = data;
            data = new Todolist[data.length * 2];
            for (int i = 0; i < tmp.length; i++) {
                data[i] = tmp[i];
            }
        } 
    }

    @Override
    public void add(Todolist todolist) {
        resizeIfFull();

        // tambahkah ke posisis data array-nya null
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todolist;
                break;
            }
        }

    }

    @Override
    public Todolist[] getAll() {
        return data;
    }

    @Override
    public void remove(Integer number) {
        
    }

}
