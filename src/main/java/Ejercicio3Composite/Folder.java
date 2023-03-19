package Ejercicio3Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder  implements IFile{

    private List<IFile> files = new ArrayList<>();

    @Override
    public int getNumberOfWords() {
        int n = 0;
        for (IFile i: files){
            n += i.getNumberOfWords();
        }
        return n;
    }

    @Override
    public void addChild(IFile file) {
        files.add(file);
    }

    @Override
    public void removeChild(IFile file) {
        files.remove(file);
    }

    @Override
    public IFile getChild(int index) {
        return files.get(index);
    }
}
