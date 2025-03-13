package dao;

import java.util.ArrayList;

public interface Dao<T> {
    public int insert(T t);
    public int update(T t);
    public int delete(String id);
    public ArrayList<T> sellectAll();
    public T sellectById(String id);
}
