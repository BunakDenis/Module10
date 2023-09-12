package global.goit.edu.homework;

import global.goit.edu.homework.task2.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public interface FileContentReader<V> {

    Collection<V> read(File file);

}
