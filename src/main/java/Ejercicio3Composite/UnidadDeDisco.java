package Ejercicio3Composite;

import java.util.ArrayList;
import java.util.List;

public class UnidadDeDisco implements IFile{

    private List<IFile> folders = new ArrayList<>();

    @Override
    public int getNumberOfWords() {
        int f = 0;
        for (IFile folder: folders){
            f += folder.getNumberOfWords();
        }
        return f;
    }

    @Override
    public void addChild(IFile file) {
        folders.add(file);
    }

    @Override
    public void removeChild(IFile file) {
        folders.remove(file);
    }

    @Override
    public IFile getChild(int index) {
        return folders.get(index);
    }
}
