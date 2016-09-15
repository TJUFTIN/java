package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by UNIX on 14.09.2015.
 */
public class ImageReaderFactory {
    public static ImageReader getReader(ImageTypes types) {
        if ( types == (ImageTypes.BMP))        {
            return new BmpReader();
        } else if (types == (ImageTypes.JPG)) {
            return new JpgReader();
        } else if (types == (ImageTypes.PNG)) {
            return new PngReader();
        }  else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
