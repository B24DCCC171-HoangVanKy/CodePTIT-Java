package Map;

import java.util.Map;
import java.util.TreeMap;

public class TuDien {
    private Map<String, String> duLieu = new TreeMap<>();

    public String themTu(String tuKhoa, String yNghia){
        return duLieu.put(tuKhoa, yNghia);
    }

    public String xoaTu(String tuKhoa){
        return this.duLieu.remove(tuKhoa);
    }

    public String traTu(String tuKhoa){
        String yNghia = this.duLieu.get(tuKhoa);
        return yNghia;
    }

    public void inTuKhoa(){

    }
}
