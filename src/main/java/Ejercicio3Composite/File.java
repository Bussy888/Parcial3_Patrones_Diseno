package Ejercicio3Composite;

public class File implements IFile{

    private int numberOfWords;

    public File(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    @Override
    public int getNumberOfWords() {
        return numberOfWords;
    }

    @Override
    public void addChild(IFile file) {

    }

    @Override
    public void removeChild(IFile file) {

    }

    @Override
    public IFile getChild(int index) {
        return null;
    }
}
