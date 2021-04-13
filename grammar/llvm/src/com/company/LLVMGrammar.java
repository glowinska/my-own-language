package com.company;

public class LLVMGrammar {

    static String header_text = "";
    static String main_text = "";
    static int reg = 1;
    static String text = "";

    public static void printf_i32(String id) {
        main_text += "%" + reg++ + " = load i32* %" + id + "\n";
        main_text += "%" + reg++ + " = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strpi, i32 0, i32 0), i32 %" + (reg - 2) + ")\n";
    }

    public static void printf_double(String id) {
        main_text += "%" + reg++ + " = load double* %" + id + "\n";
        main_text += "%" + reg++ + " = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strpd, i32 0, i32 0), double %" + (reg - 2) + ")\n";
    }

    public static void printf_string(String textString) {
        }

    public static void declare_i32(String id) {
        main_text += "%" + id + " = alloca i32\n";
    }

    public static void declare_double(String id) {
        main_text += "%" + id + " = alloca double\n";
    }

    public static void assign_i32(String id, String value) {
        main_text += "store i32 " + value + ", i32* %" + id + "\n";
    }

    public static void assign_last_i32(String id) {
        main_text += "store i32 %" + (reg - 1) + ", i32* %" + id + "\n";
    }

    public static void assign_double(String id, String value) {
        main_text += "store double " + value + ", double* %" + id + "\n";
    }

    public static void assign_last_double(String id) {
        main_text += "store double %" + (reg - 1) + ", double* %" + id + "\n";
    }

    public static void read_i32(String id) {
        main_text += "%" + reg++ + " = call i32 (i8*, ...)* @scanf(i8* getelementptr inbounds ([3 x i8]* @strsi, i32 0, i32 0), i32* %" + id + ")\n";
    }

    public static void read_double(String id) {
        main_text += "%" + reg++ + " = call i32 (i8*, ...)* @scanf(i8* getelementptr inbounds ([3 x i8]* @strsd, i32 0, i32 0), double* %" + id + ")\n";
    }

    public static void add_i32(String val1, String val2) {
        main_text += "%" + reg++ + " = add i32 " + val1 + ", " + val2 + "\n";
    }

    public static void add_double(String val1, String val2) {
        main_text += "%" + reg++ + " = fadd double " + val1 + ", " + val2 + "\n";
    }

    public static void mult_i32(String val1, String val2) {
        main_text += "%" + reg++ + " = mul i32 " + val1 + ", " + val2 + "\n";
    }

    public static void mult_double(String val1, String val2) {
        main_text += "%" + reg++ + " = fmul double " + val1 + ", " + val2 + "\n";
    }

    public static String generate() {
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @scanf(i8*, ...)\n";
        text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strsi = constant [3 x i8] c\"%d\\00\"\n";
        text += "@strsd = constant [3 x i8] c\"%f\\00\"\n";
        text += header_text;
        text += "define i32 @main() nounwind{\n";
        text += main_text;
        text += "ret i32 0 }\n";
        return text;
    }


}
