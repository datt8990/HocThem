/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoneJava2;

import java.io.File;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class DocGhiFile implements Serializable {

    public String ghiFile(String path, List<NhanVien> lists) {
        File file = new File(path);
        // kiểm tra xem file đã tồn tại chưa
        if (!file.exists()) {
            try {
                //tạo file mới
                file.createNewFile();
            } catch (IOException ex) {
                return "Tạo file thất bại";
            }
        }
        //ghi file -> fileoutputstream -> objectoutputstream
        try (FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream() {
        }) {
            // ghi từng đối tượng vào file
            for (NhanVien list : lists) {
                oos.writeObject(lists);
            }
        } catch (IOException ex) {
            return "Ghi file thất bại";
        }
        return "Ghi file thành công";
    }
    
    public List<NhanVien> docFile(String path) {
        List<NhanVien> lists = new ArrayList<>();
        File file = new File(path);
        // kiểm tra xem file đã tồn tại chưa
        if (!file.exists()) {
            System.out.println("File không tồn tại");
            return null;
        }
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream() {
        }) {
            // ghi từng đối tượng vào file
            while (fis.available() > 0) {
                lists.add((NhanVien) ois.readObject());
            }
        } catch (Exception e) {
            System.out.println("Đọc file thất bại");;
            return null;
        }
        return lists;
    }
     }
