package com.vsu.by.service.files;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;

@Service
public class Deserializer {
    private Gson gson;

    public Deserializer() {
        this.gson = new Gson();
    }

    //public boolean deserialize(String path, Class clazz) {
    //    try {
    //        BufferedReader reader = this.getReader(path);
    //        reader.
    //        //reader.read();
    //        reader.close();
    //    } catch (IOException e) {
    //        return false;
    //    }
    //    return true;
    //}
//
    //private BufferedReader getReader(String path) throws IOException {
    //    return new BufferedReader(new FileReader(path));
    //}
}
