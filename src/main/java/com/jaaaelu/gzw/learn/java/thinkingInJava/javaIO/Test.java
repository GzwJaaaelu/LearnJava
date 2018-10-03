package com.jaaaelu.gzw.learn.java.thinkingInJava.javaIO;

import java.io.*;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.Date;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, BackingStoreException {
        testFile();

        System.out.println();

        System.out.println(testRead("build.gradle"));

        System.out.println("------------------------------------------------");

        System.out.println(testRead("settings.gradle"));

        System.out.println("------------------------------------------------");

        testDataInput();

        System.out.println("------------------------------------------------");

        testWrite("测试写入");
        testWrite("，");
        testWrite("今天天气");
        testWrite("。");

        testWriteSimple();

        System.out.println();

        testFileLock();

        System.out.println();

        testZip();

        System.out.println();

//        testPerson();

        System.out.println();

        testReadPerson();

        System.out.println();

        testXml();

        System.out.println();

//        testPreferences();

        testGetPref();
    }

    private static void testGetPref() throws BackingStoreException {
        Preferences prefs = Preferences.userNodeForPackage(Person.class);
        for (String key : prefs.keys()) {
            System.out.println(key + "  "  + prefs.get(key, null));
        }
    }

    private static void testPreferences() {
        Preferences prefs = Preferences.userNodeForPackage(Person.class);
        prefs.put("name", "Jaaaelu");
        prefs.put("adds", "WZ");
        prefs.put("phone", "I don't know");
        prefs.put("sex", "girl");
    }

    private static void testXml() {
    }

    private static void testReadPerson() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.out"));
        String str = (String) ois.readObject();
        Person p = (Person) ois.readObject();
        System.out.println(str);
        System.out.println(p);
    }

    private static void testPerson() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.out"));
        oos.writeObject("Person");
        oos.writeObject(new Person("Gzw", "杭州", "9809", "man"));
        oos.flush();
        oos.close();
    }

    private static void testZip() throws IOException {
        ZipInputStream br = new ZipInputStream(new FileInputStream("t.zip"));
        ZipEntry ze;
        while ((ze = br.getNextEntry()) != null) {
            System.out.println(ze.getName());
        }
    }

    private static void testFileLock() throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        FileLock fl = fos.getChannel().lock();
        if (fl != null) {
            System.out.println("lock");
            fos.write(new byte[]{0, 97});
            fl.release();
            System.out.println("released");
        }
        fos.close();
    }

    private static void testWriteSimple() throws IOException {
        PrintWriter writer = new PrintWriter("test.txt");
        writer.println("Gzw");
        writer.close();
    }

    private static void testWrite(String text) throws IOException {
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("test.txt", true)));
        //  如果 append 不改为 true 的话，write() 会覆盖原有内容
        writer.write(text);
        writer.flush();
        writer.close();
    }

    private static void testDataInput() throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("build.gradle")));
        int i = 0;
        //  available() 方法查看还有多少可供存取的字符，字面意思就是"在没有阻塞的情况下还能读取的字节数"。
        while ((i = in.available()) != 0) {
            System.out.print((char) in.readByte());
        }
    }

    private static String testRead(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String item;
        StringBuilder totalStr = new StringBuilder();
        while ((item = in.readLine()) != null) {
            totalStr.append(item).append("\n");
        }
        in.close();
        return totalStr.toString();
    }

    private static void testInput() throws IOException {
        File file = new File("build.gradle");
//        FileInputStream fis = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());

    }

    private static void testFile() {
        File file = new File(".");
        System.out.println(Arrays.toString(file.list()));
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
        System.out.println(new Date(file.lastModified()));
        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        File create = new File("test");
        if (!create.exists()) {
            System.out.println(create.mkdir());
        }
//        if (create.exists()) {
//            System.out.println(create.delete());
//        }
//        System.out.println(create.renameTo(new File("newTest")));
    }
}
