package Ejercicio3Composite;

public class Client {
    public static void main(String[] args){
        IFile f1 = new File(560);
        IFile f2 = new File(2435);
        IFile f3 = new File(1);
        IFile f4 = new File(3456);
        IFile f5 = new File(362);

        IFile folder1 = new Folder();
        IFile folder2 = new Folder();

        folder1.addChild(f1);
        folder1.addChild(f2);

        folder2.addChild(f3);
        folder2.addChild(f4);
        folder2.addChild(f5);

        UnidadDeDisco discoC = new UnidadDeDisco();

        discoC.addChild(folder1);
        discoC.addChild(folder2);

        if (discoC.getNumberOfWords() == folder1.getNumberOfWords() + folder2.getNumberOfWords()){
            System.out.println("El numero total de palabras en la unidad de disco es: "+discoC.getNumberOfWords());
        }
    }
}
