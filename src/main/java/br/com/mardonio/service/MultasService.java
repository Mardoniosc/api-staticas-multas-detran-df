package br.com.mardonio.service;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.mardonio.domain.Multa;
import br.com.mardonio.resource.AbstractReader;

public class MultasService extends AbstractReader {
	 public static Multa readOneFrom(String path) throws IOException {
        String jsonText = readJson(path);

        Type collectionType = new TypeToken<Multa>(){}.getType();
        return new Gson().fromJson(jsonText,collectionType);
    }

    public static List<Multa> readListFrom(String path) throws IOException {
        String jsonText = readJson(path);
        Type collectionType = new TypeToken<List<Multa>>(){}.getType();
        return new Gson().fromJson(jsonText, collectionType);

    }
}