package com.java._6_exceptions;

import com.java._4_oop._1_classes.CNPValidator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Dangerous {

    public static void main(String... args) {

        Path p = Paths.get("/Users/ionut/workspace/soc-gen/test.txt");

        dangerousMethod(p);
        System.out.println("In main after dangerousMethod");
    }

    private static void dangerousMethod(Path p) {  // declare --> throws IOException {

        try {
            CNPValidator.validateCNP("8721982"); //unchecked
            System.out.println("Before exception");
            Files.writeString(p, "Hello exception");
            System.out.println("After exception");

        } catch (IOException | IllegalArgumentException ex) { //multicatch
            System.out.println(ex.getMessage());
            if (Files.exists(p)) {
                Files.isWritable(p);
            }
        } catch (MyUncheckkedException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }

//        catch (MyCheckedException e){
//            System.out.println(e);
//        }
    }

    private static void citescDinFisier(String path) throws IOException {
        Path path1 = Paths.get("/Users/ionut/workspace/soc-gen/test.txt");
        if (!Files.exists(path1)) {
            Files.createFile(path1);
        } else {
            Files.delete(path1);
        }
    }
}
