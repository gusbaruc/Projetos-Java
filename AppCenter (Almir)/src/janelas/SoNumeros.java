package janelas;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

//Classe criada derivada do PlainDocuments para que um JTextField aceite somente, sesse caso, números e o ponto.
public class SoNumeros extends PlainDocument{
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str.replaceAll("[^0-9.]", ""), a);
        //Dentro do replaceAll deve ser inserido o que a caixa de texto poderá suportar.
    }
}